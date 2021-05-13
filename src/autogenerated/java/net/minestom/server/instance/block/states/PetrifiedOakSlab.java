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
public final class PetrifiedOakSlab {
    public static final BlockState PETRIFIED_OAK_SLAB_0 = new BlockState(NamespaceID.from("minecraft:petrified_oak_slab_0"), (short) 8364, Block.PETRIFIED_OAK_SLAB, new RawBlockStateData(2.0, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.5, 0.0] -> [1.0, 1.0, 1.0]]"), "type=top","waterlogged=true");

    public static final BlockState PETRIFIED_OAK_SLAB_1 = new BlockState(NamespaceID.from("minecraft:petrified_oak_slab_1"), (short) 8365, Block.PETRIFIED_OAK_SLAB, new RawBlockStateData(2.0, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.5, 0.0] -> [1.0, 1.0, 1.0]]"), "type=top","waterlogged=false");

    public static final BlockState PETRIFIED_OAK_SLAB_2 = new BlockState(NamespaceID.from("minecraft:petrified_oak_slab_2"), (short) 8366, Block.PETRIFIED_OAK_SLAB, new RawBlockStateData(2.0, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 0.5, 1.0]]"), "type=bottom","waterlogged=true");

    public static final BlockState PETRIFIED_OAK_SLAB_3 = new BlockState(NamespaceID.from("minecraft:petrified_oak_slab_3"), (short) 8367, Block.PETRIFIED_OAK_SLAB, new RawBlockStateData(2.0, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 0.5, 1.0]]"), "type=bottom","waterlogged=false");

    public static final BlockState PETRIFIED_OAK_SLAB_4 = new BlockState(NamespaceID.from("minecraft:petrified_oak_slab_4"), (short) 8368, Block.PETRIFIED_OAK_SLAB, new RawBlockStateData(2.0, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "type=double","waterlogged=true");

    public static final BlockState PETRIFIED_OAK_SLAB_5 = new BlockState(NamespaceID.from("minecraft:petrified_oak_slab_5"), (short) 8369, Block.PETRIFIED_OAK_SLAB, new RawBlockStateData(2.0, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "type=double","waterlogged=false");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(PETRIFIED_OAK_SLAB_0);
        Registry.BLOCK_STATE_REGISTRY.register(PETRIFIED_OAK_SLAB_1);
        Registry.BLOCK_STATE_REGISTRY.register(PETRIFIED_OAK_SLAB_2);
        Registry.BLOCK_STATE_REGISTRY.register(PETRIFIED_OAK_SLAB_3);
        Registry.BLOCK_STATE_REGISTRY.register(PETRIFIED_OAK_SLAB_4);
        Registry.BLOCK_STATE_REGISTRY.register(PETRIFIED_OAK_SLAB_5);
    }

    public static void initStates() {
        Block.PETRIFIED_OAK_SLAB.addBlockState(PETRIFIED_OAK_SLAB_0);
        Block.PETRIFIED_OAK_SLAB.addBlockState(PETRIFIED_OAK_SLAB_1);
        Block.PETRIFIED_OAK_SLAB.addBlockState(PETRIFIED_OAK_SLAB_2);
        Block.PETRIFIED_OAK_SLAB.addBlockState(PETRIFIED_OAK_SLAB_3);
        Block.PETRIFIED_OAK_SLAB.addBlockState(PETRIFIED_OAK_SLAB_4);
        Block.PETRIFIED_OAK_SLAB.addBlockState(PETRIFIED_OAK_SLAB_5);
    }
}
