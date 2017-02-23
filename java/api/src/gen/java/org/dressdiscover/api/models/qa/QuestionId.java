package org.dressdiscover.api.models.qa;

public final class QuestionId extends org.thryft.waf.api.models.BsonModelId {
    public static QuestionId parse(final String value) {
        if (!_isValid(value)) {
            throw new IllegalArgumentException(value);
        }
        return new QuestionId(value);
    }

    private QuestionId(final String value) {
        super(value);
    }
}
