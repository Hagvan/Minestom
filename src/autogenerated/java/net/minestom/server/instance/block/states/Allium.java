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
public final class Allium {
  public static final BlockState ALLIUM_0 = new BlockState(NamespaceID.from("minecraft:allium:0"), (short) 1415, Block.ALLIUM);

  public static void initStates() {
    Block.ALLIUM.addBlockState(ALLIUM_0);
  }
}
