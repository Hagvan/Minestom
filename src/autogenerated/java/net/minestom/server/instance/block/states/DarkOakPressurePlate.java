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
public final class DarkOakPressurePlate {
    public static final BlockState DARK_OAK_PRESSURE_PLATE_0 = new BlockState(NamespaceID.from("minecraft:dark_oak_pressure_plate_0"), (short) 3883, Block.DARK_OAK_PRESSURE_PLATE, new RawBlockStateData(0.5, 0, false, "NORMAL", true, true, false, false, true, true, 13, "[]"), "powered=true");

    public static final BlockState DARK_OAK_PRESSURE_PLATE_1 = new BlockState(NamespaceID.from("minecraft:dark_oak_pressure_plate_1"), (short) 3884, Block.DARK_OAK_PRESSURE_PLATE, new RawBlockStateData(0.5, 0, false, "NORMAL", true, true, false, false, true, true, 13, "[]"), "powered=false");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(DARK_OAK_PRESSURE_PLATE_0);
        Registry.BLOCK_STATE_REGISTRY.register(DARK_OAK_PRESSURE_PLATE_1);
    }

    public static void initStates() {
        Block.DARK_OAK_PRESSURE_PLATE.addBlockState(DARK_OAK_PRESSURE_PLATE_0);
        Block.DARK_OAK_PRESSURE_PLATE.addBlockState(DARK_OAK_PRESSURE_PLATE_1);
    }
}
