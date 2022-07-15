package ml.pkom.mcpitanlib2.api.event.block;

import ml.pkom.mcpitanlib2.api.block.BlockPos;
import ml.pkom.mcpitanlib2.api.block.BlockState;
import ml.pkom.mcpitanlib2.api.world.World;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;

public class BlockPlacedEvent {
    private World world;
    private BlockPos pos;
    private BlockState state;

    @Nullable
    private LivingEntity placer;
    private ItemStack itemStack;

    public BlockPlacedEvent(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        setWorld(world);
        setPos(pos);
        setState(state);
        setPlacer(placer);
        setItemStack(itemStack);
    }

    public BlockPlacedEvent(net.minecraft.world.World world, net.minecraft.util.math.BlockPos pos, net.minecraft.block.BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        this(new World(world), new BlockPos(pos), new BlockState(state), placer, itemStack);
    }

    public void setPos(BlockPos pos) {
        this.pos = pos;
    }

    public void setState(BlockState state) {
        this.state = state;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public void setItemStack(ItemStack itemStack) {
        this.itemStack = itemStack;
    }

    public void setPlacer(@Nullable LivingEntity placer) {
        this.placer = placer;
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

    public ItemStack getItemStack() {
        return itemStack;
    }

    @Nullable
    public LivingEntity getPlacer() {
        return placer;
    }
}
