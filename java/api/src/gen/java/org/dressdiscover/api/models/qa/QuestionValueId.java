package org.dressdiscover.api.models.qa;

public final class QuestionValueId extends org.thryft.waf.api.models.BsonModelId {
    public static QuestionValueId parse(final String value) {
        if (!_isValid(value)) {
            throw new IllegalArgumentException(value);
        }
        return new QuestionValueId(value);
    }

    private QuestionValueId(final String value) {
        super(value);
    }
}
