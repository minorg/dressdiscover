package net.lab1318.costume.api.services.object;

public enum ObjectSummarySortField {
    COLLECTION_ID(0),
    DATE(1),
    INSTITUTION_ID(2),
    TITLE(3),
    WORK_TYPE_TEXTS(4);

    private ObjectSummarySortField(int value) {
        this.value = value;
    }

    public static ObjectSummarySortField valueOf(final int value) {
        switch (value) {
        case 0: return COLLECTION_ID;
        case 1: return DATE;
        case 2: return INSTITUTION_ID;
        case 3: return TITLE;
        case 4: return WORK_TYPE_TEXTS;
        default: throw new IllegalArgumentException();
        }
    }

    public static ObjectSummarySortField valueOf(final Integer value) {
        return valueOf(value.intValue());
    }

    public final int value() {
        return value;
    }

    private final int value;
}
