package net.lab1318.costume.gui.views.object_by_id;

import com.google.common.collect.ImmutableSet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.NativeButton;
import com.vaadin.ui.Table;

import net.lab1318.costume.api.models.location.Location;
import net.lab1318.costume.api.models.location.LocationName;
import net.lab1318.costume.api.models.location.LocationRefid;
import net.lab1318.costume.api.models.location.LocationSet;
import net.lab1318.costume.api.services.object.ObjectFacetFilters;
import net.lab1318.costume.api.services.object.ObjectQuery;
import net.lab1318.costume.gui.GuiUI;

@SuppressWarnings("serial")
final class LocationSetTable extends ElementSetTable {
    public LocationSetTable(final LocationSet locations) {
        super("Locations", locations);

        addContainerProperty("Type", String.class, null);
        addContainerProperty("Text", String.class, null);
        addContainerProperty("Extent", String.class, null);
        for (final Location location : locations.getElements()) {
            if (!location.getNames().isPresent() && !location.getRefids().isPresent()) {
                continue;
            }
            if (location.getNames().isPresent()) {
                for (final LocationName locationName : location.getNames().get()) {
                    addItem(new Object[] { locationName.getType().name(), locationName.getText(),
                            locationName.getExtent().orNull() }, locationName.getText());
                }
            }
            if (location.getRefids().isPresent()) {
                for (final LocationRefid locationRefid : location.getRefids().get()) {
                    addItem(new Object[] { locationRefid.getType().name(), locationRefid.getText(), "reference" },
                            locationRefid.getText());
                }
            }
        }
        addGeneratedColumn("Text", new ColumnGenerator() {
            @Override
            public Object generateCell(final Table source, final Object itemId, final Object columnId) {
                final String category = (String) source.getContainerDataSource().getContainerProperty(itemId, columnId)
                        .getValue();
                return new NativeButton(category, new Button.ClickListener() {
                    @Override
                    public void buttonClick(final ClickEvent event) {
                        GuiUI.navigateTo(
                                ObjectQuery.builder()
                                        .setFacetFilters(ObjectFacetFilters.builder()
                                                .setIncludeLocationNameTexts(ImmutableSet.of(category)).build())
                                .build());
                    }
                });
            }
        });
        setPageLength(getContainerDataSource().size());
    }
}
