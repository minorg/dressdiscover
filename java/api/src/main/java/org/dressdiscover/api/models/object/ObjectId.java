package org.dressdiscover.api.models.object;

import static com.google.common.base.Preconditions.checkNotNull;

import org.dressdiscover.api.models.collection.CollectionId;
import org.dressdiscover.api.models.collection.InvalidCollectionIdException;
import org.dressdiscover.api.models.institution.InstitutionId;
import org.thryft.waf.api.models.StringModelId;

public final class ObjectId extends StringModelId {
    public static ObjectId parse(final String value) throws InvalidObjectIdException {
        if (value.isEmpty()) {
            throw InvalidObjectIdException.create("empty string");
        }
        final int lastSep = value.lastIndexOf('/');
        if (lastSep == -1 || lastSep == value.length() - 1) {
            throw InvalidObjectIdException.create("malformed object ID: " + value);
        }
        CollectionId collectionId;
        try {
            collectionId = CollectionId.parse(value.substring(0, lastSep));
        } catch (final InvalidCollectionIdException e) {
            throw InvalidObjectIdException.create(e.toString());
        }
        final String unqualifiedObjectId = value.substring(lastSep + 1);
        if (unqualifiedObjectId.isEmpty()) {
            throw InvalidObjectIdException.create("empty object ID: " + value);
        }
        return new ObjectId(collectionId, unqualifiedObjectId, value);
    }

    private ObjectId(final CollectionId collectionId, final String unqualifiedObjectId, final String value) {
        super(value);
        this.collectionId = checkNotNull(collectionId);
        this.unqualifiedObjectId = checkNotNull(unqualifiedObjectId);
    }

    public CollectionId getCollectionId() {
        return collectionId;
    }

    public InstitutionId getInstitutionId() {
        return collectionId.getInstitutionId();
    }

    public String getUnqualifiedObjectId() {
        return unqualifiedObjectId;
    }

    private final CollectionId collectionId;
    private final String unqualifiedObjectId;
}
