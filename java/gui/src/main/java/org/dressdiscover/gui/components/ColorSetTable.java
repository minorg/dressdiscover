package org.dressdiscover.gui.components;

import com.google.common.collect.ImmutableList;
import com.vaadin.data.util.BeanItemContainer;

import org.dressdiscover.api.models.color.Color;
import org.dressdiscover.api.models.color.ColorSet;
import org.dressdiscover.gui.models.color.ColorBean;

@SuppressWarnings("serial")
final class ColorSetTable extends ElementSetTable {
    public ColorSetTable(final ColorSet colors) {
        super("Colors", colors);
        final BeanItemContainer<ColorBean> container = new BeanItemContainer<>(ColorBean.class);
        for (final Color color : colors.getElements()) {
            container.addBean(new ColorBean(color));
        }
        setContainerDataSource(container);
        setPageLength(container.size());
        setVisibleColumns(ImmutableList
                .of(Color.FieldMetadata.TYPE.getJavaName(), Color.FieldMetadata.TEXT.getJavaName()).toArray());
        setColumnHeaders("Type", "Text");
    }
}
