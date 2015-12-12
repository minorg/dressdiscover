package net.lab1318.costume.api.models.description;

public enum DescriptionType {
    CONDITION(0),
    EXHIBITION(1),
    HISTORY(2),
    PHYSICAL(3),
    PRIVATE(4),
    PUBLIC(5),
    SUMMARY(6);

    private DescriptionType(int value) {
        this.value = value;
    }

    public static DescriptionType valueOf(final int value) {
        switch (value) {
        case 0: return CONDITION;
        case 1: return EXHIBITION;
        case 2: return HISTORY;
        case 3: return PHYSICAL;
        case 4: return PRIVATE;
        case 5: return PUBLIC;
        case 6: return SUMMARY;
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
