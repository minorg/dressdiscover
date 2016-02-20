package net.lab1318.costume.gui.models.wizard;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class FeatureSetFactories {
    @Inject
    public FeatureSetFactories(final CostumeCoreFeatureSetFactory costumeCoreFeatureSetFactory) {
        map = ImmutableMap.<String, FeatureSetFactory> of("costume_core", costumeCoreFeatureSetFactory);
    }

    public final FeatureSetFactory getFeatureSetFactoryByName(final String name) {
        final FeatureSetFactory result = map.get(name.toLowerCase());
        if (result != null) {
            return result;
        } else {
            throw new IllegalArgumentException(name);
        }
    }

    private final ImmutableMap<String, FeatureSetFactory> map;
}
