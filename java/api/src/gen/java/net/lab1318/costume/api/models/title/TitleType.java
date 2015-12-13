package net.lab1318.costume.api.models.title;

public enum TitleType {
    BRAND_NAME(0),
    CITED(1),
    CREATOR(2),
    DESCRIPTIVE(3),
    FORMER(4),
    INSCRIBED(5),
    OWNER(6),
    POPULAR(7),
    REPOSITORY(8),
    TRANSLATED(9),
    OTHER(10),
    GENERAL_VIEW(11),
    PARTIAL_VIEW(12);

    private TitleType(int value) {
        this.value = value;
    }

    public static TitleType valueOf(final int value) {
        switch (value) {
        case 0: return BRAND_NAME;
        case 1: return CITED;
        case 2: return CREATOR;
        case 3: return DESCRIPTIVE;
        case 4: return FORMER;
        case 5: return INSCRIBED;
        case 6: return OWNER;
        case 7: return POPULAR;
        case 8: return REPOSITORY;
        case 9: return TRANSLATED;
        case 10: return OTHER;
        case 11: return GENERAL_VIEW;
        case 12: return PARTIAL_VIEW;
        default: throw new IllegalArgumentException();
        }
    }

    public static TitleType valueOf(final Integer value) {
        return valueOf(value.intValue());
    }

    public final int value() {
        return value;
    }

    private final int value;
}
