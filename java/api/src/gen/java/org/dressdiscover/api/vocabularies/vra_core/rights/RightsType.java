package org.dressdiscover.api.vocabularies.vra_core.rights;

/**
 * VRA Core 4.0 rights type= attribute
 */
public enum RightsType implements org.thryft.ThryftEnum {
    COPYRIGHTED(0),
    LICENSED(1),
    PUBLIC_DOMAIN(2),
    UNDETERMINED(3),
    OTHER(4);

    public final static class Factory implements org.thryft.ThryftEnum.Factory<RightsType> {
        public final static Factory getInstance() {
            return instance;
        }

        public final RightsType valueOf(final String name) {
            return RightsType.valueOf(name);
        }

        public final RightsType valueOf(final int value) {
            return RightsType.valueOf(value);
        }

        private Factory() {
        }

        private final static Factory instance = new Factory();
    }

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

    public final int value() {
        return value;
    }

    private final int value;
}
