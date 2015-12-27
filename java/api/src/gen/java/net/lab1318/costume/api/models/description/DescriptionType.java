package net.lab1318.costume.api.models.description;

public enum DescriptionType {
    BIOGRAPHY(0),
    CONDITION(1),
    CREDIT(2),
    EXHIBITION(3),
    HISTORY(4),
    PHYSICAL(5),
    PRIVATE(6),
    PUBLIC(7),
    SUMMARY(8);

    private DescriptionType(int value) {
        this.value = value;
    }

    public static DescriptionType valueOf(final int value) {
        switch (value) {
        case 0: return BIOGRAPHY;
        case 1: return CONDITION;
        case 2: return CREDIT;
        case 3: return EXHIBITION;
        case 4: return HISTORY;
        case 5: return PHYSICAL;
        case 6: return PRIVATE;
        case 7: return PUBLIC;
        case 8: return SUMMARY;
        default: throw new IllegalArgumentException();
        }
    }

    public static DescriptionType valueOf(final Integer value) {
        return valueOf(value.intValue());
    }

    public final int value() {
        return value;
    }

    private final int value;
}
