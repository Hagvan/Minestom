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
public final class Beetroots {
    public static final BlockState BEETROOTS_0 = new BlockState(NamespaceID.from("minecraft:beetroots_0"), (short) 9223, Block.BEETROOTS, new RawBlockStateData(0.0, 0, false, "DESTROY", false, false, false, false, false, false, 7, "[]"), "age=0");

    public static final BlockState BEETROOTS_1 = new BlockState(NamespaceID.from("minecraft:beetroots_1"), (short) 9224, Block.BEETROOTS, new RawBlockStateData(0.0, 0, false, "DESTROY", false, false, false, false, false, false, 7, "[]"), "age=1");

    public static final BlockState BEETROOTS_2 = new BlockState(NamespaceID.from("minecraft:beetroots_2"), (short) 9225, Block.BEETROOTS, new RawBlockStateData(0.0, 0, false, "DESTROY", false, false, false, false, false, false, 7, "[]"), "age=2");

    public static final BlockState BEETROOTS_3 = new BlockState(NamespaceID.from("minecraft:beetroots_3"), (short) 9226, Block.BEETROOTS, new RawBlockStateData(0.0, 0, false, "DESTROY", false, false, false, false, false, false, 7, "[]"), "age=3");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(BEETROOTS_0);
        Registry.BLOCK_STATE_REGISTRY.register(BEETROOTS_1);
        Registry.BLOCK_STATE_REGISTRY.register(BEETROOTS_2);
        Registry.BLOCK_STATE_REGISTRY.register(BEETROOTS_3);
    }

    public static void initStates() {
        Block.BEETROOTS.addBlockState(BEETROOTS_0);
        Block.BEETROOTS.addBlockState(BEETROOTS_1);
        Block.BEETROOTS.addBlockState(BEETROOTS_2);
        Block.BEETROOTS.addBlockState(BEETROOTS_3);
    }
}
