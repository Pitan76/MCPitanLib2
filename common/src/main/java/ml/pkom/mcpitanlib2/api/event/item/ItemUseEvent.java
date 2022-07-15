package ml.pkom.mcpitanlib2.api.event.item;

import ml.pkom.mcpitanlib2.api.entity.Player;
import ml.pkom.mcpitanlib2.api.event.BaseEvent;
import ml.pkom.mcpitanlib2.api.util.Hand;
import ml.pkom.mcpitanlib2.api.world.WorldLevel;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class ItemUseEvent extends BaseEvent {

    private WorldLevel world;
    private Player player;
    private Hand hand;

    public ItemUseEvent(World world, PlayerEntity user, net.minecraft.util.Hand hand) {
        this(new WorldLevel(world), new Player(user), Hand.fromMCHand(hand));
    }

    public ItemUseEvent(WorldLevel world, Player user, Hand hand) {
        setWorld(world);
        setPlayer(user);
        setHand(hand);
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setWorld(WorldLevel world) {
        this.world = world;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Player getPlayer() {
        return player;
    }

    public WorldLevel getWorld() {
        return world;
    }

    public Hand getHand() {
        return hand;
    }
}
