package net.lab1318.costume.api.models.measurements;

/**
 * VRA Core 4.0 measurements type= attribute
 */
public enum MeasurementsType {
    AREA(0),
    BASE(1),
    BIT_DEPTH(2),
    CIRCUMFERENCE(3),
    COUNT(4),
    DEPTH(5),
    DIAMETER(6),
    DISTANCE_BETWEEN(7),
    DURATION(8),
    FILE_SIZE(9),
    HEIGHT(10),
    LENGTH(11),
    RESOLUTION(12),
    RUNNING_TIME(13),
    SCALE(14),
    SIZE(15),
    TARGET(16),
    WEIGHT(17),
    WIDTH(18),
    OTHER(19);

    private MeasurementsType(int value) {
        this.value = value;
    }

    public static MeasurementsType valueOf(final int value) {
        switch (value) {
        case 0: return AREA;
        case 1: return BASE;
        case 2: return BIT_DEPTH;
        case 3: return CIRCUMFERENCE;
        case 4: return COUNT;
        case 5: return DEPTH;
        case 6: return DIAMETER;
        case 7: return DISTANCE_BETWEEN;
        case 8: return DURATION;
        case 9: return FILE_SIZE;
        case 10: return HEIGHT;
        case 11: return LENGTH;
        case 12: return RESOLUTION;
        case 13: return RUNNING_TIME;
        case 14: return SCALE;
        case 15: return SIZE;
        case 16: return TARGET;
        case 17: return WEIGHT;
        case 18: return WIDTH;
        case 19: return OTHER;
        default: throw new IllegalArgumentException();
        }
    }

    public static MeasurementsType valueOf(final Integer value) {
        return valueOf(value.intValue());
    }

    public final int value() {
        return value;
    }

    private final int value;
}
