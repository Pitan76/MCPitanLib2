package ml.pkom.mcpitanlib2.api.block.v0;

import ml.pkom.mcpitanlib2.api.event.block.BlockBreakEvent;
import ml.pkom.mcpitanlib2.api.event.block.BlockBrokenEvent;
import ml.pkom.mcpitanlib2.api.util.SuperFunction;

@Deprecated
public class Block {

    BlockSettings settings;

    public Block(BlockSettings settings) {
        setSettings(settings);
    }

    public void setSettings(BlockSettings settings) {
        this.settings = settings;
    }

    public BlockSettings getSettings() {
        return settings;
    }

    public void onBroken(BlockBrokenEvent event, SuperFunction superFunction) {
        superFunction.superF();
    }

    public void onBreak(BlockBreakEvent event, SuperFunction superFunction) {
        superFunction.superF();
    }
}
