package org.dressdiscover.gui.views.institutions;

import org.dressdiscover.gui.views.TopLevelView;
import org.dressdiscover.lib.CostumeProperties;
import org.thryft.waf.gui.EventBus;

import com.google.common.collect.ImmutableMultimap;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Layout;
import com.vaadin.ui.VerticalLayout;

import org.dressdiscover.api.models.collection.CollectionEntry;
import org.dressdiscover.api.models.institution.InstitutionEntry;

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
