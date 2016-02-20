package net.lab1318.costume.gui.views.wizard.query_wizard;

import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
import com.google.common.primitives.UnsignedInteger;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.NativeButton;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

import net.lab1318.costume.gui.events.wizard.WizardFeatureGotoRequest;
import net.lab1318.costume.gui.models.wizard.WizardFeature;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSet;
import net.lab1318.costume.gui.models.wizard.WizardFeatureValue;

@SuppressWarnings("serial")
@DesignRoot
final class QueryWizardFeatureSetLayout extends VerticalLayout {
    public QueryWizardFeatureSetLayout(final Optional<WizardFeature> currentFeature, final EventBus eventBus,
            final WizardFeatureSet featureSet, final UnsignedInteger selectedObjectCount) {
        Design.read(this);

        currentSelectedObjectCountButton.setCaption(selectedObjectCount + " objects");

        for (final WizardFeature feature : featureSet.getFeatures()) {
            final VerticalLayout featureNavigationLayout = new VerticalLayout();
            final Button featureButton = new NativeButton(feature.getName(), new Button.ClickListener() {
                @Override
                public void buttonClick(final com.vaadin.ui.Button.ClickEvent event) {
                    eventBus.post(new WizardFeatureGotoRequest(feature.getName()));
                }
            });
            if (currentFeature.isPresent() && feature.getName().equals(currentFeature.get().getName())) {
                featureButton.addStyleName("bold-button");
            }
            featureNavigationLayout.addComponent(featureButton);

            String selectedFeatureValuesString = "";
            for (final WizardFeatureValue featureValue : feature.getValues()) {
                if (!featureValue.isSelected()) {
                    continue;
                }

                if (!selectedFeatureValuesString.isEmpty()) {
                    selectedFeatureValuesString += " OR ";
                }
                selectedFeatureValuesString += '"' + featureValue.getName() + '"';
            }
            featureNavigationLayout.addComponent(new Label(selectedFeatureValuesString));

            allFeatureNavigationLayout.addComponent(featureNavigationLayout);
        }
    }

    VerticalLayout allFeatureNavigationLayout = null;
    Button currentSelectedObjectCountButton = null;
}
