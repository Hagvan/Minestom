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
public final class RedMushroom {
    public static final BlockState RED_MUSHROOM_0 = new BlockState(NamespaceID.from("minecraft:red_mushroom_0"), (short) 1426, Block.RED_MUSHROOM, new RawBlockStateData(0.0, 0, false, "DESTROY", false, false, false, false, false, false, 7, "[]"));

    static {
        Registry.BLOCK_STATE_REGISTRY.register(RED_MUSHROOM_0);
    }

    public static void initStates() {
        Block.RED_MUSHROOM.addBlockState(RED_MUSHROOM_0);
    }
}
