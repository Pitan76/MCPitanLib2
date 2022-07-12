package ml.pkom.mcpitanlib2.api.block;

public class BlockPos {
    private net.minecraft.util.math.BlockPos blockPos;

    public BlockPos(net.minecraft.util.math.BlockPos blockPos) {
        setBlockPos(blockPos);
    }

    public BlockPos(int x, int y, int z) {
        setBlockPos(new net.minecraft.util.math.BlockPos(x, y, z));
    }

    public net.minecraft.util.math.BlockPos getBlockPos() {
        return blockPos;
    }

    public void setBlockPos(net.minecraft.util.math.BlockPos blockPos) {
        this.blockPos = blockPos;
    }
}
