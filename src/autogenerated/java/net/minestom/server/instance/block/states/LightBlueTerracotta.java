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
public final class LightBlueTerracotta {
  public static final BlockState LIGHT_BLUE_TERRACOTTA_0 = new BlockState(NamespaceID.from("minecraft:light_blue_terracotta:0"), (short) 6854, Block.LIGHT_BLUE_TERRACOTTA);

  static {
    Registries.registerBlockState(LIGHT_BLUE_TERRACOTTA_0);
  }

  public static void initStates() {
    Block.LIGHT_BLUE_TERRACOTTA.addBlockState(LIGHT_BLUE_TERRACOTTA_0);
  }
}