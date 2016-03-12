package net.lab1318.costume.gui.models.wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;

public abstract class WizardState {
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

    public final ImmutableMap<String, String> toMap() {
        final ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
        _toMap(mapBuilder);
        return mapBuilder.build();
    }

    protected void _toMap(final ImmutableMap.Builder<String, String> builder) {
        if (currentFeature.isPresent()) {
            builder.put("feature", currentFeature.get().getName());
        }
        builder.put("feature_set", featureSet.getSelectedAsUrlEncodedString());
    }

    private Optional<WizardFeature> currentFeature;
    private final WizardFeatureSet featureSet;
}
