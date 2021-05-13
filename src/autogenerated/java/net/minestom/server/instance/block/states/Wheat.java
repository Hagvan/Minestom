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
public final class Wheat {
    public static final BlockState WHEAT_0 = new BlockState(NamespaceID.from("minecraft:wheat_0"), (short) 3357, Block.WHEAT, new RawBlockStateData(0.0, 0, false, "DESTROY", false, false, false, false, false, false, 7, "[]"), "age=0");

    public static final BlockState WHEAT_1 = new BlockState(NamespaceID.from("minecraft:wheat_1"), (short) 3358, Block.WHEAT, new RawBlockStateData(0.0, 0, false, "DESTROY", false, false, false, false, false, false, 7, "[]"), "age=1");

    public static final BlockState WHEAT_2 = new BlockState(NamespaceID.from("minecraft:wheat_2"), (short) 3359, Block.WHEAT, new RawBlockStateData(0.0, 0, false, "DESTROY", false, false, false, false, false, false, 7, "[]"), "age=2");

    public static final BlockState WHEAT_3 = new BlockState(NamespaceID.from("minecraft:wheat_3"), (short) 3360, Block.WHEAT, new RawBlockStateData(0.0, 0, false, "DESTROY", false, false, false, false, false, false, 7, "[]"), "age=3");

    public static final BlockState WHEAT_4 = new BlockState(NamespaceID.from("minecraft:wheat_4"), (short) 3361, Block.WHEAT, new RawBlockStateData(0.0, 0, false, "DESTROY", false, false, false, false, false, false, 7, "[]"), "age=4");

    public static final BlockState WHEAT_5 = new BlockState(NamespaceID.from("minecraft:wheat_5"), (short) 3362, Block.WHEAT, new RawBlockStateData(0.0, 0, false, "DESTROY", false, false, false, false, false, false, 7, "[]"), "age=5");

    public static final BlockState WHEAT_6 = new BlockState(NamespaceID.from("minecraft:wheat_6"), (short) 3363, Block.WHEAT, new RawBlockStateData(0.0, 0, false, "DESTROY", false, false, false, false, false, false, 7, "[]"), "age=6");

    public static final BlockState WHEAT_7 = new BlockState(NamespaceID.from("minecraft:wheat_7"), (short) 3364, Block.WHEAT, new RawBlockStateData(0.0, 0, false, "DESTROY", false, false, false, false, false, false, 7, "[]"), "age=7");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(WHEAT_0);
        Registry.BLOCK_STATE_REGISTRY.register(WHEAT_1);
        Registry.BLOCK_STATE_REGISTRY.register(WHEAT_2);
        Registry.BLOCK_STATE_REGISTRY.register(WHEAT_3);
        Registry.BLOCK_STATE_REGISTRY.register(WHEAT_4);
        Registry.BLOCK_STATE_REGISTRY.register(WHEAT_5);
        Registry.BLOCK_STATE_REGISTRY.register(WHEAT_6);
        Registry.BLOCK_STATE_REGISTRY.register(WHEAT_7);
    }

    public static void initStates() {
        Block.WHEAT.addBlockState(WHEAT_0);
        Block.WHEAT.addBlockState(WHEAT_1);
        Block.WHEAT.addBlockState(WHEAT_2);
        Block.WHEAT.addBlockState(WHEAT_3);
        Block.WHEAT.addBlockState(WHEAT_4);
        Block.WHEAT.addBlockState(WHEAT_5);
        Block.WHEAT.addBlockState(WHEAT_6);
        Block.WHEAT.addBlockState(WHEAT_7);
    }
}
