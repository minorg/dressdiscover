package org.dressdiscover.gui.events.wizard;

import org.dressdiscover.gui.models.wizard.WizardState;

public final class WizardFeatureFinishRequest extends AbstractWizardFeatureNavigationRequest {
    public WizardFeatureFinishRequest(final WizardState state) {
        super(state);
    }
}
