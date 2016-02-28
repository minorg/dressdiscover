package net.lab1318.costume.gui.views.wizard;

import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.NativeButton;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.gui.events.wizard.WizardFeatureGotoRequest;
import net.lab1318.costume.gui.models.wizard.WizardFeature;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSet;

@SuppressWarnings("serial")
public final class WizardFeatureSetLayout extends VerticalLayout {
    public WizardFeatureSetLayout(final Optional<WizardFeature> currentFeature, final EventBus eventBus,
            final WizardFeatureSet featureSet) {
        for (final WizardFeature feature : featureSet.getFeatures()) {
            final VerticalLayout featureNavigationLayout = new VerticalLayout();
            final Button featureButton = new Button(feature.getName(), new Button.ClickListener() {
                @Override
                public void buttonClick(final com.vaadin.ui.Button.ClickEvent event) {
                    eventBus.post(new WizardFeatureGotoRequest(feature.getName(), featureSet));
                }
            });
            if (currentFeature.isPresent() && feature.getName().equals(currentFeature.get().getName())) {
                featureButton.addStyleName("bold-button");
            }
            featureNavigationLayout.addComponent(featureButton);

            String selectedFeatureValuesString = "";
            for (final String featureValue : feature.getSelected()) {
                if (!selectedFeatureValuesString.isEmpty()) {
                    selectedFeatureValuesString += " OR ";
                }
                selectedFeatureValuesString += '"' + featureValue + '"';
            }
            featureNavigationLayout.addComponent(new Label(selectedFeatureValuesString));

            addComponent(featureNavigationLayout);
        }
    }
}
