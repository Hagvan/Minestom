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
public final class PottedCrimsonFungus {
    public static final BlockState POTTED_CRIMSON_FUNGUS_0 = new BlockState(NamespaceID.from("minecraft:potted_crimson_fungus_0"), (short) 15842, Block.POTTED_CRIMSON_FUNGUS, new RawBlockStateData(0.0, 0, false, "DESTROY", false, false, false, false, false, false, 0, "[AABB[0.3125, 0.0, 0.3125] -> [0.6875, 0.375, 0.6875]]"));

    static {
        Registry.BLOCK_STATE_REGISTRY.register(POTTED_CRIMSON_FUNGUS_0);
    }

    public static void initStates() {
        Block.POTTED_CRIMSON_FUNGUS.addBlockState(POTTED_CRIMSON_FUNGUS_0);
    }
}
