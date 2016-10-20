package org.dressdiscover.gui.models.wizard;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.apache.commons.lang3.StringUtils;
import org.dressdiscover.api.services.IoException;

import com.google.common.base.Charsets;
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

    public final WizardFeatureSet createFeatureSetFromUrlEncodedString(final WizardMode mode,
            final String urlEncodedString) throws IoException, UnknownWizardFeatureSetException {
        String urlDecodedString;
        try {
            urlDecodedString = URLDecoder.decode(urlEncodedString, Charsets.UTF_8.name());
        } catch (final UnsupportedEncodingException e) {
            throw new IllegalStateException();
        }

        final String[] urlDecodedStringSplit = StringUtils.splitByWholeSeparator(urlDecodedString, "?", 2);

        final WizardFeatureSetFactory factory = byUrlName.get(urlDecodedStringSplit[0].toLowerCase());
        if (factory == null) {
            throw new UnknownWizardFeatureSetException(
                    String.format("unknown feature set '%s'", urlDecodedStringSplit[0]));
        }

        final WizardFeatureSet featureSet = factory.createFeatureSet(mode);
        featureSet.setSelectedFromUrlDecodedString(urlDecodedString);

        return featureSet;
    }

    private final ImmutableMap<String, WizardFeatureSetFactory> byUrlName;
}
