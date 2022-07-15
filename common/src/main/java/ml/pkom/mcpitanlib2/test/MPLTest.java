package ml.pkom.mcpitanlib2.test;

import ml.pkom.mcpitanlib2.api.block.BlockSettings;
import ml.pkom.mcpitanlib2.api.block.ExtendedBlock;

public class MPLTest {
    public static void init() {
        ExtendedBlock block = new ExtendedBlock(new BlockSettings().hardness(1f).resistance(1f));

    }
}
