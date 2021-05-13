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
public final class AncientDebris {
    public static final BlockState ANCIENT_DEBRIS_0 = new BlockState(NamespaceID.from("minecraft:ancient_debris_0"), (short) 15835, Block.ANCIENT_DEBRIS, new RawBlockStateData(30.0, 0, true, "NORMAL", true, false, false, false, true, true, 6, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"));

    static {
        Registry.BLOCK_STATE_REGISTRY.register(ANCIENT_DEBRIS_0);
    }

    public static void initStates() {
        Block.ANCIENT_DEBRIS.addBlockState(ANCIENT_DEBRIS_0);
    }
}
