package ml.pkom.mcpitanlib2.api.block;

import ml.pkom.mcpitanlib2.api.event.block.BlockBreakEvent;
import ml.pkom.mcpitanlib2.api.event.block.BlockBrokenEvent;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class ExtendedBlock extends Block {

    private ml.pkom.mcpitanlib2.api.block.Block MPLBlock;

    public void setMPLBlock(ml.pkom.mcpitanlib2.api.block.Block MPLBlock) {
        this.MPLBlock = MPLBlock;
    }

    public ml.pkom.mcpitanlib2.api.block.Block getMPLBlock() {
        return MPLBlock;
    }

    public ExtendedBlock(Settings settings) {
        super(settings);
    }

    public ExtendedBlock(BlockSettings settings) {
        this(settings.getSettings());
    }

    @Override
    public void onBroken(WorldAccess world, BlockPos pos, BlockState state) {
        MPLBlock.onBroken(new BlockBrokenEvent(world, pos, state), () -> super.onBroken(world, pos, state));
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        MPLBlock.onBreak(new BlockBreakEvent(world, pos, state, player), () -> super.onBreak(world, pos, state, player));
    }

    public ExtendedBlock(ml.pkom.mcpitanlib2.api.block.Block block) {
        super(block.getSettings().getSettings());
        setMPLBlock(block);
    }

    public static ExtendedBlock of(ml.pkom.mcpitanlib2.api.block.Block block) {
        return new ExtendedBlock(block);
    }
}
