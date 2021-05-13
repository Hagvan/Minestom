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
public final class JungleWood {
    public static final BlockState JUNGLE_WOOD_0 = new BlockState(NamespaceID.from("minecraft:jungle_wood_0"), (short) 118, Block.JUNGLE_WOOD, new RawBlockStateData(2.0, 0, true, "NORMAL", true, true, false, false, true, true, 13, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "axis=x");

    public static final BlockState JUNGLE_WOOD_1 = new BlockState(NamespaceID.from("minecraft:jungle_wood_1"), (short) 119, Block.JUNGLE_WOOD, new RawBlockStateData(2.0, 0, true, "NORMAL", true, true, false, false, true, true, 13, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "axis=y");

    public static final BlockState JUNGLE_WOOD_2 = new BlockState(NamespaceID.from("minecraft:jungle_wood_2"), (short) 120, Block.JUNGLE_WOOD, new RawBlockStateData(2.0, 0, true, "NORMAL", true, true, false, false, true, true, 13, "[AABB[0.0, 0.0, 0.0] -> [1.0, 1.0, 1.0]]"), "axis=z");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(JUNGLE_WOOD_0);
        Registry.BLOCK_STATE_REGISTRY.register(JUNGLE_WOOD_1);
        Registry.BLOCK_STATE_REGISTRY.register(JUNGLE_WOOD_2);
    }

    public static void initStates() {
        Block.JUNGLE_WOOD.addBlockState(JUNGLE_WOOD_0);
        Block.JUNGLE_WOOD.addBlockState(JUNGLE_WOOD_1);
        Block.JUNGLE_WOOD.addBlockState(JUNGLE_WOOD_2);
    }
}
