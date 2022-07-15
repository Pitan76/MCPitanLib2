package ml.pkom.mcpitanlib2.api.util.hit;

public class HitResult {
    private net.minecraft.util.hit.HitResult hitResult;

    public HitResult(net.minecraft.util.hit.HitResult hitResult) {
        setHitResult(hitResult);
    }

    public void setHitResult(net.minecraft.util.hit.HitResult hitResult) {
        this.hitResult = hitResult;
    }

    public net.minecraft.util.hit.HitResult getHitResult() {
        return hitResult;
    }
}
