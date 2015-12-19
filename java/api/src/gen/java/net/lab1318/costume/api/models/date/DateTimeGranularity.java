package net.lab1318.costume.api.models.date;

public enum DateTimeGranularity {
    DAY(0),
    MONTH(1),
    YEAR(2);

    private DateTimeGranularity(int value) {
        this.value = value;
    }

    public static DateTimeGranularity valueOf(final int value) {
        switch (value) {
        case 0: return DAY;
        case 1: return MONTH;
        case 2: return YEAR;
        default: throw new IllegalArgumentException();
        }
    }

    public static DateTimeGranularity valueOf(final Integer value) {
        return valueOf(value.intValue());
    }

    public final int value() {
        return value;
    }

    private final int value;
}
