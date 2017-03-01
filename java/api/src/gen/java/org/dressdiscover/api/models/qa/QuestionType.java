package org.dressdiscover.api.models.qa;

public enum QuestionType {
    COLORS(0),
    DATE_RANGE(1),
    SELECT_MULTIPLE(2),
    SELECT_ONE(3),
    TEXT(4);

    private QuestionType(int value) {
        this.value = value;
    }

    public static QuestionType valueOf(final int value) {
        switch (value) {
        case 0: return COLORS;
        case 1: return DATE_RANGE;
        case 2: return SELECT_MULTIPLE;
        case 3: return SELECT_ONE;
        case 4: return TEXT;
        default: throw new IllegalArgumentException();
        }
    }

    public static QuestionType valueOf(final Integer value) {
        return valueOf(value.intValue());
    }

    public final int value() {
        return value;
    }

    private final int value;
}
