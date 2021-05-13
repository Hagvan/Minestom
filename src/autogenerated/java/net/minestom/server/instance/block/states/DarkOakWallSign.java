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
public final class DarkOakWallSign {
    public static final BlockState DARK_OAK_WALL_SIGN_0 = new BlockState(NamespaceID.from("minecraft:dark_oak_wall_sign_0"), (short) 3775, Block.DARK_OAK_WALL_SIGN, new RawBlockStateData(1.0, 0, false, "NORMAL", true, true, false, false, true, true, 13, "[]"), "facing=north","waterlogged=true");

    public static final BlockState DARK_OAK_WALL_SIGN_1 = new BlockState(NamespaceID.from("minecraft:dark_oak_wall_sign_1"), (short) 3776, Block.DARK_OAK_WALL_SIGN, new RawBlockStateData(1.0, 0, false, "NORMAL", true, true, false, false, true, true, 13, "[]"), "facing=north","waterlogged=false");

    public static final BlockState DARK_OAK_WALL_SIGN_2 = new BlockState(NamespaceID.from("minecraft:dark_oak_wall_sign_2"), (short) 3777, Block.DARK_OAK_WALL_SIGN, new RawBlockStateData(1.0, 0, false, "NORMAL", true, true, false, false, true, true, 13, "[]"), "facing=south","waterlogged=true");

    public static final BlockState DARK_OAK_WALL_SIGN_3 = new BlockState(NamespaceID.from("minecraft:dark_oak_wall_sign_3"), (short) 3778, Block.DARK_OAK_WALL_SIGN, new RawBlockStateData(1.0, 0, false, "NORMAL", true, true, false, false, true, true, 13, "[]"), "facing=south","waterlogged=false");

    public static final BlockState DARK_OAK_WALL_SIGN_4 = new BlockState(NamespaceID.from("minecraft:dark_oak_wall_sign_4"), (short) 3779, Block.DARK_OAK_WALL_SIGN, new RawBlockStateData(1.0, 0, false, "NORMAL", true, true, false, false, true, true, 13, "[]"), "facing=west","waterlogged=true");

    public static final BlockState DARK_OAK_WALL_SIGN_5 = new BlockState(NamespaceID.from("minecraft:dark_oak_wall_sign_5"), (short) 3780, Block.DARK_OAK_WALL_SIGN, new RawBlockStateData(1.0, 0, false, "NORMAL", true, true, false, false, true, true, 13, "[]"), "facing=west","waterlogged=false");

    public static final BlockState DARK_OAK_WALL_SIGN_6 = new BlockState(NamespaceID.from("minecraft:dark_oak_wall_sign_6"), (short) 3781, Block.DARK_OAK_WALL_SIGN, new RawBlockStateData(1.0, 0, false, "NORMAL", true, true, false, false, true, true, 13, "[]"), "facing=east","waterlogged=true");

    public static final BlockState DARK_OAK_WALL_SIGN_7 = new BlockState(NamespaceID.from("minecraft:dark_oak_wall_sign_7"), (short) 3782, Block.DARK_OAK_WALL_SIGN, new RawBlockStateData(1.0, 0, false, "NORMAL", true, true, false, false, true, true, 13, "[]"), "facing=east","waterlogged=false");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(DARK_OAK_WALL_SIGN_0);
        Registry.BLOCK_STATE_REGISTRY.register(DARK_OAK_WALL_SIGN_1);
        Registry.BLOCK_STATE_REGISTRY.register(DARK_OAK_WALL_SIGN_2);
        Registry.BLOCK_STATE_REGISTRY.register(DARK_OAK_WALL_SIGN_3);
        Registry.BLOCK_STATE_REGISTRY.register(DARK_OAK_WALL_SIGN_4);
        Registry.BLOCK_STATE_REGISTRY.register(DARK_OAK_WALL_SIGN_5);
        Registry.BLOCK_STATE_REGISTRY.register(DARK_OAK_WALL_SIGN_6);
        Registry.BLOCK_STATE_REGISTRY.register(DARK_OAK_WALL_SIGN_7);
    }

    public static void initStates() {
        Block.DARK_OAK_WALL_SIGN.addBlockState(DARK_OAK_WALL_SIGN_0);
        Block.DARK_OAK_WALL_SIGN.addBlockState(DARK_OAK_WALL_SIGN_1);
        Block.DARK_OAK_WALL_SIGN.addBlockState(DARK_OAK_WALL_SIGN_2);
        Block.DARK_OAK_WALL_SIGN.addBlockState(DARK_OAK_WALL_SIGN_3);
        Block.DARK_OAK_WALL_SIGN.addBlockState(DARK_OAK_WALL_SIGN_4);
        Block.DARK_OAK_WALL_SIGN.addBlockState(DARK_OAK_WALL_SIGN_5);
        Block.DARK_OAK_WALL_SIGN.addBlockState(DARK_OAK_WALL_SIGN_6);
        Block.DARK_OAK_WALL_SIGN.addBlockState(DARK_OAK_WALL_SIGN_7);
    }
}
