package ml.pkom.mcpitanlib2.api.util;

import ml.pkom.mcpitanlib2.api.tag.MineableToolTags;
import net.minecraft.block.Block;

import java.util.HashMap;
import java.util.Map;

public class MineableBlockManager {
    private static Map<Block, BlockNeedMiningLevelData> mineableToolTagsMap = new HashMap<>();

    public static Map<Block, BlockNeedMiningLevelData> getMineableToolTagsMap() {
        return mineableToolTagsMap;
    }

    public static boolean containsMineableToolTags(Block block) {
        return getMineableToolTagsMap().containsKey(block);
    }


    /**
     * Register mineable tag
     * @param block Block
     */
    /*
    public static void registerMineable(Block block) {
        if (block.getBlockSettings().getMineableToolTags() != MineableToolTags.NONE) {
            mineableToolTagsMap.put(block, new MiningToolEvent(block.getBlockSettings().getMineableToolTags(), block.getBlockSettings().getMineableLevel()));
        }
    }

     */

}
