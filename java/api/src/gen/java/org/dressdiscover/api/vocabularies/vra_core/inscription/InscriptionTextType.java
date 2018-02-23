package org.dressdiscover.api.vocabularies.vra_core.inscription;

public enum InscriptionTextType implements org.thryft.ThryftEnum {
    SIGNATURE(0),
    MARK(1),
    CAPTION(2),
    DATE(3),
    LABEL(4),
    TEXT(5),
    TRANSLATION(6),
    OTHER(7);

    public final static class Factory implements org.thryft.ThryftEnum.Factory<InscriptionTextType> {
        public final static Factory getInstance() {
            return instance;
        }

        public final InscriptionTextType valueOf(final String name) {
            return InscriptionTextType.valueOf(name);
        }

        public final InscriptionTextType valueOf(final int value) {
            return InscriptionTextType.valueOf(value);
        }

        private Factory() {
        }

        private final static Factory instance = new Factory();
    }

    private InscriptionTextType(int value) {
        this.value = value;
    }

    public static InscriptionTextType valueOf(final int value) {
        switch (value) {
        case 0: return SIGNATURE;
        case 1: return MARK;
        case 2: return CAPTION;
        case 3: return DATE;
        case 4: return LABEL;
        case 5: return TEXT;
        case 6: return TRANSLATION;
        case 7: return OTHER;
        default: throw new IllegalArgumentException();
        }
    }

    public final int value() {
        return value;
    }

    private final int value;
}
