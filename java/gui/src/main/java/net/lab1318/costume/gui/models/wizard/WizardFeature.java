package net.lab1318.costume.gui.models.wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;

public final class WizardFeature {
    WizardFeature(final String name, final ImmutableList<WizardFeatureValue> values) {
        this.name = checkNotNull(name);
        this.values = checkNotNull(values);
    }

    public String getName() {
        return name;
    }

    public Optional<WizardFeature> getNextFeature() {
        return nextFeature;
    }

    public Optional<WizardFeature> getPreviousFeature() {
        return previousFeature;
    }

    public ImmutableList<WizardFeatureValue> getValues() {
        return values;
    }

    public void resetSelected() {
        for (final WizardFeatureValue value : values) {
            value.setSelected(false);
        }
    }

    void setNextFeature(final WizardFeature nextFeature) {
        this.nextFeature = Optional.of(nextFeature);
    }

    void setPreviousFeature(final WizardFeature previousFeature) {
        this.previousFeature = Optional.of(previousFeature);
    }

    private final String name;
    private Optional<WizardFeature> nextFeature = Optional.absent();
    private Optional<WizardFeature> previousFeature = Optional.absent();
    private final ImmutableList<WizardFeatureValue> values;
}
