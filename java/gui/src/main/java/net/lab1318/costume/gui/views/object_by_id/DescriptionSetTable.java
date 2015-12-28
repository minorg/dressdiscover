package net.lab1318.costume.gui.views.object_by_id;

import com.google.common.collect.ImmutableList;
import com.vaadin.data.util.BeanItemContainer;

import net.lab1318.costume.api.models.description.Description;
import net.lab1318.costume.api.models.description.DescriptionSet;
import net.lab1318.costume.api.models.description.DescriptionType;
import net.lab1318.costume.gui.models.description.DescriptionBean;

@SuppressWarnings("serial")
final class DescriptionSetTable extends ElementSetTable {
    public DescriptionSetTable(final DescriptionSet descriptions) {
        super("Descriptions", descriptions);
        final BeanItemContainer<DescriptionBean> container = new BeanItemContainer<>(DescriptionBean.class);

        // Add untyped descriptions first
        for (final Description description : descriptions.getElements()) {
            if (!description.getType().isPresent()) {
                container.addBean(new DescriptionBean(description));
            }
        }

        // Add typed descriptions
        for (final Description description : descriptions.getElements()) {
            if (!description.getType().isPresent()) {
                continue;
            }
            if (description.getType().get() == DescriptionType.PRIVATE) {
                continue;
            }
            container.addBean(new DescriptionBean(description));
        }

        setContainerDataSource(container);
        setPageLength(container.size());
        setVisibleColumns(ImmutableList
                .of(Description.FieldMetadata.TYPE.getJavaName(), Description.FieldMetadata.TEXT.getJavaName())
                .toArray());
        setColumnHeaders("Type", "Text");
    }
}
