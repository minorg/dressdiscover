package net.lab1318.costume.gui.presenters.wizard.catalog_wizard;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.thryft.waf.gui.EventBus;

import com.google.common.base.Charsets;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.ui.UI;

import net.lab1318.costume.api.services.user.UserCommandService;
import net.lab1318.costume.api.services.user.UserQueryService;
import net.lab1318.costume.gui.models.wizard.WizardFeature;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSet;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSetFactories;
import net.lab1318.costume.gui.models.wizard.WizardMode;
import net.lab1318.costume.gui.presenters.wizard.AbstractWizardFeaturePresenter;
import net.lab1318.costume.gui.views.wizard.catalog_wizard.CatalogWizardFeatureView;
import net.lab1318.costume.gui.views.wizard.catalog_wizard.CatalogWizardSummaryView;

@SessionScoped
public class CatalogWizardFeaturePresenter extends AbstractWizardFeaturePresenter<CatalogWizardFeatureView> {
    @Inject
    public CatalogWizardFeaturePresenter(final EventBus eventBus, final WizardFeatureSetFactories featureSetFactories,
            final UserCommandService userCommandService, final UserQueryService userQueryService,
            final CatalogWizardFeatureView view) {
        super(eventBus, featureSetFactories, WizardMode.CATALOG, userCommandService, userQueryService, view);
    }

    @Override
    protected final void _navigateToFeature(final WizardFeature feature, final WizardFeatureSet featureSet) {
        try {
            UI.getCurrent().getNavigator().navigateTo(CatalogWizardFeatureView.NAME + '/' + featureSet.toUrlString()
                    + '/' + URLEncoder.encode(feature.getName(), Charsets.UTF_8.toString()));
        } catch (final UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    protected final void _navigateToSummary(final WizardFeatureSet featureSet) {
        UI.getCurrent().getNavigator().navigateTo(CatalogWizardSummaryView.NAME + "/" + featureSet.toUrlString());
    }

    @Override
    protected final void _refreshView(final WizardFeature currentFeature, final WizardFeatureSet featureSet) {
        _getView().setModels(currentFeature, featureSet);
    }
}
