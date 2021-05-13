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
public final class Clay {
    public static final BlockState CLAY_0 = new BlockState(NamespaceID.from("minecraft:clay_0"), (short) 3947, Block.CLAY, new RawBlockStateData(0.6, 0, true, "NORMAL", true, false, false, false, true, true, 9, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"));

    static {
        Registry.BLOCK_STATE_REGISTRY.register(CLAY_0);
    }

    public static void initStates() {
        Block.CLAY.addBlockState(CLAY_0);
    }
}
