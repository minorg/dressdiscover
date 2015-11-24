package net.lab1318.costume.gui.components;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.Table;

import net.lab1318.costume.api.models.material.Material;
import net.lab1318.costume.api.models.material.MaterialSet;
import net.lab1318.costume.gui.models.material.MaterialBean;

@SuppressWarnings("serial")
public final class MaterialsTable extends Table {
    public MaterialsTable(final MaterialSet materials) {
        if (materials.getDisplay().isPresent()) {
            setCaption("Materials: " + materials.getDisplay().get());
        } else {
            setCaption("Materials");
        }
        final BeanItemContainer<MaterialBean> container = new BeanItemContainer<>(MaterialBean.class);
        // boolean haveVocab = false;
        // for (final Material material : materials.getMaterials()) {
        // container.addBean(new MaterialBean(material));
        // if (material.getVocabRef().isPresent()) {
        // haveVocab = true;
        // break;
        // }
        // }
        setContainerDataSource(container);
        setPageLength(materials.getMaterials().size());
        setColumnHeader(Material.FieldMetadata.TEXT.getJavaName(), "Name");
        // setColumnHeader(Material.FieldMetadata.VOCAB.getJavaName(),
        // "Vocabulary");
        final List<Object> visibleColumns = new ArrayList<>();
        visibleColumns.add(Material.FieldMetadata.TEXT.getJavaName());
        // if (haveVocab) {
        // visibleColumns.add(Material.FieldMetadata.VOCAB.getJavaName());
        // }
        setVisibleColumns(visibleColumns.toArray());
    }
}
