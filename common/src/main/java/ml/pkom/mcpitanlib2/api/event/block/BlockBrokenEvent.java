package ml.pkom.mcpitanlib2.api.event.block;

import ml.pkom.mcpitanlib2.api.block.BlockPos;
import ml.pkom.mcpitanlib2.api.block.BlockState;
import ml.pkom.mcpitanlib2.api.world.WorldLevel;
import net.minecraft.world.WorldAccess;

public class BlockBrokenEvent {
    private WorldLevel world;
    private BlockPos pos;
    private BlockState state;

    public BlockBrokenEvent(WorldLevel world, BlockPos pos, BlockState state) {
        setPos(pos);
        setState(state);
        setWorld(world);
    }

    public BlockBrokenEvent(WorldAccess world, net.minecraft.util.math.BlockPos pos, net.minecraft.block.BlockState state) {
        setPos(new BlockPos(pos));
        setState(new BlockState(state));
        setWorld(new WorldLevel(world));
    }

    public BlockState getState() {
        return state;
    }

    public BlockPos getPos() {
        return pos;
    }

    public WorldLevel getWorld() {
        return world;
    }

    public void setWorld(WorldLevel world) {
        this.world = world;
    }

    public void setPos(BlockPos pos) {
        this.pos = pos;
    }

    public void setState(BlockState state) {
        this.state = state;
    }
}
