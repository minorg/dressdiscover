package org.dressdiscover.gui.models.wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.vaadin.server.ErrorMessage;

public abstract class WizardFeature {
    protected WizardFeature(final String name) {
        this.name = checkNotNull(name);
    }

    public abstract void addSelected(final String value);

    public String getName() {
        return name;
    }

    public Optional<WizardFeature> getNextFeature() {
        return nextFeature;
    }

    public Optional<WizardFeature> getPreviousFeature() {
        return previousFeature;
    }

    public abstract ImmutableList<String> getSelected();

    public abstract void resetSelected();

    public Optional<ErrorMessage> validateSelected() {
        return Optional.absent();
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
}
