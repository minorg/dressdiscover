package net.lab1318.costume.api.models.date;

public enum DateType {
    ALTERATION(0),
    BROADCAST(1),
    BULK(2),
    COMMISSION(3),
    CREATION(4),
    DESIGN(5),
    DESTRUCTION(6),
    DISCOVERY(7),
    DONATION(8),
    EXHIBITION(9),
    INCLUSIVE(10),
    PERFORMANCE(11),
    PUBLICATION(12),
    RESTORATION(13),
    VIEW(14),
    OTHER(15);

    private DateType(int value) {
        this.value = value;
    }

    public static DateType valueOf(final int value) {
        switch (value) {
        case 0: return ALTERATION;
        case 1: return BROADCAST;
        case 2: return BULK;
        case 3: return COMMISSION;
        case 4: return CREATION;
        case 5: return DESIGN;
        case 6: return DESTRUCTION;
        case 7: return DISCOVERY;
        case 8: return DONATION;
        case 9: return EXHIBITION;
        case 10: return INCLUSIVE;
        case 11: return PERFORMANCE;
        case 12: return PUBLICATION;
        case 13: return RESTORATION;
        case 14: return VIEW;
        case 15: return OTHER;
        default: throw new IllegalArgumentException();
        }
    }

    public static DateType valueOf(final Integer value) {
        return valueOf(value.intValue());
    }

    public final int value() {
        return value;
    }

    private final int value;
}
