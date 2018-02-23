package org.dressdiscover.api.services.object;

public enum ObjectSummarySortField implements org.thryft.ThryftEnum {
    COLLECTION_ID(0),
    DATE(1),
    INSTITUTION_ID(2),
    TITLE(3),
    WORK_TYPE_TEXTS(4);

    public final static class Factory implements org.thryft.ThryftEnum.Factory<ObjectSummarySortField> {
        public final static Factory getInstance() {
            return instance;
        }

        public final ObjectSummarySortField valueOf(final String name) {
            return ObjectSummarySortField.valueOf(name);
        }

        public final ObjectSummarySortField valueOf(final int value) {
            return ObjectSummarySortField.valueOf(value);
        }

        private Factory() {
        }

        private final static Factory instance = new Factory();
    }

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

    public final int value() {
        return value;
    }

    private final int value;
}
