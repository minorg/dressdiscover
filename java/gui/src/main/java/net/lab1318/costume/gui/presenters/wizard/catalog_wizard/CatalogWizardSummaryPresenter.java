package net.lab1318.costume.gui.presenters.wizard.catalog_wizard;

import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.ui.UI;

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
import net.lab1318.costume.gui.presenters.wizard.AbstractWizardSummaryPresenter;
import net.lab1318.costume.gui.views.wizard.catalog_wizard.CatalogWizardFeatureView;
import net.lab1318.costume.gui.views.wizard.catalog_wizard.CatalogWizardSummaryView;

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
    protected CatalogWizardState _parseParameters(final NameValuePairs parameters)
            throws IoException, UnknownWizardFeatureException, UnknownWizardFeatureSetException {
        return new CatalogWizardState(Optional.absent(), _parseFeatureSetParameter(parameters), Optional.absent());
    }
}
