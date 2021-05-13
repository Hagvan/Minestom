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
public final class Cornflower {
    public static final BlockState CORNFLOWER_0 = new BlockState(NamespaceID.from("minecraft:cornflower_0"), (short) 1422, Block.CORNFLOWER, new RawBlockStateData(0.0, 0, false, "DESTROY", false, false, false, false, false, false, 7, "[]"));

    static {
        Registry.BLOCK_STATE_REGISTRY.register(CORNFLOWER_0);
    }

    public static void initStates() {
        Block.CORNFLOWER.addBlockState(CORNFLOWER_0);
    }
}
