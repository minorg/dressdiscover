package net.lab1318.costume.gui.presenters.wizard.query_wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.common.primitives.UnsignedInteger;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.server.SystemError;
import com.vaadin.ui.UI;

import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.object.GetObjectSummariesOptions;
import net.lab1318.costume.api.services.object.ObjectSummaryQueryService;
import net.lab1318.costume.api.services.user.UserCommandService;
import net.lab1318.costume.api.services.user.UserQueryService;
import net.lab1318.costume.gui.models.wizard.WizardFeature;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSet;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSetFactories;
import net.lab1318.costume.gui.models.wizard.WizardMode;
import net.lab1318.costume.gui.presenters.wizard.AbstractWizardFeaturePresenter;
import net.lab1318.costume.gui.views.wizard.query_wizard.QueryWizardFeatureView;
import net.lab1318.costume.gui.views.wizard.query_wizard.QueryWizardSummaryView;

@SessionScoped
public class QueryWizardFeaturePresenter extends AbstractWizardFeaturePresenter<QueryWizardFeatureView> {
    static void navigateToFeature(final WizardFeature feature, final WizardFeatureSet featureSet) {
        UI.getCurrent().getNavigator()
                .navigateTo(QueryWizardFeatureView.NAME + '/'
                        + new NamedParameters(ImmutableMap.of("feature", feature.getName(), "feature_set",
                                featureSet.getSelectedAsUrlEncodedString())).toUrlEncodedString());
    }

    @Inject
    public QueryWizardFeaturePresenter(final EventBus eventBus, final WizardFeatureSetFactories featureSetFactories,
            final ObjectSummaryQueryService objectSummaryQueryService, final UserCommandService userCommandService,
            final UserQueryService userQueryService, final QueryWizardFeatureView view) {
        super(eventBus, featureSetFactories, WizardMode.QUERY, userCommandService, userQueryService, view);
        this.objectSummaryQueryService = checkNotNull(objectSummaryQueryService);
    }

    @Override
    protected final void _navigateToFeature(final WizardFeature feature, final WizardFeatureSet featureSet) {
        navigateToFeature(feature, featureSet);
    }

    @Override
    protected final void _navigateToSummary(final WizardFeatureSet featureSet) {
        UI.getCurrent().getNavigator()
                .navigateTo(QueryWizardSummaryView.NAME + "/" + featureSet.getSelectedAsUrlEncodedString());
    }

    @Override
    protected final void _refreshView(final WizardFeature currentFeature, final WizardFeatureSet featureSet,
            final NamedParameters parameters) {
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

    private final ObjectSummaryQueryService objectSummaryQueryService;
    final static Optional<GetObjectSummariesOptions> GET_OBJECT_COUNT_OPTIONS = Optional
            .of(GetObjectSummariesOptions.builder().setSize(UnsignedInteger.ZERO).build());
}
