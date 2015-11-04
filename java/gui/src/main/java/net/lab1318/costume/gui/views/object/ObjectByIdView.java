package net.lab1318.costume.gui.views.object;

import org.notaweb.gui.EventBus;

import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;

import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.models.object.ObjectEntry;
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
    }

    public final static String NAME = "object_by_id";
}
