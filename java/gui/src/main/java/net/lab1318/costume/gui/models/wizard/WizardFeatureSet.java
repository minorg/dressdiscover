package net.lab1318.costume.gui.models.wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import com.google.common.collect.ImmutableList;

import net.lab1318.costume.api.models.object.ObjectQuery;

public abstract class WizardFeatureSet {
    public WizardFeatureSet(final ImmutableList<WizardFeature> features) {
        this.features = checkNotNull(features);
        for (int featureI = 0; featureI < features.size(); featureI++) {
            final WizardFeature feature = features.get(featureI);
            if (featureI > 0) {
                feature.setPreviousFeature(features.get(featureI - 1));
            }
            if (featureI + 1 < features.size()) {
                feature.setNextFeature(features.get(featureI + 1));
            }
        }
    }

    public WizardFeature getFeatureByName(final String name) {
        for (final WizardFeature feature : features) {
            if (feature.getName().equals(name)) {
                return feature;
            }
        }
        throw new IllegalArgumentException();
    }

    public ImmutableList<WizardFeature> getFeatures() {
        return features;
    }

    public abstract ObjectQuery getSelectedAsQuery();

    public void resetSelected() {
        for (final WizardFeature feature : features) {
            feature.resetSelected();
        }
    }

    public abstract void setSelectedFromQuery(ObjectQuery query);

    private final ImmutableList<WizardFeature> features;
}
