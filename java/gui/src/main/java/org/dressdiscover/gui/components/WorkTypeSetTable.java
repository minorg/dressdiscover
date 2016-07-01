package org.dressdiscover.gui.components;

import com.google.common.collect.ImmutableList;
import com.vaadin.data.util.BeanItemContainer;

import org.dressdiscover.api.models.work_type.WorkType;
import org.dressdiscover.api.models.work_type.WorkTypeSet;
import org.dressdiscover.gui.models.work_type.WorkTypeBean;

@SuppressWarnings("serial")
final class WorkTypeSetTable extends ElementSetTable {
    public WorkTypeSetTable(final WorkTypeSet workTypes) {
        super("Work types", workTypes);

        final BeanItemContainer<WorkTypeBean> container = new BeanItemContainer<>(WorkTypeBean.class);
        for (final WorkType workType : workTypes.getElements()) {
            container.addBean(new WorkTypeBean(workType));
        }
        setContainerDataSource(container);
        setPageLength(workTypes.getElements().size());
        setColumnHeaderMode(ColumnHeaderMode.HIDDEN);
        setVisibleColumns(ImmutableList.of(WorkType.FieldMetadata.TEXT.getJavaName()).toArray());
    }
}
