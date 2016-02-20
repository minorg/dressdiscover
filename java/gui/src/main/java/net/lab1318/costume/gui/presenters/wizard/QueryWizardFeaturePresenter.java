package net.lab1318.costume.gui.presenters.wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import org.thryft.waf.gui.EventBus;

import com.google.common.base.Charsets;
import com.google.common.base.Optional;
import com.google.common.eventbus.Subscribe;
import com.google.common.primitives.UnsignedInteger;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.SystemError;
import com.vaadin.server.UserError;
import com.vaadin.ui.UI;

import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.object.GetObjectSummariesOptions;
import net.lab1318.costume.api.services.object.ObjectSummaryQueryService;
import net.lab1318.costume.api.services.user.UserCommandService;
import net.lab1318.costume.api.services.user.UserQueryService;
import net.lab1318.costume.gui.events.wizard.WizardFeatureBackRequest;
import net.lab1318.costume.gui.events.wizard.WizardFeatureFinishRequest;
import net.lab1318.costume.gui.events.wizard.WizardFeatureGotoRequest;
import net.lab1318.costume.gui.events.wizard.WizardFeatureNextRequest;
import net.lab1318.costume.gui.events.wizard.WizardFeatureRefreshRequest;
import net.lab1318.costume.gui.models.wizard.Feature;
import net.lab1318.costume.gui.models.wizard.FeatureSet;
import net.lab1318.costume.gui.models.wizard.FeatureSetFactories;
import net.lab1318.costume.gui.presenters.Presenter;
import net.lab1318.costume.gui.views.wizard.QueryWizardFeatureView;
import net.lab1318.costume.gui.views.wizard.QueryWizardSummaryView;

@SessionScoped
public class QueryWizardFeaturePresenter extends Presenter<QueryWizardFeatureView> {
    @Inject
    public QueryWizardFeaturePresenter(final EventBus eventBus, final FeatureSetFactories featureSetFactories,
            final ObjectSummaryQueryService objectSummaryQueryService, final UserCommandService userCommandService,
            final UserQueryService userQueryService, final QueryWizardFeatureView view) {
        super(eventBus, userCommandService, userQueryService, view);
        this.featureSetFactories = checkNotNull(featureSetFactories);
        this.objectSummaryQueryService = checkNotNull(objectSummaryQueryService);
    }

    @Subscribe
    public void onWizardFeatureBackRequest(final WizardFeatureBackRequest event) {
        if (currentFeature.getPreviousFeature().isPresent()) {
            __navigateToFeature(currentFeature.getPreviousFeature().get());
        }
    }

    @Subscribe
    public void onWizardFeatureFinishRequest(final WizardFeatureFinishRequest event) {
        __navigateToFinish();
    }

    @Subscribe
    public void onWizardFeatureGotoRequest(final WizardFeatureGotoRequest event) {
        __navigateToFeature(featureSet.getFeatureByName(event.getFeatureName()));
    }

    @Subscribe
    public void onWizardFeatureNextRequest(final WizardFeatureNextRequest event) {
        if (currentFeature.getNextFeature().isPresent()) {
            __navigateToFeature(currentFeature.getNextFeature().get());
        } else {
            __navigateToFinish();
        }
    }

    @Subscribe
    public void onWizardFeatureRefreshEvent(final WizardFeatureRefreshRequest event) {
        __refreshView();
    }

    @Override
    protected void _onViewEnter(final Optional<UserEntry> currentUser, final ViewChangeEvent event) {
        if (featureSet == null) {
            // TODO: check if current featureSet corresponds to desired features
            try {
                featureSet = featureSetFactories.getFeatureSetFactoryByName("costume_core").createFeatureSet();
            } catch (final IoException e) {
                _getView().setComponentError(new SystemError("I/O exception", e));
                return;
            }
        }

        if (event.getParameters().isEmpty()) {
            featureSet.resetSelected();
            __navigateToFeature(featureSet.getFeatures().get(0));
            return;
        }

        String currentFeatureName;
        try {
            currentFeatureName = URLDecoder.decode(event.getParameters(), "UTF-8");
        } catch (final UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }

        try {
            currentFeature = featureSet.getFeatureByName(currentFeatureName);
        } catch (final IllegalArgumentException e) {
            _getView().setComponentError(new UserError("no such feature " + currentFeatureName));
            return;
        }

        __refreshView();
    }

    private void __navigateToFeature(final Feature feature) {
        try {
            UI.getCurrent().getNavigator().navigateTo(QueryWizardFeatureView.NAME + '/'
                    + URLEncoder.encode(feature.getName(), Charsets.UTF_8.toString()));
        } catch (final UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }

    private void __navigateToFinish() {
        UI.getCurrent().getNavigator().navigateTo(
                QueryWizardSummaryView.NAME + "/" + _toUrlEncodedJsonString(featureSet.getSelectedAsQuery()));
    }

    private void __refreshView() {
        final UnsignedInteger selectedObjectCount;
        try {
            selectedObjectCount = objectSummaryQueryService
                    .getObjectSummaries(GET_OBJECT_COUNT_OPTIONS, Optional.of(featureSet.getSelectedAsQuery()))
                    .getTotalHits();
        } catch (final IoException e) {
            _getView().setComponentError(new SystemError("I/O exception", e));
            return;
        }

        _getView().setModels(currentFeature, featureSet, selectedObjectCount);
    }

    private Feature currentFeature = null;
    private FeatureSet featureSet = null;
    private final FeatureSetFactories featureSetFactories;
    private final ObjectSummaryQueryService objectSummaryQueryService;
    final static Optional<GetObjectSummariesOptions> GET_OBJECT_COUNT_OPTIONS = Optional
            .of(GetObjectSummariesOptions.builder().setSize(UnsignedInteger.ZERO).build());
}
