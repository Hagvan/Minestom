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
public final class PurpurSlab {
    public static final BlockState PURPUR_SLAB_0 = new BlockState(NamespaceID.from("minecraft:purpur_slab_0"), (short) 8412, Block.PURPUR_SLAB, new RawBlockStateData(2.0, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.5, 0.0] -> [1.0, 1.0, 1.0]]"), "type=top","waterlogged=true");

    public static final BlockState PURPUR_SLAB_1 = new BlockState(NamespaceID.from("minecraft:purpur_slab_1"), (short) 8413, Block.PURPUR_SLAB, new RawBlockStateData(2.0, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.5, 0.0] -> [1.0, 1.0, 1.0]]"), "type=top","waterlogged=false");

    public static final BlockState PURPUR_SLAB_2 = new BlockState(NamespaceID.from("minecraft:purpur_slab_2"), (short) 8414, Block.PURPUR_SLAB, new RawBlockStateData(2.0, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 0.5, 1.0]]"), "type=bottom","waterlogged=true");

    public static final BlockState PURPUR_SLAB_3 = new BlockState(NamespaceID.from("minecraft:purpur_slab_3"), (short) 8415, Block.PURPUR_SLAB, new RawBlockStateData(2.0, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 0.5, 1.0]]"), "type=bottom","waterlogged=false");

    public static final BlockState PURPUR_SLAB_4 = new BlockState(NamespaceID.from("minecraft:purpur_slab_4"), (short) 8416, Block.PURPUR_SLAB, new RawBlockStateData(2.0, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "type=double","waterlogged=true");

    public static final BlockState PURPUR_SLAB_5 = new BlockState(NamespaceID.from("minecraft:purpur_slab_5"), (short) 8417, Block.PURPUR_SLAB, new RawBlockStateData(2.0, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "type=double","waterlogged=false");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(PURPUR_SLAB_0);
        Registry.BLOCK_STATE_REGISTRY.register(PURPUR_SLAB_1);
        Registry.BLOCK_STATE_REGISTRY.register(PURPUR_SLAB_2);
        Registry.BLOCK_STATE_REGISTRY.register(PURPUR_SLAB_3);
        Registry.BLOCK_STATE_REGISTRY.register(PURPUR_SLAB_4);
        Registry.BLOCK_STATE_REGISTRY.register(PURPUR_SLAB_5);
    }

    public static void initStates() {
        Block.PURPUR_SLAB.addBlockState(PURPUR_SLAB_0);
        Block.PURPUR_SLAB.addBlockState(PURPUR_SLAB_1);
        Block.PURPUR_SLAB.addBlockState(PURPUR_SLAB_2);
        Block.PURPUR_SLAB.addBlockState(PURPUR_SLAB_3);
        Block.PURPUR_SLAB.addBlockState(PURPUR_SLAB_4);
        Block.PURPUR_SLAB.addBlockState(PURPUR_SLAB_5);
    }
}
