package net.lab1318.costume.gui.models.wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.thryft.native_.Url;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.primitives.UnsignedInteger;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.collection.InvalidCollectionIdException;
import net.lab1318.costume.api.models.image.Image;
import net.lab1318.costume.api.models.image.ImageVersion;
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
    public final synchronized WizardFeatureSet createFeatureSet() throws IoException {
        if (featureImages == null) {
            final ImmutableList<ObjectSummaryEntry> featureObjectSummariesList = objectSummaryQueryService
                    .getObjectSummaries(Optional.absent(),
                            Optional.of(ObjectQuery.builder().setCollectionId(collectionId).setIncludeHidden(true)
                                    .setInstitutionId(collectionId.getInstitutionId()).build()))
                    .getHits();
            final Map<String, Map<String, Image>> featureImages = new HashMap<>();
            for (final Map.Entry<String, Collection<String>> featureEntry : CostumeCore.FEATURES.asMap().entrySet()) {
                final String featureName = featureEntry.getKey();
                final Map<String, Image> featureValueImages = new HashMap<>();
                for (final String featureValue : featureEntry.getValue()) {
                    Image featureValueImage = placeholderImage;
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
                        featureValueImage = featureObjectSummary.getModel().getImage().orNull();
                        break;
                    }
                    featureValueImages.put(featureValue, featureValueImage);
                }
                featureImages.put(featureName, featureValueImages);
            }
            final ImmutableMap.Builder<String, ImmutableMap<String, Image>> immutableFeatureImagesBuilder = ImmutableMap
                    .builder();
            for (final Map.Entry<String, Map<String, Image>> entry : featureImages.entrySet()) {
                immutableFeatureImagesBuilder.put(entry.getKey(), ImmutableMap.copyOf(entry.getValue()));
            }
            this.featureImages = immutableFeatureImagesBuilder.build();
        }

        final ImmutableList.Builder<WizardFeature> featuresBuilder = ImmutableList.builder();
        for (final Map.Entry<String, Collection<String>> featureEntry : CostumeCore.FEATURES.asMap().entrySet()) {
            final String featureName = featureEntry.getKey();
            final ImmutableMap<String, Image> featureValueImages = checkNotNull(featureImages.get(featureName));
            final ImmutableList.Builder<WizardFeatureValue> featureValuesBuilder = ImmutableList.builder();
            for (final String featureValue : featureEntry.getValue()) {
                featureValuesBuilder
                        .add(new WizardFeatureValue(checkNotNull(featureValueImages.get(featureValue)), featureValue));
            }
            featuresBuilder.add(new WizardFeature(featureName, featureValuesBuilder.build()));
        }
        return new CostumeCoreWizardFeatureSet(featuresBuilder.build());
    }

    private final CollectionId collectionId;
    private ImmutableMap<String, ImmutableMap<String, Image>> featureImages = null;
    private final ObjectSummaryQueryService objectSummaryQueryService;
    private final Image placeholderImage = Image.builder()
            .setSquareThumbnail(ImageVersion.builder().setHeightPx(UnsignedInteger.valueOf(200))
                    .setUrl(Url.parse("http://placehold.it/200x200?text=Missing%20image"))
                    .setWidthPx(UnsignedInteger.valueOf(200)).build())
            .build();
}
