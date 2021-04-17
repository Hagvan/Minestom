package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;
import net.minestom.server.registry.Registries;
import net.minestom.server.utils.NamespaceID;

/**
 * AUTOGENERATED
 */
@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class PottedSpruceSapling {
  public static final BlockState POTTED_SPRUCE_SAPLING_0 = new BlockState(NamespaceID.from("minecraft:potted_spruce_sapling:0"), (short) 6311, Block.POTTED_SPRUCE_SAPLING);

  static {
    Registries.registerBlockState(POTTED_SPRUCE_SAPLING_0);
  }

  public static void initStates() {
    Block.POTTED_SPRUCE_SAPLING.addBlockState(POTTED_SPRUCE_SAPLING_0);
  }
}