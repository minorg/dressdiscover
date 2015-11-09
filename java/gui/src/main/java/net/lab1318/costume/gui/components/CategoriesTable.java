package net.lab1318.costume.gui.components;

import com.google.common.collect.ImmutableList;
import com.vaadin.ui.Table;

@SuppressWarnings("serial")
public final class CategoriesTable extends Table {
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
