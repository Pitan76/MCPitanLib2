package ml.pkom.mcpitanlib2.api.block;

public class BlockState {
    private net.minecraft.block.BlockState blockState;

    public BlockState(net.minecraft.block.BlockState blockState) {
        setBlockState(blockState);
    }

    public net.minecraft.block.BlockState getBlockState() {
        return blockState;
    }

    public void setBlockState(net.minecraft.block.BlockState blockState) {
        this.blockState = blockState;
    }
}
