package org.dressdiscover.gui.presenters.wizard.query_wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import org.dressdiscover.gui.models.NameValuePairs;
import org.dressdiscover.gui.models.wizard.UnknownWizardFeatureException;
import org.dressdiscover.gui.models.wizard.UnknownWizardFeatureSetException;
import org.dressdiscover.gui.models.wizard.WizardFeature;
import org.dressdiscover.gui.models.wizard.WizardFeatureSetFactories;
import org.dressdiscover.gui.models.wizard.WizardMode;
import org.dressdiscover.gui.models.wizard.query_wizard.QueryWizardState;
import org.dressdiscover.gui.presenters.wizard.AbstractWizardFeaturePresenter;
import org.dressdiscover.gui.views.wizard.query_wizard.QueryWizardFeatureView;
import org.dressdiscover.gui.views.wizard.query_wizard.QueryWizardSummaryView;
import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
import com.google.common.primitives.UnsignedInteger;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.server.SystemError;
import com.vaadin.ui.UI;

import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.object.GetObjectSummariesOptions;
import net.lab1318.costume.api.services.object.ObjectSummaryQueryService;
import net.lab1318.costume.api.services.user.UserCommandService;
import net.lab1318.costume.api.services.user.UserQueryService;

@SessionScoped
public class QueryWizardFeaturePresenter
        extends AbstractWizardFeaturePresenter<QueryWizardState, QueryWizardFeatureView> {
    @Inject
    public QueryWizardFeaturePresenter(final EventBus eventBus, final WizardFeatureSetFactories featureSetFactories,
            final ObjectSummaryQueryService objectSummaryQueryService, final UserCommandService userCommandService,
            final UserQueryService userQueryService, final QueryWizardFeatureView view) {
        super(eventBus, featureSetFactories, WizardMode.QUERY, userCommandService, userQueryService, view);
        this.objectSummaryQueryService = checkNotNull(objectSummaryQueryService);
    }

    @Override
    protected final void _navigateToFeature(final WizardFeature feature, final QueryWizardState state) {
        state.setCurrentFeature(feature);
        UI.getCurrent().getNavigator()
                .navigateTo(QueryWizardFeatureView.NAME + '/' + state.toNameValuePairs().toUrlEncodedString());
    }

    @Override
    protected final void _navigateToSummary(final QueryWizardState state) {
        UI.getCurrent().getNavigator()
                .navigateTo(QueryWizardSummaryView.NAME + "/" + state.toNameValuePairs().toUrlEncodedString());
    }

    @Override
    protected void _onViewEnter(final Optional<UserEntry> currentUser, final QueryWizardState state) {
        final UnsignedInteger selectedObjectCount;
        try {
            selectedObjectCount = objectSummaryQueryService.getObjectSummaries(GET_OBJECT_COUNT_OPTIONS,
                    Optional.of(state.getFeatureSet().getSelectedAsQuery())).getTotalHits();
        } catch (final IoException e) {
            _getView().setComponentError(new SystemError("I/O exception", e));
            return;
        }

        _getView().setModels(selectedObjectCount, state);
    }

    @Override
    protected QueryWizardState _parseParameters(final NameValuePairs parameters)
            throws IoException, UnknownWizardFeatureException, UnknownWizardFeatureSetException {
        return QueryWizardState.fromNameValuePairs(_getFeatureSetFactories(), parameters);
    }

    private final ObjectSummaryQueryService objectSummaryQueryService;
    final static Optional<GetObjectSummariesOptions> GET_OBJECT_COUNT_OPTIONS = Optional
            .of(GetObjectSummariesOptions.builder().setSize(UnsignedInteger.ZERO).build());
}
