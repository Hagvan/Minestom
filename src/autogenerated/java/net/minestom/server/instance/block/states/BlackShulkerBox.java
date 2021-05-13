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
public final class BlackShulkerBox {
    public static final BlockState BLACK_SHULKER_BOX_0 = new BlockState(NamespaceID.from("minecraft:black_shulker_box_0"), (short) 9372, Block.BLACK_SHULKER_BOX, new RawBlockStateData(2.0, 0, false, "NORMAL", true, false, false, false, true, true, 24, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "facing=north");

    public static final BlockState BLACK_SHULKER_BOX_1 = new BlockState(NamespaceID.from("minecraft:black_shulker_box_1"), (short) 9373, Block.BLACK_SHULKER_BOX, new RawBlockStateData(2.0, 0, false, "NORMAL", true, false, false, false, true, true, 24, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "facing=east");

    public static final BlockState BLACK_SHULKER_BOX_2 = new BlockState(NamespaceID.from("minecraft:black_shulker_box_2"), (short) 9374, Block.BLACK_SHULKER_BOX, new RawBlockStateData(2.0, 0, false, "NORMAL", true, false, false, false, true, true, 24, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "facing=south");

    public static final BlockState BLACK_SHULKER_BOX_3 = new BlockState(NamespaceID.from("minecraft:black_shulker_box_3"), (short) 9375, Block.BLACK_SHULKER_BOX, new RawBlockStateData(2.0, 0, false, "NORMAL", true, false, false, false, true, true, 24, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "facing=west");

    public static final BlockState BLACK_SHULKER_BOX_4 = new BlockState(NamespaceID.from("minecraft:black_shulker_box_4"), (short) 9376, Block.BLACK_SHULKER_BOX, new RawBlockStateData(2.0, 0, false, "NORMAL", true, false, false, false, true, true, 24, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "facing=up");

    public static final BlockState BLACK_SHULKER_BOX_5 = new BlockState(NamespaceID.from("minecraft:black_shulker_box_5"), (short) 9377, Block.BLACK_SHULKER_BOX, new RawBlockStateData(2.0, 0, false, "NORMAL", true, false, false, false, true, true, 24, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "facing=down");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(BLACK_SHULKER_BOX_0);
        Registry.BLOCK_STATE_REGISTRY.register(BLACK_SHULKER_BOX_1);
        Registry.BLOCK_STATE_REGISTRY.register(BLACK_SHULKER_BOX_2);
        Registry.BLOCK_STATE_REGISTRY.register(BLACK_SHULKER_BOX_3);
        Registry.BLOCK_STATE_REGISTRY.register(BLACK_SHULKER_BOX_4);
        Registry.BLOCK_STATE_REGISTRY.register(BLACK_SHULKER_BOX_5);
    }

    public static void initStates() {
        Block.BLACK_SHULKER_BOX.addBlockState(BLACK_SHULKER_BOX_0);
        Block.BLACK_SHULKER_BOX.addBlockState(BLACK_SHULKER_BOX_1);
        Block.BLACK_SHULKER_BOX.addBlockState(BLACK_SHULKER_BOX_2);
        Block.BLACK_SHULKER_BOX.addBlockState(BLACK_SHULKER_BOX_3);
        Block.BLACK_SHULKER_BOX.addBlockState(BLACK_SHULKER_BOX_4);
        Block.BLACK_SHULKER_BOX.addBlockState(BLACK_SHULKER_BOX_5);
    }
}
