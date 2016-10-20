package org.dressdiscover.api.vocabularies.vra_core.location;

/**
 * VRA Core 4.0 location.name type= attribute
 */
public enum LocationNameType {
    CORPORATE(0),
    GEOGRAPHIC(1),
    OTHER(2),
    PERSONAL(3);

    private LocationNameType(int value) {
        this.value = value;
    }

    public static LocationNameType valueOf(final int value) {
        switch (value) {
        case 0: return CORPORATE;
        case 1: return GEOGRAPHIC;
        case 2: return OTHER;
        case 3: return PERSONAL;
        default: throw new IllegalArgumentException();
        }
    }

    public static LocationNameType valueOf(final Integer value) {
        return valueOf(value.intValue());
    }

    public final int value() {
        return value;
    }

    private final int value;
}
