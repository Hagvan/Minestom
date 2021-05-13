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
public final class Pumpkin {
    public static final BlockState PUMPKIN_0 = new BlockState(NamespaceID.from("minecraft:pumpkin_0"), (short) 3998, Block.PUMPKIN, new RawBlockStateData(1.0, 0, true, "DESTROY", true, false, false, false, true, true, 7, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"));

    static {
        Registry.BLOCK_STATE_REGISTRY.register(PUMPKIN_0);
    }

    public static void initStates() {
        Block.PUMPKIN.addBlockState(PUMPKIN_0);
    }
}
