package org.dressdiscover.api.models.collection;

import static com.google.common.base.Preconditions.checkNotNull;

import org.dressdiscover.api.models.institution.InstitutionId;
import org.thryft.waf.api.models.StringModelId;

import org.dressdiscover.api.models.collection.InvalidCollectionIdException;
import org.dressdiscover.api.models.institution.InvalidInstitutionIdException;

public final class CollectionId extends StringModelId {
    public static CollectionId parse(final String value) throws InvalidCollectionIdException {
        if (value.isEmpty()) {
            throw InvalidCollectionIdException.create("empty string");
        }
        final String[] valueSplit = value.split("/");
        if (valueSplit.length != 2) {
            throw InvalidCollectionIdException.create("malformed collection ID: " + value);
        }
        InstitutionId institutionId;
        try {
            institutionId = InstitutionId.parse(valueSplit[0].trim());
        } catch (final InvalidInstitutionIdException e) {
            throw InvalidCollectionIdException.create(e.toString());
        }
        final String unqualifiedCollectionId = valueSplit[1].trim();
        if (unqualifiedCollectionId.isEmpty()) {
            throw InvalidCollectionIdException.create("empty collection ID: " + value);
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
