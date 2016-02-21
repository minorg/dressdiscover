package net.lab1318.costume.gui.events.wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import net.lab1318.costume.gui.models.wizard.WizardFeature;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSet;

abstract class AbstractWizardFeatureNavigationRequest {
    protected AbstractWizardFeatureNavigationRequest(final WizardFeature currentFeature, final WizardFeatureSet featureSet) {
        this.currentFeature = checkNotNull(currentFeature);
        this.featureSet = checkNotNull(featureSet);
    }

    public final WizardFeature getCurrentFeature() {
        return currentFeature;
    }

    public final WizardFeatureSet getFeatureSet() {
        return featureSet;
    }

    private final WizardFeature currentFeature;
    private final WizardFeatureSet featureSet;
}
