package net.lab1318.costume.gui.views.object;

import com.google.common.collect.ImmutableList;
import com.vaadin.data.util.BeanItemContainer;

import net.lab1318.costume.api.models.description.Description;
import net.lab1318.costume.api.models.description.DescriptionSet;
import net.lab1318.costume.gui.models.description.DescriptionBean;

@SuppressWarnings("serial")
final class DescriptionSetTable extends ElementSetTable {
    public DescriptionSetTable(final DescriptionSet descriptions) {
        super("Descriptions", descriptions);
        final BeanItemContainer<DescriptionBean> container = new BeanItemContainer<>(DescriptionBean.class);
        for (final Description description : descriptions.getElements()) {
            container.addBean(new DescriptionBean(description));
        }
        setContainerDataSource(container);
        setPageLength(descriptions.getElements().size());
        setVisibleColumns(ImmutableList
                .of(Description.FieldMetadata.TYPE.getJavaName(), Description.FieldMetadata.TEXT.getJavaName())
                .toArray());
        setColumnHeaders("Type", "Text");
    }
}
