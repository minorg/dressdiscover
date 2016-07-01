package org.dressdiscover.gui.components;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.data.util.BeanItemContainer;

import org.dressdiscover.api.models.technique.Technique;
import org.dressdiscover.api.models.technique.TechniqueSet;
import org.dressdiscover.gui.models.technique.TechniqueBean;

@SuppressWarnings("serial")
final class TechniqueSetTable extends ElementSetTable {
    public TechniqueSetTable(final TechniqueSet techniques) {
        super("Techniques", techniques);

        final BeanItemContainer<TechniqueBean> container = new BeanItemContainer<>(TechniqueBean.class);
        // boolean haveVocab = false;
        for (final Technique technique : techniques.getElements()) {
            container.addBean(new TechniqueBean(technique));
            // if (technique.getVocab().isPresent()) {
            // haveVocab = true;
            // break;
            // }
        }
        setContainerDataSource(container);
        setPageLength(techniques.getElements().size());
        setColumnHeaderMode(ColumnHeaderMode.HIDDEN);
        // setColumnHeader(Technique.FieldMetadata.TEXT.getJavaName(), "Name");
        // setColumnHeader(Technique.FieldMetadata.VOCAB.getJavaName(),
        // "Vocabulary");
        final List<Object> visibleColumns = new ArrayList<>();
        visibleColumns.add(Technique.FieldMetadata.TEXT.getJavaName());
        // if (haveVocab) {
        // visibleColumns.add(Technique.FieldMetadata.VOCAB.getJavaName());
        // }
        setVisibleColumns(visibleColumns.toArray());
    }
}
