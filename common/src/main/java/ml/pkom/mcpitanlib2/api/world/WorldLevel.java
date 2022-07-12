package ml.pkom.mcpitanlib2.api.world;

import net.minecraft.world.WorldAccess;

public class WorldLevel {
    private WorldAccess worldAccess;

    public WorldLevel(WorldAccess worldAccess) {
        setWorldAccess(worldAccess);
    }

    public WorldAccess getWorldAccess() {
        return worldAccess;
    }

    public void setWorldAccess(WorldAccess worldAccess) {
        this.worldAccess = worldAccess;
    }
}
