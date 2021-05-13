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
public final class JungleLog {
    public static final BlockState JUNGLE_LOG_0 = new BlockState(NamespaceID.from("minecraft:jungle_log_0"), (short) 82, Block.JUNGLE_LOG, new RawBlockStateData(2.0, 0, true, "NORMAL", true, true, false, false, true, true, 13, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "axis=x");

    public static final BlockState JUNGLE_LOG_1 = new BlockState(NamespaceID.from("minecraft:jungle_log_1"), (short) 83, Block.JUNGLE_LOG, new RawBlockStateData(2.0, 0, true, "NORMAL", true, true, false, false, true, true, 13, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "axis=y");

    public static final BlockState JUNGLE_LOG_2 = new BlockState(NamespaceID.from("minecraft:jungle_log_2"), (short) 84, Block.JUNGLE_LOG, new RawBlockStateData(2.0, 0, true, "NORMAL", true, true, false, false, true, true, 13, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "axis=z");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(JUNGLE_LOG_0);
        Registry.BLOCK_STATE_REGISTRY.register(JUNGLE_LOG_1);
        Registry.BLOCK_STATE_REGISTRY.register(JUNGLE_LOG_2);
    }

    public static void initStates() {
        Block.JUNGLE_LOG.addBlockState(JUNGLE_LOG_0);
        Block.JUNGLE_LOG.addBlockState(JUNGLE_LOG_1);
        Block.JUNGLE_LOG.addBlockState(JUNGLE_LOG_2);
    }
}
