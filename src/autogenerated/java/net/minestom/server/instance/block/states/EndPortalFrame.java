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
public final class EndPortalFrame {
    public static final BlockState END_PORTAL_FRAME_0 = new BlockState(NamespaceID.from("minecraft:end_portal_frame_0"), (short) 5150, Block.END_PORTAL_FRAME, new RawBlockStateData(-1.0, 1, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 0.8125, 1.0], AABB[0.25, 0.8125, 0.25] -> [0.75, 1.0, 0.75]]"), "eye=true","facing=north");

    public static final BlockState END_PORTAL_FRAME_1 = new BlockState(NamespaceID.from("minecraft:end_portal_frame_1"), (short) 5151, Block.END_PORTAL_FRAME, new RawBlockStateData(-1.0, 1, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 0.8125, 1.0], AABB[0.25, 0.8125, 0.25] -> [0.75, 1.0, 0.75]]"), "eye=true","facing=south");

    public static final BlockState END_PORTAL_FRAME_2 = new BlockState(NamespaceID.from("minecraft:end_portal_frame_2"), (short) 5152, Block.END_PORTAL_FRAME, new RawBlockStateData(-1.0, 1, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 0.8125, 1.0], AABB[0.25, 0.8125, 0.25] -> [0.75, 1.0, 0.75]]"), "eye=true","facing=west");

    public static final BlockState END_PORTAL_FRAME_3 = new BlockState(NamespaceID.from("minecraft:end_portal_frame_3"), (short) 5153, Block.END_PORTAL_FRAME, new RawBlockStateData(-1.0, 1, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 0.8125, 1.0], AABB[0.25, 0.8125, 0.25] -> [0.75, 1.0, 0.75]]"), "eye=true","facing=east");

    public static final BlockState END_PORTAL_FRAME_4 = new BlockState(NamespaceID.from("minecraft:end_portal_frame_4"), (short) 5154, Block.END_PORTAL_FRAME, new RawBlockStateData(-1.0, 1, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 0.8125, 1.0]]"), "eye=false","facing=north");

    public static final BlockState END_PORTAL_FRAME_5 = new BlockState(NamespaceID.from("minecraft:end_portal_frame_5"), (short) 5155, Block.END_PORTAL_FRAME, new RawBlockStateData(-1.0, 1, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 0.8125, 1.0]]"), "eye=false","facing=south");

    public static final BlockState END_PORTAL_FRAME_6 = new BlockState(NamespaceID.from("minecraft:end_portal_frame_6"), (short) 5156, Block.END_PORTAL_FRAME, new RawBlockStateData(-1.0, 1, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 0.8125, 1.0]]"), "eye=false","facing=west");

    public static final BlockState END_PORTAL_FRAME_7 = new BlockState(NamespaceID.from("minecraft:end_portal_frame_7"), (short) 5157, Block.END_PORTAL_FRAME, new RawBlockStateData(-1.0, 1, true, "NORMAL", true, false, false, false, true, true, 11, "[AABB[0.0, 0.0, 0.0] -> [1.0, 0.8125, 1.0]]"), "eye=false","facing=east");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(END_PORTAL_FRAME_0);
        Registry.BLOCK_STATE_REGISTRY.register(END_PORTAL_FRAME_1);
        Registry.BLOCK_STATE_REGISTRY.register(END_PORTAL_FRAME_2);
        Registry.BLOCK_STATE_REGISTRY.register(END_PORTAL_FRAME_3);
        Registry.BLOCK_STATE_REGISTRY.register(END_PORTAL_FRAME_4);
        Registry.BLOCK_STATE_REGISTRY.register(END_PORTAL_FRAME_5);
        Registry.BLOCK_STATE_REGISTRY.register(END_PORTAL_FRAME_6);
        Registry.BLOCK_STATE_REGISTRY.register(END_PORTAL_FRAME_7);
    }

    public static void initStates() {
        Block.END_PORTAL_FRAME.addBlockState(END_PORTAL_FRAME_0);
        Block.END_PORTAL_FRAME.addBlockState(END_PORTAL_FRAME_1);
        Block.END_PORTAL_FRAME.addBlockState(END_PORTAL_FRAME_2);
        Block.END_PORTAL_FRAME.addBlockState(END_PORTAL_FRAME_3);
        Block.END_PORTAL_FRAME.addBlockState(END_PORTAL_FRAME_4);
        Block.END_PORTAL_FRAME.addBlockState(END_PORTAL_FRAME_5);
        Block.END_PORTAL_FRAME.addBlockState(END_PORTAL_FRAME_6);
        Block.END_PORTAL_FRAME.addBlockState(END_PORTAL_FRAME_7);
    }
}
