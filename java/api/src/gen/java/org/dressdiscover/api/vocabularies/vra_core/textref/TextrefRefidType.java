package org.dressdiscover.api.vocabularies.vra_core.textref;

/**
 * VRA Core 4.0 textref.refid.type attribute values
 */
public enum TextrefRefidType {
    CITATION(0),
    ISBN(1),
    ISSN(2),
    OPEN_URL(3),
    OTHER(4),
    URI(5),
    VENDOR(6);

    private TextrefRefidType(int value) {
        this.value = value;
    }

    public static TextrefRefidType valueOf(final int value) {
        switch (value) {
        case 0: return CITATION;
        case 1: return ISBN;
        case 2: return ISSN;
        case 3: return OPEN_URL;
        case 4: return OTHER;
        case 5: return URI;
        case 6: return VENDOR;
        default: throw new IllegalArgumentException();
        }
    }

    public static TextrefRefidType valueOf(final Integer value) {
        return valueOf(value.intValue());
    }

    public final int value() {
        return value;
    }

    private final int value;
}
