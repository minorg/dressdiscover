package org.dressdiscover.gui.models.wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.dressdiscover.api.models.institution.InstitutionId;
import org.thryft.waf.lib.stores.ElasticSearchIndex;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.primitives.UnsignedInteger;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.vaadin.server.ErrorMessage;
import com.vaadin.server.UserError;

import net.lab1318.costume.api.models.image.Image;
import net.lab1318.costume.api.models.institution.InvalidInstitutionIdException;
import net.lab1318.costume.api.models.object.ObjectQuery;
import net.lab1318.costume.api.models.object.ObjectSummaryEntry;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.object.GetObjectSummariesOptions;
import net.lab1318.costume.api.services.object.ObjectSummaryQueryService;

@Singleton
public class CostumeCoreWizardFeatureSetFactory implements WizardFeatureSetFactory {
    @Inject
    public CostumeCoreWizardFeatureSetFactory(final ObjectSummaryQueryService objectSummaryQueryService) {
        try {
            institutionId = InstitutionId.parse("wizard");
        } catch (final InvalidInstitutionIdException e) {
            throw new IllegalStateException(e);
        }
        this.objectSummaryQueryService = checkNotNull(objectSummaryQueryService);
    }

    @Override
    public final synchronized WizardFeatureSet createFeatureSet(final WizardMode mode) throws IoException {
        if (featureImages == null) {
            final ImmutableList<ObjectSummaryEntry> featureObjectSummariesList = objectSummaryQueryService
                    .getObjectSummaries(
                            Optional.of(GetObjectSummariesOptions.builder()
                                    .setSize(UnsignedInteger.valueOf(ElasticSearchIndex.SEARCH_REQUEST_SIZE_MAX))
                                    .build()),
                            Optional.of(ObjectQuery.builder().setIncludeHidden(true).setInstitutionId(institutionId)
                                    .build()))
                    .getHits();
            final Map<String, Map<String, Optional<Image>>> featureImages = new HashMap<>();
            for (final ObjectSummaryEntry featureObjectSummary : featureObjectSummariesList) {
                if (!featureObjectSummary.getModel().getStructureTexts().isPresent()) {
                    continue;
                }
                final Entry<String, String> structureText = featureObjectSummary.getModel().getStructureTexts().get()
                        .entrySet().iterator().next();
                final String featureName = structureText.getKey();
                final String featureValue = structureText.getValue();
                final Optional<Image> featureValueImage = featureObjectSummary.getModel().getImage();
                Map<String, Optional<Image>> featureValueImages = featureImages.get(featureName);
                if (featureValueImages == null) {
                    featureValueImages = new HashMap<>();
                    featureImages.put(featureName, featureValueImages);
                }
                featureValueImages.put(featureValue, featureValueImage);
            }
            final ImmutableMap.Builder<String, ImmutableMap<String, Optional<Image>>> immutableFeatureImagesBuilder = ImmutableMap
                    .builder();
            for (final Map.Entry<String, Map<String, Optional<Image>>> entry : featureImages.entrySet()) {
                immutableFeatureImagesBuilder.put(entry.getKey(), ImmutableMap.copyOf(entry.getValue()));
            }
            this.featureImages = immutableFeatureImagesBuilder.build();
        }

        final ImmutableList.Builder<WizardFeature> featuresBuilder = ImmutableList.builder();

        if (mode == WizardMode.CATALOG) {
            featuresBuilder.add(new TextWizardFeature("Title", true) {
                @Override
                public Optional<ErrorMessage> validateSelected() {
                    if (getSelected().isEmpty() || getSelected().get(0).isEmpty()) {
                        return Optional.of(new UserError("Must specify title"));
                    } else {
                        return Optional.absent();
                    }
                }
            });
        }

        for (final Map.Entry<String, ImmutableMap<String, Optional<Image>>> featureEntry : featureImages.entrySet()) {
            final String featureName = featureEntry.getKey();
            final ImmutableList.Builder<EnumWizardFeatureValue> featureValuesBuilder = ImmutableList.builder();
            for (final Map.Entry<String, Optional<Image>> featureValueEntry : featureEntry.getValue().entrySet()) {
                featureValuesBuilder
                        .add(new EnumWizardFeatureValue(featureValueEntry.getValue(), featureValueEntry.getKey()));
            }
            featuresBuilder.add(new EnumWizardFeature(featureName, featureValuesBuilder.build()));
        }

        return new CostumeCoreWizardFeatureSet(featuresBuilder.build());
    }

    @Override
    public String getDisplayName() {
        return CostumeCoreWizardFeatureSet.DISPLAY_NAME;
    }

    @Override
    public String getUrlName() {
        return CostumeCoreWizardFeatureSet.URL_NAME;
    }

    private ImmutableMap<String, ImmutableMap<String, Optional<Image>>> featureImages = null;
    private final InstitutionId institutionId;
    private final ObjectSummaryQueryService objectSummaryQueryService;
}
