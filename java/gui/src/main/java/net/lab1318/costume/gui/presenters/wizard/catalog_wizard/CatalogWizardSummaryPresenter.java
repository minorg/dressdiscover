package net.lab1318.costume.gui.presenters.wizard.catalog_wizard;

import org.thryft.waf.gui.EventBus;

import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;

import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.user.UserCommandService;
import net.lab1318.costume.api.services.user.UserQueryService;
import net.lab1318.costume.gui.models.wizard.UnknownWizardFeatureException;
import net.lab1318.costume.gui.models.wizard.UnknownWizardFeatureSetException;
import net.lab1318.costume.gui.models.wizard.WizardFeature;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSet;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSetFactories;
import net.lab1318.costume.gui.models.wizard.WizardMode;
import net.lab1318.costume.gui.presenters.NamedPresenterParameters;
import net.lab1318.costume.gui.presenters.wizard.AbstractWizardSummaryPresenter;
import net.lab1318.costume.gui.views.wizard.catalog_wizard.CatalogWizardSummaryView;

@SessionScoped
public class CatalogWizardSummaryPresenter
        extends AbstractWizardSummaryPresenter<CatalogWizardSummaryPresenter.Parameters, CatalogWizardSummaryView> {
    public final static class Parameters extends AbstractWizardSummaryPresenter.Parameters {
        protected Parameters(final WizardFeatureSet featureSet) {
            super(featureSet);
        }
    }

    @Inject
    public CatalogWizardSummaryPresenter(final EventBus eventBus, final WizardFeatureSetFactories featureSetFactories,
            final UserCommandService userCommandService, final UserQueryService userQueryService,
            final CatalogWizardSummaryView view) {
        super(eventBus, featureSetFactories, WizardMode.CATALOG, userCommandService, userQueryService, view);
    }

    @Override
    protected void _navigateToFeature(final WizardFeature feature, final WizardFeatureSet featureSet) {
        CatalogWizardFeaturePresenter
                .navigateToFeature(new CatalogWizardFeaturePresenter.Parameters(feature, featureSet));
    }

    @Override
    protected Parameters _parseParameters(final NamedPresenterParameters parameters)
            throws IoException, UnknownWizardFeatureException, UnknownWizardFeatureSetException {
        return new Parameters(_parseFeatureSetParameter(parameters));
    }
}
