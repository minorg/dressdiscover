package net.lab1318.costume.gui.models.wizard;

import static com.google.common.base.Preconditions.checkState;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

import net.lab1318.costume.api.models.object.ObjectFacetFilters;
import net.lab1318.costume.api.models.object.ObjectQuery;

public final class CostumeCoreWizardFeatureSet extends WizardFeatureSet {
    CostumeCoreWizardFeatureSet(final ImmutableList<WizardFeature> features) {
        super(features);
    }

    @Override
    public String getDisplayName() {
        return DISPLAY_NAME;
    }

    @Override
    public ObjectQuery getSelectedAsQuery() {
        ObjectQuery.Builder queryBuilder = ObjectQuery.builder().setFacetFilters(
                ObjectFacetFilters.builder().setIncludeWorkTypeTexts(ImmutableSet.of("PhysicalObject")).build());
        final ImmutableMap.Builder<String, ImmutableList<String>> structureTextsBuilder = ImmutableMap.builder();
        for (final WizardFeature feature : getFeatures()) {
            checkState(feature instanceof EnumWizardFeature);
            ImmutableList.Builder<String> selectedFeatureValuesBuilder = null;
            for (final String featureValue : feature.getSelected()) {
                if (selectedFeatureValuesBuilder == null) {
                    selectedFeatureValuesBuilder = ImmutableList.builder();
                }
                selectedFeatureValuesBuilder.add(featureValue);
            }
            if (selectedFeatureValuesBuilder != null) {
                structureTextsBuilder.put(feature.getName(), selectedFeatureValuesBuilder.build());
            }
        }
        final ImmutableMap<String, ImmutableList<String>> structureTexts = structureTextsBuilder.build();
        if (!structureTexts.isEmpty()) {
            queryBuilder = queryBuilder.setStructureTexts(structureTexts);
        }
        return queryBuilder.build();
    }

    @Override
    public String getUrlName() {
        return URL_NAME;
    }

    // @Override
    // public void setSelectedFromQuery(final ObjectQuery query) {
    // if (!query.getStructureTexts().isPresent()) {
    // return;
    // }
    // final ImmutableMap<String, ImmutableList<String>> structuredTexts =
    // query.getStructureTexts().get();
    // for (final WizardFeature feature : getFeatures()) {
    // final ImmutableList<String> structuredTextValues =
    // structuredTexts.get(feature.getName());
    // if (structuredTextValues == null) {
    // continue;
    // }
    // for (final WizardFeatureValue featureValue : feature.getValues()) {
    // if (structuredTextValues.contains(featureValue.getName())) {
    // featureValue.setSelected(true);
    // }
    // }
    // }
    // }

    public final static String DISPLAY_NAME = "Costume Core";
    public final static String URL_NAME = "costume_core";
}
