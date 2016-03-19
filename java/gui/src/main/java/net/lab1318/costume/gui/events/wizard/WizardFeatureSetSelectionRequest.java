package net.lab1318.costume.gui.events.wizard;

import static com.google.common.base.Preconditions.checkNotNull;

public class WizardFeatureSetSelectionRequest {
    public WizardFeatureSetSelectionRequest(final String featureSetUrlName) {
        this.featureSetUrlName = checkNotNull(featureSetUrlName);
    }

    public final String getFeatureSetUrlName() {
        return featureSetUrlName;
    }

    private final String featureSetUrlName;
}
