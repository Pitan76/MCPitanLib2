package ml.pkom.mcpitanlib2.api.item;

import ml.pkom.mcpitanlib2.api.event.item.ItemUseEvent;
import ml.pkom.mcpitanlib2.api.event.result.ExtendTypedActionResult;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class ExtendedItem extends Item {

    private ml.pkom.mcpitanlib2.api.item.Item MPLItem;

    public void setMPLItem(ml.pkom.mcpitanlib2.api.item.Item MPLItem) {
        this.MPLItem = MPLItem;
    }

    public ml.pkom.mcpitanlib2.api.item.Item getMPLItem() {
        return MPLItem;
    }

    public ExtendedItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        return MPLItem.onUse(new ItemUseEvent(world, user, hand), () -> ExtendTypedActionResult.fromTypedActionResult(super.use(world, user, hand))).toTypedActionResult();
    }

    public ExtendedItem(ml.pkom.mcpitanlib2.api.item.Item item) {
        super(item.getSettings().getSettings());
        setMPLItem(item);
    }

    public static ExtendedItem of(ml.pkom.mcpitanlib2.api.item.Item item) {
        return new ExtendedItem(item);
    }
}
