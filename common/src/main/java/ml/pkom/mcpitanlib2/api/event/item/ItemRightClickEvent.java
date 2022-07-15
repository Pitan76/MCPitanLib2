package ml.pkom.mcpitanlib2.api.event.item;

import ml.pkom.mcpitanlib2.api.entity.Player;
import ml.pkom.mcpitanlib2.api.event.BaseEvent;
import ml.pkom.mcpitanlib2.api.util.Hand;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class ItemRightClickEvent extends BaseEvent {

    private ml.pkom.mcpitanlib2.api.world.World world;
    private Player player;
    private Hand hand;

    public ItemRightClickEvent(World world, PlayerEntity user, net.minecraft.util.Hand hand) {
        this(new ml.pkom.mcpitanlib2.api.world.World(world), new Player(user), Hand.fromMCHand(hand));
    }

    public ItemRightClickEvent(ml.pkom.mcpitanlib2.api.world.World world, Player user, Hand hand) {
        setWorld(world);
        setPlayer(user);
        setHand(hand);
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setWorld(ml.pkom.mcpitanlib2.api.world.World world) {
        this.world = world;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Player getPlayer() {
        return player;
    }

    public ml.pkom.mcpitanlib2.api.world.World getWorld() {
        return world;
    }

    public Hand getHand() {
        return hand;
    }
}
