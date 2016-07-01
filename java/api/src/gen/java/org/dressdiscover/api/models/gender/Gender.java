package org.dressdiscover.api.models.gender;

public enum Gender {
    FEMALE(0),
    MALE(1),
    UNKNOWN(2);

    private Gender(int value) {
        this.value = value;
    }

    public static Gender valueOf(final int value) {
        switch (value) {
        case 0: return FEMALE;
        case 1: return MALE;
        case 2: return UNKNOWN;
        default: throw new IllegalArgumentException();
        }
    }

    public static Gender valueOf(final Integer value) {
        return valueOf(value.intValue());
    }

    public final int value() {
        return value;
    }

    private final int value;
}
