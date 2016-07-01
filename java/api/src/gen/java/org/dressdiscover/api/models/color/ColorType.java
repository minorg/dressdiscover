package org.dressdiscover.api.models.color;

public enum ColorType {
    PRIMARY(0),
    SECONDARY(1);

    private ColorType(int value) {
        this.value = value;
    }

    public static ColorType valueOf(final int value) {
        switch (value) {
        case 0: return PRIMARY;
        case 1: return SECONDARY;
        default: throw new IllegalArgumentException();
        }
    }

    public static ColorType valueOf(final Integer value) {
        return valueOf(value.intValue());
    }

    public final int value() {
        return value;
    }

    private final int value;
}
