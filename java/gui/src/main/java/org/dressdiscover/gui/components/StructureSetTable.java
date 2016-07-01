package org.dressdiscover.gui.components;

import com.google.common.collect.ImmutableList;
import com.vaadin.data.util.BeanItemContainer;

import net.lab1318.costume.api.models.structure.Structure;
import net.lab1318.costume.api.models.structure.StructureSet;
import net.lab1318.costume.api.models.structure.StructureType;
import net.lab1318.costume.gui.models.structure.StructureBean;

@SuppressWarnings("serial")
final class StructureSetTable extends ElementSetTable {
    public StructureSetTable(final StructureSet structures) {
        super("Structures", structures);
        final BeanItemContainer<StructureBean> container = new BeanItemContainer<>(StructureBean.class);
        for (final Structure structure : structures.getElements()) {
            container.addBean(new StructureBean(structure));
        }
        container.addNestedContainerBean(Structure.FieldMetadata.TYPE.getJavaName());
        setContainerDataSource(container);
        setPageLength(container.size());
        setVisibleColumns(ImmutableList
                .of(Structure.FieldMetadata.TYPE.getJavaName() + '.' + StructureType.FieldMetadata.TEXT.getJavaName(),
                        Structure.FieldMetadata.TEXT.getJavaName())
                .toArray());
        setColumnHeaders("Type", "Text");
    }
}
