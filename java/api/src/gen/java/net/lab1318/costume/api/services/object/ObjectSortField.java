package net.lab1318.costume.api.services.object;

public enum ObjectSortField {
    COLLECTION_ID(0),
    DATE_TEXT(1),
    INSTITUTION_ID(2),
    TITLE(3);

    private ObjectSortField(int value) {
        this.value = value;
    }

    public static ObjectSortField valueOf(final int value) {
        switch (value) {
        case 0: return COLLECTION_ID;
        case 1: return DATE_TEXT;
        case 2: return INSTITUTION_ID;
        case 3: return TITLE;
        default: throw new IllegalArgumentException();
        }
    }

    public static ObjectSortField valueOf(final Integer value) {
        return valueOf(value.intValue());
    }

    public final int value() {
        return value;
    }

    private final int value;
}
