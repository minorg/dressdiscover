package net.lab1318.costume.gui.events.wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import net.lab1318.costume.gui.models.wizard.WizardFeatureSet;

public final class WizardFeatureGotoRequest {
    public WizardFeatureGotoRequest(final String featureName, final WizardFeatureSet featureSet) {
        this.featureName = checkNotNull(featureName);
        this.featureSet = checkNotNull(featureSet);
    }

    public String getFeatureName() {
        return featureName;
    }

    public WizardFeatureSet getFeatureSet() {
        return featureSet;
    }

    private final String featureName;
    private final WizardFeatureSet featureSet;
}
