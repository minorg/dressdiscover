package org.dressdiscover.api.vocabularies.vra_core.view_type;

public enum ViewType {
    ACTION(0),
    BACK(1),
    CONDITION(2),
    CONDITION_DETAIL(3),
    DETAIL(4),
    DOCUMENT(5),
    DRAWING(6),
    FRONT(7),
    GROUP(8),
    INTERIOR(9),
    INTERIOR_CONSTRUCTION(10),
    LABEL(11),
    OTHER(12),
    PATTERN(13),
    PHOTOGRAPH(14),
    REFERENCE(15),
    SIDE(16),
    SUPPORTING_DOCUMENT(17),
    VIDEO(18);

    private ViewType(int value) {
        this.value = value;
    }

    public static ViewType valueOf(final int value) {
        switch (value) {
        case 0: return ACTION;
        case 1: return BACK;
        case 2: return CONDITION;
        case 3: return CONDITION_DETAIL;
        case 4: return DETAIL;
        case 5: return DOCUMENT;
        case 6: return DRAWING;
        case 7: return FRONT;
        case 8: return GROUP;
        case 9: return INTERIOR;
        case 10: return INTERIOR_CONSTRUCTION;
        case 11: return LABEL;
        case 12: return OTHER;
        case 13: return PATTERN;
        case 14: return PHOTOGRAPH;
        case 15: return REFERENCE;
        case 16: return SIDE;
        case 17: return SUPPORTING_DOCUMENT;
        case 18: return VIDEO;
        default: throw new IllegalArgumentException();
        }
    }

    public static ViewType valueOf(final Integer value) {
        return valueOf(value.intValue());
    }

    public final int value() {
        return value;
    }

    private final int value;
}
