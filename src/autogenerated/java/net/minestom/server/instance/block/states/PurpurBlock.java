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
public final class PurpurBlock {
  public static final BlockState PURPUR_BLOCK_0 = new BlockState(NamespaceID.from("minecraft:purpur_block:0"), (short) 9138, Block.PURPUR_BLOCK);

  public static void initStates() {
    Block.PURPUR_BLOCK.addBlockState(PURPUR_BLOCK_0);
  }
}
