package net.lab1318.costume.gui.views.wizard.catalog_wizard;

import org.thryft.waf.gui.EventBus;
import org.vaadin.viritin.components.DisclosurePanel;

import com.google.common.base.Optional;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Layout;

import net.lab1318.costume.gui.models.wizard.EnumWizardFeature;
import net.lab1318.costume.gui.models.wizard.TextWizardFeature;
import net.lab1318.costume.gui.models.wizard.catalog_wizard.CatalogWizardState;
import net.lab1318.costume.gui.views.TopLevelView;
import net.lab1318.costume.gui.views.wizard.EnumWizardFeatureLayout;
import net.lab1318.costume.gui.views.wizard.TextWizardFeatureLayout;
import net.lab1318.costume.gui.views.wizard.WizardFeatureNavigationLayout;
import net.lab1318.costume.gui.views.wizard.WizardFeatureSetLayout;

@SuppressWarnings("serial")
@SessionScoped
public class CatalogWizardFeatureView extends TopLevelView {
    @DesignRoot("CatalogWizardFeatureView.html")
    private final static class Design extends HorizontalLayout {
        public Design() {
            com.vaadin.ui.declarative.Design.read(this);
        }

        Layout bottomNavigationLayout;
        Layout currentFeatureLayout;
        Label currentFeatureNameLabel;
        Layout existingObjectLayout;
        Layout featureSetLayout;
        Layout topNavigationLayout;
    }

    @Inject
    public CatalogWizardFeatureView(final EventBus eventBus) {
        super(eventBus);
    }

    public void setModels(final CatalogWizardState state) {
        final Design design = new Design();

        final WizardFeatureNavigationLayout bottomFeatureNavigationLayout = new WizardFeatureNavigationLayout(
                state.getCurrentFeature().get(), _getEventBus(), state);
        design.bottomNavigationLayout.addComponent(bottomFeatureNavigationLayout);

        if (state.getCurrentFeature().get() instanceof EnumWizardFeature) {
            design.currentFeatureLayout.addComponent(new EnumWizardFeatureLayout(_getEventBus(),
                    (EnumWizardFeature) state.getCurrentFeature().get(), state));
        } else if (state.getCurrentFeature().get() instanceof TextWizardFeature) {
            design.currentFeatureLayout
                    .addComponent(new TextWizardFeatureLayout((TextWizardFeature) state.getCurrentFeature().get(),
                            bottomFeatureNavigationLayout.getNextButton()));
        } else {
            throw new UnsupportedOperationException();
        }

        design.currentFeatureNameLabel.setCaptionAsHtml(true);
        design.currentFeatureNameLabel.setCaption("<h1>" + state.getCurrentFeature().get().getName() + "</h1>");

        if (state.getObjectId().isPresent()) {
            ObjectEntryf
            final DisclosurePanel disclosurePanel = new DisclosurePanel("Object " + state.getObjectId().get(), iframe);
            design.existingObjectLayout.addComponent(disclosurePanel);
        }

        design.featureSetLayout.addComponent(
                new WizardFeatureSetLayout(Optional.of(state.getCurrentFeature().get()), _getEventBus(), state));

        design.topNavigationLayout.addComponent(
                new WizardFeatureNavigationLayout(state.getCurrentFeature().get(), _getEventBus(), state));

        setCompositionRoot(design);
    }

    public final static String NAME = "catalog_wizard_feature";
}
