package net.lab1318.costume.api.models.condition;

public enum Condition {
    EXCELLENT(0),
    FAIR(1),
    GOOD(2),
    POOR(3),
    VERY_GOOD(4);

    private Condition(int value) {
        this.value = value;
    }

    public static Condition valueOf(final int value) {
        switch (value) {
        case 0: return EXCELLENT;
        case 1: return FAIR;
        case 2: return GOOD;
        case 3: return POOR;
        case 4: return VERY_GOOD;
        default: throw new IllegalArgumentException();
        }
    }

    public static Condition valueOf(final Integer value) {
        return valueOf(value.intValue());
    }

    public final int value() {
        return value;
    }

    private final int value;
}
