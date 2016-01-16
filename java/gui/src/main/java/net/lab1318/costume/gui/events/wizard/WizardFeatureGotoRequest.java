package net.lab1318.costume.gui.events.wizard;

import static com.google.common.base.Preconditions.checkNotNull;

public final class WizardFeatureGotoRequest {
    public WizardFeatureGotoRequest(final String featureName) {
        this.featureName = checkNotNull(featureName);
    }

    public String getFeatureName() {
        return featureName;
    }

    private final String featureName;
}
