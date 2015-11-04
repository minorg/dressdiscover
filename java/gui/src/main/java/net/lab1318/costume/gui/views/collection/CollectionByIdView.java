package net.lab1318.costume.gui.views.collection;

import org.notaweb.gui.EventBus;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.data.Container;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.gui.components.CollectionHeader;
import net.lab1318.costume.gui.components.ObjectsTable;
import net.lab1318.costume.gui.views.TopLevelView;

@SuppressWarnings("serial")
@SessionScoped
public class CollectionByIdView extends TopLevelView {
    @Inject
    public CollectionByIdView(final EventBus eventBus) {
        super(eventBus);
    }

    public void setModels(final CollectionEntry collectionEntry, final InstitutionEntry institutionEntry,
            final Container objects) {
        final VerticalLayout rootLayout = new VerticalLayout();
        rootLayout.setSpacing(true);

        rootLayout.addComponent(new CollectionHeader(collectionEntry, _getEventBus(), institutionEntry));

        rootLayout.addComponent(new Label("&nbsp;", ContentMode.HTML));

        rootLayout.addComponent(new ObjectsTable(ImmutableMap.of(collectionEntry.getId(), collectionEntry.getModel()),
                _getEventBus(), ImmutableMap.of(institutionEntry.getId(), institutionEntry.getModel()), objects));

        setCompositionRoot(rootLayout);
    }

    public final static String NAME = "collection_by_id";
}
