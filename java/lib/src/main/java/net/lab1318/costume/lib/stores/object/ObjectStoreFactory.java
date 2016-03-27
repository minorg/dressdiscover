package net.lab1318.costume.lib.stores.object;

import org.thryft.native_.Url;

import net.lab1318.costume.lib.CostumeProperties;

public interface ObjectStoreFactory {
    public ObjectStore createObjectStore(CostumeProperties properties, final Url url);
}
