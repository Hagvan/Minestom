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
public final class StrippedDarkOakLog {
    public static final BlockState STRIPPED_DARK_OAK_LOG_0 = new BlockState(NamespaceID.from("minecraft:stripped_dark_oak_log_0"), (short) 103, Block.STRIPPED_DARK_OAK_LOG, new RawBlockStateData(2.0, 0, true, "NORMAL", true, true, false, false, true, true, 13, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "axis=x");

    public static final BlockState STRIPPED_DARK_OAK_LOG_1 = new BlockState(NamespaceID.from("minecraft:stripped_dark_oak_log_1"), (short) 104, Block.STRIPPED_DARK_OAK_LOG, new RawBlockStateData(2.0, 0, true, "NORMAL", true, true, false, false, true, true, 13, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "axis=y");

    public static final BlockState STRIPPED_DARK_OAK_LOG_2 = new BlockState(NamespaceID.from("minecraft:stripped_dark_oak_log_2"), (short) 105, Block.STRIPPED_DARK_OAK_LOG, new RawBlockStateData(2.0, 0, true, "NORMAL", true, true, false, false, true, true, 13, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "axis=z");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(STRIPPED_DARK_OAK_LOG_0);
        Registry.BLOCK_STATE_REGISTRY.register(STRIPPED_DARK_OAK_LOG_1);
        Registry.BLOCK_STATE_REGISTRY.register(STRIPPED_DARK_OAK_LOG_2);
    }

    public static void initStates() {
        Block.STRIPPED_DARK_OAK_LOG.addBlockState(STRIPPED_DARK_OAK_LOG_0);
        Block.STRIPPED_DARK_OAK_LOG.addBlockState(STRIPPED_DARK_OAK_LOG_1);
        Block.STRIPPED_DARK_OAK_LOG.addBlockState(STRIPPED_DARK_OAK_LOG_2);
    }
}
