package ml.pkom.mcpitanlib2.api.event.block;

import ml.pkom.mcpitanlib2.api.block.BlockPos;
import ml.pkom.mcpitanlib2.api.block.BlockState;
import ml.pkom.mcpitanlib2.api.entity.Player;
import ml.pkom.mcpitanlib2.api.world.World;
import net.minecraft.entity.player.PlayerEntity;

public class BlockBreakEvent {
    private World world;
    private BlockPos pos;
    private BlockState state;

    private Player player;

    public BlockBreakEvent(World world, BlockPos pos, BlockState state, Player player) {
        setPos(pos);
        setState(state);
        setWorld(world);
        setPlayer(player);
    }

    public BlockBreakEvent(net.minecraft.world.World world, net.minecraft.util.math.BlockPos pos, net.minecraft.block.BlockState state, PlayerEntity player) {
        setPos(new BlockPos(pos));
        setState(new BlockState(state));
        setWorld(new World(world));
        setPlayer(new Player(player));
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public BlockState getState() {
        return state;
    }

    public BlockPos getPos() {
        return pos;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public void setPos(BlockPos pos) {
        this.pos = pos;
    }

    public void setState(BlockState state) {
        this.state = state;
    }
}
