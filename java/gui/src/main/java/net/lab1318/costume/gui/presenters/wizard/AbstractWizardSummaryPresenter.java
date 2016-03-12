package net.lab1318.costume.gui.presenters.wizard;

import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
import com.google.common.eventbus.Subscribe;
import com.vaadin.server.UserError;

import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.api.services.user.UserCommandService;
import net.lab1318.costume.api.services.user.UserQueryService;
import net.lab1318.costume.gui.events.wizard.WizardFeatureGotoRequest;
import net.lab1318.costume.gui.models.wizard.UnknownWizardFeatureException;
import net.lab1318.costume.gui.models.wizard.WizardFeature;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSet;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSetFactories;
import net.lab1318.costume.gui.models.wizard.WizardMode;
import net.lab1318.costume.gui.views.wizard.AbstractWizardSummaryView;

public abstract class AbstractWizardSummaryPresenter<ParametersT extends AbstractWizardSummaryPresenter.Parameters, ViewT extends AbstractWizardSummaryView>
        extends AbstractWizardPresenter<ParametersT, ViewT> {
    public abstract static class Parameters extends AbstractWizardPresenter.Parameters {
        protected Parameters(final WizardFeatureSet featureSet) {
            super(featureSet);
        }
    }

    protected AbstractWizardSummaryPresenter(final EventBus eventBus,
            final WizardFeatureSetFactories featureSetFactories, final WizardMode mode,
            final UserCommandService userCommandService, final UserQueryService userQueryService, final ViewT view) {
        super(eventBus, featureSetFactories, mode, userCommandService, userQueryService, view);
    }

    @Subscribe
    public final void onWizardFeatureGotoRequest(final WizardFeatureGotoRequest event) {
        try {
            _navigateToFeature(event.getFeatureSet().getFeatureByName(event.getFeatureName()), event.getFeatureSet());
        } catch (final UnknownWizardFeatureException e) {
            _getView().setComponentError(new UserError(e.getMessage()));
            return;
        }
    }

    protected abstract void _navigateToFeature(final WizardFeature feature, final WizardFeatureSet featureSet);

    @Override
    protected final void _onViewEnter(final Optional<UserEntry> currentUser, final ParametersT parameters) {
        _getView().setModels(parameters.getFeatureSet());
    }
}
