package net.lab1318.costume.gui.models.wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.opencsv.CSVWriter;

import net.lab1318.costume.api.models.object.ObjectQuery;

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

    public final WizardFeature getFeatureByName(final String name) {
        for (final WizardFeature feature : features) {
            if (feature.getName().equals(name)) {
                return feature;
            }
        }
        throw new IllegalArgumentException(name);
    }

    public final ImmutableList<WizardFeature> getFeatures() {
        return features;
    }

    public abstract ObjectQuery getSelectedAsQuery();

    public abstract String getUrlName();

    public final void resetSelected() {
        for (final WizardFeature feature : features) {
            feature.resetSelected();
        }
    }

    public String toCsv() {
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

    public final String toUrlString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(getUrlName());
        boolean haveSelectedFeatureValue = false;
        for (final WizardFeature feature : features) {
            for (final String featureValue : feature.getSelected()) {
                if (haveSelectedFeatureValue) {
                    builder.append('&');
                } else {
                    builder.append(URL_STRING_SEPARATOR);
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
        return builder.toString();
    }

    private final ImmutableList<WizardFeature> features;

    public final static String URL_STRING_SEPARATOR;

    static {
        try {
            URL_STRING_SEPARATOR = URLEncoder.encode("?", Charsets.UTF_8.name());
        } catch (final UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }
}
