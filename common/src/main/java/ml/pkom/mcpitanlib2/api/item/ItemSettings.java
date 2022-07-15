package ml.pkom.mcpitanlib2.api.item;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Rarity;

public class ItemSettings {
    private Item.Settings settings = new Item.Settings();

    public void setSettings(Item.Settings settings) {
        this.settings = settings;
    }

    public Item.Settings getSettings() {
        return settings;
    }

    public ItemSettings group(ItemGroup group) {
        settings.group(group);
        return this;
    }

    public ItemSettings maxCount(int maxCount) {
        settings.maxCount(maxCount);
        return this;
    }

    public ItemSettings maxDamage(int maxDamage) {
        settings.maxDamage(maxDamage);
        return this;
    }

    public ItemSettings maxDamageIfAbsent(int maxDamage) {
        settings.maxDamageIfAbsent(maxDamage);
        return this;
    }

    public ItemSettings fireproof() {
        settings.fireproof();
        return this;
    }

    public ItemSettings maxDamageIfAbsent(FoodComponent component) {
        settings.food(component);
        return this;
    }

    public ItemSettings recipeRemainder(Item item) {
        settings.recipeRemainder(item);
        return this;
    }

    public ItemSettings rarity(Rarity rarity) {
        settings.rarity(rarity);
        return this;
    }
}
