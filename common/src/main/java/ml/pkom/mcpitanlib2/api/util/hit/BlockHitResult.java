package ml.pkom.mcpitanlib2.api.util.hit;

public class BlockHitResult {
    private net.minecraft.util.hit.BlockHitResult blockHitResult;

    public BlockHitResult(net.minecraft.util.hit.BlockHitResult blockHitResult) {
        setBlockHitResult(blockHitResult);
    }

    public net.minecraft.util.hit.BlockHitResult getBlockHitResult() {
        return blockHitResult;
    }

    public void setBlockHitResult(net.minecraft.util.hit.BlockHitResult blockHitResult) {
        this.blockHitResult = blockHitResult;
    }
}
