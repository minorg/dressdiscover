package org.dressdiscover.api.vocabularies.vra_core;

public enum Vocab implements org.thryft.ThryftEnum {
    AAT(0),
    COSTUME_CORE(1),
    CREATIVE_COMMONS(2),
    DC(3),
    DCMI_TYPE(4),
    KWD(5),
    LCSH(6),
    OTH(7),
    QUILT_INDEX(8),
    TGN(9);

    public final static class Factory implements org.thryft.ThryftEnum.Factory<Vocab> {
        public final static Factory getInstance() {
            return instance;
        }

        public final Vocab valueOf(final String name) {
            return Vocab.valueOf(name);
        }

        public final Vocab valueOf(final int value) {
            return Vocab.valueOf(value);
        }

        private Factory() {
        }

        private final static Factory instance = new Factory();
    }

    private Vocab(int value) {
        this.value = value;
    }

    public static Vocab valueOf(final int value) {
        switch (value) {
        case 0: return AAT;
        case 1: return COSTUME_CORE;
        case 2: return CREATIVE_COMMONS;
        case 3: return DC;
        case 4: return DCMI_TYPE;
        case 5: return KWD;
        case 6: return LCSH;
        case 7: return OTH;
        case 8: return QUILT_INDEX;
        case 9: return TGN;
        default: throw new IllegalArgumentException();
        }
    }

    public final int value() {
        return value;
    }

    private final int value;
}
