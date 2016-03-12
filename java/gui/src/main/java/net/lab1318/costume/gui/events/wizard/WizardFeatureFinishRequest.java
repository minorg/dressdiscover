package net.lab1318.costume.gui.events.wizard;

import net.lab1318.costume.gui.models.wizard.WizardState;

public final class WizardFeatureFinishRequest extends AbstractWizardFeatureNavigationRequest {
    public WizardFeatureFinishRequest(final WizardState state) {
        super(state);
    }
}
