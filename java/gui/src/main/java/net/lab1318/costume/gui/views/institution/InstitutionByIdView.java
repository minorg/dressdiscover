package net.lab1318.costume.gui.views.institution;

import org.notaweb.gui.EventBus;

import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.services.collection.CollectionQueryService;
import net.lab1318.costume.gui.components.InstitutionHeader;
import net.lab1318.costume.gui.views.TopLevelView;

@SuppressWarnings("serial")
@SessionScoped
public class InstitutionByIdView extends TopLevelView {
    @Inject
    public InstitutionByIdView(final EventBus eventBus) {
        super(eventBus);
    }

    public void setModels(final ImmutableList<CollectionEntry> collectionEntries,
            final InstitutionEntry institutionEntry) {
        final VerticalLayout rootLayout = new VerticalLayout();

        rootLayout.addComponent(new InstitutionHeader(_getEventBus(), institutionEntry));

        {
            final GridLayout collectionsLayout = new GridLayout();
            for (final CollectionEntry collectionEntry : collectionEntries) {
                final Button collectionButton = new Button("Collection: " + collectionEntry.getModel().getTitle(),
                        new Button.ClickListener() {
                            @Override
                            public void buttonClick(final ClickEvent event) {
                                _getEventBus().post(new CollectionQueryService.Messages.GetCollectionByIdRequest(
                                        collectionEntry.getId()));
                            }
                        });
                collectionsLayout.addComponent(collectionButton);
            }
            rootLayout.addComponent(collectionsLayout);
        }

        setCompositionRoot(rootLayout);
    }

    public final static String NAME = "institution_by_id";
}
