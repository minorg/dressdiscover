package org.dressdiscover.api.models.qa;

public enum QuestionType {
    DATE_RANGE(0),
    SELECT_MULTIPLE(1),
    SELECT_ONE(2),
    TEXT(3);

    private QuestionType(int value) {
        this.value = value;
    }

    public static QuestionType valueOf(final int value) {
        switch (value) {
        case 0: return DATE_RANGE;
        case 1: return SELECT_MULTIPLE;
        case 2: return SELECT_ONE;
        case 3: return TEXT;
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
