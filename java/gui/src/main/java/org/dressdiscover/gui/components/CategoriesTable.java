package org.dressdiscover.gui.components;

import org.dressdiscover.api.models.object.ObjectId;
import org.dressdiscover.gui.events.object_by_id.ObjectElementSelectionRequest;
import org.thryft.waf.gui.EventBus;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Table;

import net.lab1318.costume.api.models.object.ObjectFacetFilters;

@SuppressWarnings("serial")
final class CategoriesTable extends Table {
    public CategoriesTable(final ImmutableList<String> categories, final EventBus eventBus, final ObjectId objectId) {
        setCaption("Categories");
        addContainerProperty("Text", String.class, null);
        for (final String category : categories) {
            if (category.isEmpty()) {
                continue;
            }
            addItem(new Object[] { category }, category);
        }
        addGeneratedColumn("Text", new ColumnGenerator() {
            @Override
            public Object generateCell(final Table source, final Object itemId, final Object columnId) {
                final String category = (String) source.getContainerDataSource().getContainerProperty(itemId, columnId)
                        .getValue();
                final Button button = new Button(category, new Button.ClickListener() {
                    @Override
                    public void buttonClick(final ClickEvent event) {
                        eventBus.post(new ObjectElementSelectionRequest(
                                ObjectFacetFilters.builder().setIncludeCategories(ImmutableSet.of(category)).build(),
                                objectId));
                    }
                });
                button.setStyleName("category-button");
                return button;
            }
        });
        setColumnHeaderMode(ColumnHeaderMode.HIDDEN);
        setPageLength(getContainerDataSource().size());
    }
}