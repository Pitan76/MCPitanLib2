package ml.pkom.mcpitanlib2.api.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.Nullable;

public class BaseItemStack {
    private ItemStack itemStack;

    public static BaseItemStack of(@Nullable ItemStack itemStack) {
        return new BaseItemStack(itemStack);
    }

    public BaseItemStack(@Nullable Item item, int count) {
        itemStack = new ItemStack(item, count);
    }

    public BaseItemStack(@Nullable Block block, int count) {
        itemStack = new ItemStack(block.asItem(), count);
    }

    public BaseItemStack(@Nullable Item item) {
        this(item, 1);
    }

    public BaseItemStack(@Nullable Block block) {
        this(block.asItem(), 1);
    }

    public BaseItemStack(@Nullable ItemStack itemStack) {
        setItemStack(itemStack);
    }

    public int getCount() {
        return itemStack.getCount();
    }

    public void setCount(int count) {
        itemStack.setCount(count);
    }

    public Item getItem() {
        return itemStack.getItem();
    }

    public int getDamage() {
        return itemStack.getDamage();
    }

    public void setDamage(int damage) {
        itemStack.setDamage(damage);
    }

    public int getMaxDamage() {
        return itemStack.getMaxDamage();
    }

    public @Nullable ItemStack origin() {
        return getItemStack();
    }

    public void decrement(int amount) {
        getItemStack().decrement(amount);
    }

    public void increment(int amount) {
        setCount(getCount() + amount);
    }

    public boolean isEmpty() {
        return getItemStack().isEmpty();
    }

    public @Nullable ItemStack getItemStack() {
        return itemStack;
    }

    public void setItemStack(@Nullable ItemStack itemStack) {
        this.itemStack = itemStack;
    }
}