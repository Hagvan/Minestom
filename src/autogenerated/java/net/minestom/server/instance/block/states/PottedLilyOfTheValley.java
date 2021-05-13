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
public final class PottedLilyOfTheValley {
    public static final BlockState POTTED_LILY_OF_THE_VALLEY_0 = new BlockState(NamespaceID.from("minecraft:potted_lily_of_the_valley_0"), (short) 6328, Block.POTTED_LILY_OF_THE_VALLEY, new RawBlockStateData(0.0, 0, false, "DESTROY", false, false, false, false, false, false, 0, "[AABB[0.3125, 0.0, 0.3125] -> [0.6875, 0.375, 0.6875]]"));

    static {
        Registry.BLOCK_STATE_REGISTRY.register(POTTED_LILY_OF_THE_VALLEY_0);
    }

    public static void initStates() {
        Block.POTTED_LILY_OF_THE_VALLEY.addBlockState(POTTED_LILY_OF_THE_VALLEY_0);
    }
}
