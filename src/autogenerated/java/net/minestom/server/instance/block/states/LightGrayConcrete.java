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
public final class LightGrayConcrete {
    public static final BlockState LIGHT_GRAY_CONCRETE_0 = new BlockState(NamespaceID.from("minecraft:light_gray_concrete_0"), (short) 9450, Block.LIGHT_GRAY_CONCRETE, new RawBlockStateData(1.8, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"));

    static {
        Registry.BLOCK_STATE_REGISTRY.register(LIGHT_GRAY_CONCRETE_0);
    }

    public static void initStates() {
        Block.LIGHT_GRAY_CONCRETE.addBlockState(LIGHT_GRAY_CONCRETE_0);
    }
}
