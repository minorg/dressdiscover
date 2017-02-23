package org.dressdiscover.api.models.qa;

public final class QuestionSetId extends org.thryft.waf.api.models.BsonModelId {
    public static QuestionSetId parse(final String value) {
        if (!_isValid(value)) {
            throw new IllegalArgumentException(value);
        }
        return new QuestionSetId(value);
    }

    private QuestionSetId(final String value) {
        super(value);
    }
}
