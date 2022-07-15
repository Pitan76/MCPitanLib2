package ml.pkom.mcpitanlib2.test;

import ml.pkom.mcpitanlib2.api.block.Block;
import ml.pkom.mcpitanlib2.api.block.BlockSettings;
import ml.pkom.mcpitanlib2.api.registry.Registries;
import ml.pkom.mcpitanlib2.api.util.ExtendIdentifier;

public class MPLTest {
    public static void init() {
        Block block = new Block(new BlockSettings().hardness(1f).resistance(1f));
        Registries.registerBlock(new ExtendIdentifier("mpltest:block"), block);
    }
}
