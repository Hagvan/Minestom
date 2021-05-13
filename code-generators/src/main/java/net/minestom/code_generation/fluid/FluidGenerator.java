package net.minestom.code_generation.fluid;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import com.squareup.javapoet.*;
import net.minestom.code_generation.MinestomCodeGenerator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.lang.model.element.Modifier;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collections;
import java.util.List;

public final class FluidGenerator extends MinestomCodeGenerator {
    private static final Logger LOGGER = LoggerFactory.getLogger(FluidGenerator.class);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    private final File fluidsFile;
    private final File outputFolder;

    public FluidGenerator(@NotNull File fluidsFile, @NotNull File outputFolder) {
        this.fluidsFile = fluidsFile;
        this.outputFolder = outputFolder;
    }

    @Override
    public void generate() {
        if (!fluidsFile.exists()) {
            LOGGER.error("Failed to find fluids.json.");
            LOGGER.error("Stopped code generation for fluids.");
            return;
        }
        if (!outputFolder.exists() && !outputFolder.mkdirs()) {
            LOGGER.error("Output folder for code generation does not exist and could not be created.");
            return;
        }
        // Important classes we use alot
        ClassName namespaceIDClassName = ClassName.get("net.minestom.server.utils", "NamespaceID");
        ClassName rawFluidDataClassName = ClassName.get("net.minestom.server.raw_data", "RawFluidData");
        ClassName registryClassName = ClassName.get("net.minestom.server.registry", "Registry");

        JsonArray fluids;
        try {
            fluids = GSON.fromJson(new JsonReader(new FileReader(fluidsFile)), JsonArray.class);
        } catch (FileNotFoundException e) {
            LOGGER.error("Failed to find fluids.json.");
            LOGGER.error("Stopped code generation for fluids.");
            return;
        }
        ClassName fluidClassName = ClassName.get("net.minestom.server.fluid", "Fluid");

        // Particle
        TypeSpec.Builder fluidClass = TypeSpec.classBuilder(fluidClassName)
                .addSuperinterface(ClassName.get("net.kyori.adventure.key", "Keyed"))
                .addModifiers(Modifier.PUBLIC).addJavadoc("AUTOGENERATED by " + getClass().getSimpleName());
        fluidClass.addField(
                FieldSpec.builder(namespaceIDClassName, "id")
                        .addModifiers(Modifier.PRIVATE, Modifier.FINAL).addAnnotation(NotNull.class).build()
        );
        fluidClass.addField(
                FieldSpec.builder(rawFluidDataClassName, "fluidData")
                        .addModifiers(Modifier.PRIVATE, Modifier.VOLATILE)
                        .addAnnotation(NotNull.class)
                        .build()
        );
        fluidClass.addMethod(
                MethodSpec.constructorBuilder()
                        .addParameter(ParameterSpec.builder(namespaceIDClassName, "id").addAnnotation(NotNull.class).build())
                        .addParameter(ParameterSpec.builder(rawFluidDataClassName, "fluidData").addAnnotation(NotNull.class).build())
                        .addStatement("this.id = id")
                        .addStatement("this.fluidData = fluidData")
                        .addModifiers(Modifier.PROTECTED)
                        .build()
        );
        // Override key method (adventure)
        fluidClass.addMethod(
                MethodSpec.methodBuilder("key")
                        .returns(ClassName.get("net.kyori.adventure.key", "Key"))
                        .addAnnotation(Override.class)
                        .addAnnotation(NotNull.class)
                        .addStatement("return this.id")
                        .addModifiers(Modifier.PUBLIC)
                        .build()
        );
        // getId method
        fluidClass.addMethod(
                MethodSpec.methodBuilder("getId")
                        .returns(namespaceIDClassName)
                        .addAnnotation(NotNull.class)
                        .addStatement("return this.id")
                        .addModifiers(Modifier.PUBLIC)
                        .build()
        );
        // getNumericalId
        fluidClass.addMethod(
                MethodSpec.methodBuilder("getNumericalId")
                        .returns(TypeName.INT)
                        .addStatement("return $T.FLUID_REGISTRY.getId(this)", registryClassName)
                        .addModifiers(Modifier.PUBLIC)
                        .build()
        );
        // fromId Method
        fluidClass.addMethod(
                MethodSpec.methodBuilder("fromId")
                        .returns(fluidClassName)
                        .addAnnotation(Nullable.class)
                        .addParameter(TypeName.INT, "id")
                        .addStatement("return $T.FLUID_REGISTRY.get((short) id)", registryClassName)
                        .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                        .build()
        );
        // fromId Method
        fluidClass.addMethod(
                MethodSpec.methodBuilder("fromId")
                        .returns(fluidClassName)
                        .addAnnotation(NotNull.class)
                        .addParameter(ClassName.get("net.kyori.adventure.key", "Key"), "id")
                        .addStatement("return $T.FLUID_REGISTRY.get(id)", registryClassName)
                        .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                        .build()
        );
        // getFluidData method
        fluidClass.addMethod(
                MethodSpec.methodBuilder("getFluidData")
                        .returns(rawFluidDataClassName)
                        .addAnnotation(NotNull.class)
                        .addStatement("return this.fluidData")
                        .addModifiers(Modifier.PUBLIC, Modifier.FINAL)
                        .build()
        );
        // setEnchantmentData method
        fluidClass.addMethod(
                MethodSpec.methodBuilder("setFluidData")
                        .addParameter(ParameterSpec.builder(rawFluidDataClassName, "fluidData").addAnnotation(NotNull.class).build())
                        .addStatement("this.fluidData = fluidData")
                        .addModifiers(Modifier.PUBLIC, Modifier.FINAL)
                        .build()
        );
        // toString method
        fluidClass.addMethod(
                MethodSpec.methodBuilder("toString")
                        .addAnnotation(NotNull.class)
                        .addAnnotation(Override.class)
                        .returns(String.class)
                        // this resolves to [Namespace]
                        .addStatement("return \"[\" + this.id + \"]\"")
                        .addModifiers(Modifier.PUBLIC)
                        .build()
        );
        // values method
        fluidClass.addMethod(
                MethodSpec.methodBuilder("values")
                        .addAnnotation(NotNull.class)
                        .returns(ParameterizedTypeName.get(ClassName.get(List.class), fluidClassName))
                        .addStatement("return $T.FLUID_REGISTRY.values()", registryClassName)
                        .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                        .build()
        );

        CodeBlock.Builder staticBlock = CodeBlock.builder();
        // Use data
        for (JsonElement f : fluids) {
            JsonObject fluid = f.getAsJsonObject();

            String fluidName = fluid.get("name").getAsString();

            fluidClass.addField(
                    FieldSpec.builder(
                            fluidClassName,
                            fluidName
                    ).initializer(
                            "new $T($T.from($S), new $T(() -> $T.MATERIAL_REGISTRY.get($S)))",
                            fluidClassName,
                            namespaceIDClassName,
                            fluid.get("id").getAsString(),

                            rawFluidDataClassName,
                            registryClassName,
                            fluid.get("bucketId").getAsString()
                    ).addModifiers(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL).build()
            );
            // Add to static init.
            staticBlock.addStatement("$T.FLUID_REGISTRY.register($N)", registryClassName, fluidName);
        }

        fluidClass.addStaticBlock(staticBlock.build());

        // Write files to outputFolder
        writeFiles(
                Collections.singletonList(
                        JavaFile.builder("net.minestom.server.fluid", fluidClass.build())
                                .indent("    ")
                                .skipJavaLangImports(true)
                                .build()
                ),
                outputFolder
        );
    }
}
