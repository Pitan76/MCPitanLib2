package ml.pkom.mcpitanlib2.api.block;

import ml.pkom.mcpitanlib2.api.event.block.BlockBreakEvent;
import ml.pkom.mcpitanlib2.api.event.block.BlockBrokenEvent;
import ml.pkom.mcpitanlib2.api.event.block.BlockPlacedEvent;
import ml.pkom.mcpitanlib2.api.event.block.BlockRightClickEvent;
import ml.pkom.mcpitanlib2.api.event.result.ExtendActionResult;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

public class ExtendBlock extends Block {
    public ExtendBlock(Settings settings) {
        super(settings);
    }

    @Override
    @Deprecated
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        onBreak(new BlockBreakEvent(world, pos, state, player));
    }

    public void super_onBreak(BlockBreakEvent event) {
        super.onBreak(
                event.getWorld().getWorld(),
                event.getPos().getBlockPos(),
                event.getState().getBlockState(),
                event.getPlayer().getPlayerEntity()
        );
    }

    public void onBreak(BlockBreakEvent event) {
        super_onBreak(event);
    }

    @Override
    @Deprecated
    public void onBroken(WorldAccess world, BlockPos pos, BlockState state) {
        onBroken(new BlockBrokenEvent(world, pos, state));
    }

    @Deprecated
    public void super_onBroken(BlockBrokenEvent event) {
        super.onBroken(
                event.getWorld().getWorldAccess(),
                event.getPos().getBlockPos(),
                event.getState().getBlockState()
        );
    }

    public void onBroken(BlockBrokenEvent event) {
        super_onBroken(event);
    }

    @Override
    @Deprecated
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        return onRightClick(new BlockRightClickEvent(state, world, pos, player, hand, hit)).getActionResult();
    }

    @Deprecated
    public ExtendActionResult super_onRightClick(BlockRightClickEvent event) {
        return ExtendActionResult.from(super.onUse(event.getState().getBlockState(), event.getWorld().getWorld(), event.getPos().getBlockPos(),
                event.getPlayer().getPlayerEntity(), event.getHand().toMCHand(), event.getHitResult().getBlockHitResult()));
    }

    public ExtendActionResult onRightClick(BlockRightClickEvent event) {
        return super_onRightClick(event);
    }

    @Override
    @Deprecated
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        onPlaced(new BlockPlacedEvent(world, pos, state, placer, itemStack));
    }

    @Deprecated
    public void super_onPlaced(BlockPlacedEvent event) {
        super.onPlaced(event.getWorld().getWorld(), event.getPos().getBlockPos(), event.getState().getBlockState(), event.getPlacer(), event.getItemStack());
    }

    public void onPlaced(BlockPlacedEvent event) {
        super_onPlaced(event);
    }
}
