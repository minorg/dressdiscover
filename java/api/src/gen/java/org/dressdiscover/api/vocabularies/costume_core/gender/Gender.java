package org.dressdiscover.api.vocabularies.costume_core.gender;

public enum Gender implements org.thryft.ThryftEnum {
    FEMALE(0),
    MALE(1),
    UNKNOWN(2);

    public final static class Factory implements org.thryft.ThryftEnum.Factory<Gender> {
        public final static Factory getInstance() {
            return instance;
        }

        public final Gender valueOf(final String name) {
            return Gender.valueOf(name);
        }

        public final Gender valueOf(final int value) {
            return Gender.valueOf(value);
        }

        private Factory() {
        }

        private final static Factory instance = new Factory();
    }

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

    public final int value() {
        return value;
    }

    private final int value;
}
