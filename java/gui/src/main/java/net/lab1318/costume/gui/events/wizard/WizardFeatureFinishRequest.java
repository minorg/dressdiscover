package net.lab1318.costume.gui.events.wizard;

import net.lab1318.costume.gui.models.wizard.WizardFeature;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSet;

public final class WizardFeatureFinishRequest extends AbstractWizardFeatureNavigationRequest {
    public WizardFeatureFinishRequest(final WizardFeature currentFeature, final WizardFeatureSet featureSet) {
        super(currentFeature, featureSet);
    }
}
