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
public final class BirchSlab {
    public static final BlockState BIRCH_SLAB_0 = new BlockState(NamespaceID.from("minecraft:birch_slab_0"), (short) 8316, Block.BIRCH_SLAB, new RawBlockStateData(2.0, 0, true, "NORMAL", true, true, false, false, true, true, 13, "[AABB[0.0, 0.5, 0.0] -> [1.0, 1.0, 1.0]]"), "type=top","waterlogged=true");

    public static final BlockState BIRCH_SLAB_1 = new BlockState(NamespaceID.from("minecraft:birch_slab_1"), (short) 8317, Block.BIRCH_SLAB, new RawBlockStateData(2.0, 0, true, "NORMAL", true, true, false, false, true, true, 13, "[AABB[0.0, 0.5, 0.0] -> [1.0, 1.0, 1.0]]"), "type=top","waterlogged=false");

    public static final BlockState BIRCH_SLAB_2 = new BlockState(NamespaceID.from("minecraft:birch_slab_2"), (short) 8318, Block.BIRCH_SLAB, new RawBlockStateData(2.0, 0, true, "NORMAL", true, true, false, false, true, true, 13, "[AABB[0.0, 0.0, 0.0] -> [1.0, 0.5, 1.0]]"), "type=bottom","waterlogged=true");

    public static final BlockState BIRCH_SLAB_3 = new BlockState(NamespaceID.from("minecraft:birch_slab_3"), (short) 8319, Block.BIRCH_SLAB, new RawBlockStateData(2.0, 0, true, "NORMAL", true, true, false, false, true, true, 13, "[AABB[0.0, 0.0, 0.0] -> [1.0, 0.5, 1.0]]"), "type=bottom","waterlogged=false");

    public static final BlockState BIRCH_SLAB_4 = new BlockState(NamespaceID.from("minecraft:birch_slab_4"), (short) 8320, Block.BIRCH_SLAB, new RawBlockStateData(2.0, 0, true, "NORMAL", true, true, false, false, true, true, 13, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "type=double","waterlogged=true");

    public static final BlockState BIRCH_SLAB_5 = new BlockState(NamespaceID.from("minecraft:birch_slab_5"), (short) 8321, Block.BIRCH_SLAB, new RawBlockStateData(2.0, 0, true, "NORMAL", true, true, false, false, true, true, 13, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "type=double","waterlogged=false");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(BIRCH_SLAB_0);
        Registry.BLOCK_STATE_REGISTRY.register(BIRCH_SLAB_1);
        Registry.BLOCK_STATE_REGISTRY.register(BIRCH_SLAB_2);
        Registry.BLOCK_STATE_REGISTRY.register(BIRCH_SLAB_3);
        Registry.BLOCK_STATE_REGISTRY.register(BIRCH_SLAB_4);
        Registry.BLOCK_STATE_REGISTRY.register(BIRCH_SLAB_5);
    }

    public static void initStates() {
        Block.BIRCH_SLAB.addBlockState(BIRCH_SLAB_0);
        Block.BIRCH_SLAB.addBlockState(BIRCH_SLAB_1);
        Block.BIRCH_SLAB.addBlockState(BIRCH_SLAB_2);
        Block.BIRCH_SLAB.addBlockState(BIRCH_SLAB_3);
        Block.BIRCH_SLAB.addBlockState(BIRCH_SLAB_4);
        Block.BIRCH_SLAB.addBlockState(BIRCH_SLAB_5);
    }
}
