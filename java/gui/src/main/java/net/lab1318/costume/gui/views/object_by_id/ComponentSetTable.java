package net.lab1318.costume.gui.views.object_by_id;

import com.google.common.collect.ImmutableList;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Panel;
import com.vaadin.ui.Table;
import com.vaadin.ui.Table.ColumnHeaderMode;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.api.models.component.Component;
import net.lab1318.costume.api.models.component.ComponentSet;
import net.lab1318.costume.api.models.component.ComponentTerm;
import net.lab1318.costume.gui.models.component.ComponentTermBean;

@SuppressWarnings("serial")
final class ComponentSetTable extends CustomComponent {
    public ComponentSetTable(final ComponentSet components) {
        boolean haveNestedBeans = false;
        for (final Component component : components.getElements()) {
            if (component.getStructures().isPresent()) {
                haveNestedBeans = true;
                break;
            }
        }

        if (haveNestedBeans) {
            final VerticalLayout rootLayout = new VerticalLayout();
            for (final Component component : components.getElements()) {
                final VerticalLayout componentLayout = new VerticalLayout();
                if (component.getStructures().isPresent()) {
                    componentLayout.addComponent(new StructureSetTable(component.getStructures().get()));
                }
                rootLayout.addComponent(new Panel("Component: " + component.getTerm().getText(), componentLayout));
            }
            setCompositionRoot(new Panel("Components", rootLayout));
        } else {
            final Table table = new Table("Components");
            table.setColumnHeaderMode(ColumnHeaderMode.HIDDEN);
            final BeanItemContainer<ComponentTermBean> container = new BeanItemContainer<>(ComponentTermBean.class);
            for (final Component component : components.getElements()) {
                container.addBean(new ComponentTermBean(component.getTerm()));
            }
            table.setContainerDataSource(container);
            table.setPageLength(container.size());
            table.setVisibleColumns(ImmutableList.of(ComponentTerm.FieldMetadata.TEXT.getJavaName()).toArray());
            setCompositionRoot(table);
        }
    }
}
