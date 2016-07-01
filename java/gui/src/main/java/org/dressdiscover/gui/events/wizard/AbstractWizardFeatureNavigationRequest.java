package org.dressdiscover.gui.events.wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import org.dressdiscover.gui.models.wizard.WizardState;

abstract class AbstractWizardFeatureNavigationRequest {
    protected AbstractWizardFeatureNavigationRequest(final WizardState state) {
        this.state = checkNotNull(state);
    }

    public WizardState getState() {
        return state;
    }

    private final WizardState state;
}
