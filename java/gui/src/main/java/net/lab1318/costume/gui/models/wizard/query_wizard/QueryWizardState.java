package net.lab1318.costume.gui.models.wizard.query_wizard;

import com.google.common.base.Optional;

import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.gui.models.NameValuePairs;
import net.lab1318.costume.gui.models.wizard.UnknownWizardFeatureException;
import net.lab1318.costume.gui.models.wizard.UnknownWizardFeatureSetException;
import net.lab1318.costume.gui.models.wizard.WizardFeature;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSet;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSetFactories;
import net.lab1318.costume.gui.models.wizard.WizardMode;
import net.lab1318.costume.gui.models.wizard.WizardState;

public final class QueryWizardState extends WizardState {
    public static QueryWizardState fromNameValuePairs(final WizardFeatureSetFactories featureSetFactories,
            final NameValuePairs nameValuePairs)
            throws IoException, UnknownWizardFeatureException, UnknownWizardFeatureSetException {
        final WizardFeatureSet featureSet = _parseFeatureSet(featureSetFactories, WizardMode.QUERY, nameValuePairs);
        return new QueryWizardState(Optional.of(_parseFeature(featureSet, nameValuePairs)), featureSet);
    }

    public QueryWizardState(final Optional<WizardFeature> currentFeature, final WizardFeatureSet featureSet) {
        super(currentFeature, featureSet);
    }
}
