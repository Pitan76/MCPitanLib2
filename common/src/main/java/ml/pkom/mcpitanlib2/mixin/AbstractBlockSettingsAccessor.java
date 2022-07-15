package ml.pkom.mcpitanlib2.mixin;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.entity.EntityType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

import java.util.function.Function;
import java.util.function.ToIntFunction;

// net.fabricmc.fabric.mixin.object.builder.AbstractBlockSettingsAccessor;

@Mixin(AbstractBlock.Settings.class)
public interface AbstractBlockSettingsAccessor {

    @Accessor
    Material getMaterial();

    @Accessor
    float getHardness();

    @Accessor
    float getResistance();

    @Accessor
    boolean getCollidable();

    @Accessor
    boolean getRandomTicks();

    @Accessor("luminance")
    ToIntFunction<BlockState> getLuminance();

    @Accessor
    Function<BlockState, MapColor> getMapColorProvider();

    @Accessor
    BlockSoundGroup getSoundGroup();

    @Accessor
    float getSlipperiness();

    @Accessor
    float getVelocityMultiplier();

    @Accessor
    float getJumpVelocityMultiplier();

    @Accessor
    boolean getDynamicBounds();

    @Accessor
    boolean getOpaque();

    @Accessor
    boolean getIsAir();

    @Accessor
    boolean isToolRequired();

    @Accessor
    AbstractBlock.TypedContextPredicate<EntityType<?>> getAllowsSpawningPredicate();

    @Accessor
    AbstractBlock.ContextPredicate getSolidBlockPredicate();

    @Accessor
    AbstractBlock.ContextPredicate getSuffocationPredicate();

    @Accessor
    AbstractBlock.ContextPredicate getBlockVisionPredicate();

    @Accessor
    AbstractBlock.ContextPredicate getPostProcessPredicate();

    @Accessor
    AbstractBlock.ContextPredicate getEmissiveLightingPredicate();

    @Accessor
    Function<BlockState, AbstractBlock.OffsetType> getOffsetType();

    /* SETTERS */
    @Accessor
    void setMaterial(Material material);

    @Accessor
    void setHardness(float hardness);

    @Accessor
    void setResistance(float resistance);

    @Accessor
    void setCollidable(boolean collidable);

    @Accessor
    void setRandomTicks(boolean ticksRandomly);

    @Accessor
    void setMapColorProvider(Function<BlockState, MapColor> mapColorProvider);

    @Accessor
    void setDynamicBounds(boolean dynamicBounds);

    @Accessor
    void setOpaque(boolean opaque);

    @Accessor
    void setIsAir(boolean isAir);

    @Accessor
    void setLootTableId(Identifier lootTableId);

    @Accessor
    void setToolRequired(boolean toolRequired);

    @Accessor("luminance")
    void setLuminanceFunction(ToIntFunction<BlockState> luminanceFunction);

    @Invoker
    AbstractBlock.Settings invokeSounds(BlockSoundGroup group);

    @Invoker
    AbstractBlock.Settings invokeBreakInstantly();

    @Invoker
    AbstractBlock.Settings invokeStrength(float strength);

    @Invoker
    AbstractBlock.Settings invokeTicksRandomly();

    @Invoker
    void invokeSettings(Material material, MapColor mapColorProvider);
}
