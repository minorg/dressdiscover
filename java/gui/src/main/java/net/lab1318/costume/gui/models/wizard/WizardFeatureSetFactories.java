package net.lab1318.costume.gui.models.wizard;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.services.IoException;
import net.logstash.logback.encoder.org.apache.commons.lang.StringUtils;

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

    public final WizardFeatureSet createFeatureSetFromUrlString(final WizardMode mode, final String urlString)
            throws IoException {
        final String[] urlStringSplit = StringUtils.splitByWholeSeparator(urlString,
                WizardFeatureSet.URL_STRING_SEPARATOR, 2);

        final WizardFeatureSetFactory factory = byUrlName.get(urlStringSplit[0].toLowerCase());
        if (factory == null) {
            throw new IllegalArgumentException(String.format("unknown feature set '%s'", urlStringSplit[0]));
        }

        final WizardFeatureSet featureSet = factory.createFeatureSet(mode);
        if (urlStringSplit.length == 1 || urlStringSplit[1].isEmpty()) {
            return featureSet;
        }

        for (final String nameValuePairString : urlStringSplit[1].split("&")) {
            final String[] nameValuePairSplit = nameValuePairString.split("=", 2);
            if (nameValuePairSplit.length == 1) {
                continue;
            }
            String selectedName, selectedValue;
            try {
                selectedName = URLDecoder.decode(nameValuePairSplit[0], Charsets.UTF_8.name());
                if (selectedName.isEmpty()) {
                    continue;
                }
                selectedValue = URLDecoder.decode(nameValuePairSplit[1], Charsets.UTF_8.name());
                if (selectedValue.isEmpty()) {
                    continue;
                }
            } catch (final UnsupportedEncodingException e) {
                throw new IllegalStateException(e);
            }
            for (final WizardFeature feature : featureSet.getFeatures()) {
                if (!feature.getName().equals(selectedName)) {
                    continue;
                }
                feature.addSelected(selectedValue);
                break;
            }
        }

        return featureSet;
    }

    private final ImmutableMap<String, WizardFeatureSetFactory> byUrlName;
}
