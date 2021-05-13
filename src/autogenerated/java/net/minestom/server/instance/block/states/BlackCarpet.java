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
public final class BlackCarpet {
    public static final BlockState BLACK_CARPET_0 = new BlockState(NamespaceID.from("minecraft:black_carpet_0"), (short) 7885, Block.BLACK_CARPET, new RawBlockStateData(0.1, 0, true, "NORMAL", false, true, false, false, false, false, 3, "[AABB[0.0, 0.0, 0.0] -> [1.0, 0.0625, 1.0]]"));

    static {
        Registry.BLOCK_STATE_REGISTRY.register(BLACK_CARPET_0);
    }

    public static void initStates() {
        Block.BLACK_CARPET.addBlockState(BLACK_CARPET_0);
    }
}
