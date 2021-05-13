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
public final class SandstoneSlab {
    public static final BlockState SANDSTONE_SLAB_0 = new BlockState(NamespaceID.from("minecraft:sandstone_slab_0"), (short) 8352, Block.SANDSTONE_SLAB, new RawBlockStateData(2.0, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.5, 0.0] -> [1.0, 1.0, 1.0]]"), "type=top","waterlogged=true");

    public static final BlockState SANDSTONE_SLAB_1 = new BlockState(NamespaceID.from("minecraft:sandstone_slab_1"), (short) 8353, Block.SANDSTONE_SLAB, new RawBlockStateData(2.0, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.5, 0.0] -> [1.0, 1.0, 1.0]]"), "type=top","waterlogged=false");

    public static final BlockState SANDSTONE_SLAB_2 = new BlockState(NamespaceID.from("minecraft:sandstone_slab_2"), (short) 8354, Block.SANDSTONE_SLAB, new RawBlockStateData(2.0, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 0.5, 1.0]]"), "type=bottom","waterlogged=true");

    public static final BlockState SANDSTONE_SLAB_3 = new BlockState(NamespaceID.from("minecraft:sandstone_slab_3"), (short) 8355, Block.SANDSTONE_SLAB, new RawBlockStateData(2.0, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 0.5, 1.0]]"), "type=bottom","waterlogged=false");

    public static final BlockState SANDSTONE_SLAB_4 = new BlockState(NamespaceID.from("minecraft:sandstone_slab_4"), (short) 8356, Block.SANDSTONE_SLAB, new RawBlockStateData(2.0, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "type=double","waterlogged=true");

    public static final BlockState SANDSTONE_SLAB_5 = new BlockState(NamespaceID.from("minecraft:sandstone_slab_5"), (short) 8357, Block.SANDSTONE_SLAB, new RawBlockStateData(2.0, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "type=double","waterlogged=false");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(SANDSTONE_SLAB_0);
        Registry.BLOCK_STATE_REGISTRY.register(SANDSTONE_SLAB_1);
        Registry.BLOCK_STATE_REGISTRY.register(SANDSTONE_SLAB_2);
        Registry.BLOCK_STATE_REGISTRY.register(SANDSTONE_SLAB_3);
        Registry.BLOCK_STATE_REGISTRY.register(SANDSTONE_SLAB_4);
        Registry.BLOCK_STATE_REGISTRY.register(SANDSTONE_SLAB_5);
    }

    public static void initStates() {
        Block.SANDSTONE_SLAB.addBlockState(SANDSTONE_SLAB_0);
        Block.SANDSTONE_SLAB.addBlockState(SANDSTONE_SLAB_1);
        Block.SANDSTONE_SLAB.addBlockState(SANDSTONE_SLAB_2);
        Block.SANDSTONE_SLAB.addBlockState(SANDSTONE_SLAB_3);
        Block.SANDSTONE_SLAB.addBlockState(SANDSTONE_SLAB_4);
        Block.SANDSTONE_SLAB.addBlockState(SANDSTONE_SLAB_5);
    }
}
