package net.lab1318.costume.lib.stores.object;

import org.thryft.native_.Uri;

import com.google.common.collect.ImmutableMap;

import net.lab1318.costume.lib.CostumeProperties;
import net.lab1318.costume.lib.stores.StoreFactory;

public interface ObjectStoreFactory extends StoreFactory {
    public ObjectStore createObjectStore(ImmutableMap<String, String> parameters, CostumeProperties properties,
            final Uri uri);
}
