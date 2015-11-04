package net.lab1318.costume.gui.components;

import org.notaweb.gui.EventBus;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalLayout;

import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.services.collection.CollectionQueryService;

@SuppressWarnings("serial")
public final class CollectionHeader extends CustomComponent {
    public CollectionHeader(final CollectionEntry collectionEntry, final EventBus eventBus,
            final InstitutionEntry institutionEntry) {
        final HorizontalLayout layout = new HorizontalLayout();
        layout.setSizeFull();

        final InstitutionHeader institutionHeader = new InstitutionHeader(eventBus, institutionEntry);
        layout.addComponent(institutionHeader);
        layout.setComponentAlignment(institutionHeader, Alignment.MIDDLE_LEFT);

        final Button collectionButton = new Button("Collection: " + collectionEntry.getModel().getTitle(),
                new Button.ClickListener() {
                    @Override
                    public void buttonClick(final ClickEvent event) {
                        eventBus.post(
                                new CollectionQueryService.Messages.GetCollectionByIdRequest(collectionEntry.getId()));
                    }
                });
        collectionButton.addStyleName("borderlessButton");

        layout.addComponent(collectionButton);
        layout.setComponentAlignment(collectionButton, Alignment.MIDDLE_RIGHT);

        setCompositionRoot(layout);
    }
}
