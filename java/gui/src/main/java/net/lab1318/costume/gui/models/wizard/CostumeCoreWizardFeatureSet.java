package net.lab1318.costume.gui.models.wizard;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

import net.lab1318.costume.api.models.object.ObjectFacetFilters;
import net.lab1318.costume.api.models.object.ObjectQuery;

final class CostumeCoreWizardFeatureSet extends WizardFeatureSet {
    CostumeCoreWizardFeatureSet(final ImmutableList<WizardFeature> features) {
        super(features);
    }

    @Override
    public ObjectQuery getSelectedAsQuery() {
        ObjectQuery.Builder queryBuilder = ObjectQuery.builder().setFacetFilters(
                ObjectFacetFilters.builder().setIncludeWorkTypeTexts(ImmutableSet.of("PhysicalObject")).build());
        final ImmutableMap.Builder<String, ImmutableList<String>> structureTextsBuilder = ImmutableMap.builder();
        for (final WizardFeature feature : getFeatures()) {
            ImmutableList.Builder<String> selectedFeatureValuesBuilder = null;
            for (final WizardFeatureValue featureValue : feature.getValues()) {
                if (featureValue.isSelected()) {
                    if (selectedFeatureValuesBuilder == null) {
                        selectedFeatureValuesBuilder = ImmutableList.builder();
                    }
                    selectedFeatureValuesBuilder.add(featureValue.getName());
                }
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
    public void setSelectedFromQuery(final ObjectQuery query) {
        if (!query.getStructureTexts().isPresent()) {
            return;
        }
        final ImmutableMap<String, ImmutableList<String>> structuredTexts = query.getStructureTexts().get();
        for (final WizardFeature feature : getFeatures()) {
            final ImmutableList<String> structuredTextValues = structuredTexts.get(feature.getName());
            if (structuredTextValues == null) {
                continue;
            }
            for (final WizardFeatureValue featureValue : feature.getValues()) {
                if (structuredTextValues.contains(featureValue.getName())) {
                    featureValue.setSelected(true);
                }
            }
        }
    }
}
