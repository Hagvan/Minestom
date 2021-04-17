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
public final class Barrier {
  public static final BlockState BARRIER_0 = new BlockState(NamespaceID.from("minecraft:barrier:0"), (short) 7540, Block.BARRIER);

  static {
    Registries.registerBlockState(BARRIER_0);
  }

  public static void initStates() {
    Block.BARRIER.addBlockState(BARRIER_0);
  }
}