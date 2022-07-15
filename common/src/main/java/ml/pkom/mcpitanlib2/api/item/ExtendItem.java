package ml.pkom.mcpitanlib2.api.item;

import ml.pkom.mcpitanlib2.api.event.item.ItemRightClickEvent;
import ml.pkom.mcpitanlib2.api.event.result.ExtendTypedActionResult;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class ExtendItem extends Item {
    public ExtendItem(Settings settings) {
        super(settings);
    }

    @Override
    @Deprecated
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        return onRightClick(new ItemRightClickEvent(world, user, hand)).toTypedActionResult();
    }

    @Deprecated
    public ExtendTypedActionResult<ItemStack> super_onRightClick(ItemRightClickEvent event) {
        return ExtendTypedActionResult.from(super.use(event.getWorld().getWorld(), event.getPlayer().getEntity(), event.getHand().toMCHand()));
    }

    public ExtendTypedActionResult<ItemStack> onRightClick(ItemRightClickEvent event) {
        return super_onRightClick(event);
    }
}
