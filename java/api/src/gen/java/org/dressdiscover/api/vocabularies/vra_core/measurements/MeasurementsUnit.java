package org.dressdiscover.api.vocabularies.vra_core.measurements;

/**
 * VRA Core 4.0 measurements unit= attribute
 */
public enum MeasurementsUnit implements org.thryft.ThryftEnum {
    CM(0),
    IN(1);

    public final static class Factory implements org.thryft.ThryftEnum.Factory<MeasurementsUnit> {
        public final static Factory getInstance() {
            return instance;
        }

        public final MeasurementsUnit valueOf(final String name) {
            return MeasurementsUnit.valueOf(name);
        }

        public final MeasurementsUnit valueOf(final int value) {
            return MeasurementsUnit.valueOf(value);
        }

        private Factory() {
        }

        private final static Factory instance = new Factory();
    }

    private MeasurementsUnit(int value) {
        this.value = value;
    }

    public static MeasurementsUnit valueOf(final int value) {
        switch (value) {
        case 0: return CM;
        case 1: return IN;
        default: throw new IllegalArgumentException();
        }
    }

    public final int value() {
        return value;
    }

    private final int value;
}
