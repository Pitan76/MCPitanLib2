package ml.pkom.mcpitanlib2.api.util;

public enum Hand {
    MAIN_HAND,
    OFF_HAND;

    private Hand() {
    }

    public net.minecraft.util.Hand toMCHand() {
        return switch (this) {
            case MAIN_HAND -> net.minecraft.util.Hand.MAIN_HAND;
            case OFF_HAND -> net.minecraft.util.Hand.OFF_HAND;
        };
    }

    public static Hand fromMCHand(net.minecraft.util.Hand mchand) {
        return switch (mchand) {
            case MAIN_HAND -> MAIN_HAND;
            case OFF_HAND -> OFF_HAND;
        };
    }
}
