package net.lab1318.costume.gui.presenters.wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import org.thryft.waf.gui.EventBus;

import com.google.common.base.Charsets;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.SystemError;
import com.vaadin.server.UserError;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.UI;

import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.collection.InvalidCollectionIdException;
import net.lab1318.costume.api.models.object.ObjectSummaryEntry;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.object.ObjectQuery;
import net.lab1318.costume.api.services.object.ObjectSummaryQueryService;
import net.lab1318.costume.gui.models.wizard.CostumeCore;
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

    @SuppressWarnings("serial")
    @Inject
    public WizardFeaturePresenter(final EventBus eventBus, final ObjectSummaryQueryService objectSummaryQueryService,
            final WizardFeatureView view) {
        super(eventBus, view);
        this.objectSummaryQueryService = checkNotNull(objectSummaryQueryService);

        _getView().getBackButton().addClickListener(new ClickListener() {
            @Override
            public void buttonClick(final ClickEvent event) {
                if (currentFeatureIndex > 0) {
                    __navigateToFeature(FEATURE_NAMES.get(currentFeatureIndex - 1));
                }
            }
        });

        _getView().getNextButton().addClickListener(new ClickListener() {
            @Override
            public void buttonClick(final ClickEvent event) {
                if (currentFeatureIndex + 1 < FEATURE_NAMES.size()) {
                    __navigateToFeature(FEATURE_NAMES.get(currentFeatureIndex + 1));
                } else {
                    throw new UnsupportedOperationException();
                }
            }
        });
    }

    @Override
    protected void _onViewEnter(final ViewChangeEvent event) {
        if (event.getParameters().isEmpty()) {
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

        ImmutableList<ObjectSummaryEntry> objectSummaryEntries;
        try {
            objectSummaryEntries = objectSummaryQueryService.getObjectSummaries(Optional.absent(),
                    Optional.of(ObjectQuery.builder().setCollectionId(COLLECTION_ID)
                            .setInstitutionId(COLLECTION_ID.getInstitutionId())
                            .setStructureTexts(ImmutableMap.of(currentFeatureName, ImmutableList.of())).build()))
                    .getHits();
        } catch (final IoException e) {
            _getView().setComponentError(new SystemError("I/O exception", e));
            return;
        }

        _getView().setModels(currentFeatureName, objectSummaryEntries);
    }

    private void __navigateToFeature(final String featureName) {
        try {
            UI.getCurrent().getNavigator()
                    .navigateTo(WizardFeatureView.NAME + '/' + URLEncoder.encode(featureName, Charsets.UTF_8.toString()));
        } catch (final UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }

    private String currentFeatureName = "";
    private int currentFeatureIndex = -1;
    private final ObjectSummaryQueryService objectSummaryQueryService;
    private final static CollectionId COLLECTION_ID = __createCollectionId();
    private final static ImmutableList<String> FEATURE_NAMES = ImmutableList.copyOf(CostumeCore.FEATURES.keySet());
}
