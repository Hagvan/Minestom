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
public final class Basalt {
    public static final BlockState BASALT_0 = new BlockState(NamespaceID.from("minecraft:basalt_0"), (short) 4002, Block.BASALT, new RawBlockStateData(1.25, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "axis=x");

    public static final BlockState BASALT_1 = new BlockState(NamespaceID.from("minecraft:basalt_1"), (short) 4003, Block.BASALT, new RawBlockStateData(1.25, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "axis=y");

    public static final BlockState BASALT_2 = new BlockState(NamespaceID.from("minecraft:basalt_2"), (short) 4004, Block.BASALT, new RawBlockStateData(1.25, 0, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "axis=z");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(BASALT_0);
        Registry.BLOCK_STATE_REGISTRY.register(BASALT_1);
        Registry.BLOCK_STATE_REGISTRY.register(BASALT_2);
    }

    public static void initStates() {
        Block.BASALT.addBlockState(BASALT_0);
        Block.BASALT.addBlockState(BASALT_1);
        Block.BASALT.addBlockState(BASALT_2);
    }
}
