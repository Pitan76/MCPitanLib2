package ml.pkom.mcpitanlib2.api.block.v0;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.util.DyeColor;

import java.util.function.Function;

@Deprecated
public class BlockSettings {
    private AbstractBlock.Settings settings;

    public BlockSettings(AbstractBlock block) {
        setSettings(AbstractBlock.Settings.copy(block));
    }

    public BlockSettings(Material material) {
        setSettings(AbstractBlock.Settings.of(material));
    }

    public BlockSettings(Material material, DyeColor color) {
        setSettings(AbstractBlock.Settings.of(material, color));
    }

    public BlockSettings(Material material, MapColor color) {
        setSettings(AbstractBlock.Settings.of(material, color));
    }

    public BlockSettings(Material material, Function<BlockState, MapColor> mapColor) {
        setSettings(AbstractBlock.Settings.of(material, mapColor));
    }

    public BlockSettings air() {
        settings.air();
        return this;
    }

    public BlockSettings breakInstantly() {
        settings.breakInstantly();
        return this;
    }

    public BlockSettings dropsNothing() {
        settings.dropsNothing();
        return this;
    }

    public BlockSettings dynamicBounds() {
        settings.dynamicBounds();
        return this;
    }

    public BlockSettings hardness(float hardness) {
        settings.hardness(hardness);
        return this;
    }

    public BlockSettings resistance(float resistance) {
        settings.resistance(resistance);
        return this;
    }

    public BlockSettings requiresTool() {
        settings.requiresTool();
        return this;
    }

    public BlockSettings nonOpaque() {
        settings.nonOpaque();
        return this;
    }

    public BlockSettings ticksRandomly() {
        settings.ticksRandomly();
        return this;
    }

    public BlockSettings luminance(int luminance) {
        settings.luminance(blockState -> luminance);
        return this;
    }

    public BlockSettings mapColor(MapColor color) {
        settings.mapColor(color);
        return this;
    }

    public BlockSettings noCollision(MapColor color) {
        settings.noCollision();
        return this;
    }

    public void setSettings(AbstractBlock.Settings settings) {
        this.settings = settings;
    }

    public AbstractBlock.Settings getSettings() {
        return settings;
    }
}
