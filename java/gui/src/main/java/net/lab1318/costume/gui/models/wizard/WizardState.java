package net.lab1318.costume.gui.models.wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;

import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.gui.models.NameValuePairs;

public abstract class WizardState {
    protected static WizardFeature _parseFeature(final WizardFeatureSet featureSet, final NameValuePairs parameters)
            throws IoException, UnknownWizardFeatureException {
        final Optional<String> featureName = parameters.getFirst("feature");
        if (!featureName.isPresent() || featureName.get().isEmpty()) {
            return featureSet.getFeatures().get(0);
        }

        return featureSet.getFeatureByName(featureName.get());
    }

    protected static WizardFeatureSet _parseFeatureSet(final WizardFeatureSetFactories featureSetFactories,
            final WizardMode mode, final NameValuePairs nameValuePairs)
            throws IoException, UnknownWizardFeatureSetException {
        final Optional<String> featureSetName = nameValuePairs.getFirst("feature_set");
        if (!featureSetName.isPresent()) {
            throw new UnknownWizardFeatureSetException("missing feature set");
        }

        return featureSetFactories.createFeatureSetFromUrlEncodedString(mode, featureSetName.get());
    }

    protected WizardState(final Optional<WizardFeature> currentFeature, final WizardFeatureSet featureSet) {
        this.currentFeature = checkNotNull(currentFeature);
        this.featureSet = checkNotNull(featureSet);
    }

    public Optional<WizardFeature> getCurrentFeature() {
        return currentFeature;
    }

    public final WizardFeatureSet getFeatureSet() {
        return featureSet;
    }

    public void setCurrentFeature(final Optional<WizardFeature> currentFeature) {
        this.currentFeature = checkNotNull(currentFeature);
    }

    public void setCurrentFeature(final WizardFeature currentFeature) {
        this.currentFeature = Optional.of(currentFeature);
    }

    public final NameValuePairs toNameValuePairs() {
        final ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
        _toNameValuePairs(mapBuilder);
        return new NameValuePairs(mapBuilder.build());
    }

    protected void _toNameValuePairs(final ImmutableMap.Builder<String, String> builder) {
        if (currentFeature.isPresent()) {
            builder.put("feature", currentFeature.get().getName());
        }
        builder.put("feature_set", featureSet.getSelectedAsUrlEncodedString());
    }

    private Optional<WizardFeature> currentFeature;
    private final WizardFeatureSet featureSet;
}
