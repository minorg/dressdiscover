package org.dressdiscover.gui.models.wizard;

import static com.google.common.base.Preconditions.checkState;

import com.google.common.collect.ImmutableList;

public class TextWizardFeature extends WizardFeature {
    TextWizardFeature(final String name, final boolean required) {
        super(name);
    }

    @Override
    public void addSelected(final String value) {
        checkState(text.isEmpty());
        text = ImmutableList.of(value);
    }

    @Override
    public ImmutableList<String> getSelected() {
        return text;
    }

    @Override
    public void resetSelected() {
        text = ImmutableList.of();
    }

    private ImmutableList<String> text = ImmutableList.of();
}
