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
public final class KelpPlant {
    public static final BlockState KELP_PLANT_0 = new BlockState(NamespaceID.from("minecraft:kelp_plant_0"), (short) 9500, Block.KELP_PLANT, new RawBlockStateData(0.0, 0, false, "DESTROY", false, false, false, false, false, false, 12, "[]"));

    static {
        Registry.BLOCK_STATE_REGISTRY.register(KELP_PLANT_0);
    }

    public static void initStates() {
        Block.KELP_PLANT.addBlockState(KELP_PLANT_0);
    }
}
