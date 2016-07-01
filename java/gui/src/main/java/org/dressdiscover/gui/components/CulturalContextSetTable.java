package org.dressdiscover.gui.components;

import com.google.common.collect.ImmutableList;
import com.vaadin.data.util.BeanItemContainer;

import org.dressdiscover.api.models.cultural_context.CulturalContext;
import org.dressdiscover.api.models.cultural_context.CulturalContextSet;
import org.dressdiscover.gui.models.cultural_context.CulturalContextBean;

@SuppressWarnings("serial")
final class CulturalContextSetTable extends ElementSetTable {
    public CulturalContextSetTable(final CulturalContextSet culturalContexts) {
        super("Cultural contexts", culturalContexts);
        setColumnHeaderMode(ColumnHeaderMode.HIDDEN);
        final BeanItemContainer<CulturalContextBean> container = new BeanItemContainer<>(CulturalContextBean.class);
        for (final CulturalContext culturalContext : culturalContexts.getElements()) {
            container.addBean(new CulturalContextBean(culturalContext));
        }
        setContainerDataSource(container);
        setPageLength(container.size());
        setVisibleColumns(ImmutableList.of(CulturalContext.FieldMetadata.TEXT.getJavaName()).toArray());
    }
}
