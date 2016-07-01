package org.dressdiscover.gui.models.wizard.query_wizard;

import org.dressdiscover.gui.models.NameValuePairs;
import org.dressdiscover.gui.models.wizard.UnknownWizardFeatureException;
import org.dressdiscover.gui.models.wizard.UnknownWizardFeatureSetException;
import org.dressdiscover.gui.models.wizard.WizardFeature;
import org.dressdiscover.gui.models.wizard.WizardFeatureSet;
import org.dressdiscover.gui.models.wizard.WizardFeatureSetFactories;
import org.dressdiscover.gui.models.wizard.WizardMode;
import org.dressdiscover.gui.models.wizard.WizardState;

import com.google.common.base.Optional;

import org.dressdiscover.api.services.IoException;

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
