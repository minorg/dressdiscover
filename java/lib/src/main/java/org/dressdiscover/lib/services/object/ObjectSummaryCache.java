package org.dressdiscover.lib.services.object;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

import org.dressdiscover.api.models.object.ObjectId;
import org.dressdiscover.api.models.object.ObjectSummaryEntry;
import org.dressdiscover.lib.properties.StoreProperties;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
class ObjectSummaryCache {
    @Inject
    public ObjectSummaryCache(final StoreProperties storeProperties) {
        cache = CacheBuilder.newBuilder().maximumSize(storeProperties.getObjectSummaryCacheSize()).build();
    }

    public final ObjectSummaryEntry get(final ObjectId key, final Callable<ObjectSummaryEntry> valueLoader)
            throws ExecutionException {
        return cache.get(key, valueLoader);
    }

    public final void invalidateAll() {
        cache.invalidateAll();
    }

    private final Cache<ObjectId, ObjectSummaryEntry> cache;
}
