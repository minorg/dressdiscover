package net.lab1318.costume.api.models.object;

import org.notaweb.api.models.StringModelId;

import net.lab1318.costume.api.services.object.InvalidObjectIdException;

public final class ObjectId extends StringModelId {
    public static ObjectId parse(final String value) throws InvalidObjectIdException {
        return new ObjectId(value);
    }

    private ObjectId(final String value) {
        super(value);
    }
}
