package org.dressdiscover.gui.events.wizard;

import org.dressdiscover.gui.models.wizard.WizardState;

public final class WizardFeatureRefreshRequest extends AbstractWizardFeatureNavigationRequest {
    public WizardFeatureRefreshRequest(final WizardState state) {
        super(state);
    }
}
