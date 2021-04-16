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
public final class BlueWool {
  public static final BlockState BLUE_WOOL_0 = new BlockState(NamespaceID.from("minecraft:blue_wool:0"), (short) 1395, Block.BLUE_WOOL);

  public static void initStates() {
    Block.BLUE_WOOL.addBlockState(BLUE_WOOL_0);
  }
}
