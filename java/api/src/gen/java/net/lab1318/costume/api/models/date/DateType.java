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
    EXHIBITION(8),
    INCLUSIVE(9),
    PERFORMANCE(10),
    PUBLICATION(11),
    RESTORATION(12),
    VIEW(13),
    OTHER(14);

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
        case 8: return EXHIBITION;
        case 9: return INCLUSIVE;
        case 10: return PERFORMANCE;
        case 11: return PUBLICATION;
        case 12: return RESTORATION;
        case 13: return VIEW;
        case 14: return OTHER;
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
