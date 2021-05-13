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
public final class GrayConcrete {
    public static final BlockState GRAY_CONCRETE_0 = new BlockState(NamespaceID.from("minecraft:gray_concrete_0"), (short) 9449, Block.GRAY_CONCRETE, new RawBlockStateData(1.8, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"));

    static {
        Registry.BLOCK_STATE_REGISTRY.register(GRAY_CONCRETE_0);
    }

    public static void initStates() {
        Block.GRAY_CONCRETE.addBlockState(GRAY_CONCRETE_0);
    }
}
