package net.lab1318.costume.gui.presenters.wizard.catalog_wizard;

import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.ui.UI;

import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.user.UserCommandService;
import net.lab1318.costume.api.services.user.UserQueryService;
import net.lab1318.costume.gui.models.NameValuePairs;
import net.lab1318.costume.gui.models.wizard.UnknownWizardFeatureException;
import net.lab1318.costume.gui.models.wizard.UnknownWizardFeatureSetException;
import net.lab1318.costume.gui.models.wizard.WizardFeature;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSetFactories;
import net.lab1318.costume.gui.models.wizard.WizardMode;
import net.lab1318.costume.gui.models.wizard.catalog_wizard.CatalogWizardState;
import net.lab1318.costume.gui.presenters.wizard.AbstractWizardFeaturePresenter;
import net.lab1318.costume.gui.views.wizard.catalog_wizard.CatalogWizardFeatureView;
import net.lab1318.costume.gui.views.wizard.catalog_wizard.CatalogWizardSummaryView;

@SessionScoped
public class CatalogWizardFeaturePresenter
        extends AbstractWizardFeaturePresenter<CatalogWizardState, CatalogWizardFeatureView> {
    @Inject
    public CatalogWizardFeaturePresenter(final EventBus eventBus, final WizardFeatureSetFactories featureSetFactories,
            final UserCommandService userCommandService, final UserQueryService userQueryService,
            final CatalogWizardFeatureView view) {
        super(eventBus, featureSetFactories, WizardMode.CATALOG, userCommandService, userQueryService, view);
    }

    @Override
    protected final void _navigateToFeature(final WizardFeature feature, final CatalogWizardState state) {
        state.setCurrentFeature(feature);
        UI.getCurrent().getNavigator()
                .navigateTo(CatalogWizardFeatureView.NAME + '/' + state.toNameValuePairs().toUrlEncodedString());
    }

    @Override
    protected final void _navigateToSummary(final CatalogWizardState state) {
        state.setCurrentFeature(Optional.absent());
        UI.getCurrent().getNavigator()
                .navigateTo(CatalogWizardSummaryView.NAME + "/" + state.toNameValuePairs().toUrlEncodedString());
    }

    @Override
    protected void _onViewEnter(final Optional<UserEntry> currentUser, final CatalogWizardState state) {
        _getView().setModels(state);
    }

    @Override
    protected CatalogWizardState _parseParameters(final NameValuePairs parameters)
            throws IoException, UnknownWizardFeatureException, UnknownWizardFeatureSetException {
        return CatalogWizardState.fromNameValuePairs(_getFeatureSetFactories(), _getMode(), parameters);
    }
}
