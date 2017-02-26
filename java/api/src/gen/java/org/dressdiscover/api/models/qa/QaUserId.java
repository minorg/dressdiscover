package org.dressdiscover.api.models.qa;

public final class QaUserId extends org.thryft.waf.api.models.StringModelId {
    public static QaUserId parse(final String value) {
        if (value.trim().isEmpty()) {
            throw new IllegalArgumentException(value);
        }
        return new QaUserId(value);
    }

    private QaUserId(final String value) {
        super(value);
    }
}
