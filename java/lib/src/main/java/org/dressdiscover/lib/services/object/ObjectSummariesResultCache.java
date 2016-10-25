package org.dressdiscover.lib.services.object;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.dressdiscover.api.models.object.ObjectQuery;
import org.dressdiscover.api.services.object.GetObjectSummariesOptions;
import org.dressdiscover.api.services.object.GetObjectSummariesResult;
import org.dressdiscover.lib.properties.StoreProperties;

import com.google.common.base.Optional;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
class ObjectSummariesResultCache {
    @Inject
    public ObjectSummariesResultCache(final StoreProperties storeProperties) {
        cache = CacheBuilder.newBuilder().maximumSize(storeProperties.getObjectSummariesResultCacheSize()).build();
    }

    public final GetObjectSummariesResult get(
            final ImmutablePair<Optional<GetObjectSummariesOptions>, Optional<ObjectQuery>> key,
            final Callable<GetObjectSummariesResult> valueLoader) throws ExecutionException {
        return cache.get(key, valueLoader);
    }

    public final void invalidateAll() {
        cache.invalidateAll();
    }

    private final Cache<ImmutablePair<Optional<GetObjectSummariesOptions>, Optional<ObjectQuery>>, GetObjectSummariesResult> cache;
}
