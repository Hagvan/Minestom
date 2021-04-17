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
public final class PottedWarpedRoots {
  public static final BlockState POTTED_WARPED_ROOTS_0 = new BlockState(NamespaceID.from("minecraft:potted_warped_roots:0"), (short) 15845, Block.POTTED_WARPED_ROOTS);

  static {
    Registries.registerBlockState(POTTED_WARPED_ROOTS_0);
  }

  public static void initStates() {
    Block.POTTED_WARPED_ROOTS.addBlockState(POTTED_WARPED_ROOTS_0);
  }
}