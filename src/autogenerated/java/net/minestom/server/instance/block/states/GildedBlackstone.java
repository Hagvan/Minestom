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
public final class GildedBlackstone {
  public static final BlockState GILDED_BLACKSTONE_0 = new BlockState(NamespaceID.from("minecraft:gilded_blackstone:0"), (short) 16672, Block.GILDED_BLACKSTONE);

  static {
    Registries.registerBlockState(GILDED_BLACKSTONE_0);
  }

  public static void initStates() {
    Block.GILDED_BLACKSTONE.addBlockState(GILDED_BLACKSTONE_0);
  }
}