package net.lab1318.costume.gui.models.object;

import java.util.HashMap;
import java.util.Map;

import org.vaadin.addons.lazyquerycontainer.BeanQueryFactory;

import net.lab1318.costume.api.services.object.ObjectQuery;
import net.lab1318.costume.api.services.object.ObjectQueryService;

public final class ObjectSummaryEntryBeanQueryFactory {
    public static BeanQueryFactory<ObjectSummaryEntryBeanQuery> create(final ObjectQuery objectQuery,
            final ObjectQueryService objectQueryService) {
        final BeanQueryFactory<ObjectSummaryEntryBeanQuery> queryFactory = new BeanQueryFactory<ObjectSummaryEntryBeanQuery>(
                ObjectSummaryEntryBeanQuery.class);
        final Map<String, java.lang.Object> queryConfiguration = new HashMap<>();
        queryConfiguration.put("objectQuery", objectQuery);
        queryConfiguration.put("objectQueryService", objectQueryService);
        queryFactory.setQueryConfiguration(queryConfiguration);
        return queryFactory;
    }

    private ObjectSummaryEntryBeanQueryFactory() {
    }
}
