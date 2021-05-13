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
public final class LilyOfTheValley {
    public static final BlockState LILY_OF_THE_VALLEY_0 = new BlockState(NamespaceID.from("minecraft:lily_of_the_valley_0"), (short) 1424, Block.LILY_OF_THE_VALLEY, new RawBlockStateData(0.0, 0, false, "DESTROY", false, false, false, false, false, false, 7, "[]"));

    static {
        Registry.BLOCK_STATE_REGISTRY.register(LILY_OF_THE_VALLEY_0);
    }

    public static void initStates() {
        Block.LILY_OF_THE_VALLEY.addBlockState(LILY_OF_THE_VALLEY_0);
    }
}
