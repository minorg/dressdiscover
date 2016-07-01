package org.dressdiscover.api.models.textref;

/**
 * VRA Core 4.0 textref.name.type attribute values
 */
public enum TextrefNameType {
    BOOK(0),
    CATALOG(1),
    CORPUS(2),
    ELECTRONIC(3),
    OTHER(4),
    SERIAL(5);

    private TextrefNameType(int value) {
        this.value = value;
    }

    public static TextrefNameType valueOf(final int value) {
        switch (value) {
        case 0: return BOOK;
        case 1: return CATALOG;
        case 2: return CORPUS;
        case 3: return ELECTRONIC;
        case 4: return OTHER;
        case 5: return SERIAL;
        default: throw new IllegalArgumentException();
        }
    }

    public static TextrefNameType valueOf(final Integer value) {
        return valueOf(value.intValue());
    }

    public final int value() {
        return value;
    }

    private final int value;
}
