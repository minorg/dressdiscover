package org.dressdiscover.gui.models.object;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.dressdiscover.gui.models.object.ObjectSummaryEntryBean;
import org.vaadin.addons.lazyquerycontainer.AbstractBeanQuery;
import org.vaadin.addons.lazyquerycontainer.QueryDefinition;

import com.google.common.base.CaseFormat;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.UnsignedInteger;

import net.lab1318.costume.api.models.SortOrder;
import net.lab1318.costume.api.models.object.ObjectQuery;
import net.lab1318.costume.api.models.object.ObjectSummaryEntry;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.object.GetObjectSummariesOptions;
import net.lab1318.costume.api.services.object.GetObjectSummariesResult;
import net.lab1318.costume.api.services.object.ObjectSummaryQueryService;
import net.lab1318.costume.api.services.object.ObjectSummarySort;
import net.lab1318.costume.api.services.object.ObjectSummarySortField;

@SuppressWarnings("serial")
public final class ObjectSummaryEntryBeanQuery extends AbstractBeanQuery<ObjectSummaryEntryBean> {
    public ObjectSummaryEntryBeanQuery(final QueryDefinition definition,
            final Map<String, java.lang.Object> queryConfiguration, final java.lang.Object[] sortPropertyIds,
            final boolean[] sortStates) {
        super(definition, queryConfiguration, sortPropertyIds, sortStates);
        this.firstResult = checkNotNull((GetObjectSummariesResult) queryConfiguration.get("firstResult"));
        this.objectQuery = Optional.of((ObjectQuery) queryConfiguration.get("objectQuery"));
        this.objectSummaryQueryService = (ObjectSummaryQueryService) queryConfiguration
                .get("objectSummaryQueryService");
        this.size = firstResult.getTotalHits().intValue();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    protected ObjectSummaryEntryBean constructBean() {
        throw new UnsupportedOperationException();
    }

    @Override
    protected List<ObjectSummaryEntryBean> loadBeans(final int startIndex, final int count) {
        GetObjectSummariesResult result;
        if (startIndex == 0) {
            result = firstResult;
            checkState(count <= getQueryDefinition().getBatchSize());
        } else {
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

            try {
                result = objectSummaryQueryService.getObjectSummaries(Optional.of(optionsBuilder.build()), objectQuery);
            } catch (final IoException e) {
                throw new RuntimeException(e);
            }
        }

        final List<ObjectSummaryEntryBean> beans = new ArrayList<>(result.getHits().size());
        for (final ObjectSummaryEntry entry : result.getHits()) {
            beans.add(new ObjectSummaryEntryBean(entry));
        }
        return beans;
    }

    @Override
    protected void saveBeans(final List<ObjectSummaryEntryBean> added, final List<ObjectSummaryEntryBean> modified,
            final List<ObjectSummaryEntryBean> removed) {
        throw new UnsupportedOperationException();
    }

    private final int size;

    private final GetObjectSummariesResult firstResult;
    private final Optional<ObjectQuery> objectQuery;
    private final ObjectSummaryQueryService objectSummaryQueryService;
}