package net.lab1318.costume.gui.events.wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import net.lab1318.costume.gui.models.wizard.WizardState;

abstract class AbstractWizardFeatureNavigationRequest {
    protected AbstractWizardFeatureNavigationRequest(final WizardState state) {
        this.state = checkNotNull(state);
    }

    public WizardState getState() {
        return state;
    }

    private final WizardState state;
}
