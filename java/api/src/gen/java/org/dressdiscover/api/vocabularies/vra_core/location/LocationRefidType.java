package org.dressdiscover.api.vocabularies.vra_core.location;

/**
 * VRA Core 4.0 location.refid type= attribute
 */
public enum LocationRefidType {
    ACCESSION(0),
    BARCODE(1),
    SHELF_LIST(2),
    OTHER(3);

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

    public static LocationRefidType valueOf(final Integer value) {
        return valueOf(value.intValue());
    }

    public final int value() {
        return value;
    }

    private final int value;
}
