package net.lab1318.costume.api.models.measurements;

/**
 * VRA Core 4.0 measurements unit= attribute
 */
public enum MeasurementsUnit {
    CM(0),
    IN(1);

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

    public static MeasurementsUnit valueOf(final Integer value) {
        return valueOf(value.intValue());
    }

    public final int value() {
        return value;
    }

    private final int value;
}
