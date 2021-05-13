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
public final class DeadFireCoralBlock {
    public static final BlockState DEAD_FIRE_CORAL_BLOCK_0 = new BlockState(NamespaceID.from("minecraft:dead_fire_coral_block_0"), (short) 9517, Block.DEAD_FIRE_CORAL_BLOCK, new RawBlockStateData(1.5, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"));

    static {
        Registry.BLOCK_STATE_REGISTRY.register(DEAD_FIRE_CORAL_BLOCK_0);
    }

    public static void initStates() {
        Block.DEAD_FIRE_CORAL_BLOCK.addBlockState(DEAD_FIRE_CORAL_BLOCK_0);
    }
}
