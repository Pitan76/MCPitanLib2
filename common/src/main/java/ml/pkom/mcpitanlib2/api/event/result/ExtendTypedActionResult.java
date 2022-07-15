package ml.pkom.mcpitanlib2.api.event.result;

import net.minecraft.util.ActionResult;
import net.minecraft.util.TypedActionResult;

public class ExtendTypedActionResult<T> {
    private final ActionResult result;
    private final T value;

    public ExtendTypedActionResult(ActionResult result, T value) {
        this.result = result;
        this.value = value;
    }

    public ActionResult getResult() {
        return this.result;
    }

    public T getValue() {
        return this.value;
    }

    public static <T> ExtendTypedActionResult<T> success(T data) {
        return new ExtendTypedActionResult(ActionResult.SUCCESS, data);
    }

    public static <T> ExtendTypedActionResult<T> consume(T data) {
        return new ExtendTypedActionResult(ActionResult.CONSUME, data);
    }

    public static <T> ExtendTypedActionResult<T> pass(T data) {
        return new ExtendTypedActionResult(ActionResult.PASS, data);
    }

    public static <T> ExtendTypedActionResult<T> fail(T data) {
        return new ExtendTypedActionResult(ActionResult.FAIL, data);
    }

    public static <T> ExtendTypedActionResult<T> success(T data, boolean swingHand) {
        return swingHand ? success(data) : consume(data);
    }

    public TypedActionResult<T> toTypedActionResult() {
        return new TypedActionResult<>(result, value);
    }

    public static <T> ExtendTypedActionResult<T> from(TypedActionResult<T> actionResult) {
        return new ExtendTypedActionResult<>(actionResult.getResult(), actionResult.getValue());
    }
}
