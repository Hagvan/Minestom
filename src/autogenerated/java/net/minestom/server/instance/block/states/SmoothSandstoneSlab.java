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
public final class SmoothSandstoneSlab {
    public static final BlockState SMOOTH_SANDSTONE_SLAB_0 = new BlockState(NamespaceID.from("minecraft:smooth_sandstone_slab_0"), (short) 10829, Block.SMOOTH_SANDSTONE_SLAB, new RawBlockStateData(2.0, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.5, 0.0] -> [1.0, 1.0, 1.0]]"), "type=top","waterlogged=true");

    public static final BlockState SMOOTH_SANDSTONE_SLAB_1 = new BlockState(NamespaceID.from("minecraft:smooth_sandstone_slab_1"), (short) 10830, Block.SMOOTH_SANDSTONE_SLAB, new RawBlockStateData(2.0, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.5, 0.0] -> [1.0, 1.0, 1.0]]"), "type=top","waterlogged=false");

    public static final BlockState SMOOTH_SANDSTONE_SLAB_2 = new BlockState(NamespaceID.from("minecraft:smooth_sandstone_slab_2"), (short) 10831, Block.SMOOTH_SANDSTONE_SLAB, new RawBlockStateData(2.0, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 0.5, 1.0]]"), "type=bottom","waterlogged=true");

    public static final BlockState SMOOTH_SANDSTONE_SLAB_3 = new BlockState(NamespaceID.from("minecraft:smooth_sandstone_slab_3"), (short) 10832, Block.SMOOTH_SANDSTONE_SLAB, new RawBlockStateData(2.0, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 0.5, 1.0]]"), "type=bottom","waterlogged=false");

    public static final BlockState SMOOTH_SANDSTONE_SLAB_4 = new BlockState(NamespaceID.from("minecraft:smooth_sandstone_slab_4"), (short) 10833, Block.SMOOTH_SANDSTONE_SLAB, new RawBlockStateData(2.0, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "type=double","waterlogged=true");

    public static final BlockState SMOOTH_SANDSTONE_SLAB_5 = new BlockState(NamespaceID.from("minecraft:smooth_sandstone_slab_5"), (short) 10834, Block.SMOOTH_SANDSTONE_SLAB, new RawBlockStateData(2.0, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "type=double","waterlogged=false");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(SMOOTH_SANDSTONE_SLAB_0);
        Registry.BLOCK_STATE_REGISTRY.register(SMOOTH_SANDSTONE_SLAB_1);
        Registry.BLOCK_STATE_REGISTRY.register(SMOOTH_SANDSTONE_SLAB_2);
        Registry.BLOCK_STATE_REGISTRY.register(SMOOTH_SANDSTONE_SLAB_3);
        Registry.BLOCK_STATE_REGISTRY.register(SMOOTH_SANDSTONE_SLAB_4);
        Registry.BLOCK_STATE_REGISTRY.register(SMOOTH_SANDSTONE_SLAB_5);
    }

    public static void initStates() {
        Block.SMOOTH_SANDSTONE_SLAB.addBlockState(SMOOTH_SANDSTONE_SLAB_0);
        Block.SMOOTH_SANDSTONE_SLAB.addBlockState(SMOOTH_SANDSTONE_SLAB_1);
        Block.SMOOTH_SANDSTONE_SLAB.addBlockState(SMOOTH_SANDSTONE_SLAB_2);
        Block.SMOOTH_SANDSTONE_SLAB.addBlockState(SMOOTH_SANDSTONE_SLAB_3);
        Block.SMOOTH_SANDSTONE_SLAB.addBlockState(SMOOTH_SANDSTONE_SLAB_4);
        Block.SMOOTH_SANDSTONE_SLAB.addBlockState(SMOOTH_SANDSTONE_SLAB_5);
    }
}
