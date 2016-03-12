package net.lab1318.costume.gui.models.wizard.query_wizard;

import com.google.common.base.Optional;

import net.lab1318.costume.gui.models.wizard.WizardFeature;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSet;
import net.lab1318.costume.gui.models.wizard.WizardState;

public final class QueryWizardState extends WizardState {
    public QueryWizardState(final Optional<WizardFeature> currentFeature, final WizardFeatureSet featureSet) {
        super(currentFeature, featureSet);
    }
}
