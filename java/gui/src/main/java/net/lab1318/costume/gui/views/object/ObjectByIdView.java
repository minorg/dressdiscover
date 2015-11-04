package net.lab1318.costume.gui.views.object;

import org.notaweb.gui.EventBus;

import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.models.object.ObjectEntry;
import net.lab1318.costume.gui.components.CollectionHeader;
import net.lab1318.costume.gui.components.ObjectForm;
import net.lab1318.costume.gui.views.TopLevelView;

@SuppressWarnings("serial")
@SessionScoped
public class ObjectByIdView extends TopLevelView {
    @Inject
    public ObjectByIdView(final EventBus eventBus) {
        super(eventBus);
    }

    public void setModels(final CollectionEntry collectionEntry, final InstitutionEntry institutionEntry,
            final ObjectEntry objectEntry) {
        final VerticalLayout rootLayout = new VerticalLayout();

        rootLayout.addComponent(new CollectionHeader(collectionEntry, _getEventBus(), institutionEntry));

        rootLayout.addComponent(new ObjectForm(objectEntry, institutionEntry.getModel()));

        setCompositionRoot(rootLayout);
    }

    public final static String NAME = "object_by_id";
}
