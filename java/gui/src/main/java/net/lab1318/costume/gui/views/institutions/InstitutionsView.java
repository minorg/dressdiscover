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

@SuppressWarnings("serial")
@SessionScoped
public class InstitutionsView extends TopLevelView {
    @DesignRoot("InstitutionsView.html")
    private final static class Design extends VerticalLayout {
        public Design() {
            com.vaadin.ui.declarative.Design.read(this);
        }

        Layout treeLayout;
    }

    @Inject
    public InstitutionsView(final EventBus eventBus) {
        super(eventBus);
    }

    public void setModels(final ImmutableMultimap<InstitutionEntry, CollectionEntry> modelTree) {
        final Design design = new Design();

        design.treeLayout.addComponent(new InstitutionTree(_getEventBus(), modelTree));

        setCompositionRoot(design);
    }

    public final static String NAME = "institutions";
}
