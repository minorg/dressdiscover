package org.dressdiscover.api.models;

public enum SortOrder implements org.thryft.ThryftEnum {
    ASC(0),
    DESC(1);

    public final static class Factory implements org.thryft.ThryftEnum.Factory<SortOrder> {
        public final static Factory getInstance() {
            return instance;
        }

        public final SortOrder valueOf(final String name) {
            return SortOrder.valueOf(name);
        }

        public final SortOrder valueOf(final int value) {
            return SortOrder.valueOf(value);
        }

        private Factory() {
        }

        private final static Factory instance = new Factory();
    }

    private SortOrder(int value) {
        this.value = value;
    }

    public static SortOrder valueOf(final int value) {
        switch (value) {
        case 0: return ASC;
        case 1: return DESC;
        default: throw new IllegalArgumentException();
        }
    }

    public final int value() {
        return value;
    }

    private final int value;
}
