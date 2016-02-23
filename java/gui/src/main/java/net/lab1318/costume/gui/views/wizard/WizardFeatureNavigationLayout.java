package net.lab1318.costume.gui.views.wizard;

import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.server.ErrorMessage;
import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Notification;
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
                if (__validateSelected(currentFeature)) {
                    eventBus.post(new WizardFeatureBackRequest(currentFeature, featureSet));
                }
            }
        });

        finishButton.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(final com.vaadin.ui.Button.ClickEvent event) {
                if (__validateSelected(currentFeature)) {
                    eventBus.post(new WizardFeatureFinishRequest(currentFeature, featureSet));
                }
            }
        });

        nextButton.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(final com.vaadin.ui.Button.ClickEvent event) {
                if (__validateSelected(currentFeature)) {
                    eventBus.post(new WizardFeatureNextRequest(currentFeature, featureSet));
                }
            }
        });
    }

    public final Button getNextButton() {
        return nextButton;
    }

    private boolean __validateSelected(final WizardFeature currentFeature) {
        final Optional<ErrorMessage> errorMessage = currentFeature.validateSelected();
        if (!errorMessage.isPresent()) {
            return true;
        }
        final Notification notification = new Notification("Error", errorMessage.get().getFormattedHtmlMessage(),
                Notification.Type.ERROR_MESSAGE, true);
        notification.show(Page.getCurrent());
        return false;
    }

    Button backButton;
    Button finishButton;
    Button nextButton;
}
