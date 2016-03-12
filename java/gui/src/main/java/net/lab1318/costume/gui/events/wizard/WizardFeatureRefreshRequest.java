package net.lab1318.costume.gui.events.wizard;

import net.lab1318.costume.gui.models.wizard.WizardState;

public final class WizardFeatureRefreshRequest extends AbstractWizardFeatureNavigationRequest {
    public WizardFeatureRefreshRequest(final WizardState state) {
        super(state);
    }
}
