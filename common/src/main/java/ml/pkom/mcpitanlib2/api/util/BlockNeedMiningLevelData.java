package ml.pkom.mcpitanlib2.api.util;

import ml.pkom.mcpitanlib2.api.tag.MineableToolTags;

public class BlockNeedMiningLevelData {
    private int level;
    private MineableToolTags toolTags;

    public BlockNeedMiningLevelData(MineableToolTags toolTags, int level) {
        setLevel(level);
        setToolTags(toolTags);
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setToolTags(MineableToolTags toolTags) {
        this.toolTags = toolTags;
    }

    public int getLevel() {
        return level;
    }

    public MineableToolTags getToolTags() {
        return toolTags;
    }
}
