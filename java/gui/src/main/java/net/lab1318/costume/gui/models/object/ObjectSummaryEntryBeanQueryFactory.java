package net.lab1318.costume.gui.models.object;

import java.util.HashMap;
import java.util.Map;

import org.vaadin.addons.lazyquerycontainer.BeanQueryFactory;

import net.lab1318.costume.api.models.object.ObjectQuery;
import net.lab1318.costume.api.services.object.GetObjectSummariesResult;
import net.lab1318.costume.api.services.object.ObjectSummaryQueryService;

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
