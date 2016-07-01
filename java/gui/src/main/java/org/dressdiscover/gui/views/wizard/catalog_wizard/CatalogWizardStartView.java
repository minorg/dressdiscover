package org.dressdiscover.gui.views.wizard.catalog_wizard;

import org.dressdiscover.api.models.object.ObjectId;
import org.dressdiscover.gui.events.wizard.catalog_wizard.CatalogWizardFeatureSetSelectionRequest;
import org.dressdiscover.gui.models.wizard.CostumeCoreWizardFeatureSet;
import org.dressdiscover.gui.views.TopLevelView;
import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
@SessionScoped
public class CatalogWizardStartView extends TopLevelView {
    @DesignRoot("CatalogWizardStartView.html")
    private final static class Design extends VerticalLayout {
        public Design() {
            com.vaadin.ui.declarative.Design.read(this);
        }

        Button costumeCoreButton = null;
    }

    @Inject
    public CatalogWizardStartView(final EventBus eventBus) {
        super(eventBus);
    }

    public void setModels(final Optional<ObjectId> objectId) {
        final Design design = new Design();
        design.costumeCoreButton.addClickListener(new ClickListener() {
            @Override
            public void buttonClick(final ClickEvent event) {
                _getEventBus().post(
                        new CatalogWizardFeatureSetSelectionRequest(CostumeCoreWizardFeatureSet.URL_NAME, objectId));
            }
        });
        setCompositionRoot(design);
    }

    public final static String NAME = "catalog_wizard";
}
