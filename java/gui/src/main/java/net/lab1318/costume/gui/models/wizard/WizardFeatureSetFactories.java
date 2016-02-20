package net.lab1318.costume.gui.models.wizard;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class WizardFeatureSetFactories {
    @Inject
    public WizardFeatureSetFactories(final CostumeCoreWizardFeatureSetFactory costumeCoreFeatureSetFactory) {
        map = ImmutableMap.<String, WizardFeatureSetFactory> of("costume_core", costumeCoreFeatureSetFactory);
    }

    public final WizardFeatureSetFactory getFeatureSetFactoryByName(final String name) {
        final WizardFeatureSetFactory result = map.get(name.toLowerCase());
        if (result != null) {
            return result;
        } else {
            throw new IllegalArgumentException(name);
        }
    }

    private final ImmutableMap<String, WizardFeatureSetFactory> map;
}
