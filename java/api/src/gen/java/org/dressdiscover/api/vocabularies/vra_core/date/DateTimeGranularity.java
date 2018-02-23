package org.dressdiscover.api.vocabularies.vra_core.date;

public enum DateTimeGranularity implements org.thryft.ThryftEnum {
    DAY(0),
    MONTH(1),
    YEAR(2);

    public final static class Factory implements org.thryft.ThryftEnum.Factory<DateTimeGranularity> {
        public final static Factory getInstance() {
            return instance;
        }

        public final DateTimeGranularity valueOf(final String name) {
            return DateTimeGranularity.valueOf(name);
        }

        public final DateTimeGranularity valueOf(final int value) {
            return DateTimeGranularity.valueOf(value);
        }

        private Factory() {
        }

        private final static Factory instance = new Factory();
    }

    private DateTimeGranularity(int value) {
        this.value = value;
    }

    public static DateTimeGranularity valueOf(final int value) {
        switch (value) {
        case 0: return DAY;
        case 1: return MONTH;
        case 2: return YEAR;
        default: throw new IllegalArgumentException();
        }
    }

    public final int value() {
        return value;
    }

    private final int value;
}
