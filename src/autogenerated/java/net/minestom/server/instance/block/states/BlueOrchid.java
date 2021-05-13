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
public final class BlueOrchid {
    public static final BlockState BLUE_ORCHID_0 = new BlockState(NamespaceID.from("minecraft:blue_orchid_0"), (short) 1414, Block.BLUE_ORCHID, new RawBlockStateData(0.0, 0, false, "DESTROY", false, false, false, false, false, false, 7, "[]"));

    static {
        Registry.BLOCK_STATE_REGISTRY.register(BLUE_ORCHID_0);
    }

    public static void initStates() {
        Block.BLUE_ORCHID.addBlockState(BLUE_ORCHID_0);
    }
}
