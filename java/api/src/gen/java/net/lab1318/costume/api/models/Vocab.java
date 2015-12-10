package net.lab1318.costume.api.models;

public enum Vocab {
    AAT(0),
    DC(1),
    DCMI_TYPE(2),
    KWD(3),
    OTH(4),
    LCSH(5);

    private Vocab(int value) {
        this.value = value;
    }

    public static Vocab valueOf(final int value) {
        switch (value) {
        case 0: return AAT;
        case 1: return DC;
        case 2: return DCMI_TYPE;
        case 3: return KWD;
        case 4: return OTH;
        case 5: return LCSH;
        default: throw new IllegalArgumentException();
        }
    }

    public static Vocab valueOf(final Integer value) {
        return valueOf(value.intValue());
    }

    public final int value() {
        return value;
    }

    private final int value;
}
