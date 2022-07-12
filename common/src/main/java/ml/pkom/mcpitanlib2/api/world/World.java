package ml.pkom.mcpitanlib2.api.world;

public class World {
    private net.minecraft.world.World world;

    public World(net.minecraft.world.World world) {
        setWorld(world);
    }

    public net.minecraft.world.World getWorld() {
        return world;
    }

    public void setWorld(net.minecraft.world.World world) {
        this.world = world;
    }
}
