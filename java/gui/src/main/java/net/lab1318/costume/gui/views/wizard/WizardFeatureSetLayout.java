package net.lab1318.costume.gui.views.wizard;

import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.gui.events.wizard.WizardFeatureGotoRequest;
import net.lab1318.costume.gui.models.wizard.WizardFeature;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSet;

@SuppressWarnings("serial")
public final class WizardFeatureSetLayout extends VerticalLayout {
    public WizardFeatureSetLayout(final Optional<WizardFeature> currentFeature, final EventBus eventBus,
            final WizardFeatureSet featureSet) {
        setStyleName("wizard-feature-set-layout");

        for (final WizardFeature feature : featureSet.getFeatures()) {
            final VerticalLayout featureLayout = new VerticalLayout();
            featureLayout.setStyleName("feature-layout");
            final Button featureButton = new Button(feature.getName(), new Button.ClickListener() {
                @Override
                public void buttonClick(final com.vaadin.ui.Button.ClickEvent event) {
                    eventBus.post(new WizardFeatureGotoRequest(feature.getName(), featureSet));
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
