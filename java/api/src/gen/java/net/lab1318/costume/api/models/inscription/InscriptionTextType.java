package net.lab1318.costume.api.models.inscription;

public enum InscriptionTextType {
    SIGNATURE(0),
    MARK(1),
    CAPTION(2),
    DATE(3),
    TEXT(4),
    TRANSLATION(5),
    OTHER(6);

    private InscriptionTextType(int value) {
        this.value = value;
    }

    public static InscriptionTextType valueOf(final int value) {
        switch (value) {
        case 0: return SIGNATURE;
        case 1: return MARK;
        case 2: return CAPTION;
        case 3: return DATE;
        case 4: return TEXT;
        case 5: return TRANSLATION;
        case 6: return OTHER;
        default: throw new IllegalArgumentException();
        }
    }

    public static InscriptionTextType valueOf(final Integer value) {
        return valueOf(value.intValue());
    }

    public final int value() {
        return value;
    }

    private final int value;
}
