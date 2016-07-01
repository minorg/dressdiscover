package org.dressdiscover.api.models.institution;

import org.thryft.waf.api.models.StringModelId;

import net.lab1318.costume.api.models.institution.InvalidInstitutionIdException;

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
