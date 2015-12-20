package net.lab1318.costume.api.models.description;

public enum DescriptionType {
    CONDITION(0),
    CREDIT(1),
    EXHIBITION(2),
    HISTORY(3),
    PHYSICAL(4),
    PRIVATE(5),
    PUBLIC(6),
    SUMMARY(7);

    private DescriptionType(int value) {
        this.value = value;
    }

    public static DescriptionType valueOf(final int value) {
        switch (value) {
        case 0: return CONDITION;
        case 1: return CREDIT;
        case 2: return EXHIBITION;
        case 3: return HISTORY;
        case 4: return PHYSICAL;
        case 5: return PRIVATE;
        case 6: return PUBLIC;
        case 7: return SUMMARY;
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
