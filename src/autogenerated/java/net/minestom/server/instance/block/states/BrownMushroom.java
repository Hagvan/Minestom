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
public final class BrownMushroom {
    public static final BlockState BROWN_MUSHROOM_0 = new BlockState(NamespaceID.from("minecraft:brown_mushroom_0"), (short) 1425, Block.BROWN_MUSHROOM, new RawBlockStateData(0.0, 1, false, "DESTROY", false, false, false, false, false, false, 7, "[]"));

    static {
        Registry.BLOCK_STATE_REGISTRY.register(BROWN_MUSHROOM_0);
    }

    public static void initStates() {
        Block.BROWN_MUSHROOM.addBlockState(BROWN_MUSHROOM_0);
    }
}
