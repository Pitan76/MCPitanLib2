package ml.pkom.mcpitanlib2.test;

import ml.pkom.mcpitanlib2.api.block.ExtendBlock;
import ml.pkom.mcpitanlib2.api.registry.Registries;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;

public class MPLTest {
    public static void init() {
        ExtendBlock block = new ExtendBlock(AbstractBlock.Settings.of(Material.STONE));
        Registries.registerBlock(new Identifier("mpltest:block"), block);
    }
}
