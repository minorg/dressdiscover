package net.lab1318.costume.gui.presenters.wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import org.thryft.waf.gui.EventBus;
import org.thryft.waf.gui.views.View;

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
import net.lab1318.costume.gui.models.NameValuePairs;
import net.lab1318.costume.gui.models.wizard.UnknownWizardFeatureException;
import net.lab1318.costume.gui.models.wizard.UnknownWizardFeatureSetException;
import net.lab1318.costume.gui.models.wizard.WizardFeature;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSet;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSetFactories;
import net.lab1318.costume.gui.models.wizard.WizardMode;
import net.lab1318.costume.gui.models.wizard.WizardState;
import net.lab1318.costume.gui.presenters.Presenter;

public abstract class AbstractWizardPresenter<StateT extends WizardState, ViewT extends View> extends Presenter<ViewT> {
    protected AbstractWizardPresenter(final EventBus eventBus, final WizardFeatureSetFactories featureSetFactories,
            final WizardMode mode, final UserCommandService userCommandService, final UserQueryService userQueryService,
            final ViewT view) {
        super(eventBus, userCommandService, userQueryService, view);
        this.mode = checkNotNull(mode);
        this.featureSetFactories = checkNotNull(featureSetFactories);
    }

    @SuppressWarnings("unchecked")
    @Subscribe
    public final void onWizardFeatureGotoRequest(final WizardFeatureGotoRequest event) {
        try {
            _navigateToFeature(event.getState().getFeatureSet().getFeatureByName(event.getFeatureName()),
                    (StateT) event.getState());
        } catch (final UnknownWizardFeatureException e) {
            _getView().setComponentError(new UserError(e.getMessage()));
            return;
        }
    }

    protected final WizardFeatureSetFactories _getFeatureSetFactories() {
        return featureSetFactories;
    }

    protected final WizardMode _getMode() {
        return mode;
    }

    protected abstract void _navigateToFeature(final WizardFeature feature, final StateT state);

    protected abstract void _onViewEnter(Optional<UserEntry> currentUser, StateT state);

    @Override
    protected final void _onViewEnter(final Optional<UserEntry> currentUser, final ViewChangeEvent event) {
        final StateT parameters;
        try {
            parameters = _parseParameters(NameValuePairs.fromUrlEncodedString(event.getParameters()));
        } catch (final IoException e) {
            _getView().setComponentError(new SystemError("I/O exception", e));
            return;
        } catch (final UnknownWizardFeatureException | UnknownWizardFeatureSetException e) {
            _getView().setComponentError(new UserError(e.getMessage()));
            return;
        }

        _onViewEnter(currentUser, parameters);
    }

    protected final WizardFeatureSet _parseFeatureSetParameter(final NameValuePairs parameters)
            throws IoException, UnknownWizardFeatureSetException {
        final Optional<String> featureSetName = parameters.getFirst("feature_set");
        if (!featureSetName.isPresent()) {
            throw new UnknownWizardFeatureSetException("missing feature set");
        }

        return featureSetFactories.createFeatureSetFromUrlEncodedString(mode, featureSetName.get());
    }

    protected abstract StateT _parseParameters(final NameValuePairs parameters)
            throws IoException, UnknownWizardFeatureException, UnknownWizardFeatureSetException;

    private final WizardFeatureSetFactories featureSetFactories;
    private final WizardMode mode;
}
