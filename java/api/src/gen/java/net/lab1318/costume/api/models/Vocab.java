package net.lab1318.costume.api.models;

public enum Vocab {
    AAT(0),
    DC(1),
    KWD(2),
    OTH(3),
    LCSH(4);

    private Vocab(int value) {
        this.value = value;
    }

    public static Vocab valueOf(final int value) {
        switch (value) {
        case 0: return AAT;
        case 1: return DC;
        case 2: return KWD;
        case 3: return OTH;
        case 4: return LCSH;
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
