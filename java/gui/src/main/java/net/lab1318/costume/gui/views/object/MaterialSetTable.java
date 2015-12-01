package net.lab1318.costume.gui.views.object;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.data.util.BeanItemContainer;

import net.lab1318.costume.api.models.material.Material;
import net.lab1318.costume.api.models.material.MaterialSet;
import net.lab1318.costume.gui.models.material.MaterialBean;

@SuppressWarnings("serial")
final class MaterialSetTable extends ElementSetTable {
	public MaterialSetTable(final MaterialSet materials) {
		super("Materials", materials);

		final BeanItemContainer<MaterialBean> container = new BeanItemContainer<>(MaterialBean.class);
		// boolean haveVocab = false;
		for (final Material material : materials.getMaterials()) {
			container.addBean(new MaterialBean(material));
			// if (material.getVocabRef().isPresent()) {
			// haveVocab = true;
			// break;
			// }
		}
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
