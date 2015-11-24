package net.lab1318.costume.api.models;

public enum Vocab {
    AAT(0),
    KWD(1),
    OTH(2),
    LCSH(3);

    private Vocab(int value) {
        this.value = value;
    }

    public static Vocab valueOf(final int value) {
        switch (value) {
        case 0: return AAT;
        case 1: return KWD;
        case 2: return OTH;
        case 3: return LCSH;
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
