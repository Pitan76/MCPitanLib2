package ml.pkom.mcpitanlib2;

import ml.pkom.mcpitanlib2.test.MPLTest;
import net.fabricmc.loader.api.FabricLoader;

public class MCPitanLib2 {
    public static final String MOD_ID = "mcpitanlib2";

    public static void init() {
        if (FabricLoader.getInstance().isDevelopmentEnvironment()) {
            MPLTest.init();
        }
    }
}