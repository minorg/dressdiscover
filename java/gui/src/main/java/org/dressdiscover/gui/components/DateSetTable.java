package org.dressdiscover.gui.components;

import com.google.common.collect.ImmutableList;
import com.vaadin.data.util.BeanItemContainer;

import net.lab1318.costume.api.models.date.Date;
import net.lab1318.costume.api.models.date.DateSet;
import net.lab1318.costume.gui.models.date.DateBean;
import net.lab1318.costume.gui.models.date.DateBoundBean;

@SuppressWarnings("serial")
final class DateSetTable extends ElementSetTable {
    public DateSetTable(final DateSet dates) {
        super("Dates", dates);
        final BeanItemContainer<DateBean> container = new BeanItemContainer<>(DateBean.class);
        for (final Date date : dates.getElements()) {
            container.addBean(new DateBean(date));
        }
        container.addNestedContainerBean(DateBean.FieldMetadata.EARLIEST_DATE.getJavaName());
        container.addNestedContainerBean(DateBean.FieldMetadata.LATEST_DATE.getJavaName());

        setContainerDataSource(container);
        setPageLength(container.size());
        setVisibleColumns(ImmutableList
                .of(DateBean.FieldMetadata.TYPE.getJavaName(),
                        DateBean.FieldMetadata.EARLIEST_DATE.getJavaName() + '.'
                                + DateBoundBean.FieldMetadata.TEXT.getJavaName(),
                DateBean.FieldMetadata.LATEST_DATE.getJavaName() + '.' + DateBoundBean.FieldMetadata.TEXT.getJavaName())
                .toArray());
        setColumnHeaders("Type", "Earliest date", "Latest date");
    }
}
