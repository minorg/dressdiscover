package net.lab1318.costume.gui.views.object_by_id;

import com.google.common.collect.ImmutableList;
import com.vaadin.data.util.BeanItemContainer;

import net.lab1318.costume.api.models.color.Color;
import net.lab1318.costume.api.models.color.ColorSet;
import net.lab1318.costume.gui.models.color.ColorBean;

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
