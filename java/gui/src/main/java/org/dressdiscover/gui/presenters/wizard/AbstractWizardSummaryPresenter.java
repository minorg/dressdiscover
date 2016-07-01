package org.dressdiscover.gui.presenters.wizard;

import org.dressdiscover.gui.models.wizard.WizardFeatureSetFactories;
import org.dressdiscover.gui.models.wizard.WizardMode;
import org.dressdiscover.gui.models.wizard.WizardState;
import org.dressdiscover.gui.views.wizard.AbstractWizardSummaryView;
import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;

import org.dressdiscover.api.models.user.UserEntry;
import org.dressdiscover.api.services.user.UserCommandService;
import org.dressdiscover.api.services.user.UserQueryService;

public abstract class AbstractWizardSummaryPresenter<StateT extends WizardState, ViewT extends AbstractWizardSummaryView<StateT>>
        extends AbstractWizardPresenter<StateT, ViewT> {
    protected AbstractWizardSummaryPresenter(final EventBus eventBus,
            final WizardFeatureSetFactories featureSetFactories, final WizardMode mode,
            final UserCommandService userCommandService, final UserQueryService userQueryService, final ViewT view) {
        super(eventBus, featureSetFactories, mode, userCommandService, userQueryService, view);
    }

    @Override
    protected final void _onViewEnter(final Optional<UserEntry> currentUser, final StateT state) {
        _getView().setModels(state);
    }
}
