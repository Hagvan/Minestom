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
public final class DeadFireCoralFan {
  public static final BlockState DEAD_FIRE_CORAL_FAN_0 = new BlockState(NamespaceID.from("minecraft:dead_fire_coral_fan:0"), (short) 9550, Block.DEAD_FIRE_CORAL_FAN);

  public static final BlockState DEAD_FIRE_CORAL_FAN_1 = new BlockState(NamespaceID.from("minecraft:dead_fire_coral_fan:1"), (short) 9551, Block.DEAD_FIRE_CORAL_FAN);

  public static void initStates() {
    Block.DEAD_FIRE_CORAL_FAN.addBlockState(DEAD_FIRE_CORAL_FAN_0);
    Block.DEAD_FIRE_CORAL_FAN.addBlockState(DEAD_FIRE_CORAL_FAN_1);
  }
}
