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
public final class BlueStainedGlass {
  public static final BlockState BLUE_STAINED_GLASS_0 = new BlockState(NamespaceID.from("minecraft:blue_stained_glass:0"), (short) 4106, Block.BLUE_STAINED_GLASS);

  public static void initStates() {
    Block.BLUE_STAINED_GLASS.addBlockState(BLUE_STAINED_GLASS_0);
  }
}
