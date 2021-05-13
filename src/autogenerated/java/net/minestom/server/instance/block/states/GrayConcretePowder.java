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
public final class GrayConcretePowder {
    public static final BlockState GRAY_CONCRETE_POWDER_0 = new BlockState(NamespaceID.from("minecraft:gray_concrete_powder_0"), (short) 9465, Block.GRAY_CONCRETE_POWDER, new RawBlockStateData(0.5, 0, true, "NORMAL", true, false, false, false, true, true, 2, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"));

    static {
        Registry.BLOCK_STATE_REGISTRY.register(GRAY_CONCRETE_POWDER_0);
    }

    public static void initStates() {
        Block.GRAY_CONCRETE_POWDER.addBlockState(GRAY_CONCRETE_POWDER_0);
    }
}
