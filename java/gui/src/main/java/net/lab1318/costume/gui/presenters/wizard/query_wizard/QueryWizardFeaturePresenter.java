package net.lab1318.costume.gui.presenters.wizard.query_wizard;

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
import net.lab1318.costume.gui.models.wizard.WizardFeature;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSet;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSetFactories;
import net.lab1318.costume.gui.models.wizard.WizardMode;
import net.lab1318.costume.gui.presenters.Presenter;
import net.lab1318.costume.gui.views.wizard.query_wizard.QueryWizardFeatureView;
import net.lab1318.costume.gui.views.wizard.query_wizard.QueryWizardSummaryView;

@SessionScoped
public class QueryWizardFeaturePresenter extends Presenter<QueryWizardFeatureView> {
    @Inject
    public QueryWizardFeaturePresenter(final EventBus eventBus, final WizardFeatureSetFactories featureSetFactories,
            final ObjectSummaryQueryService objectSummaryQueryService, final UserCommandService userCommandService,
            final UserQueryService userQueryService, final QueryWizardFeatureView view) {
        super(eventBus, userCommandService, userQueryService, view);
        this.featureSetFactories = checkNotNull(featureSetFactories);
        this.objectSummaryQueryService = checkNotNull(objectSummaryQueryService);
    }

    @Subscribe
    public void onWizardFeatureBackRequest(final WizardFeatureBackRequest event) {
        if (event.getCurrentFeature().getPreviousFeature().isPresent()) {
            __navigateToFeature(event.getCurrentFeature().getPreviousFeature().get(), event.getFeatureSet());
        }
    }

    @Subscribe
    public void onWizardFeatureFinishRequest(final WizardFeatureFinishRequest event) {
        __navigateToFinish(event.getFeatureSet());
    }

    @Subscribe
    public void onWizardFeatureGotoRequest(final WizardFeatureGotoRequest event) {
        __navigateToFeature(event.getFeatureSet().getFeatureByName(event.getFeatureName()), event.getFeatureSet());
    }

    @Subscribe
    public void onWizardFeatureNextRequest(final WizardFeatureNextRequest event) {
        if (event.getCurrentFeature().getNextFeature().isPresent()) {
            __navigateToFeature(event.getCurrentFeature().getNextFeature().get(), event.getFeatureSet());
        } else {
            __navigateToFinish(event.getFeatureSet());
        }
    }

    @Subscribe
    public void onWizardFeatureRefreshEvent(final WizardFeatureRefreshRequest event) {
        __refreshView(event.getCurrentFeature(), event.getFeatureSet());
    }

    @Override
    protected void _onViewEnter(final Optional<UserEntry> currentUser, final ViewChangeEvent event) {
        if (event.getParameters().isEmpty()) {
            _getView().setComponentError(new UserError("missing feature set"));
            return;
        }

        final String[] parametersSplit = event.getParameters().split("/", 2);
        WizardFeatureSet featureSet;
        try {
            featureSet = featureSetFactories.createFeatureSetFromUrlString(WizardMode.QUERY, parametersSplit[0]);
        } catch (final IllegalArgumentException e) {
            _getView().setComponentError(new UserError(e.getMessage()));
            return;
        } catch (final IoException e) {
            _getView().setComponentError(new SystemError("I/O exception", e));
            return;
        }

        String featureName;
        try {
            featureName = parametersSplit.length >= 2 ? URLDecoder.decode(parametersSplit[1], Charsets.UTF_8.name())
                    : "";
        } catch (final UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
        if (featureName.isEmpty()) {
            __navigateToFeature(featureSet.getFeatures().get(0), featureSet);
            return;
        }

        WizardFeature currentFeature;
        try {
            currentFeature = featureSet.getFeatureByName(featureName);
        } catch (final IllegalArgumentException e) {
            _getView().setComponentError(new UserError("no such feature " + featureName));
            return;
        }

        __refreshView(currentFeature, featureSet);
    }

    private void __navigateToFeature(final WizardFeature feature, final WizardFeatureSet featureSet) {
        try {
            UI.getCurrent().getNavigator().navigateTo(QueryWizardFeatureView.NAME + '/' + featureSet.toUrlString() + '/'
                    + URLEncoder.encode(feature.getName(), Charsets.UTF_8.toString()));
        } catch (final UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }

    private void __navigateToFinish(final WizardFeatureSet featureSet) {
        UI.getCurrent().getNavigator().navigateTo(QueryWizardSummaryView.NAME + "/" + featureSet.toUrlString());
    }

    private void __refreshView(final WizardFeature currentFeature, final WizardFeatureSet featureSet) {
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

    private final WizardFeatureSetFactories featureSetFactories;
    private final ObjectSummaryQueryService objectSummaryQueryService;
    final static Optional<GetObjectSummariesOptions> GET_OBJECT_COUNT_OPTIONS = Optional
            .of(GetObjectSummariesOptions.builder().setSize(UnsignedInteger.ZERO).build());
}
