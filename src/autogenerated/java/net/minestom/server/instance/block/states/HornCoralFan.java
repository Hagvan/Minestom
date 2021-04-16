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
public final class HornCoralFan {
  public static final BlockState HORN_CORAL_FAN_0 = new BlockState(NamespaceID.from("minecraft:horn_coral_fan:0"), (short) 9562, Block.HORN_CORAL_FAN);

  public static final BlockState HORN_CORAL_FAN_1 = new BlockState(NamespaceID.from("minecraft:horn_coral_fan:1"), (short) 9563, Block.HORN_CORAL_FAN);

  public static void initStates() {
    Block.HORN_CORAL_FAN.addBlockState(HORN_CORAL_FAN_0);
    Block.HORN_CORAL_FAN.addBlockState(HORN_CORAL_FAN_1);
  }
}
