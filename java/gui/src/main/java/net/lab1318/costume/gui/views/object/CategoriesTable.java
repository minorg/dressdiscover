package net.lab1318.costume.gui.views.object;

import com.google.common.collect.ImmutableList;
import com.vaadin.ui.Table;

@SuppressWarnings("serial")
final class CategoriesTable extends Table {
	public CategoriesTable(final ImmutableList<String> categories) {
		setCaption("Categories");
		addContainerProperty("Text", String.class, null);
		for (final String category : categories) {
			addItem(new Object[] { category }, category);
		}
		setColumnHeaderMode(ColumnHeaderMode.HIDDEN);
		setPageLength(categories.size());
	}
}
