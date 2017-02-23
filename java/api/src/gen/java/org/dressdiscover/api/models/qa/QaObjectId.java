package org.dressdiscover.api.models.qa;

public final class QaObjectId extends org.thryft.waf.api.models.BsonModelId {
    public static QaObjectId parse(final String value) {
        if (!_isValid(value)) {
            throw new IllegalArgumentException(value);
        }
        return new QaObjectId(value);
    }

    private QaObjectId(final String value) {
        super(value);
    }
}
