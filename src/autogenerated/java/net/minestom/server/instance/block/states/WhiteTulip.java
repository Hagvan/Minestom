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
public final class WhiteTulip {
    public static final BlockState WHITE_TULIP_0 = new BlockState(NamespaceID.from("minecraft:white_tulip_0"), (short) 1419, Block.WHITE_TULIP, new RawBlockStateData(0.0, 0, false, "DESTROY", false, false, false, false, false, false, 7, "[]"));

    static {
        Registry.BLOCK_STATE_REGISTRY.register(WHITE_TULIP_0);
    }

    public static void initStates() {
        Block.WHITE_TULIP.addBlockState(WHITE_TULIP_0);
    }
}
