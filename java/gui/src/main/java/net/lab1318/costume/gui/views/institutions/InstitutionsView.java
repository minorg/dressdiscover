package net.lab1318.costume.gui.views.institutions;

import org.thryft.waf.gui.EventBus;

import com.google.common.collect.ImmutableMultimap;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Layout;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.gui.views.TopLevelView;
import net.lab1318.costume.lib.CostumeProperties;

@SuppressWarnings("serial")
@SessionScoped
public class InstitutionsView extends TopLevelView {
    @DesignRoot("InstitutionsView.html")
    private final static class Design extends VerticalLayout {
        public Design() {
            com.vaadin.ui.declarative.Design.read(this);
        }

        Layout treeLayout;
        Layout mapLayout;
    }

    @Inject
    public InstitutionsView(final EventBus eventBus, final CostumeProperties properties) {
        super(eventBus);
        this.googleApiKey = properties.getGoogleApiKey();
    }

    public void setModels(final ImmutableMultimap<InstitutionEntry, CollectionEntry> modelTree) {
        final Design design = new Design();

        design.treeLayout.addComponent(new InstitutionTree(_getEventBus(), modelTree));

        design.mapLayout.addComponent(new InstitutionMap(_getEventBus(), googleApiKey, modelTree));

        setCompositionRoot(design);
    }

    private final String googleApiKey;
    public final static String NAME = "institutions";
}
