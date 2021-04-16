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
public final class ZombieWallHead {
  public static final BlockState ZOMBIE_WALL_HEAD_0 = new BlockState(NamespaceID.from("minecraft:zombie_wall_head:0"), (short) 6550, Block.ZOMBIE_WALL_HEAD);

  public static final BlockState ZOMBIE_WALL_HEAD_1 = new BlockState(NamespaceID.from("minecraft:zombie_wall_head:1"), (short) 6551, Block.ZOMBIE_WALL_HEAD);

  public static final BlockState ZOMBIE_WALL_HEAD_2 = new BlockState(NamespaceID.from("minecraft:zombie_wall_head:2"), (short) 6552, Block.ZOMBIE_WALL_HEAD);

  public static final BlockState ZOMBIE_WALL_HEAD_3 = new BlockState(NamespaceID.from("minecraft:zombie_wall_head:3"), (short) 6553, Block.ZOMBIE_WALL_HEAD);

  public static void initStates() {
    Block.ZOMBIE_WALL_HEAD.addBlockState(ZOMBIE_WALL_HEAD_0);
    Block.ZOMBIE_WALL_HEAD.addBlockState(ZOMBIE_WALL_HEAD_1);
    Block.ZOMBIE_WALL_HEAD.addBlockState(ZOMBIE_WALL_HEAD_2);
    Block.ZOMBIE_WALL_HEAD.addBlockState(ZOMBIE_WALL_HEAD_3);
  }
}
