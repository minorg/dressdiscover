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
        final String unqualifiedCollectionId = valueSplit[1].trim();
        if (unqualifiedCollectionId.isEmpty()) {
            throw new InvalidCollectionIdException("empty collection ID: " + value);
        }
        return new CollectionId(unqualifiedCollectionId, institutionId, value);
    }

    private CollectionId(final String unqualifiedCollectionId, final InstitutionId institutionId, final String value) {
        super(value);
        this.institutionId = checkNotNull(institutionId);
        this.unqualifiedCollectionId = checkNotNull(unqualifiedCollectionId);
    }

    public InstitutionId getInstitutionId() {
        return institutionId;
    }

    public String getUnqualifiedCollectionId() {
        return unqualifiedCollectionId;
    }

    private final InstitutionId institutionId;
    private final String unqualifiedCollectionId;
}
