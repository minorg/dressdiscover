package org.dressdiscover.api.vocabularies.costume_core.condition;

public enum Condition implements org.thryft.ThryftEnum {
    EXCELLENT(0),
    FAIR(1),
    GOOD(2),
    POOR(3),
    VERY_GOOD(4);

    public final static class Factory implements org.thryft.ThryftEnum.Factory<Condition> {
        public final static Factory getInstance() {
            return instance;
        }

        public final Condition valueOf(final String name) {
            return Condition.valueOf(name);
        }

        public final Condition valueOf(final int value) {
            return Condition.valueOf(value);
        }

        private Factory() {
        }

        private final static Factory instance = new Factory();
    }

    private Condition(int value) {
        this.value = value;
    }

    public static Condition valueOf(final int value) {
        switch (value) {
        case 0: return EXCELLENT;
        case 1: return FAIR;
        case 2: return GOOD;
        case 3: return POOR;
        case 4: return VERY_GOOD;
        default: throw new IllegalArgumentException();
        }
    }

    public final int value() {
        return value;
    }

    private final int value;
}
