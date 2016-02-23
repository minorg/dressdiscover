package net.lab1318.costume.gui.views.wizard.catalog_wizard;

import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Layout;

import net.lab1318.costume.gui.models.wizard.EnumWizardFeature;
import net.lab1318.costume.gui.models.wizard.TextWizardFeature;
import net.lab1318.costume.gui.models.wizard.WizardFeature;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSet;
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
        Layout featureSetLayout;
        Layout topNavigationLayout;
    }

    @Inject
    public CatalogWizardFeatureView(final EventBus eventBus) {
        super(eventBus);
    }

    public void setModels(final WizardFeature currentFeature, final WizardFeatureSet featureSet) {
        final Design design = new Design();

        design.currentFeatureNameLabel.setCaptionAsHtml(true);
        design.currentFeatureNameLabel.setCaption("<h1>" + currentFeature.getName() + "</h1>");

        final WizardFeatureNavigationLayout bottomFeatureNavigationLayout = new WizardFeatureNavigationLayout(
                currentFeature, _getEventBus(), featureSet);
        design.bottomNavigationLayout.addComponent(bottomFeatureNavigationLayout);

        if (currentFeature instanceof EnumWizardFeature) {
            design.currentFeatureLayout.addComponent(
                    new EnumWizardFeatureLayout(_getEventBus(), (EnumWizardFeature) currentFeature, featureSet));
        } else if (currentFeature instanceof TextWizardFeature) {
            design.currentFeatureLayout.addComponent(new TextWizardFeatureLayout((TextWizardFeature) currentFeature,
                    bottomFeatureNavigationLayout.getNextButton()));
        } else {
            throw new UnsupportedOperationException();
        }

        design.featureSetLayout
                .addComponent(new WizardFeatureSetLayout(Optional.of(currentFeature), _getEventBus(), featureSet));

        design.topNavigationLayout
                .addComponent(new WizardFeatureNavigationLayout(currentFeature, _getEventBus(), featureSet));

        setCompositionRoot(design);
    }

    public final static String NAME = "catalog_wizard_feature";
}
