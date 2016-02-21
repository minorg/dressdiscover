package net.lab1318.costume.gui.views.wizard.query_wizard;

import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
import com.google.common.primitives.UnsignedInteger;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Layout;

import net.lab1318.costume.gui.events.wizard.WizardFeatureBackRequest;
import net.lab1318.costume.gui.events.wizard.WizardFeatureFinishRequest;
import net.lab1318.costume.gui.events.wizard.WizardFeatureNextRequest;
import net.lab1318.costume.gui.events.wizard.WizardFeatureRefreshRequest;
import net.lab1318.costume.gui.models.wizard.WizardFeature;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSet;
import net.lab1318.costume.gui.views.TopLevelView;

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
        Layout leftPaneLayout;
        Button resetButton;
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

        design.leftPaneLayout.removeAllComponents();
        design.leftPaneLayout.addComponent(new QueryWizardFeatureSetLayout(Optional.of(currentFeature), _getEventBus(),
                featureSet, selectedObjectCount));

        design.currentFeatureNameLabel.setCaptionAsHtml(true);
        design.currentFeatureNameLabel.setCaption("<h1>Selecting: " + currentFeature.getName() + "</h1>");

        design.availableFeaturesLayout.removeAllComponents();
        design.availableFeaturesLayout
                .addComponent(new QueryWizardFeatureGrid(_getEventBus(), currentFeature, featureSet));

        setCompositionRoot(design);
    }

    public final static String NAME = "query_wizard_feature";
}
