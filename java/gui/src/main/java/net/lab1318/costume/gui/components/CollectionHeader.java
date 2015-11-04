package net.lab1318.costume.gui.components;

import org.notaweb.gui.EventBus;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.services.collection.CollectionQueryService;

@SuppressWarnings("serial")
public final class CollectionHeader extends CustomComponent {
    public CollectionHeader(final CollectionEntry collectionEntry, final EventBus eventBus,
            final InstitutionEntry institutionEntry) {
        final VerticalLayout layout = new VerticalLayout();

        layout.addComponent(new InstitutionHeader(eventBus, institutionEntry));

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

        setCompositionRoot(layout);
    }
}
