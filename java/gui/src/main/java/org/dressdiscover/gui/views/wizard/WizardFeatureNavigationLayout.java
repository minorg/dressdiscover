package org.dressdiscover.gui.views.wizard;

import org.dressdiscover.gui.events.wizard.WizardFeatureBackRequest;
import org.dressdiscover.gui.events.wizard.WizardFeatureFinishRequest;
import org.dressdiscover.gui.events.wizard.WizardFeatureNextRequest;
import org.dressdiscover.gui.models.wizard.WizardFeature;
import org.dressdiscover.gui.models.wizard.WizardState;
import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.server.ErrorMessage;
import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.declarative.Design;

@SuppressWarnings("serial")
@DesignRoot
public final class WizardFeatureNavigationLayout extends HorizontalLayout {
    public WizardFeatureNavigationLayout(final WizardFeature currentFeature, final EventBus eventBus,
            final WizardState state) {
        Design.read(this);

        backButton.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(final com.vaadin.ui.Button.ClickEvent event) {
                if (__validateSelected(currentFeature)) {
                    eventBus.post(new WizardFeatureBackRequest(state));
                }
            }
        });

        finishButton.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(final com.vaadin.ui.Button.ClickEvent event) {
                if (__validateSelected(currentFeature)) {
                    eventBus.post(new WizardFeatureFinishRequest(state));
                }
            }
        });

        nextButton.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(final com.vaadin.ui.Button.ClickEvent event) {
                if (__validateSelected(currentFeature)) {
                    eventBus.post(new WizardFeatureNextRequest(state));
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