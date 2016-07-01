package org.dressdiscover.gui.components;

import com.vaadin.data.util.BeanItemContainer;

import org.dressdiscover.api.models.closure.Closure;
import org.dressdiscover.api.models.closure.ClosureSet;
import org.dressdiscover.gui.models.closure.ClosureBean;
import org.dressdiscover.gui.models.closure.ClosurePlacementBean;
import org.dressdiscover.gui.models.closure.ClosureTypeBean;

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
