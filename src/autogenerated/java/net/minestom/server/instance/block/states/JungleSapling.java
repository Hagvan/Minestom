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
public final class JungleSapling {
    public static final BlockState JUNGLE_SAPLING_0 = new BlockState(NamespaceID.from("minecraft:jungle_sapling_0"), (short) 27, Block.JUNGLE_SAPLING, new RawBlockStateData(0.0, 0, false, "DESTROY", false, false, false, false, false, false, 7, "[]"), "stage=0");

    public static final BlockState JUNGLE_SAPLING_1 = new BlockState(NamespaceID.from("minecraft:jungle_sapling_1"), (short) 28, Block.JUNGLE_SAPLING, new RawBlockStateData(0.0, 0, false, "DESTROY", false, false, false, false, false, false, 7, "[]"), "stage=1");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(JUNGLE_SAPLING_0);
        Registry.BLOCK_STATE_REGISTRY.register(JUNGLE_SAPLING_1);
    }

    public static void initStates() {
        Block.JUNGLE_SAPLING.addBlockState(JUNGLE_SAPLING_0);
        Block.JUNGLE_SAPLING.addBlockState(JUNGLE_SAPLING_1);
    }
}
