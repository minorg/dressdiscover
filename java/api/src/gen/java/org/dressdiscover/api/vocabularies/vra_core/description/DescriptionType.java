package org.dressdiscover.api.vocabularies.vra_core.description;

public enum DescriptionType implements org.thryft.ThryftEnum {
    BIBLIOGRAPHY(0),
    BIOGRAPHY(1),
    CONDITION(2),
    CREDIT(3),
    EXHIBITION(4),
    HISTORY(5),
    PHYSICAL(6),
    PRIVATE(7),
    PUBLIC(8),
    SUMMARY(9);

    public final static class Factory implements org.thryft.ThryftEnum.Factory<DescriptionType> {
        public final static Factory getInstance() {
            return instance;
        }

        public final DescriptionType valueOf(final String name) {
            return DescriptionType.valueOf(name);
        }

        public final DescriptionType valueOf(final int value) {
            return DescriptionType.valueOf(value);
        }

        private Factory() {
        }

        private final static Factory instance = new Factory();
    }

    private DescriptionType(int value) {
        this.value = value;
    }

    public static DescriptionType valueOf(final int value) {
        switch (value) {
        case 0: return BIBLIOGRAPHY;
        case 1: return BIOGRAPHY;
        case 2: return CONDITION;
        case 3: return CREDIT;
        case 4: return EXHIBITION;
        case 5: return HISTORY;
        case 6: return PHYSICAL;
        case 7: return PRIVATE;
        case 8: return PUBLIC;
        case 9: return SUMMARY;
        default: throw new IllegalArgumentException();
        }
    }

    public final int value() {
        return value;
    }

    private final int value;
}
