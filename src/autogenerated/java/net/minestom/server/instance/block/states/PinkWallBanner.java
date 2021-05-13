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
public final class PinkWallBanner {
    public static final BlockState PINK_WALL_BANNER_0 = new BlockState(NamespaceID.from("minecraft:pink_wall_banner_0"), (short) 8181, Block.PINK_WALL_BANNER, new RawBlockStateData(1.0, 0, false, "NORMAL", true, true, false, false, true, true, 13, "[]"), "facing=north");

    public static final BlockState PINK_WALL_BANNER_1 = new BlockState(NamespaceID.from("minecraft:pink_wall_banner_1"), (short) 8182, Block.PINK_WALL_BANNER, new RawBlockStateData(1.0, 0, false, "NORMAL", true, true, false, false, true, true, 13, "[]"), "facing=south");

    public static final BlockState PINK_WALL_BANNER_2 = new BlockState(NamespaceID.from("minecraft:pink_wall_banner_2"), (short) 8183, Block.PINK_WALL_BANNER, new RawBlockStateData(1.0, 0, false, "NORMAL", true, true, false, false, true, true, 13, "[]"), "facing=west");

    public static final BlockState PINK_WALL_BANNER_3 = new BlockState(NamespaceID.from("minecraft:pink_wall_banner_3"), (short) 8184, Block.PINK_WALL_BANNER, new RawBlockStateData(1.0, 0, false, "NORMAL", true, true, false, false, true, true, 13, "[]"), "facing=east");

    static {
        Registry.BLOCK_STATE_REGISTRY.register(PINK_WALL_BANNER_0);
        Registry.BLOCK_STATE_REGISTRY.register(PINK_WALL_BANNER_1);
        Registry.BLOCK_STATE_REGISTRY.register(PINK_WALL_BANNER_2);
        Registry.BLOCK_STATE_REGISTRY.register(PINK_WALL_BANNER_3);
    }

    public static void initStates() {
        Block.PINK_WALL_BANNER.addBlockState(PINK_WALL_BANNER_0);
        Block.PINK_WALL_BANNER.addBlockState(PINK_WALL_BANNER_1);
        Block.PINK_WALL_BANNER.addBlockState(PINK_WALL_BANNER_2);
        Block.PINK_WALL_BANNER.addBlockState(PINK_WALL_BANNER_3);
    }
}
