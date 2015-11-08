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
    public TechniquesTable(final TechniqueSet materials) {
        if (materials.getDisplay().isPresent()) {
            setCaption("Techniques: " + materials.getDisplay().get());
        } else {
            setCaption("Techniques");
        }
        boolean haveVocab = false;
        final BeanItemContainer<TechniqueBean> container = new BeanItemContainer<>(TechniqueBean.class);
        for (final Technique material : materials.getTechniques()) {
            container.addBean(new TechniqueBean(material));
            haveVocab |= material.getVocab().isPresent();
        }
        setContainerDataSource(container);
        setPageLength(materials.getTechniques().size());
        setColumnHeader(Technique.FieldMetadata.TITLE.getJavaName(), "Name");
        setColumnHeader(Technique.FieldMetadata.VOCAB.getJavaName(), "Vocabulary");
        final List<Object> visibleColumns = new ArrayList<>();
        visibleColumns.add(Technique.FieldMetadata.TITLE.getJavaName());
        if (haveVocab) {
            visibleColumns.add(Technique.FieldMetadata.VOCAB.getJavaName());
        }
        setVisibleColumns(visibleColumns.toArray());
    }
}
