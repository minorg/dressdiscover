package org.dressdiscover.api.vocabularies.costume_core.color;

public enum ColorType implements org.thryft.ThryftEnum {
    PRIMARY(0),
    SECONDARY(1);

    public final static class Factory implements org.thryft.ThryftEnum.Factory<ColorType> {
        public final static Factory getInstance() {
            return instance;
        }

        public final ColorType valueOf(final String name) {
            return ColorType.valueOf(name);
        }

        public final ColorType valueOf(final int value) {
            return ColorType.valueOf(value);
        }

        private Factory() {
        }

        private final static Factory instance = new Factory();
    }

    private ColorType(int value) {
        this.value = value;
    }

    public static ColorType valueOf(final int value) {
        switch (value) {
        case 0: return PRIMARY;
        case 1: return SECONDARY;
        default: throw new IllegalArgumentException();
        }
    }

    public final int value() {
        return value;
    }

    private final int value;
}
