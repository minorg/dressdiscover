package org.dressdiscover.gui.models.wizard;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;

import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.opencsv.CSVWriter;

import net.lab1318.costume.api.models.object.ObjectQuery;
import net.logstash.logback.encoder.org.apache.commons.lang.StringUtils;

public abstract class WizardFeatureSet {
    public WizardFeatureSet(final ImmutableList<WizardFeature> features) {
        this.features = checkNotNull(features);
        for (int featureI = 0; featureI < features.size(); featureI++) {
            final WizardFeature feature = features.get(featureI);
            if (featureI > 0) {
                feature.setPreviousFeature(features.get(featureI - 1));
            }
            if (featureI + 1 < features.size()) {
                feature.setNextFeature(features.get(featureI + 1));
            }
        }
    }

    public abstract String getDisplayName();

    public String getExportFileBaseName() {
        return "features";
    }

    public final WizardFeature getFeatureByName(final String name) throws UnknownWizardFeatureException {
        for (final WizardFeature feature : features) {
            if (feature.getName().equals(name)) {
                return feature;
            }
        }
        throw new UnknownWizardFeatureException(String.format("unknown feature '%s'", name));
    }

    public final ImmutableList<WizardFeature> getFeatures() {
        return features;
    }

    public String getSelectedAsCsv() {
        final StringWriter csvStringWriter = new StringWriter();
        try (final CSVWriter csvWriter = new CSVWriter(csvStringWriter)) {
            csvWriter.writeNext(new String[] { "Feature name", "Feature value" });
            for (final WizardFeature feature : features) {
                for (final String featureValue : feature.getSelected()) {
                    csvWriter.writeNext(new String[] { feature.getName(), featureValue });
                }
            }
            csvWriter.flush();
        } catch (final IOException e) {
            throw new IllegalStateException(e);
        }
        return csvStringWriter.toString();
    }

    public abstract ObjectQuery getSelectedAsQuery();

    public final String getSelectedAsUrlEncodedString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(getUrlName());
        boolean haveSelectedFeatureValue = false;
        for (final WizardFeature feature : features) {
            for (final String featureValue : feature.getSelected()) {
                if (haveSelectedFeatureValue) {
                    builder.append('&');
                } else {
                    builder.append('?');
                }
                try {
                    builder.append(URLEncoder.encode(feature.getName(), Charsets.UTF_8.name()));
                    builder.append('=');
                    builder.append(URLEncoder.encode(featureValue, Charsets.UTF_8.name()));
                } catch (final UnsupportedEncodingException e) {
                    throw new IllegalStateException(e);
                }
                haveSelectedFeatureValue = true;
            }
        }
        try {
            return URLEncoder.encode(builder.toString(), Charsets.UTF_8.name());
        } catch (final UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }

    public abstract String getUrlName();

    public final void resetSelected() {
        for (final WizardFeature feature : features) {
            feature.resetSelected();
        }
    }

    public final void setSelectedFromUrlDecodedString(final String urlDecodedString) {
        final String[] urlDecodedStringSplit = StringUtils.splitByWholeSeparator(urlDecodedString, "?", 2);

        checkState(urlDecodedStringSplit[0].toLowerCase().equals(getUrlName()));

        if (urlDecodedStringSplit.length == 1 || urlDecodedStringSplit[1].isEmpty()) {
            return;
        }

        for (final String nameValuePairString : urlDecodedStringSplit[1].split("&")) {
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
            for (final WizardFeature feature : getFeatures()) {
                if (!feature.getName().equals(selectedName)) {
                    continue;
                }
                feature.addSelected(selectedValue);
                break;
            }
        }
    }

    private final ImmutableList<WizardFeature> features;
}
