package net.lab1318.costume.gui.views.wizard.query_wizard;

import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
import com.google.common.primitives.UnsignedInteger;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Layout;

import net.lab1318.costume.api.services.object.ObjectSummaryQueryService.Messages.GetObjectSummariesRequest;
import net.lab1318.costume.gui.events.wizard.WizardFeatureRefreshRequest;
import net.lab1318.costume.gui.models.wizard.EnumWizardFeature;
import net.lab1318.costume.gui.models.wizard.WizardFeature;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSet;
import net.lab1318.costume.gui.views.TopLevelView;
import net.lab1318.costume.gui.views.wizard.EnumWizardFeatureGrid;
import net.lab1318.costume.gui.views.wizard.WizardFeatureNavigationLayout;
import net.lab1318.costume.gui.views.wizard.WizardFeatureSetLayout;

@SuppressWarnings("serial")
@SessionScoped
public class QueryWizardFeatureView extends TopLevelView {
    @DesignRoot("QueryWizardFeatureView.html")
    private final static class Design extends HorizontalLayout {
        public Design() {
            com.vaadin.ui.declarative.Design.read(this);
        }

        Layout availableFeaturesLayout;
        Layout bottomNavigationLayout;
        Label currentFeatureNameLabel;
        Layout featureSetLayout;
        Button resetButton;
        Button selectedObjectCountButton;
        Layout topNavigationLayout;
    }

    @Inject
    public QueryWizardFeatureView(final EventBus eventBus) {
        super(eventBus);
    }

    public void setModels(final WizardFeature currentFeature, final WizardFeatureSet featureSet,
            final UnsignedInteger selectedObjectCount) {
        if (!(currentFeature instanceof EnumWizardFeature)) {
            throw new UnsupportedOperationException();
        }

        final Design design = new Design();

        design.availableFeaturesLayout.removeAllComponents();
        design.availableFeaturesLayout.addComponent(
                new EnumWizardFeatureGrid(_getEventBus(), (EnumWizardFeature) currentFeature, featureSet));

        design.currentFeatureNameLabel.setCaptionAsHtml(true);
        design.currentFeatureNameLabel.setCaption("<h1>Selecting: " + currentFeature.getName() + "</h1>");

        design.bottomNavigationLayout
                .addComponent(new WizardFeatureNavigationLayout(currentFeature, _getEventBus(), featureSet));

        design.featureSetLayout
                .addComponent(new WizardFeatureSetLayout(Optional.of(currentFeature), _getEventBus(), featureSet));

        design.resetButton.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(final com.vaadin.ui.Button.ClickEvent event) {
                currentFeature.resetSelected();
                _getEventBus().post(new WizardFeatureRefreshRequest(currentFeature, featureSet));
            }
        });

        design.selectedObjectCountButton.setCaption(selectedObjectCount + " objects");
        design.selectedObjectCountButton.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(final ClickEvent event) {
                _getEventBus()
                        .post(GetObjectSummariesRequest.builder().setQuery(featureSet.getSelectedAsQuery()).build());
            }
        });

        design.topNavigationLayout
                .addComponent(new WizardFeatureNavigationLayout(currentFeature, _getEventBus(), featureSet));

        setCompositionRoot(design);
    }

    public final static String NAME = "query_wizard_feature";
}
