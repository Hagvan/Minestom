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
public final class OrangeTulip {
    public static final BlockState ORANGE_TULIP_0 = new BlockState(NamespaceID.from("minecraft:orange_tulip_0"), (short) 1418, Block.ORANGE_TULIP, new RawBlockStateData(0.0, 0, false, "DESTROY", false, false, false, false, false, false, 7, "[]"));

    static {
        Registry.BLOCK_STATE_REGISTRY.register(ORANGE_TULIP_0);
    }

    public static void initStates() {
        Block.ORANGE_TULIP.addBlockState(ORANGE_TULIP_0);
    }
}
