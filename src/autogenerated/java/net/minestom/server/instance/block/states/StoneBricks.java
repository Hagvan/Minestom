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
public final class StoneBricks {
  public static final BlockState STONE_BRICKS_0 = new BlockState(NamespaceID.from("minecraft:stone_bricks:0"), (short) 4495, Block.STONE_BRICKS);

  public static void initStates() {
    Block.STONE_BRICKS.addBlockState(STONE_BRICKS_0);
  }
}
