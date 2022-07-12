package ml.pkom.mcpitanlib2.mixin;

import ml.pkom.mcpitanlib2.api.tag.MineableToolTags;
import ml.pkom.mcpitanlib2.api.util.BlockNeedMiningLevelData;
import ml.pkom.mcpitanlib2.api.util.MineableBlockManager;
import net.minecraft.block.BlockState;
import net.minecraft.item.*;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MiningToolItem.class)
public class MiningToolItemMixin {
    @Shadow @Final protected float miningSpeed;

    @Inject(method = "getMiningSpeedMultiplier", at = @At("RETURN"), cancellable = true)
    private void injectGetMiningSpeedMultiplier(ItemStack stack, BlockState state, CallbackInfoReturnable<Float> info) {
        if (info.getReturnValueF() == 1.0f) {
            if (MineableBlockManager.containsMineableToolTags(state.getBlock())) {
                //
                BlockNeedMiningLevelData event = MineableBlockManager.getMineableToolTagsMap().get(state.getBlock());
                if ((Object)this instanceof AxeItem)
                    if (event.getToolTags() != MineableToolTags.AXE) {
                        return;
                    }
                if ((Object)this instanceof PickaxeItem)
                    if (event.getToolTags() != MineableToolTags.PICKAXE) {
                        return;
                    }
                if ((Object)this instanceof ShovelItem)
                    if (event.getToolTags() != MineableToolTags.SHOVEL) {
                        return;
                    }
                if ((Object)this instanceof HoeItem)
                    if (event.getToolTags() != MineableToolTags.HOE) {
                        return;
                    }
                //
                info.setReturnValue(this.miningSpeed);
            }
        }
    }

    @Inject(method = "isSuitableFor", at = @At("RETURN"), cancellable = true)
    private void injectIsSuitableFor(BlockState state, CallbackInfoReturnable<Boolean> info) {
        if (MineableBlockManager.containsMineableToolTags(state.getBlock())) {
            //
            BlockNeedMiningLevelData event = MineableBlockManager.getMineableToolTagsMap().get(state.getBlock());
            if ((Object)this instanceof AxeItem)
                if (event.getToolTags() != MineableToolTags.AXE) {
                    return;
                }
            if ((Object)this instanceof PickaxeItem)
                if (event.getToolTags() != MineableToolTags.PICKAXE) {
                    return;
                }
            if ((Object)this instanceof ShovelItem)
                if (event.getToolTags() != MineableToolTags.SHOVEL) {
                    return;
                }
            if ((Object)this instanceof HoeItem)
                if (event.getToolTags() != MineableToolTags.HOE) {
                    return;
                }
            //

            int miningLevel = ((ToolItem)(Object)this).getMaterial().getMiningLevel();
            if (miningLevel >= event.getLevel()) {
                info.setReturnValue(true);
            }
        }
    }
}