package net.lab1318.costume.api.models;

public enum Vocab {
    AAT(0),
    COSTUME_CORE(1),
    DC(2),
    DCMI_TYPE(3),
    KWD(4),
    LCSH(5),
    OTH(6),
    QUILT_INDEX(7);

    private Vocab(int value) {
        this.value = value;
    }

    public static Vocab valueOf(final int value) {
        switch (value) {
        case 0: return AAT;
        case 1: return COSTUME_CORE;
        case 2: return DC;
        case 3: return DCMI_TYPE;
        case 4: return KWD;
        case 5: return LCSH;
        case 6: return OTH;
        case 7: return QUILT_INDEX;
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
