package org.dressdiscover.api.models.rights;

/**
 * VRA Core 4.0 rights type= attribute
 */
public enum RightsType {
    COPYRIGHTED(0),
    LICENSED(1),
    PUBLIC_DOMAIN(2),
    UNDETERMINED(3),
    OTHER(4);

    private RightsType(int value) {
        this.value = value;
    }

    public static RightsType valueOf(final int value) {
        switch (value) {
        case 0: return COPYRIGHTED;
        case 1: return LICENSED;
        case 2: return PUBLIC_DOMAIN;
        case 3: return UNDETERMINED;
        case 4: return OTHER;
        default: throw new IllegalArgumentException();
        }
    }

    public static RightsType valueOf(final Integer value) {
        return valueOf(value.intValue());
    }

    public final int value() {
        return value;
    }

    private final int value;
}
