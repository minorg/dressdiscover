package net.lab1318.costume.gui.models.wizard;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class WizardFeatureSetFactories {
    @Inject
    public WizardFeatureSetFactories(final CostumeCoreWizardFeatureSetFactory costumeCoreFeatureSetFactory) {
        final ImmutableMap.Builder<String, WizardFeatureSetFactory> byUrlNameBuilder = ImmutableMap.builder();
        for (final WizardFeatureSetFactory featureSetFactory : new WizardFeatureSetFactory[] {
                costumeCoreFeatureSetFactory }) {
            byUrlNameBuilder.put(featureSetFactory.getUrlName(), featureSetFactory);
        }
        byUrlName = byUrlNameBuilder.build();
    }

    public final WizardFeatureSetFactory getFeatureSetFactoryByUrlName(final String name) {
        final WizardFeatureSetFactory result = byUrlName.get(name.toLowerCase());
        if (result != null) {
            return result;
        } else {
            throw new IllegalArgumentException(name);
        }
    }

    private final ImmutableMap<String, WizardFeatureSetFactory> byUrlName;
}
