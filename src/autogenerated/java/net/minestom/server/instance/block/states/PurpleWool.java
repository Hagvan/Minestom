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
public final class PurpleWool {
  public static final BlockState PURPLE_WOOL_0 = new BlockState(NamespaceID.from("minecraft:purple_wool:0"), (short) 1394, Block.PURPLE_WOOL);

  public static void initStates() {
    Block.PURPLE_WOOL.addBlockState(PURPLE_WOOL_0);
  }
}
