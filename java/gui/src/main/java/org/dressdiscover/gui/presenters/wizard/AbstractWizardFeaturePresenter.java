package org.dressdiscover.gui.presenters.wizard;

import org.dressdiscover.gui.events.wizard.WizardFeatureBackRequest;
import org.dressdiscover.gui.events.wizard.WizardFeatureFinishRequest;
import org.dressdiscover.gui.events.wizard.WizardFeatureNextRequest;
import org.dressdiscover.gui.events.wizard.WizardFeatureRefreshRequest;
import org.dressdiscover.gui.models.wizard.WizardFeatureSetFactories;
import org.dressdiscover.gui.models.wizard.WizardMode;
import org.dressdiscover.gui.models.wizard.WizardState;
import org.thryft.waf.gui.EventBus;
import org.thryft.waf.gui.views.View;

import com.google.common.eventbus.Subscribe;

import org.dressdiscover.api.services.user.UserCommandService;
import org.dressdiscover.api.services.user.UserQueryService;

public abstract class AbstractWizardFeaturePresenter<StateT extends WizardState, ViewT extends View>
        extends AbstractWizardPresenter<StateT, ViewT> {
    protected AbstractWizardFeaturePresenter(final EventBus eventBus,
            final WizardFeatureSetFactories featureSetFactories, final WizardMode mode,
            final UserCommandService userCommandService, final UserQueryService userQueryService, final ViewT view) {
        super(eventBus, featureSetFactories, mode, userCommandService, userQueryService, view);
    }

    @SuppressWarnings("unchecked")
    @Subscribe
    public final void onWizardFeatureBackRequest(final WizardFeatureBackRequest event) {
        if (event.getState().getCurrentFeature().get().getPreviousFeature().isPresent()) {
            _navigateToFeature(event.getState().getCurrentFeature().get().getPreviousFeature().get(),
                    (StateT) event.getState());
        }
    }

    @SuppressWarnings("unchecked")
    @Subscribe
    public final void onWizardFeatureFinishRequest(final WizardFeatureFinishRequest event) {
        _navigateToSummary((StateT) event.getState());
    }

    @SuppressWarnings("unchecked")
    @Subscribe
    public final void onWizardFeatureNextRequest(final WizardFeatureNextRequest event) {
        if (event.getState().getCurrentFeature().get().getNextFeature().isPresent()) {
            _navigateToFeature(event.getState().getCurrentFeature().get().getNextFeature().get(),
                    (StateT) event.getState());
        } else {
            _navigateToSummary((StateT) event.getState());
        }
    }

    @SuppressWarnings("unchecked")
    @Subscribe
    public final void onWizardFeatureRefreshEvent(final WizardFeatureRefreshRequest event) {
        _navigateToFeature(event.getState().getCurrentFeature().get(), (StateT) event.getState());
    }

    protected abstract void _navigateToSummary(final StateT state);
}
