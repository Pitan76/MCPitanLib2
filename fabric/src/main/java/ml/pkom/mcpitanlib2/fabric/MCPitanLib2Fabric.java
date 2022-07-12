package ml.pkom.mcpitanlib2.fabric;

import ml.pkom.mcpitanlib2.MCPitanLib2;
import net.fabricmc.api.ModInitializer;

public class MCPitanLib2Fabric implements ModInitializer {
    @Override
    public void onInitialize() {
        MCPitanLib2.init();
    }
}