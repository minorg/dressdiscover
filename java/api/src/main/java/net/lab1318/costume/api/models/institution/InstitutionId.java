package net.lab1318.costume.api.models.institution;

import org.notaweb.api.models.StringModelId;

public final class InstitutionId extends StringModelId {
    public static InstitutionId parse(final String value) throws InvalidInstitutionIdException {
        if (value.isEmpty()) {
            throw new InvalidInstitutionIdException("empty string");
        }
        return new InstitutionId(value);
    }

    private InstitutionId(final String value) {
        super(value);
    }
}
