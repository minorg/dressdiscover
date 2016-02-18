package net.lab1318.costume.gui.views.wizard;

import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.primitives.UnsignedInteger;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.NativeButton;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

import net.lab1318.costume.gui.events.wizard.WizardFeatureGotoRequest;

@SuppressWarnings("serial")
@DesignRoot
final class QueryWizardSelectedFeaturesLayout extends VerticalLayout {
    public QueryWizardSelectedFeaturesLayout(final ImmutableList<String> allFeatureNames,
            final Optional<String> currentFeatureName, final EventBus eventBus,
            final ImmutableMap<String, ImmutableList<String>> selectedFeatureValuesByFeatureName,
            final UnsignedInteger selectedObjectCount) {
        Design.read(this);

        currentSelectedObjectCountButton.setCaption(selectedObjectCount + " objects");
        for (final String featureName : allFeatureNames) {
            final VerticalLayout featureNavigationLayout = new VerticalLayout();
            final Button featureButton = new NativeButton(featureName, new Button.ClickListener() {
                @Override
                public void buttonClick(final com.vaadin.ui.Button.ClickEvent event) {
                    eventBus.post(new WizardFeatureGotoRequest(featureName));
                }
            });
            if (currentFeatureName.isPresent() && featureName.equals(currentFeatureName.get())) {
                featureButton.addStyleName("bold-button");
            }
            featureNavigationLayout.addComponent(featureButton);

            final ImmutableList<String> selectedFeatureValues_ = selectedFeatureValuesByFeatureName.get(featureName);
            if (selectedFeatureValues_ != null && !selectedFeatureValues_.isEmpty()) {
                for (int valueI = 0; valueI < selectedFeatureValues_.size(); valueI++) {
                    String value = selectedFeatureValues_.get(valueI);
                    value = '"' + value + '"';
                    if (valueI + 1 < selectedFeatureValues_.size()) {
                        value += " OR";
                    }
                    final Label valueLabel = new Label(value);
                    featureNavigationLayout.addComponent(valueLabel);
                }
            }

            allFeatureNavigationLayout.addComponent(featureNavigationLayout);
        }
    }

    VerticalLayout allFeatureNavigationLayout = null;
    Button currentSelectedObjectCountButton = null;
}
