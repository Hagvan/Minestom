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
public final class GreenConcrete {
  public static final BlockState GREEN_CONCRETE_0 = new BlockState(NamespaceID.from("minecraft:green_concrete:0"), (short) 9455, Block.GREEN_CONCRETE);

  public static void initStates() {
    Block.GREEN_CONCRETE.addBlockState(GREEN_CONCRETE_0);
  }
}
