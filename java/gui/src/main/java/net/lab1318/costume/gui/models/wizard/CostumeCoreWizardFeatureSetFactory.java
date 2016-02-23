package net.lab1318.costume.gui.models.wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.vaadin.server.ErrorMessage;
import com.vaadin.server.UserError;

import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.collection.InvalidCollectionIdException;
import net.lab1318.costume.api.models.image.Image;
import net.lab1318.costume.api.models.object.ObjectQuery;
import net.lab1318.costume.api.models.object.ObjectSummaryEntry;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.object.ObjectSummaryQueryService;

@Singleton
public class CostumeCoreWizardFeatureSetFactory implements WizardFeatureSetFactory {
    @Inject
    public CostumeCoreWizardFeatureSetFactory(final ObjectSummaryQueryService objectSummaryQueryService) {
        try {
            collectionId = CollectionId.parse("wizard/wizard");
        } catch (final InvalidCollectionIdException e) {
            throw new IllegalStateException(e);
        }
        this.objectSummaryQueryService = checkNotNull(objectSummaryQueryService);
    }

    @Override
    public final synchronized WizardFeatureSet createFeatureSet(final WizardMode mode) throws IoException {
        if (featureImages == null) {
            final ImmutableList<ObjectSummaryEntry> featureObjectSummariesList = objectSummaryQueryService
                    .getObjectSummaries(Optional.absent(),
                            Optional.of(ObjectQuery.builder().setCollectionId(collectionId).setIncludeHidden(true)
                                    .setInstitutionId(collectionId.getInstitutionId()).build()))
                    .getHits();
            final Map<String, Map<String, Optional<Image>>> featureImages = new HashMap<>();
            for (final Map.Entry<String, Collection<String>> featureEntry : CostumeCore.FEATURES.asMap().entrySet()) {
                final String featureName = featureEntry.getKey();
                final Map<String, Optional<Image>> featureValueImages = new HashMap<>();
                for (final String featureValue : featureEntry.getValue()) {
                    Optional<Image> featureValueImage = Optional.absent();
                    for (final ObjectSummaryEntry featureObjectSummary : featureObjectSummariesList) {
                        if (!featureObjectSummary.getModel().getStructureTexts().isPresent()) {
                            continue;
                        }
                        final String checkFeatureValue = featureObjectSummary.getModel().getStructureTexts().get()
                                .get(featureName);
                        if (checkFeatureValue == null) {
                            continue;
                        } else if (!checkFeatureValue.equals(featureValue)) {
                            continue;
                        }
                        featureValueImage = featureObjectSummary.getModel().getImage();
                        break;
                    }
                    if (featureValueImage.isPresent()) {
                        featureValueImages.put(featureValue, featureValueImage);
                    }
                }
                if (!featureValueImages.isEmpty()) {
                    featureImages.put(featureName, featureValueImages);
                }
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
        for (final Map.Entry<String, Collection<String>> featureEntry : CostumeCore.FEATURES.asMap().entrySet()) {
            final String featureName = featureEntry.getKey();
            final ImmutableMap<String, Optional<Image>> featureValueImages = featureImages.get(featureName);
            final ImmutableList.Builder<EnumWizardFeatureValue> featureValuesBuilder = ImmutableList.builder();
            for (final String featureValue : featureEntry.getValue()) {
                Optional<Image> featureValueImage;
                if (featureValueImages != null) {
                    featureValueImage = featureValueImages.get(featureValue);
                    if (featureValueImage == null) {
                        featureValueImage = Optional.absent();
                    }
                } else {
                    featureValueImage = Optional.absent();
                }
                featureValuesBuilder.add(new EnumWizardFeatureValue(featureValueImage, featureValue));
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

    private final CollectionId collectionId;
    private ImmutableMap<String, ImmutableMap<String, Optional<Image>>> featureImages = null;

    private final ObjectSummaryQueryService objectSummaryQueryService;
}
