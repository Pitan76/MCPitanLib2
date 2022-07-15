package ml.pkom.mcpitanlib2.api.item.v0;

import ml.pkom.mcpitanlib2.api.event.item.ItemRightClickEvent;
import ml.pkom.mcpitanlib2.api.event.result.ExtendTypedActionResult;
import ml.pkom.mcpitanlib2.api.util.ResultSuperFunction;
import net.minecraft.item.ItemStack;

@Deprecated
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

    public ExtendTypedActionResult<ItemStack> onUse(ItemRightClickEvent event, ResultSuperFunction<ExtendTypedActionResult<ItemStack>> superFunction) {
        return superFunction.superF();
    }

}
