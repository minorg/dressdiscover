package net.lab1318.costume.lib.stores.collection;

import org.thryft.native_.Uri;

import com.google.common.collect.ImmutableMap;

import net.lab1318.costume.lib.CostumeProperties;
import net.lab1318.costume.lib.stores.StoreFactory;

public interface CollectionStoreFactory extends StoreFactory {
    public CollectionStore createCollectionStore(ImmutableMap<String, String> parameters, CostumeProperties properties,
            final Uri uri);
}
