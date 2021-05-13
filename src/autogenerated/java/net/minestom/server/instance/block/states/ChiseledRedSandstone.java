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
public final class ChiseledRedSandstone {
    public static final BlockState CHISELED_RED_SANDSTONE_0 = new BlockState(NamespaceID.from("minecraft:chiseled_red_sandstone_0"), (short) 8222, Block.CHISELED_RED_SANDSTONE, new RawBlockStateData(0.8, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"));

    static {
        Registry.BLOCK_STATE_REGISTRY.register(CHISELED_RED_SANDSTONE_0);
    }

    public static void initStates() {
        Block.CHISELED_RED_SANDSTONE.addBlockState(CHISELED_RED_SANDSTONE_0);
    }
}
