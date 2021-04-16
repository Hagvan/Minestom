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
public final class Farmland {
  public static final BlockState FARMLAND_0 = new BlockState(NamespaceID.from("minecraft:farmland:0"), (short) 3365, Block.FARMLAND);

  public static final BlockState FARMLAND_1 = new BlockState(NamespaceID.from("minecraft:farmland:1"), (short) 3366, Block.FARMLAND);

  public static final BlockState FARMLAND_2 = new BlockState(NamespaceID.from("minecraft:farmland:2"), (short) 3367, Block.FARMLAND);

  public static final BlockState FARMLAND_3 = new BlockState(NamespaceID.from("minecraft:farmland:3"), (short) 3368, Block.FARMLAND);

  public static final BlockState FARMLAND_4 = new BlockState(NamespaceID.from("minecraft:farmland:4"), (short) 3369, Block.FARMLAND);

  public static final BlockState FARMLAND_5 = new BlockState(NamespaceID.from("minecraft:farmland:5"), (short) 3370, Block.FARMLAND);

  public static final BlockState FARMLAND_6 = new BlockState(NamespaceID.from("minecraft:farmland:6"), (short) 3371, Block.FARMLAND);

  public static final BlockState FARMLAND_7 = new BlockState(NamespaceID.from("minecraft:farmland:7"), (short) 3372, Block.FARMLAND);

  public static void initStates() {
    Block.FARMLAND.addBlockState(FARMLAND_0);
    Block.FARMLAND.addBlockState(FARMLAND_1);
    Block.FARMLAND.addBlockState(FARMLAND_2);
    Block.FARMLAND.addBlockState(FARMLAND_3);
    Block.FARMLAND.addBlockState(FARMLAND_4);
    Block.FARMLAND.addBlockState(FARMLAND_5);
    Block.FARMLAND.addBlockState(FARMLAND_6);
    Block.FARMLAND.addBlockState(FARMLAND_7);
  }
}
