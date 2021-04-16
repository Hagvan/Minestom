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
public final class Ice {
  public static final BlockState ICE_0 = new BlockState(NamespaceID.from("minecraft:ice:0"), (short) 3929, Block.ICE);

  public static void initStates() {
    Block.ICE.addBlockState(ICE_0);
  }
}
