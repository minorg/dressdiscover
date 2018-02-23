package org.dressdiscover.api.vocabularies.vra_core.textref;

/**
 * VRA Core 4.0 textref.name.type attribute values
 */
public enum TextrefNameType implements org.thryft.ThryftEnum {
    BOOK(0),
    CATALOG(1),
    CORPUS(2),
    ELECTRONIC(3),
    OTHER(4),
    SERIAL(5);

    public final static class Factory implements org.thryft.ThryftEnum.Factory<TextrefNameType> {
        public final static Factory getInstance() {
            return instance;
        }

        public final TextrefNameType valueOf(final String name) {
            return TextrefNameType.valueOf(name);
        }

        public final TextrefNameType valueOf(final int value) {
            return TextrefNameType.valueOf(value);
        }

        private Factory() {
        }

        private final static Factory instance = new Factory();
    }

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

    public final int value() {
        return value;
    }

    private final int value;
}
