package net.lab1318.costume.gui.presenters.wizard;

import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;

import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.api.services.user.UserCommandService;
import net.lab1318.costume.api.services.user.UserQueryService;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSetFactories;
import net.lab1318.costume.gui.models.wizard.WizardMode;
import net.lab1318.costume.gui.models.wizard.WizardState;
import net.lab1318.costume.gui.views.wizard.AbstractWizardSummaryView;

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
