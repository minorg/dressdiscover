package org.dressdiscover.gui.events.wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import org.dressdiscover.gui.models.wizard.WizardState;

public final class WizardFeatureGotoRequest extends AbstractWizardFeatureNavigationRequest {
    public WizardFeatureGotoRequest(final String featureName, final WizardState state) {
        super(state);
        this.featureName = checkNotNull(featureName);
    }

    public String getFeatureName() {
        return featureName;
    }

    private final String featureName;
}
