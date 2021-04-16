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
public final class BlueOrchid {
  public static final BlockState BLUE_ORCHID_0 = new BlockState(NamespaceID.from("minecraft:blue_orchid:0"), (short) 1414, Block.BLUE_ORCHID);

  public static void initStates() {
    Block.BLUE_ORCHID.addBlockState(BLUE_ORCHID_0);
  }
}
