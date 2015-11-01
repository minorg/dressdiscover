package net.lab1318.costume.api.models.collection;

import org.notaweb.api.models.StringModelId;

import net.lab1318.costume.api.services.collection.InvalidCollectionIdException;

public final class CollectionId extends StringModelId {
    public static CollectionId parse(final String value) throws InvalidCollectionIdException {
        return new CollectionId(value);
    }

    private CollectionId(final String value) {
        super(value);
    }
}
