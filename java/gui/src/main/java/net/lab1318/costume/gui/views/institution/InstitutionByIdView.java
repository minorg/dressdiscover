package net.lab1318.costume.gui.views.institution;

import org.notaweb.gui.EventBus;

import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.services.collection.CollectionQueryService;
import net.lab1318.costume.gui.views.TopLevelView;

@SuppressWarnings("serial")
@SessionScoped
public class InstitutionByIdView extends TopLevelView {
    @Inject
    public InstitutionByIdView(final EventBus eventBus) {
        super(eventBus);
        final VerticalLayout rootLayout = new VerticalLayout();
        rootLayout.addComponent(headerLayout);
        rootLayout.addComponent(collectionsLayout);
        setCompositionRoot(rootLayout);
    }

    public void setCollections(final ImmutableList<CollectionEntry> collections) {
        collectionsLayout.removeAllComponents();
        for (final CollectionEntry collectionEntry : collections) {
            final Button collectionButton = new Button(collectionEntry.getModel().getTitle(),
                    new Button.ClickListener() {
                        @Override
                        public void buttonClick(final ClickEvent event) {
                            _getEventBus().post(new CollectionQueryService.Messages.GetCollectionByIdRequest(
                                    collectionEntry.getId()));
                        }
                    });
            collectionsLayout.addComponent(collectionButton);
        }
    }

    public void setInstitution(final InstitutionEntry institution) {
        headerLayout.removeAllComponents();
        headerLayout.addComponent(new Label(institution.getModel().getTitle()));
    }

    private final GridLayout collectionsLayout = new GridLayout();
    private final VerticalLayout headerLayout = new VerticalLayout();
    public final static String NAME = "institution_by_id";

}
