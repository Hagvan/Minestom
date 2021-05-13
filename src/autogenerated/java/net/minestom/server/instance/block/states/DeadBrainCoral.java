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
public final class DeadBrainCoral {
    public static final BlockState DEAD_BRAIN_CORAL_0 = new BlockState(NamespaceID.from("minecraft:dead_brain_coral_0"), (short) 9526, Block.DEAD_BRAIN_CORAL, new RawBlockStateData(0.0, 0, false, "NORMAL", true, false, false, false, true, true, 11, "[]"), "waterlogged=true");

    public static final BlockState DEAD_BRAIN_CORAL_1 = new BlockState(NamespaceID.from("minecraft:dead_brain_coral_1"), (short) 9527, Block.DEAD_BRAIN_CORAL, new RawBlockStateData(0.0, 0, false, "NORMAL", true, false, false, false, true, true, 11, "[]"), "waterlogged=false");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(DEAD_BRAIN_CORAL_0);
        Registry.BLOCK_STATE_REGISTRY.register(DEAD_BRAIN_CORAL_1);
    }

    public static void initStates() {
        Block.DEAD_BRAIN_CORAL.addBlockState(DEAD_BRAIN_CORAL_0);
        Block.DEAD_BRAIN_CORAL.addBlockState(DEAD_BRAIN_CORAL_1);
    }
}
