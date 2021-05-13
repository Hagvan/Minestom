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
public final class GoldOre {
    public static final BlockState GOLD_ORE_0 = new BlockState(NamespaceID.from("minecraft:gold_ore_0"), (short) 69, Block.GOLD_ORE, new RawBlockStateData(3.0, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"));

    static {
        Registry.BLOCK_STATE_REGISTRY.register(GOLD_ORE_0);
    }

    public static void initStates() {
        Block.GOLD_ORE.addBlockState(GOLD_ORE_0);
    }
}
