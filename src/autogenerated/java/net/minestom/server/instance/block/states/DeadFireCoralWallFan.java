package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;
import net.minestom.server.raw_data.RawBlockStateData;
import net.minestom.server.registry.Registry;
import net.minestom.server.utils.NamespaceID;

/**
 * AUTOGENERATED by BlockGenerator
 */
@Deprecated(
        since = "forever",
        forRemoval = false
)
public final class DeadFireCoralWallFan {
    public static final BlockState DEAD_FIRE_CORAL_WALL_FAN_0 = new BlockState(NamespaceID.from("minecraft:dead_fire_coral_wall_fan_0"), (short) 9588, Block.DEAD_FIRE_CORAL_WALL_FAN, new RawBlockStateData(0.0, 0, false, "NORMAL", true, false, false, false, true, true, 11, "[]"), "facing=north","waterlogged=true");

    public static final BlockState DEAD_FIRE_CORAL_WALL_FAN_1 = new BlockState(NamespaceID.from("minecraft:dead_fire_coral_wall_fan_1"), (short) 9589, Block.DEAD_FIRE_CORAL_WALL_FAN, new RawBlockStateData(0.0, 0, false, "NORMAL", true, false, false, false, true, true, 11, "[]"), "facing=north","waterlogged=false");

    public static final BlockState DEAD_FIRE_CORAL_WALL_FAN_2 = new BlockState(NamespaceID.from("minecraft:dead_fire_coral_wall_fan_2"), (short) 9590, Block.DEAD_FIRE_CORAL_WALL_FAN, new RawBlockStateData(0.0, 0, false, "NORMAL", true, false, false, false, true, true, 11, "[]"), "facing=south","waterlogged=true");

    public static final BlockState DEAD_FIRE_CORAL_WALL_FAN_3 = new BlockState(NamespaceID.from("minecraft:dead_fire_coral_wall_fan_3"), (short) 9591, Block.DEAD_FIRE_CORAL_WALL_FAN, new RawBlockStateData(0.0, 0, false, "NORMAL", true, false, false, false, true, true, 11, "[]"), "facing=south","waterlogged=false");

    public static final BlockState DEAD_FIRE_CORAL_WALL_FAN_4 = new BlockState(NamespaceID.from("minecraft:dead_fire_coral_wall_fan_4"), (short) 9592, Block.DEAD_FIRE_CORAL_WALL_FAN, new RawBlockStateData(0.0, 0, false, "NORMAL", true, false, false, false, true, true, 11, "[]"), "facing=west","waterlogged=true");

    public static final BlockState DEAD_FIRE_CORAL_WALL_FAN_5 = new BlockState(NamespaceID.from("minecraft:dead_fire_coral_wall_fan_5"), (short) 9593, Block.DEAD_FIRE_CORAL_WALL_FAN, new RawBlockStateData(0.0, 0, false, "NORMAL", true, false, false, false, true, true, 11, "[]"), "facing=west","waterlogged=false");

    public static final BlockState DEAD_FIRE_CORAL_WALL_FAN_6 = new BlockState(NamespaceID.from("minecraft:dead_fire_coral_wall_fan_6"), (short) 9594, Block.DEAD_FIRE_CORAL_WALL_FAN, new RawBlockStateData(0.0, 0, false, "NORMAL", true, false, false, false, true, true, 11, "[]"), "facing=east","waterlogged=true");

    public static final BlockState DEAD_FIRE_CORAL_WALL_FAN_7 = new BlockState(NamespaceID.from("minecraft:dead_fire_coral_wall_fan_7"), (short) 9595, Block.DEAD_FIRE_CORAL_WALL_FAN, new RawBlockStateData(0.0, 0, false, "NORMAL", true, false, false, false, true, true, 11, "[]"), "facing=east","waterlogged=false");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(DEAD_FIRE_CORAL_WALL_FAN_0);
        Registry.BLOCK_STATE_REGISTRY.register(DEAD_FIRE_CORAL_WALL_FAN_1);
        Registry.BLOCK_STATE_REGISTRY.register(DEAD_FIRE_CORAL_WALL_FAN_2);
        Registry.BLOCK_STATE_REGISTRY.register(DEAD_FIRE_CORAL_WALL_FAN_3);
        Registry.BLOCK_STATE_REGISTRY.register(DEAD_FIRE_CORAL_WALL_FAN_4);
        Registry.BLOCK_STATE_REGISTRY.register(DEAD_FIRE_CORAL_WALL_FAN_5);
        Registry.BLOCK_STATE_REGISTRY.register(DEAD_FIRE_CORAL_WALL_FAN_6);
        Registry.BLOCK_STATE_REGISTRY.register(DEAD_FIRE_CORAL_WALL_FAN_7);
    }

    public static void initStates() {
        Block.DEAD_FIRE_CORAL_WALL_FAN.addBlockState(DEAD_FIRE_CORAL_WALL_FAN_0);
        Block.DEAD_FIRE_CORAL_WALL_FAN.addBlockState(DEAD_FIRE_CORAL_WALL_FAN_1);
        Block.DEAD_FIRE_CORAL_WALL_FAN.addBlockState(DEAD_FIRE_CORAL_WALL_FAN_2);
        Block.DEAD_FIRE_CORAL_WALL_FAN.addBlockState(DEAD_FIRE_CORAL_WALL_FAN_3);
        Block.DEAD_FIRE_CORAL_WALL_FAN.addBlockState(DEAD_FIRE_CORAL_WALL_FAN_4);
        Block.DEAD_FIRE_CORAL_WALL_FAN.addBlockState(DEAD_FIRE_CORAL_WALL_FAN_5);
        Block.DEAD_FIRE_CORAL_WALL_FAN.addBlockState(DEAD_FIRE_CORAL_WALL_FAN_6);
        Block.DEAD_FIRE_CORAL_WALL_FAN.addBlockState(DEAD_FIRE_CORAL_WALL_FAN_7);
    }
}
