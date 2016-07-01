package org.dressdiscover.gui.models.object;

import java.util.HashMap;
import java.util.Map;

import org.vaadin.addons.lazyquerycontainer.BeanQueryFactory;

import org.dressdiscover.api.models.object.ObjectQuery;
import org.dressdiscover.api.services.object.GetObjectSummariesResult;
import org.dressdiscover.api.services.object.ObjectSummaryQueryService;

public final class ObjectSummaryEntryBeanQueryFactory {
    public static BeanQueryFactory<ObjectSummaryEntryBeanQuery> create(final GetObjectSummariesResult firstResult,
            final ObjectQuery objectQuery, final ObjectSummaryQueryService objectSummaryQueryService) {
        final BeanQueryFactory<ObjectSummaryEntryBeanQuery> queryFactory = new BeanQueryFactory<ObjectSummaryEntryBeanQuery>(
                ObjectSummaryEntryBeanQuery.class);
        final Map<String, java.lang.Object> queryConfiguration = new HashMap<>();
        queryConfiguration.put("firstResult", firstResult);
        queryConfiguration.put("objectQuery", objectQuery);
        queryConfiguration.put("objectSummaryQueryService", objectSummaryQueryService);
        queryFactory.setQueryConfiguration(queryConfiguration);
        return queryFactory;
    }

    private ObjectSummaryEntryBeanQueryFactory() {
    }
}
