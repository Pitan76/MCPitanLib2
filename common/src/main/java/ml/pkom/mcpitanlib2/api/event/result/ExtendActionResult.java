package ml.pkom.mcpitanlib2.api.event.result;

import net.minecraft.util.ActionResult;

public enum ExtendActionResult {
    SUCCESS(ActionResult.SUCCESS),
    CONSUME(ActionResult.CONSUME),
    CONSUME_PARTIAL(ActionResult.CONSUME_PARTIAL),
    PASS(ActionResult.PASS),
    FAIL(ActionResult.FAIL);

    private ActionResult actionResult;
    
    ExtendActionResult(ActionResult actionResult) {
        this.actionResult = actionResult;
    }

    public ActionResult getActionResult() {
        return actionResult;
    }

    public void setActionResult(ActionResult actionResult) {
        this.actionResult = actionResult;
    }

    public static ExtendActionResult from(ActionResult actionResult) {
        return switch (actionResult) {
            case SUCCESS -> SUCCESS;
            case CONSUME -> CONSUME;
            case CONSUME_PARTIAL -> CONSUME_PARTIAL;
            case PASS -> PASS;
            case FAIL -> FAIL;
        };
    }

    public ActionResult toActionResult() {
        return getActionResult();
    }
}
