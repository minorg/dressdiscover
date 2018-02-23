package org.dressdiscover.api.vocabularies.vra_core.location;

/**
 * VRA Core 4.0 location.name type= attribute
 */
public enum LocationNameType implements org.thryft.ThryftEnum {
    CORPORATE(0),
    GEOGRAPHIC(1),
    OTHER(2),
    PERSONAL(3);

    public final static class Factory implements org.thryft.ThryftEnum.Factory<LocationNameType> {
        public final static Factory getInstance() {
            return instance;
        }

        public final LocationNameType valueOf(final String name) {
            return LocationNameType.valueOf(name);
        }

        public final LocationNameType valueOf(final int value) {
            return LocationNameType.valueOf(value);
        }

        private Factory() {
        }

        private final static Factory instance = new Factory();
    }

    private LocationNameType(int value) {
        this.value = value;
    }

    public static LocationNameType valueOf(final int value) {
        switch (value) {
        case 0: return CORPORATE;
        case 1: return GEOGRAPHIC;
        case 2: return OTHER;
        case 3: return PERSONAL;
        default: throw new IllegalArgumentException();
        }
    }

    public final int value() {
        return value;
    }

    private final int value;
}
