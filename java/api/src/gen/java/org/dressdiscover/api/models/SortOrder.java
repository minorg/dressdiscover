package org.dressdiscover.api.models;

public enum SortOrder {
    ASC(0),
    DESC(1);

    private SortOrder(int value) {
        this.value = value;
    }

    public static SortOrder valueOf(final int value) {
        switch (value) {
        case 0: return ASC;
        case 1: return DESC;
        default: throw new IllegalArgumentException();
        }
    }

    public static SortOrder valueOf(final Integer value) {
        return valueOf(value.intValue());
    }

    public final int value() {
        return value;
    }

    private final int value;
}
