package net.lab1318.costume.gui.presenters.wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.annotation.Nullable;

import org.thryft.native_.Url;
import org.thryft.waf.gui.EventBus;

import com.google.common.base.Charsets;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.eventbus.Subscribe;
import com.google.common.primitives.UnsignedInteger;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.SystemError;
import com.vaadin.server.UserError;
import com.vaadin.ui.UI;

import net.lab1318.costume.api.models.ModelMetadata;
import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.collection.InvalidCollectionIdException;
import net.lab1318.costume.api.models.image.Image;
import net.lab1318.costume.api.models.image.ImageVersion;
import net.lab1318.costume.api.models.object.ObjectSummary;
import net.lab1318.costume.api.models.object.ObjectSummaryEntry;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.object.ObjectQuery;
import net.lab1318.costume.api.services.object.ObjectSummaryQueryService;
import net.lab1318.costume.gui.GuiUI;
import net.lab1318.costume.gui.events.wizard.WizardFeatureBackRequest;
import net.lab1318.costume.gui.events.wizard.WizardFeatureFinishRequest;
import net.lab1318.costume.gui.events.wizard.WizardFeatureGotoRequest;
import net.lab1318.costume.gui.events.wizard.WizardFeatureNextRequest;
import net.lab1318.costume.gui.events.wizard.WizardFeatureRefreshRequest;
import net.lab1318.costume.gui.models.wizard.CostumeCore;
import net.lab1318.costume.gui.models.wizard.CostumeCore.Feature;
import net.lab1318.costume.gui.presenters.Presenter;
import net.lab1318.costume.gui.views.wizard.WizardFeatureView;

@SessionScoped
public class WizardFeaturePresenter extends Presenter<WizardFeatureView> {
    private static CollectionId __createCollectionId() {
        try {
            return CollectionId.parse("wizard/wizard");
        } catch (final InvalidCollectionIdException e) {
            throw new RuntimeException(e);
        }
    }

    @Inject
    public WizardFeaturePresenter(final EventBus eventBus, final ObjectSummaryQueryService objectSummaryQueryService,
            final WizardFeatureView view) {
        super(eventBus, view);
        this.objectSummaryQueryService = checkNotNull(objectSummaryQueryService);
    }

    @Subscribe
    public void onWizardFeatureBackRequest(final WizardFeatureBackRequest event) {
        __updateSelectedFeatureValues();
        if (currentFeatureIndex > 0) {
            __navigateToFeature(FEATURE_NAMES.get(currentFeatureIndex - 1));
        }
    }

    @Subscribe
    public void onWizardFeatureFinishRequest(final WizardFeatureFinishRequest event) {
        __updateSelectedFeatureValues();
        __navigateToFinish();
    }

    @Subscribe
    public void onWizardFeatureGotoRequest(final WizardFeatureGotoRequest event) {
        __updateSelectedFeatureValues();
        if (currentFeatureIndex > 0) {
            __navigateToFeature(event.getFeatureName());
        }
    }

    @Subscribe
    public void onWizardFeatureNextRequest(final WizardFeatureNextRequest event) {
        __updateSelectedFeatureValues();
        if (currentFeatureIndex + 1 < FEATURE_NAMES.size()) {
            __navigateToFeature(FEATURE_NAMES.get(currentFeatureIndex + 1));
        } else {
            __navigateToFinish();
        }
    }

    @Subscribe
    public void onWizardFeatureRefreshEvent(final WizardFeatureRefreshRequest event) {
        __updateSelectedFeatureValues();
        __refreshView();
    }

