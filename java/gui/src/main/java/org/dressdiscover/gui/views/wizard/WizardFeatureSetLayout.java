package org.dressdiscover.gui.views.wizard;

import org.dressdiscover.gui.events.wizard.WizardFeatureGotoRequest;
import org.dressdiscover.gui.models.wizard.WizardFeature;
import org.dressdiscover.gui.models.wizard.WizardState;
import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public final class WizardFeatureSetLayout extends VerticalLayout {
    public WizardFeatureSetLayout(final Optional<WizardFeature> currentFeature, final EventBus eventBus,
            final WizardState state) {
        setStyleName("wizard-feature-set-layout");

        for (final WizardFeature feature : state.getFeatureSet().getFeatures()) {
            final VerticalLayout featureLayout = new VerticalLayout();
            featureLayout.setStyleName("feature-layout");
            final Button featureButton = new Button(feature.getName(), new Button.ClickListener() {
                @Override
                public void buttonClick(final com.vaadin.ui.Button.ClickEvent event) {
                    eventBus.post(new WizardFeatureGotoRequest(feature.getName(), state));
                }
            });
            if (currentFeature.isPresent() && feature.getName().equals(currentFeature.get().getName())) {
                featureButton.setStyleName("current-feature-button");
            } else {
                featureButton.setStyleName("feature-button");
            }
            featureLayout.addComponent(featureButton);

            String selectedFeatureValuesString = "";
            for (final String featureValue : feature.getSelected()) {
                if (!selectedFeatureValuesString.isEmpty()) {
                    selectedFeatureValuesString += " OR ";
                }
                selectedFeatureValuesString += '"' + featureValue + '"';
            }
            final Label selectedFeatureValueLabel = new Label(selectedFeatureValuesString);
            selectedFeatureValueLabel.setStyleName("selected-feature-value-label");
            featureLayout.addComponent(selectedFeatureValueLabel);

            addComponent(featureLayout);
        }
    }
}
