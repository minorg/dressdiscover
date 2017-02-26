package org.dressdiscover.lib.properties;

public enum Environment {
    DEV(0),
    JENKINS(1),
    PRODUCTION(2);

    private Environment(int value) {
        this.value = value;
    }

    public static Environment valueOf(final int value) {
        switch (value) {
        case 0: return DEV;
        case 1: return JENKINS;
        case 2: return PRODUCTION;
        default: throw new IllegalArgumentException();
        }
    }

    public static Environment valueOf(final Integer value) {
        return valueOf(value.intValue());
    }

    public final int value() {
        return value;
    }

    private final int value;
}
