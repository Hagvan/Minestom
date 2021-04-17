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
public final class MagentaTerracotta {
  public static final BlockState MAGENTA_TERRACOTTA_0 = new BlockState(NamespaceID.from("minecraft:magenta_terracotta:0"), (short) 6853, Block.MAGENTA_TERRACOTTA);

  static {
    Registries.registerBlockState(MAGENTA_TERRACOTTA_0);
  }

  public static void initStates() {
    Block.MAGENTA_TERRACOTTA.addBlockState(MAGENTA_TERRACOTTA_0);
  }
}