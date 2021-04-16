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
public final class GreenWool {
  public static final BlockState GREEN_WOOL_0 = new BlockState(NamespaceID.from("minecraft:green_wool:0"), (short) 1397, Block.GREEN_WOOL);

  public static void initStates() {
    Block.GREEN_WOOL.addBlockState(GREEN_WOOL_0);
  }
}
