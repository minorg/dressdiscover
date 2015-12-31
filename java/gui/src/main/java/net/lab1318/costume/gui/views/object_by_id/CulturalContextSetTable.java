package net.lab1318.costume.gui.views.object_by_id;

import com.google.common.collect.ImmutableList;
import com.vaadin.data.util.BeanItemContainer;

import net.lab1318.costume.api.models.cultural_context.CulturalContext;
import net.lab1318.costume.api.models.cultural_context.CulturalContextSet;
import net.lab1318.costume.gui.models.cultural_context.CulturalContextBean;

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
