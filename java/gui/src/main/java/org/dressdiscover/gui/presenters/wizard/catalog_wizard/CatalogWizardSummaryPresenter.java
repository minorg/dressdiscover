package org.dressdiscover.gui.presenters.wizard.catalog_wizard;

import org.dressdiscover.gui.models.NameValuePairs;
import org.dressdiscover.gui.models.wizard.UnknownWizardFeatureException;
import org.dressdiscover.gui.models.wizard.UnknownWizardFeatureSetException;
import org.dressdiscover.gui.models.wizard.WizardFeature;
import org.dressdiscover.gui.models.wizard.WizardFeatureSetFactories;
import org.dressdiscover.gui.models.wizard.WizardMode;
import org.dressdiscover.gui.models.wizard.catalog_wizard.CatalogWizardState;
import org.dressdiscover.gui.presenters.wizard.AbstractWizardSummaryPresenter;
import org.dressdiscover.gui.views.wizard.catalog_wizard.CatalogWizardFeatureView;
import org.dressdiscover.gui.views.wizard.catalog_wizard.CatalogWizardSummaryView;
import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.ui.UI;

import net.lab1318.costume.api.models.object.InvalidObjectIdException;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.user.UserCommandService;
import net.lab1318.costume.api.services.user.UserQueryService;

@SessionScoped
public class CatalogWizardSummaryPresenter
        extends AbstractWizardSummaryPresenter<CatalogWizardState, CatalogWizardSummaryView> {
    @Inject
    public CatalogWizardSummaryPresenter(final EventBus eventBus, final WizardFeatureSetFactories featureSetFactories,
            final UserCommandService userCommandService, final UserQueryService userQueryService,
            final CatalogWizardSummaryView view) {
        super(eventBus, featureSetFactories, WizardMode.CATALOG, userCommandService, userQueryService, view);
    }

    @Override
    protected void _navigateToFeature(final WizardFeature feature, final CatalogWizardState state) {
        UI.getCurrent().getNavigator()
                .navigateTo(CatalogWizardFeatureView.NAME + '/'
                        + new CatalogWizardState(Optional.of(feature), state.getFeatureSet(), state.getObjectId())
                                .toNameValuePairs().toUrlEncodedString());
    }

    @Override
    protected CatalogWizardState _parseParameters(final NameValuePairs parameters) throws InvalidObjectIdException,
            IoException, UnknownWizardFeatureException, UnknownWizardFeatureSetException {
        return CatalogWizardState.fromNameValuePairs(_getFeatureSetFactories(), _getMode(), parameters);
    }
}
