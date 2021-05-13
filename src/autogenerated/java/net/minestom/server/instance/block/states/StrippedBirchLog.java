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
public final class StrippedBirchLog {
    public static final BlockState STRIPPED_BIRCH_LOG_0 = new BlockState(NamespaceID.from("minecraft:stripped_birch_log_0"), (short) 94, Block.STRIPPED_BIRCH_LOG, new RawBlockStateData(2.0, 0, true, "NORMAL", true, true, false, false, true, true, 13, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "axis=x");

    public static final BlockState STRIPPED_BIRCH_LOG_1 = new BlockState(NamespaceID.from("minecraft:stripped_birch_log_1"), (short) 95, Block.STRIPPED_BIRCH_LOG, new RawBlockStateData(2.0, 0, true, "NORMAL", true, true, false, false, true, true, 13, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "axis=y");

    public static final BlockState STRIPPED_BIRCH_LOG_2 = new BlockState(NamespaceID.from("minecraft:stripped_birch_log_2"), (short) 96, Block.STRIPPED_BIRCH_LOG, new RawBlockStateData(2.0, 0, true, "NORMAL", true, true, false, false, true, true, 13, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "axis=z");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(STRIPPED_BIRCH_LOG_0);
        Registry.BLOCK_STATE_REGISTRY.register(STRIPPED_BIRCH_LOG_1);
        Registry.BLOCK_STATE_REGISTRY.register(STRIPPED_BIRCH_LOG_2);
    }

    public static void initStates() {
        Block.STRIPPED_BIRCH_LOG.addBlockState(STRIPPED_BIRCH_LOG_0);
        Block.STRIPPED_BIRCH_LOG.addBlockState(STRIPPED_BIRCH_LOG_1);
        Block.STRIPPED_BIRCH_LOG.addBlockState(STRIPPED_BIRCH_LOG_2);
    }
}
