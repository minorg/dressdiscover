package org.dressdiscover.lib.properties;

public enum Environment implements org.thryft.ThryftEnum {
    DEV(0),
    JENKINS(1),
    PRODUCTION(2);

    public final static class Factory implements org.thryft.ThryftEnum.Factory<Environment> {
        public final static Factory getInstance() {
            return instance;
        }

        public final Environment valueOf(final String name) {
            return Environment.valueOf(name);
        }

        public final Environment valueOf(final int value) {
            return Environment.valueOf(value);
        }

        private Factory() {
        }

        private final static Factory instance = new Factory();
    }

    private Environment(int value) {
        this.value = value;
    }

    public static Environment valueOf(final int value) {
        switch (value) {
        case 0: return DEV;
        case 1: return JENKINS;
        case 2: return PRODUCTION;
        default: throw new IllegalArgumentException();
        }
    }

    public final int value() {
        return value;
    }

    private final int value;
}
