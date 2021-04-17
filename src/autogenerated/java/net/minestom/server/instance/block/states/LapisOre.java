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
public final class LapisOre {
  public static final BlockState LAPIS_ORE_0 = new BlockState(NamespaceID.from("minecraft:lapis_ore:0"), (short) 232, Block.LAPIS_ORE);

  static {
    Registries.registerBlockState(LAPIS_ORE_0);
  }

  public static void initStates() {
    Block.LAPIS_ORE.addBlockState(LAPIS_ORE_0);
  }
}