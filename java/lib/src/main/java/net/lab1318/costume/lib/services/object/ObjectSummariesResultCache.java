package net.lab1318.costume.lib.services.object;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

import org.apache.commons.lang3.tuple.ImmutablePair;

import com.google.common.base.Optional;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.services.object.GetObjectSummariesOptions;
import net.lab1318.costume.api.services.object.GetObjectSummariesResult;
import net.lab1318.costume.api.services.object.ObjectQuery;
import net.lab1318.costume.lib.CostumeProperties;

@Singleton
class ObjectSummariesResultCache {
    @Inject
    public ObjectSummariesResultCache(final CostumeProperties properties) {
        cache = CacheBuilder.newBuilder().maximumSize(properties.getObjectSummariesResultCacheSize().intValue())
                .build();
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
