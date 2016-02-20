package net.lab1318.costume.gui.models.wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;

public final class Feature {
    Feature(final String name, final ImmutableList<FeatureValue> values) {
        this.name = checkNotNull(name);
        this.values = checkNotNull(values);
    }

    public String getName() {
        return name;
    }

    public Optional<Feature> getNextFeature() {
        return nextFeature;
    }

    public Optional<Feature> getPreviousFeature() {
        return previousFeature;
    }

    public ImmutableList<FeatureValue> getValues() {
        return values;
    }

    public void resetSelected() {
        for (final FeatureValue value : values) {
            value.setSelected(false);
        }
    }

    void setNextFeature(final Feature nextFeature) {
        this.nextFeature = Optional.of(nextFeature);
    }

    void setPreviousFeature(final Feature previousFeature) {
        this.previousFeature = Optional.of(previousFeature);
    }

    private final String name;
    private Optional<Feature> nextFeature = Optional.absent();
    private Optional<Feature> previousFeature = Optional.absent();
    private final ImmutableList<FeatureValue> values;
}
