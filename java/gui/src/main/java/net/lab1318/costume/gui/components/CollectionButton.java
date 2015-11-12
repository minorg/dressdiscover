package net.lab1318.costume.gui.components;

import org.notaweb.gui.EventBus;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CustomComponent;

import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.services.collection.CollectionQueryService;

@SuppressWarnings("serial")
public final class CollectionButton extends CustomComponent {
    public CollectionButton(final String captionPrefix, final CollectionEntry collectionEntry,
            final EventBus eventBus) {
        final Button collectionButton = new Button(captionPrefix + collectionEntry.getModel().getTitle(),
                new Button.ClickListener() {
                    @Override
                    public void buttonClick(final ClickEvent event) {
                        eventBus.post(
                                new CollectionQueryService.Messages.GetCollectionByIdRequest(collectionEntry.getId()));
                    }
                });
        collectionButton.addStyleName("borderlessButton");
        setCompositionRoot(collectionButton);
    }
}
