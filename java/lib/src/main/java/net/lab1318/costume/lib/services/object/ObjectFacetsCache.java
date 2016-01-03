package net.lab1318.costume.lib.services.object;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

import com.google.common.base.Optional;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.services.object.ObjectFacets;
import net.lab1318.costume.api.services.object.ObjectQuery;
import net.lab1318.costume.lib.CostumeProperties;

@Singleton
class ObjectFacetsCache {
    @Inject
    public ObjectFacetsCache(final CostumeProperties properties) {
        cache = CacheBuilder.newBuilder().maximumSize(properties.getObjectFacetsCacheSize().intValue()).build();
    }

    public final ObjectFacets get(final Optional<ObjectQuery> key, final Callable<ObjectFacets> valueLoader)
            throws ExecutionException {
        return cache.get(key, valueLoader);
    }

    public final void invalidateAll() {
        cache.invalidateAll();
    }

    private final Cache<Optional<ObjectQuery>, ObjectFacets> cache;
}
