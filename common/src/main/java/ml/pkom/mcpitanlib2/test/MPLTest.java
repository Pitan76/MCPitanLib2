package ml.pkom.mcpitanlib2.test;

import ml.pkom.mcpitanlib2.api.block.Block;
import ml.pkom.mcpitanlib2.api.block.BlockSettings;
import ml.pkom.mcpitanlib2.api.registry.Registries;
import ml.pkom.mcpitanlib2.api.util.ExtendIdentifier;
import net.minecraft.block.Material;

public class MPLTest {
    public static void init() {
        Block block = new Block(new BlockSettings(Material.SNOW_BLOCK).hardness(1f).resistance(1f));
        Registries.registerBlock(new ExtendIdentifier("mpltest:block"), block);
    }
}
