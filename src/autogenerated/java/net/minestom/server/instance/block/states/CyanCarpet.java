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
public final class CyanCarpet {
  public static final BlockState CYAN_CARPET_0 = new BlockState(NamespaceID.from("minecraft:cyan_carpet:0"), (short) 7879, Block.CYAN_CARPET);

  static {
    Registries.registerBlockState(CYAN_CARPET_0);
  }

  public static void initStates() {
    Block.CYAN_CARPET.addBlockState(CYAN_CARPET_0);
  }
}