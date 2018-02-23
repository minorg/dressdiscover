package org.dressdiscover.api.vocabularies.vra_core.date;

public enum DateType implements org.thryft.ThryftEnum {
    ACCESSION(0),
    ALTERATION(1),
    BROADCAST(2),
    BULK(3),
    COMMISSION(4),
    CREATION(5),
    DESIGN(6),
    DESTRUCTION(7),
    DISCOVERY(8),
    DONATION(9),
    EXHIBITION(10),
    INCLUSIVE(11),
    PERFORMANCE(12),
    PUBLICATION(13),
    RESTORATION(14),
    VIEW(15),
    OTHER(16);

    public final static class Factory implements org.thryft.ThryftEnum.Factory<DateType> {
        public final static Factory getInstance() {
            return instance;
        }

        public final DateType valueOf(final String name) {
            return DateType.valueOf(name);
        }

        public final DateType valueOf(final int value) {
            return DateType.valueOf(value);
        }

        private Factory() {
        }

        private final static Factory instance = new Factory();
    }

    private DateType(int value) {
        this.value = value;
    }

    public static DateType valueOf(final int value) {
        switch (value) {
        case 0: return ACCESSION;
        case 1: return ALTERATION;
        case 2: return BROADCAST;
        case 3: return BULK;
        case 4: return COMMISSION;
        case 5: return CREATION;
        case 6: return DESIGN;
        case 7: return DESTRUCTION;
        case 8: return DISCOVERY;
        case 9: return DONATION;
        case 10: return EXHIBITION;
        case 11: return INCLUSIVE;
        case 12: return PERFORMANCE;
        case 13: return PUBLICATION;
        case 14: return RESTORATION;
        case 15: return VIEW;
        case 16: return OTHER;
        default: throw new IllegalArgumentException();
        }
    }

    public final int value() {
        return value;
    }

    private final int value;
}
