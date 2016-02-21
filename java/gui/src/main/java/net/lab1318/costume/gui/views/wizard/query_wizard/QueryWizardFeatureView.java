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
import net.lab1318.costume.gui.events.wizard.WizardFeatureBackRequest;
import net.lab1318.costume.gui.events.wizard.WizardFeatureFinishRequest;
import net.lab1318.costume.gui.events.wizard.WizardFeatureNextRequest;
import net.lab1318.costume.gui.events.wizard.WizardFeatureRefreshRequest;
import net.lab1318.costume.gui.models.wizard.EnumWizardFeature;
import net.lab1318.costume.gui.models.wizard.WizardFeature;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSet;
import net.lab1318.costume.gui.views.TopLevelView;
import net.lab1318.costume.gui.views.wizard.EnumWizardFeatureGrid;
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
        Button bottomBackButton;
        Button bottomFinishButton;
        Button bottomNextButton;
        Label currentFeatureNameLabel;
        Layout featureSetLayout;
        Button resetButton;
        Button selectedObjectCountButton;
        Button topBackButton;
        Button topFinishButton;
        Button topNextButton;
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

        final com.vaadin.ui.Button.ClickListener backButtonClickListener = new Button.ClickListener() {
            @Override
            public void buttonClick(final com.vaadin.ui.Button.ClickEvent event) {
                _getEventBus().post(new WizardFeatureBackRequest(currentFeature, featureSet));
            }
        };
        design.bottomBackButton.addClickListener(backButtonClickListener);
        design.topBackButton.addClickListener(backButtonClickListener);

        final com.vaadin.ui.Button.ClickListener finishButtonClickListener = new Button.ClickListener() {
            @Override
            public void buttonClick(final com.vaadin.ui.Button.ClickEvent event) {
                _getEventBus().post(new WizardFeatureFinishRequest(currentFeature, featureSet));
            }
        };
        design.bottomFinishButton.addClickListener(finishButtonClickListener);
        design.topFinishButton.addClickListener(finishButtonClickListener);

        final com.vaadin.ui.Button.ClickListener nextButtonClickListener = new Button.ClickListener() {
            @Override
            public void buttonClick(final com.vaadin.ui.Button.ClickEvent event) {
                _getEventBus().post(new WizardFeatureNextRequest(currentFeature, featureSet));
            }
        };
        design.bottomNextButton.addClickListener(nextButtonClickListener);
        design.topNextButton.addClickListener(nextButtonClickListener);

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
        design.featureSetLayout
                .addComponent(new WizardFeatureSetLayout(Optional.of(currentFeature), _getEventBus(), featureSet));

        design.currentFeatureNameLabel.setCaptionAsHtml(true);
        design.currentFeatureNameLabel.setCaption("<h1>Selecting: " + currentFeature.getName() + "</h1>");

        design.availableFeaturesLayout.removeAllComponents();
        design.availableFeaturesLayout.addComponent(
                new EnumWizardFeatureGrid(_getEventBus(), (EnumWizardFeature) currentFeature, featureSet));

        setCompositionRoot(design);
    }

    public final static String NAME = "query_wizard_feature";
}
