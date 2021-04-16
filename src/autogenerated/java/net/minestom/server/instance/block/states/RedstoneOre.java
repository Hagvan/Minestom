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
public final class RedstoneOre {
  public static final BlockState REDSTONE_ORE_0 = new BlockState(NamespaceID.from("minecraft:redstone_ore:0"), (short) 3885, Block.REDSTONE_ORE);

  public static final BlockState REDSTONE_ORE_1 = new BlockState(NamespaceID.from("minecraft:redstone_ore:1"), (short) 3886, Block.REDSTONE_ORE);

  public static void initStates() {
    Block.REDSTONE_ORE.addBlockState(REDSTONE_ORE_0);
    Block.REDSTONE_ORE.addBlockState(REDSTONE_ORE_1);
  }
}
