package org.dressdiscover.gui.presenters.wizard.query_wizard;

import org.dressdiscover.gui.models.NameValuePairs;
import org.dressdiscover.gui.models.wizard.UnknownWizardFeatureException;
import org.dressdiscover.gui.models.wizard.UnknownWizardFeatureSetException;
import org.dressdiscover.gui.models.wizard.WizardFeature;
import org.dressdiscover.gui.models.wizard.WizardFeatureSetFactories;
import org.dressdiscover.gui.models.wizard.WizardMode;
import org.dressdiscover.gui.models.wizard.query_wizard.QueryWizardState;
import org.dressdiscover.gui.presenters.wizard.AbstractWizardSummaryPresenter;
import org.dressdiscover.gui.views.wizard.catalog_wizard.CatalogWizardFeatureView;
import org.dressdiscover.gui.views.wizard.query_wizard.QueryWizardSummaryView;
import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.ui.UI;

import org.dressdiscover.api.services.IoException;
import org.dressdiscover.api.services.user.UserCommandService;
import org.dressdiscover.api.services.user.UserQueryService;

@SessionScoped
public class QueryWizardSummaryPresenter
        extends AbstractWizardSummaryPresenter<QueryWizardState, QueryWizardSummaryView> {
    @Inject
    public QueryWizardSummaryPresenter(final EventBus eventBus, final WizardFeatureSetFactories featureSetFactories,
            final UserCommandService userCommandService, final UserQueryService userQueryService,
            final QueryWizardSummaryView view) {
        super(eventBus, featureSetFactories, WizardMode.QUERY, userCommandService, userQueryService, view);
    }

    @Override
    protected void _navigateToFeature(final WizardFeature feature, final QueryWizardState state) {
        UI.getCurrent().getNavigator()
                .navigateTo(CatalogWizardFeatureView.NAME + '/'
                        + new QueryWizardState(Optional.of(feature), state.getFeatureSet()).toNameValuePairs()
                                .toUrlEncodedString());
    }

    @Override
    protected QueryWizardState _parseParameters(final NameValuePairs parameters)
            throws IoException, UnknownWizardFeatureException, UnknownWizardFeatureSetException {
        return QueryWizardState.fromNameValuePairs(_getFeatureSetFactories(), parameters);
    }
}
