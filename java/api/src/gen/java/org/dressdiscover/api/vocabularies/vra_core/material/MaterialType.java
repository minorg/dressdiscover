package org.dressdiscover.api.vocabularies.vra_core.material;

/**
 * VRA Core 4.0 material type= attribute
 */
public enum MaterialType {
    MEDIUM(0),
    SUPPORT(1),
    OTHER(2),
    WARP(3),
    WEFT(4);

    private MaterialType(int value) {
        this.value = value;
    }

    public static MaterialType valueOf(final int value) {
        switch (value) {
        case 0: return MEDIUM;
        case 1: return SUPPORT;
        case 2: return OTHER;
        case 3: return WARP;
        case 4: return WEFT;
        default: throw new IllegalArgumentException();
        }
    }

    public static MaterialType valueOf(final Integer value) {
        return valueOf(value.intValue());
    }

    public final int value() {
        return value;
    }

    private final int value;
}
