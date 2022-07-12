package ml.pkom.mcpitanlib2.forge;

import dev.architectury.platform.forge.EventBuses;
import ml.pkom.mcpitanlib2.MCPitanLib2;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MCPitanLib2.MOD_ID)
public class MCPitanLib2Forge {
    public MCPitanLib2Forge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(MCPitanLib2.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        MCPitanLib2.init();
    }
}