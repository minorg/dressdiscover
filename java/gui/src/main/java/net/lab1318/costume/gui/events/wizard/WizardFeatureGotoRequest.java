package net.lab1318.costume.gui.events.wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import net.lab1318.costume.gui.models.wizard.WizardState;

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
