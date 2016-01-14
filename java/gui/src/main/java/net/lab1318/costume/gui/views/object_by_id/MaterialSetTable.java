package net.lab1318.costume.gui.views.object_by_id;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.ImmutableSet;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.NativeButton;
import com.vaadin.ui.Table;

import net.lab1318.costume.api.models.material.Material;
import net.lab1318.costume.api.models.material.MaterialSet;
import net.lab1318.costume.api.services.object.ObjectFacetFilters;
import net.lab1318.costume.api.services.object.ObjectQuery;
import net.lab1318.costume.gui.GuiUI;
import net.lab1318.costume.gui.models.material.MaterialBean;

@SuppressWarnings("serial")
final class MaterialSetTable extends ElementSetTable {
    public MaterialSetTable(final MaterialSet materials) {
        super("Materials", materials);

        final BeanItemContainer<MaterialBean> container = new BeanItemContainer<>(MaterialBean.class);
        // boolean haveVocab = false;
        for (final Material material : materials.getElements()) {
            container.addBean(new MaterialBean(material));
            // if (material.getVocabRef().isPresent()) {
            // haveVocab = true;
            // break;
            // }
        }
        setContainerDataSource(container);

        addGeneratedColumn(Material.FieldMetadata.TEXT.getJavaName(), new ColumnGenerator() {
            @Override
            public Object generateCell(final Table source, final Object itemId, final Object columnId) {
                final String materialText = (String) container.getItem(itemId).getItemProperty(columnId).getValue();
                final Button button = new NativeButton(materialText, new Button.ClickListener() {
                    @Override
                    public void buttonClick(final ClickEvent event) {
                        GuiUI.navigateTo(
                                ObjectQuery.builder()
                                        .setFacetFilters(ObjectFacetFilters.builder()
                                                .setIncludeMaterialTexts(ImmutableSet.of(materialText)).build())
                                .build());
                    }
                });
                return button;
            }
        });

        setPageLength(getContainerDataSource().size());
        setColumnHeaderMode(ColumnHeaderMode.HIDDEN);
        // setColumnHeader(Material.FieldMetadata.TEXT.getJavaName(), "Name");
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