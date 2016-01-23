package net.lab1318.costume.gui.views.object_by_id;

import org.thryft.waf.gui.EventBus;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.NativeButton;
import com.vaadin.ui.Table;

import net.lab1318.costume.api.services.object.ObjectFacetFilters;
import net.lab1318.costume.gui.events.object_by_id.ObjectElementSelectionRequest;

@SuppressWarnings("serial")
final class CategoriesTable extends Table {
    public CategoriesTable(final ImmutableList<String> categories, final EventBus eventBus) {
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
                return new NativeButton(category, new Button.ClickListener() {
                    @Override
                    public void buttonClick(final ClickEvent event) {
                        eventBus.post(new ObjectElementSelectionRequest(
                                ObjectFacetFilters.builder().setIncludeCategories(ImmutableSet.of(category)).build()));
                    }
                });
            }
        });
        setColumnHeaderMode(ColumnHeaderMode.HIDDEN);
        setPageLength(getContainerDataSource().size());
    }
}
