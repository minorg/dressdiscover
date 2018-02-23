package org.dressdiscover.api.vocabularies.vra_core.location;

/**
 * VRA Core 4.0 location.refid type= attribute
 */
public enum LocationRefidType implements org.thryft.ThryftEnum {
    ACCESSION(0),
    BARCODE(1),
    SHELF_LIST(2),
    OTHER(3);

    public final static class Factory implements org.thryft.ThryftEnum.Factory<LocationRefidType> {
        public final static Factory getInstance() {
            return instance;
        }

        public final LocationRefidType valueOf(final String name) {
            return LocationRefidType.valueOf(name);
        }

        public final LocationRefidType valueOf(final int value) {
            return LocationRefidType.valueOf(value);
        }

        private Factory() {
        }

        private final static Factory instance = new Factory();
    }

    private LocationRefidType(int value) {
        this.value = value;
    }

    public static LocationRefidType valueOf(final int value) {
        switch (value) {
        case 0: return ACCESSION;
        case 1: return BARCODE;
        case 2: return SHELF_LIST;
        case 3: return OTHER;
        default: throw new IllegalArgumentException();
        }
    }

    public final int value() {
        return value;
    }

    private final int value;
}
