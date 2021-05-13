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
public final class AttachedPumpkinStem {
    public static final BlockState ATTACHED_PUMPKIN_STEM_0 = new BlockState(NamespaceID.from("minecraft:attached_pumpkin_stem_0"), (short) 4768, Block.ATTACHED_PUMPKIN_STEM, new RawBlockStateData(0.0, 0, false, "DESTROY", false, false, false, false, false, false, 7, "[]"), "facing=north");

    public static final BlockState ATTACHED_PUMPKIN_STEM_1 = new BlockState(NamespaceID.from("minecraft:attached_pumpkin_stem_1"), (short) 4769, Block.ATTACHED_PUMPKIN_STEM, new RawBlockStateData(0.0, 0, false, "DESTROY", false, false, false, false, false, false, 7, "[]"), "facing=south");

    public static final BlockState ATTACHED_PUMPKIN_STEM_2 = new BlockState(NamespaceID.from("minecraft:attached_pumpkin_stem_2"), (short) 4770, Block.ATTACHED_PUMPKIN_STEM, new RawBlockStateData(0.0, 0, false, "DESTROY", false, false, false, false, false, false, 7, "[]"), "facing=west");

    public static final BlockState ATTACHED_PUMPKIN_STEM_3 = new BlockState(NamespaceID.from("minecraft:attached_pumpkin_stem_3"), (short) 4771, Block.ATTACHED_PUMPKIN_STEM, new RawBlockStateData(0.0, 0, false, "DESTROY", false, false, false, false, false, false, 7, "[]"), "facing=east");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(ATTACHED_PUMPKIN_STEM_0);
        Registry.BLOCK_STATE_REGISTRY.register(ATTACHED_PUMPKIN_STEM_1);
        Registry.BLOCK_STATE_REGISTRY.register(ATTACHED_PUMPKIN_STEM_2);
        Registry.BLOCK_STATE_REGISTRY.register(ATTACHED_PUMPKIN_STEM_3);
    }

    public static void initStates() {
        Block.ATTACHED_PUMPKIN_STEM.addBlockState(ATTACHED_PUMPKIN_STEM_0);
        Block.ATTACHED_PUMPKIN_STEM.addBlockState(ATTACHED_PUMPKIN_STEM_1);
        Block.ATTACHED_PUMPKIN_STEM.addBlockState(ATTACHED_PUMPKIN_STEM_2);
        Block.ATTACHED_PUMPKIN_STEM.addBlockState(ATTACHED_PUMPKIN_STEM_3);
    }
}
