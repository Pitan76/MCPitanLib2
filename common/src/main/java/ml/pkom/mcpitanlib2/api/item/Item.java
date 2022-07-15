package ml.pkom.mcpitanlib2.api.item;

import ml.pkom.mcpitanlib2.api.event.item.ItemUseEvent;
import ml.pkom.mcpitanlib2.api.event.result.ExtendTypedActionResult;
import ml.pkom.mcpitanlib2.api.util.ResultSuperFunction;
import net.minecraft.item.ItemStack;

public class Item {
    ItemSettings settings;

    public Item(ItemSettings settings) {
        setSettings(settings);
    }

    public void setSettings(ItemSettings settings) {
        this.settings = settings;
    }

    public ItemSettings getSettings() {
        return settings;
    }

    public ExtendTypedActionResult<ItemStack> onUse(ItemUseEvent event, ResultSuperFunction<ExtendTypedActionResult<ItemStack>> superFunction) {
        return superFunction.superF();
    }

}
