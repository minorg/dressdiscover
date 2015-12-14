package net.lab1318.costume.gui.models.object;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.vaadin.addons.lazyquerycontainer.AbstractBeanQuery;
import org.vaadin.addons.lazyquerycontainer.QueryDefinition;

import com.google.common.base.CaseFormat;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.UnsignedInteger;

import net.lab1318.costume.api.models.SortOrder;
import net.lab1318.costume.api.models.object.ObjectSummaryEntry;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.object.GetObjectSummariesOptions;
import net.lab1318.costume.api.services.object.ObjectQuery;
import net.lab1318.costume.api.services.object.ObjectQueryService;
import net.lab1318.costume.api.services.object.ObjectSummarySort;
import net.lab1318.costume.api.services.object.ObjectSummarySortField;

@SuppressWarnings("serial")
public final class ObjectSummaryBeanQuery extends AbstractBeanQuery<ObjectSummaryBeanWithId> {
    public ObjectSummaryBeanQuery(final QueryDefinition definition,
            final Map<String, java.lang.Object> queryConfiguration, final java.lang.Object[] sortPropertyIds,
            final boolean[] sortStates) {
        super(definition, queryConfiguration, sortPropertyIds, sortStates);
        this.objectQuery = Optional.of((ObjectQuery) queryConfiguration.get("objectQuery"));
        this.objectQueryService = (ObjectQueryService) queryConfiguration.get("objectQueryService");
    }

    @Override
    public int size() {
        try {
            return objectQueryService.getObjectCount(objectQuery).intValue();
        } catch (final IoException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected ObjectSummaryBeanWithId constructBean() {
        throw new UnsupportedOperationException();
    }

    @Override
    protected List<ObjectSummaryBeanWithId> loadBeans(final int startIndex, final int count) {
        final GetObjectSummariesOptions.Builder optionsBuilder = GetObjectSummariesOptions.builder()
                .setFrom(UnsignedInteger.valueOf(startIndex)).setSize(UnsignedInteger.valueOf(count));

        if (getSortPropertyIds().length > 0) {
            final ImmutableList.Builder<ObjectSummarySort> sortsBuilder = ImmutableList.builder();
            for (int sortI = 0; sortI < getSortPropertyIds().length; sortI++) {
                final String sortPropertyId = getSortPropertyIds()[sortI].toString();
                final String fieldEnumName = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, sortPropertyId);
                final ObjectSummarySortField field = ObjectSummarySortField.valueOf(fieldEnumName);
                final SortOrder order = getSortStates()[sortI] ? SortOrder.ASC : SortOrder.DESC;
                sortsBuilder.add(ObjectSummarySort.builder().setField(field).setOrder(order).build());
            }
            optionsBuilder.setSorts(sortsBuilder.build());
        }

        final List<ObjectSummaryBeanWithId> beans = new ArrayList<>();
        try {
            for (final ObjectSummaryEntry entry : objectQueryService
                    .getObjectSummaries(Optional.of(optionsBuilder.build()), objectQuery)) {
                beans.add(new ObjectSummaryBeanWithId(entry));
            }
        } catch (final IoException e) {
            throw new RuntimeException(e);
        }
        return beans;
    }

    @Override
    protected void saveBeans(final List<ObjectSummaryBeanWithId> added, final List<ObjectSummaryBeanWithId> modified,
            final List<ObjectSummaryBeanWithId> removed) {
        throw new UnsupportedOperationException();
    }

    private final Optional<ObjectQuery> objectQuery;
    private final ObjectQueryService objectQueryService;
}