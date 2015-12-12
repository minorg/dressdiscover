package net.lab1318.costume.api.models.description;

public enum DescriptionType {
    EXHIBITION(0),
    HISTORY(1),
    PHYSICAL(2),
    PRIVATE(3),
    PUBLIC(4),
    SUMMARY(5);

    private DescriptionType(int value) {
        this.value = value;
    }

    public static DescriptionType valueOf(final int value) {
        switch (value) {
        case 0: return EXHIBITION;
        case 1: return HISTORY;
        case 2: return PHYSICAL;
        case 3: return PRIVATE;
        case 4: return PUBLIC;
        case 5: return SUMMARY;
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
