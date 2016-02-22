package net.lab1318.costume.gui.models.wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import com.google.common.collect.ImmutableList;

public class EnumWizardFeature extends WizardFeature {
    EnumWizardFeature(final String name, final ImmutableList<EnumWizardFeatureValue> values) {
        super(name);
        this.values = checkNotNull(values);
    }

    @Override
    public void addSelected(final String value) {
        for (final EnumWizardFeatureValue featureValue : values) {
            if (featureValue.getName().equals(value)) {
                featureValue.setSelected(true);
                break;
            }
        }
    }

    @Override
    public ImmutableList<String> getSelected() {
        ImmutableList.Builder<String> builder = null;
        for (final EnumWizardFeatureValue featureValue : values) {
            if (featureValue.isSelected()) {
                if (builder == null) {
                    builder = ImmutableList.builder();
                }
                builder.add(featureValue.getName());
            }
        }
        return builder != null ? builder.build() : ImmutableList.of();
    }

    public ImmutableList<EnumWizardFeatureValue> getValues() {
        return values;
    }

    @Override
    public void resetSelected() {
        for (final EnumWizardFeatureValue value : values) {
            value.setSelected(false);
        }
    }

    private final ImmutableList<EnumWizardFeatureValue> values;
}
