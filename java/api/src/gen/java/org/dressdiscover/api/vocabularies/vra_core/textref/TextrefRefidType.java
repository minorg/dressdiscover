package org.dressdiscover.api.vocabularies.vra_core.textref;

/**
 * VRA Core 4.0 textref.refid.type attribute values
 */
public enum TextrefRefidType implements org.thryft.ThryftEnum {
    CITATION(0),
    ISBN(1),
    ISSN(2),
    OPEN_URL(3),
    OTHER(4),
    URI(5),
    VENDOR(6);

    public final static class Factory implements org.thryft.ThryftEnum.Factory<TextrefRefidType> {
        public final static Factory getInstance() {
            return instance;
        }

        public final TextrefRefidType valueOf(final String name) {
            return TextrefRefidType.valueOf(name);
        }

        public final TextrefRefidType valueOf(final int value) {
            return TextrefRefidType.valueOf(value);
        }

        private Factory() {
        }

        private final static Factory instance = new Factory();
    }

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

    public final int value() {
        return value;
    }

    private final int value;
}