    @Override
    protected void _onViewEnter(final ViewChangeEvent event) {
        if (event.getParameters().isEmpty()) {
            selectedFeatureValuesByFeatureName.clear(); // Reset
            __navigateToFeature(CostumeCore.FEATURES.keySet().iterator().next());
            return;
        }

        try {
            currentFeatureName = URLDecoder.decode(event.getParameters(), "UTF-8");
        } catch (final UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
        currentFeatureIndex = FEATURE_NAMES.indexOf(currentFeatureName);
        if (currentFeatureIndex == -1) {
            _getView().setComponentError(new UserError("no such feature " + currentFeatureName));
            return;
        }

        ImmutableList<ObjectSummaryEntry> featureModelsInDatabase;
        try {
            featureModelsInDatabase = objectSummaryQueryService.getObjectSummaries(Optional.absent(),
                    Optional.of(ObjectQuery.builder().setCollectionId(COLLECTION_ID)
                            .setInstitutionId(COLLECTION_ID.getInstitutionId())
                            .setStructureTexts(ImmutableMap.of(currentFeatureName, ImmutableList.of())).build()))
                    .getHits();
        } catch (final IoException e) {
            _getView().setComponentError(new SystemError("I/O exception", e));
            return;
        }

        // Fill in availableFeatureModels with dummy images
        final Date currentDate = new Date();
        final ModelMetadata modelMetadata = ModelMetadata.builder().setCtime(currentDate).setMtime(currentDate).build();
        final ImmutableList.Builder<ObjectSummary> allFeatureModelsBuilder = ImmutableList.builder();
        for (final Feature feature : CostumeCore.FEATURES.get(currentFeatureName)) {
            @Nullable
            ObjectSummaryEntry featureModel = null;
            for (final ObjectSummaryEntry featureModelInDatabase : featureModelsInDatabase) {
                final String featureValue = checkNotNull(
                        featureModelInDatabase.getModel().getStructureTexts().get().get(currentFeatureName));
                if (featureValue.equals(feature.getDisplayName())) {
                    featureModel = featureModelInDatabase;
                    break;
                }
            }
            if (featureModel != null) {
                // This feature value is represented in the database, so use it
                allFeatureModelsBuilder.add(featureModel.getModel());
            } else {
                // Create a dummy model for this feature value
                // Need title, structure texts, thumbnail
                allFeatureModelsBuilder.add(ObjectSummary.builder().setCollectionId(COLLECTION_ID)
                        .setInstitutionId(COLLECTION_ID.getInstitutionId()).setModelMetadata(modelMetadata)
                        .setStructureTexts(ImmutableMap.of(currentFeatureName, feature.getDisplayName()))
                        .setTitle(feature.getDisplayName()).setImage(PLACEHOLDER_IMAGE).build());
            }
        }
        availableFeatureModels = allFeatureModelsBuilder.build();

        __refreshView();
    }

    private void __navigateToFeature(final String featureName) {
        try {
            UI.getCurrent().getNavigator().navigateTo(
                    WizardFeatureView.NAME + '/' + URLEncoder.encode(featureName, Charsets.UTF_8.toString()));
        } catch (final UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }

    private void __navigateToFinish() {
        GuiUI.navigateTo(ObjectQuery.builder()
                .setStructureTexts(ImmutableMap.copyOf(selectedFeatureValuesByFeatureName)).build());
    }

    private void __refreshView() {
        ImmutableList<String> currentSelectedFeatureValues = selectedFeatureValuesByFeatureName.get(currentFeatureName);
        if (currentSelectedFeatureValues == null) {
            currentSelectedFeatureValues = ImmutableList.of();
        }

        _getView().setModels(ImmutableMap.copyOf(selectedFeatureValuesByFeatureName), availableFeatureModels,
                currentFeatureName, ImmutableSet.copyOf(currentSelectedFeatureValues));
    }

    private void __updateSelectedFeatureValues() {
        final ImmutableSet<String> currentSelectedFeatureValues = _getView().getSelectedFeatureValues();
        if (!currentSelectedFeatureValues.isEmpty()) {
            this.selectedFeatureValuesByFeatureName.put(currentFeatureName,
                    ImmutableList.copyOf(currentSelectedFeatureValues));
        } else {
            this.selectedFeatureValuesByFeatureName.remove(currentFeatureName);
        }
    }

    private ImmutableList<ObjectSummary> availableFeatureModels;
    private String currentFeatureName = "";
    private int currentFeatureIndex = -1;
    private final ObjectSummaryQueryService objectSummaryQueryService;
    private final Map<String, ImmutableList<String>> selectedFeatureValuesByFeatureName = new LinkedHashMap<>();
    private final static CollectionId COLLECTION_ID = __createCollectionId();
    private final static ImmutableList<String> FEATURE_NAMES = ImmutableList.copyOf(CostumeCore.FEATURES.keySet());
    private final static Image PLACEHOLDER_IMAGE = Image.builder()
            .setSquareThumbnail(ImageVersion.builder().setHeightPx(UnsignedInteger.valueOf(200))
                    .setUrl(Url.parse("http://lorempixel.com/200/200/animals/"))
                    .setWidthPx(UnsignedInteger.valueOf(200)).build())
            .build();
}
