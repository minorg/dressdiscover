package net.lab1318.costume.gui.presenters.wizard.query_wizard;

import org.thryft.waf.gui.EventBus;

import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;

import net.lab1318.costume.api.services.user.UserCommandService;
import net.lab1318.costume.api.services.user.UserQueryService;
import net.lab1318.costume.gui.models.wizard.WizardFeature;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSet;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSetFactories;
import net.lab1318.costume.gui.models.wizard.WizardMode;
import net.lab1318.costume.gui.presenters.wizard.AbstractWizardSummaryPresenter;
import net.lab1318.costume.gui.views.wizard.query_wizard.QueryWizardSummaryView;

@SessionScoped
public class QueryWizardSummaryPresenter extends AbstractWizardSummaryPresenter<QueryWizardSummaryView> {
    @Inject
    public QueryWizardSummaryPresenter(final EventBus eventBus, final WizardFeatureSetFactories featureSetFactories,
            final UserCommandService userCommandService, final UserQueryService userQueryService,
            final QueryWizardSummaryView view) {
        super(eventBus, featureSetFactories, WizardMode.QUERY, userCommandService, userQueryService, view);
    }

    @Override
    protected void _navigateToFeature(final WizardFeature feature, final WizardFeatureSet featureSet) {
        QueryWizardFeaturePresenter.navigateToFeature(feature, featureSet);
    }
}
