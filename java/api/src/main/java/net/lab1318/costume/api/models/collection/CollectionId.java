package net.lab1318.costume.api.models.collection;

import static com.google.common.base.Preconditions.checkNotNull;

import org.thryft.waf.api.models.StringModelId;

import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.models.institution.InvalidInstitutionIdException;

public final class CollectionId extends StringModelId {
    public static CollectionId parse(final String value) throws InvalidCollectionIdException {
        if (value.isEmpty()) {
            throw new InvalidCollectionIdException("empty string");
        }
        final String[] valueSplit = value.split("/");
        if (valueSplit.length != 2) {
            throw new InvalidCollectionIdException("malformed collection ID: " + value);
        }
        InstitutionId institutionId;
        try {
            institutionId = InstitutionId.parse(valueSplit[0].trim());
        } catch (final InvalidInstitutionIdException e) {
            throw new InvalidCollectionIdException(e.toString());
        }
        final String collectionId = valueSplit[1].trim();
        if (collectionId.isEmpty()) {
            throw new InvalidCollectionIdException("empty collection ID: " + value);
        }
        return new CollectionId(institutionId, value);
    }

    private CollectionId(final InstitutionId institutionId, final String value) {
        super(value);
        this.institutionId = checkNotNull(institutionId);
    }

    public InstitutionId getInstitutionId() {
        return institutionId;
    }

    private final InstitutionId institutionId;
}
