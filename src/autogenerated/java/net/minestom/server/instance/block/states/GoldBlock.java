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
public final class GoldBlock {
  public static final BlockState GOLD_BLOCK_0 = new BlockState(NamespaceID.from("minecraft:gold_block:0"), (short) 1427, Block.GOLD_BLOCK);

  public static void initStates() {
    Block.GOLD_BLOCK.addBlockState(GOLD_BLOCK_0);
  }
}
