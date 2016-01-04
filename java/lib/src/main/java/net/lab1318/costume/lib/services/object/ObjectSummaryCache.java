package net.lab1318.costume.lib.services.object;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.models.object.ObjectId;
import net.lab1318.costume.api.models.object.ObjectSummaryEntry;
import net.lab1318.costume.lib.CostumeProperties;

@Singleton
class ObjectSummaryCache {
    @Inject
    public ObjectSummaryCache(final CostumeProperties properties) {
        cache = CacheBuilder.newBuilder().maximumSize(properties.getObjectSummaryCacheSize().intValue()).build();
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
