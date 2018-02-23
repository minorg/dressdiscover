package org.dressdiscover.api.vocabularies.vra_core.location;

/**
 * VRA Core 4.0 location type= attribute
 */
public enum LocationType implements org.thryft.ThryftEnum {
    CREATION(0),
    DISCOVERY(1),
    EXHIBITION(2),
    FORMER_OWNER(3),
    FORMER_REPOSITORY(4),
    FORMER_SITE(5),
    INSTALLATION(6),
    INTENDED(7),
    OTHER(8),
    OWNER(9),
    PERFORMANCE(10),
    PUBLICATION(11),
    REPOSITORY(12),
    SITE(13);

    public final static class Factory implements org.thryft.ThryftEnum.Factory<LocationType> {
        public final static Factory getInstance() {
            return instance;
        }

        public final LocationType valueOf(final String name) {
            return LocationType.valueOf(name);
        }

        public final LocationType valueOf(final int value) {
            return LocationType.valueOf(value);
        }

        private Factory() {
        }

        private final static Factory instance = new Factory();
    }

    private LocationType(int value) {
        this.value = value;
    }

    public static LocationType valueOf(final int value) {
        switch (value) {
        case 0: return CREATION;
        case 1: return DISCOVERY;
        case 2: return EXHIBITION;
        case 3: return FORMER_OWNER;
        case 4: return FORMER_REPOSITORY;
        case 5: return FORMER_SITE;
        case 6: return INSTALLATION;
        case 7: return INTENDED;
        case 8: return OTHER;
        case 9: return OWNER;
        case 10: return PERFORMANCE;
        case 11: return PUBLICATION;
        case 12: return REPOSITORY;
        case 13: return SITE;
        default: throw new IllegalArgumentException();
        }
    }

    public final int value() {
        return value;
    }

    private final int value;
}
