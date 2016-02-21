package net.lab1318.costume.gui.views.wizard;

import org.thryft.waf.gui.EventBus;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.declarative.Design;

import net.lab1318.costume.gui.events.wizard.WizardFeatureBackRequest;
import net.lab1318.costume.gui.events.wizard.WizardFeatureFinishRequest;
import net.lab1318.costume.gui.events.wizard.WizardFeatureNextRequest;
import net.lab1318.costume.gui.models.wizard.WizardFeature;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSet;

@SuppressWarnings("serial")
@DesignRoot
public final class WizardFeatureNavigationLayout extends HorizontalLayout {
    public WizardFeatureNavigationLayout(final WizardFeature currentFeature, final EventBus eventBus,
            final WizardFeatureSet featureSet) {
        Design.read(this);

        backButton.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(final com.vaadin.ui.Button.ClickEvent event) {
                eventBus.post(new WizardFeatureBackRequest(currentFeature, featureSet));
            }
        });

        finishButton.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(final com.vaadin.ui.Button.ClickEvent event) {
                eventBus.post(new WizardFeatureFinishRequest(currentFeature, featureSet));
            }
        });

        nextButton.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(final com.vaadin.ui.Button.ClickEvent event) {
                eventBus.post(new WizardFeatureNextRequest(currentFeature, featureSet));
            }
        });
    }

    Button backButton;
    Button finishButton;
    Button nextButton;
}
