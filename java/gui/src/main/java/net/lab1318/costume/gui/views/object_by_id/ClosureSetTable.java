package net.lab1318.costume.gui.views.object_by_id;

import com.vaadin.data.util.BeanItemContainer;

import net.lab1318.costume.api.models.closure.Closure;
import net.lab1318.costume.api.models.closure.ClosureSet;
import net.lab1318.costume.gui.models.closure.ClosureBean;
import net.lab1318.costume.gui.models.closure.ClosurePlacementBean;
import net.lab1318.costume.gui.models.closure.ClosureTypeBean;

@SuppressWarnings("serial")
final class ClosureSetTable extends ElementSetTable {
    public ClosureSetTable(final ClosureSet closures) {
        super("Closures", closures);

        final BeanItemContainer<ClosureBean> container = new BeanItemContainer<>(ClosureBean.class);
        for (final Closure closure : closures.getElements()) {
            container.addBean(new ClosureBean(closure));
        }
        container.addNestedContainerBean(ClosureBean.FieldMetadata.PLACEMENT.getJavaName());
        container.addNestedContainerBean(ClosureBean.FieldMetadata.TYPE.getJavaName());
        setContainerDataSource(container);
        setPageLength(getContainerDataSource().size());
        setVisibleColumns(
                ClosureBean.FieldMetadata.PLACEMENT.getJavaName() + '.'
                        + ClosurePlacementBean.FieldMetadata.TEXT.getJavaName(),
                ClosureBean.FieldMetadata.TYPE.getJavaName() + '.' + ClosureTypeBean.FieldMetadata.TEXT.getJavaName());
        setColumnHeaders("Type", "Placement");
    }
}
