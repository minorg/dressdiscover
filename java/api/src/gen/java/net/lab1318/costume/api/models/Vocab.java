package net.lab1318.costume.api.models;

public enum Vocab {
    AAT(0);

    private Vocab(int value) {
        this.value = value;
    }

    public static Vocab valueOf(final int value) {
        switch (value) {
        case 0: return AAT;
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
