package net.lab1318.costume.gui.presenters.wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
import com.google.common.eventbus.Subscribe;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.SystemError;
import com.vaadin.server.UserError;

import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.user.UserCommandService;
import net.lab1318.costume.api.services.user.UserQueryService;
import net.lab1318.costume.gui.events.wizard.WizardFeatureGotoRequest;
import net.lab1318.costume.gui.models.wizard.UnknownWizardFeatureSetException;
import net.lab1318.costume.gui.models.wizard.WizardFeature;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSet;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSetFactories;
import net.lab1318.costume.gui.models.wizard.WizardMode;
import net.lab1318.costume.gui.presenters.Presenter;
import net.lab1318.costume.gui.views.wizard.AbstractWizardSummaryView;

public abstract class AbstractWizardSummaryPresenter<ViewT extends AbstractWizardSummaryView> extends Presenter<ViewT> {
    protected AbstractWizardSummaryPresenter(final EventBus eventBus,
            final WizardFeatureSetFactories featureSetFactories, final WizardMode mode,
            final UserCommandService userCommandService, final UserQueryService userQueryService, final ViewT view) {
        super(eventBus, userCommandService, userQueryService, view);
        this.featureSetFactories = checkNotNull(featureSetFactories);
        this.mode = checkNotNull(mode);
    }

    @Subscribe
    public final void onWizardFeatureGotoRequest(final WizardFeatureGotoRequest event) {
        _navigateToFeature(event.getFeatureSet().getFeatureByName(event.getFeatureName()), event.getFeatureSet());
    }

    protected abstract void _navigateToFeature(final WizardFeature feature, final WizardFeatureSet featureSet);

    @Override
    protected final void _onViewEnter(final Optional<UserEntry> currentUser, final ViewChangeEvent event) {
        WizardFeatureSet featureSet;
        try {
            featureSet = featureSetFactories.createFeatureSetFromUrlEncodedString(mode, event.getParameters());
        } catch (final IoException e) {
            _getView().setComponentError(new SystemError("I/O exception", e));
            return;
        } catch (final UnknownWizardFeatureSetException e) {
            _getView().setComponentError(new UserError(e.getMessage()));
            return;
        }

        _getView().setModels(featureSet);
    }

    private final WizardFeatureSetFactories featureSetFactories;
    private final WizardMode mode;
}
