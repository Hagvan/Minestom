package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;
import net.minestom.server.raw_data.RawBlockStateData;
import net.minestom.server.registry.Registry;
import net.minestom.server.utils.NamespaceID;

/**
 * AUTOGENERATED by BlockGenerator
 */
@Deprecated(
        since = "forever",
        forRemoval = false
)
public final class BrownGlazedTerracotta {
    public static final BlockState BROWN_GLAZED_TERRACOTTA_0 = new BlockState(NamespaceID.from("minecraft:brown_glazed_terracotta_0"), (short) 9426, Block.BROWN_GLAZED_TERRACOTTA, new RawBlockStateData(1.4, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "facing=north");

    public static final BlockState BROWN_GLAZED_TERRACOTTA_1 = new BlockState(NamespaceID.from("minecraft:brown_glazed_terracotta_1"), (short) 9427, Block.BROWN_GLAZED_TERRACOTTA, new RawBlockStateData(1.4, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "facing=south");

    public static final BlockState BROWN_GLAZED_TERRACOTTA_2 = new BlockState(NamespaceID.from("minecraft:brown_glazed_terracotta_2"), (short) 9428, Block.BROWN_GLAZED_TERRACOTTA, new RawBlockStateData(1.4, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "facing=west");

    public static final BlockState BROWN_GLAZED_TERRACOTTA_3 = new BlockState(NamespaceID.from("minecraft:brown_glazed_terracotta_3"), (short) 9429, Block.BROWN_GLAZED_TERRACOTTA, new RawBlockStateData(1.4, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "facing=east");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(BROWN_GLAZED_TERRACOTTA_0);
        Registry.BLOCK_STATE_REGISTRY.register(BROWN_GLAZED_TERRACOTTA_1);
        Registry.BLOCK_STATE_REGISTRY.register(BROWN_GLAZED_TERRACOTTA_2);
        Registry.BLOCK_STATE_REGISTRY.register(BROWN_GLAZED_TERRACOTTA_3);
    }

    public static void initStates() {
        Block.BROWN_GLAZED_TERRACOTTA.addBlockState(BROWN_GLAZED_TERRACOTTA_0);
        Block.BROWN_GLAZED_TERRACOTTA.addBlockState(BROWN_GLAZED_TERRACOTTA_1);
        Block.BROWN_GLAZED_TERRACOTTA.addBlockState(BROWN_GLAZED_TERRACOTTA_2);
        Block.BROWN_GLAZED_TERRACOTTA.addBlockState(BROWN_GLAZED_TERRACOTTA_3);
    }
}
