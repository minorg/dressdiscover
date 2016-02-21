package net.lab1318.costume.gui.models.wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;

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

    public final String getSelectedAsUrlString() {
        final StringBuilder builder = new StringBuilder();
        boolean builderEmpty = true;
        for (final WizardFeature feature : features) {
            for (final WizardFeatureValue featureValue : feature.getValues()) {
                if (featureValue.isSelected()) {
                    if (!builderEmpty) {
                        builder.append('&');
                    }
                    try {
                        builder.append(URLEncoder.encode(feature.getName(), Charsets.UTF_8.name()));
                        builder.append('=');
                        builder.append(URLEncoder.encode(featureValue.getName(), Charsets.UTF_8.name()));
                    } catch (final UnsupportedEncodingException e) {
                        throw new IllegalStateException(e);
                    }
                    builderEmpty = false;
                }
            }
        }
        return builder.toString();
    }

    public abstract String getUrlName();

    public final void resetSelected() {
        for (final WizardFeature feature : features) {
            feature.resetSelected();
        }
    }

    public final void setSelectedFromUrlString(final String urlString) {
        resetSelected();

        for (final String nameValuePairString : urlString.split("&")) {
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
            for (final WizardFeature feature : features) {
                if (!feature.getName().equals(selectedName)) {
                    continue;
                }
                for (final WizardFeatureValue featureValue : feature.getValues()) {
                    if (featureValue.getName().equals(selectedValue)) {
                        featureValue.setSelected(true);
                        break;
                    }
                }
                break;
            }
        }
    }

    private final ImmutableList<WizardFeature> features;
}
