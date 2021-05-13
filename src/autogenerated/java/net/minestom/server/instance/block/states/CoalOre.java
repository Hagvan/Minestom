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
public final class CoalOre {
    public static final BlockState COAL_ORE_0 = new BlockState(NamespaceID.from("minecraft:coal_ore_0"), (short) 71, Block.COAL_ORE, new RawBlockStateData(3.0, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"));

    static {
        Registry.BLOCK_STATE_REGISTRY.register(COAL_ORE_0);
    }

    public static void initStates() {
        Block.COAL_ORE.addBlockState(COAL_ORE_0);
    }
}
