package net.lab1318.costume.api.models.rights;

/**
 * VRA Core 4.0 rights type= attribute
 */
public enum RightsType {
    COPYRIGHTED(0),
    PUBLIC_DOMAIN(1),
    UNDETERMINED(2),
    OTHER(3);

    private RightsType(int value) {
        this.value = value;
    }

    public static RightsType valueOf(final int value) {
        switch (value) {
        case 0: return COPYRIGHTED;
        case 1: return PUBLIC_DOMAIN;
        case 2: return UNDETERMINED;
        case 3: return OTHER;
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
