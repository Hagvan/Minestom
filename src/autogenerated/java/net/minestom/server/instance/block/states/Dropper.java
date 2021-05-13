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
public final class Dropper {
    public static final BlockState DROPPER_0 = new BlockState(NamespaceID.from("minecraft:dropper_0"), (short) 6839, Block.DROPPER, new RawBlockStateData(3.5, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "facing=north","triggered=true");

    public static final BlockState DROPPER_1 = new BlockState(NamespaceID.from("minecraft:dropper_1"), (short) 6840, Block.DROPPER, new RawBlockStateData(3.5, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "facing=north","triggered=false");

    public static final BlockState DROPPER_2 = new BlockState(NamespaceID.from("minecraft:dropper_2"), (short) 6841, Block.DROPPER, new RawBlockStateData(3.5, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "facing=east","triggered=true");

    public static final BlockState DROPPER_3 = new BlockState(NamespaceID.from("minecraft:dropper_3"), (short) 6842, Block.DROPPER, new RawBlockStateData(3.5, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "facing=east","triggered=false");

    public static final BlockState DROPPER_4 = new BlockState(NamespaceID.from("minecraft:dropper_4"), (short) 6843, Block.DROPPER, new RawBlockStateData(3.5, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "facing=south","triggered=true");

    public static final BlockState DROPPER_5 = new BlockState(NamespaceID.from("minecraft:dropper_5"), (short) 6844, Block.DROPPER, new RawBlockStateData(3.5, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "facing=south","triggered=false");

    public static final BlockState DROPPER_6 = new BlockState(NamespaceID.from("minecraft:dropper_6"), (short) 6845, Block.DROPPER, new RawBlockStateData(3.5, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "facing=west","triggered=true");

    public static final BlockState DROPPER_7 = new BlockState(NamespaceID.from("minecraft:dropper_7"), (short) 6846, Block.DROPPER, new RawBlockStateData(3.5, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "facing=west","triggered=false");

    public static final BlockState DROPPER_8 = new BlockState(NamespaceID.from("minecraft:dropper_8"), (short) 6847, Block.DROPPER, new RawBlockStateData(3.5, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "facing=up","triggered=true");

    public static final BlockState DROPPER_9 = new BlockState(NamespaceID.from("minecraft:dropper_9"), (short) 6848, Block.DROPPER, new RawBlockStateData(3.5, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "facing=up","triggered=false");

    public static final BlockState DROPPER_10 = new BlockState(NamespaceID.from("minecraft:dropper_10"), (short) 6849, Block.DROPPER, new RawBlockStateData(3.5, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "facing=down","triggered=true");

    public static final BlockState DROPPER_11 = new BlockState(NamespaceID.from("minecraft:dropper_11"), (short) 6850, Block.DROPPER, new RawBlockStateData(3.5, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "facing=down","triggered=false");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(DROPPER_0);
        Registry.BLOCK_STATE_REGISTRY.register(DROPPER_1);
        Registry.BLOCK_STATE_REGISTRY.register(DROPPER_2);
        Registry.BLOCK_STATE_REGISTRY.register(DROPPER_3);
        Registry.BLOCK_STATE_REGISTRY.register(DROPPER_4);
        Registry.BLOCK_STATE_REGISTRY.register(DROPPER_5);
        Registry.BLOCK_STATE_REGISTRY.register(DROPPER_6);
        Registry.BLOCK_STATE_REGISTRY.register(DROPPER_7);
        Registry.BLOCK_STATE_REGISTRY.register(DROPPER_8);
        Registry.BLOCK_STATE_REGISTRY.register(DROPPER_9);
        Registry.BLOCK_STATE_REGISTRY.register(DROPPER_10);
        Registry.BLOCK_STATE_REGISTRY.register(DROPPER_11);
    }

    public static void initStates() {
        Block.DROPPER.addBlockState(DROPPER_0);
        Block.DROPPER.addBlockState(DROPPER_1);
        Block.DROPPER.addBlockState(DROPPER_2);
        Block.DROPPER.addBlockState(DROPPER_3);
        Block.DROPPER.addBlockState(DROPPER_4);
        Block.DROPPER.addBlockState(DROPPER_5);
        Block.DROPPER.addBlockState(DROPPER_6);
        Block.DROPPER.addBlockState(DROPPER_7);
        Block.DROPPER.addBlockState(DROPPER_8);
        Block.DROPPER.addBlockState(DROPPER_9);
        Block.DROPPER.addBlockState(DROPPER_10);
        Block.DROPPER.addBlockState(DROPPER_11);
    }
}
