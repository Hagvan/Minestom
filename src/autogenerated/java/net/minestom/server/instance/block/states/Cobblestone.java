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
public final class Cobblestone {
  public static final BlockState COBBLESTONE_0 = new BlockState(NamespaceID.from("minecraft:cobblestone:0"), (short) 14, Block.COBBLESTONE);

  public static void initStates() {
    Block.COBBLESTONE.addBlockState(COBBLESTONE_0);
  }
}
