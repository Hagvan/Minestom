package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;
import net.minestom.server.utils.NamespaceID;

/**
 * AUTOGENERATED
 */
@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class Granite {
  public static final BlockState GRANITE_0 = new BlockState(NamespaceID.from("minecraft:granite:0"), (short) 2, Block.GRANITE);

  public static void initStates() {
    Block.GRANITE.addBlockState(GRANITE_0);
  }
}
