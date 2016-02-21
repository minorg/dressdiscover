package net.lab1318.costume.gui.events.wizard;

import net.lab1318.costume.gui.models.wizard.WizardFeature;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSet;

public final class WizardFeatureNextRequest extends AbstractWizardFeatureNavigationRequest {
    public WizardFeatureNextRequest(final WizardFeature currentFeature, final WizardFeatureSet featureSet) {
        super(currentFeature, featureSet);
    }
}
