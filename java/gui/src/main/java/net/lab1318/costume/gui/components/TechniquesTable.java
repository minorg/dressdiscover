package net.lab1318.costume.gui.components;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.Table;

import net.lab1318.costume.api.models.technique.Technique;
import net.lab1318.costume.api.models.technique.TechniqueSet;
import net.lab1318.costume.gui.models.technique.TechniqueBean;

@SuppressWarnings("serial")
public final class TechniquesTable extends Table {
    public TechniquesTable(final TechniqueSet techniques) {
        if (techniques.getDisplay().isPresent()) {
            setCaption("Techniques: " + techniques.getDisplay().get());
        } else {
            setCaption("Techniques");
        }
        final BeanItemContainer<TechniqueBean> container = new BeanItemContainer<>(TechniqueBean.class);
        // boolean haveVocab = false;
        // for (final Technique technique : techniques.getTechniques()) {
        // container.addBean(new TechniqueBean(technique));
        // if (technique.getVocab().isPresent()) {
        // haveVocab = true;
        // break;
        // }
        // }
        setContainerDataSource(container);
        setPageLength(techniques.getTechniques().size());
        setColumnHeader(Technique.FieldMetadata.TEXT.getJavaName(), "Name");
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
