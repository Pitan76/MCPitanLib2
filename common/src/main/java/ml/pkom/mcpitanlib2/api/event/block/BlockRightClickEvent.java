package ml.pkom.mcpitanlib2.api.event.block;

import ml.pkom.mcpitanlib2.api.block.BlockPos;
import ml.pkom.mcpitanlib2.api.block.BlockState;
import ml.pkom.mcpitanlib2.api.entity.Player;
import ml.pkom.mcpitanlib2.api.event.BaseEvent;
import ml.pkom.mcpitanlib2.api.util.Hand;
import ml.pkom.mcpitanlib2.api.util.hit.BlockHitResult;
import ml.pkom.mcpitanlib2.api.world.World;
import net.minecraft.entity.player.PlayerEntity;

public class BlockRightClickEvent extends BaseEvent {
    private BlockState state;
    private World world;
    private BlockPos pos;
    private Player player;
    private Hand hand;
    private BlockHitResult hitResult;

    public BlockRightClickEvent(BlockState state, World world, BlockPos pos, Player player, Hand hand, BlockHitResult hitResult) {
        setState(state);
        setWorld(world);
        setPos(pos);
        setPlayer(player);
        setHand(hand);
        setHitResult(hitResult);
    }

    public BlockRightClickEvent(
            net.minecraft.block.BlockState state, net.minecraft.world.World world,
            net.minecraft.util.math.BlockPos pos, PlayerEntity player,
            net.minecraft.util.Hand hand, net.minecraft.util.hit.BlockHitResult hitResult
    ) {
        this(new BlockState(state), new World(world), new BlockPos(pos),
                new Player(player), Hand.fromMCHand(hand), new BlockHitResult(hitResult));
    }

    public void setHitResult(BlockHitResult hitResult) {
        this.hitResult = hitResult;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setState(BlockState state) {
        this.state = state;
    }

    public void setPos(BlockPos pos) {
        this.pos = pos;
    }

    public Hand getHand() {
        return hand;
    }

    public Player getPlayer() {
        return player;
    }

    public World getWorld() {
        return world;
    }

    public BlockPos getPos() {
        return pos;
    }

    public BlockState getState() {
        return state;
    }

    public BlockHitResult getHitResult() {
        return hitResult;
    }
}
