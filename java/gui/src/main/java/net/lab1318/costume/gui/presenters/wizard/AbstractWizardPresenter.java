package net.lab1318.costume.gui.presenters.wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import org.thryft.waf.gui.EventBus;
import org.thryft.waf.gui.views.View;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.SystemError;
import com.vaadin.server.UserError;

import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.user.UserCommandService;
import net.lab1318.costume.api.services.user.UserQueryService;
import net.lab1318.costume.gui.models.wizard.UnknownWizardFeatureException;
import net.lab1318.costume.gui.models.wizard.UnknownWizardFeatureSetException;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSet;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSetFactories;
import net.lab1318.costume.gui.models.wizard.WizardMode;
import net.lab1318.costume.gui.presenters.NamedPresenterParameters;
import net.lab1318.costume.gui.presenters.Presenter;

public abstract class AbstractWizardPresenter<ParametersT extends AbstractWizardPresenter.Parameters, ViewT extends View>
        extends Presenter<ViewT> {
    public abstract static class Parameters {
        protected Parameters(final WizardFeatureSet featureSet) {
            this.featureSet = checkNotNull(featureSet);
        }

        public final WizardFeatureSet getFeatureSet() {
            return featureSet;
        }

        public final NamedPresenterParameters toNamedPresenterParameters() {
            final ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
            _toMap(mapBuilder);
            return new NamedPresenterParameters(mapBuilder.build());
        }

        protected void _toMap(final ImmutableMap.Builder<String, String> builder) {
            builder.put("feature_set", featureSet.getSelectedAsUrlEncodedString());
        }

        private final WizardFeatureSet featureSet;
    }

    protected AbstractWizardPresenter(final EventBus eventBus, final WizardFeatureSetFactories featureSetFactories,
            final WizardMode mode, final UserCommandService userCommandService, final UserQueryService userQueryService,
            final ViewT view) {
        super(eventBus, userCommandService, userQueryService, view);
        this.mode = checkNotNull(mode);
        this.featureSetFactories = checkNotNull(featureSetFactories);
    }

    protected final WizardFeatureSetFactories _getFeatureSetFactories() {
        return featureSetFactories;
    }

    protected WizardMode _getMode() {
        return mode;
    }

    protected abstract void _onViewEnter(Optional<UserEntry> currentUser, ParametersT parameters);

    @Override
    protected final void _onViewEnter(final Optional<UserEntry> currentUser, final ViewChangeEvent event) {
        final ParametersT parameters;
        try {
            parameters = _parseParameters(NamedPresenterParameters.fromUrlEncodedString(event.getParameters()));
        } catch (final IoException e) {
            _getView().setComponentError(new SystemError("I/O exception", e));
            return;
        } catch (final UnknownWizardFeatureException | UnknownWizardFeatureSetException e) {
            _getView().setComponentError(new UserError(e.getMessage()));
            return;
        }

        _onViewEnter(currentUser, parameters);
    }

    protected final WizardFeatureSet _parseFeatureSetParameter(final NamedPresenterParameters parameters)
            throws IoException, UnknownWizardFeatureSetException {
        final Optional<String> featureSetName = parameters.getFirst("feature_set");
        if (!featureSetName.isPresent()) {
            throw new UnknownWizardFeatureSetException("missing feature set");
        }

        return featureSetFactories.createFeatureSetFromUrlEncodedString(mode, featureSetName.get());
    }

    protected abstract ParametersT _parseParameters(final NamedPresenterParameters parameters)
            throws IoException, UnknownWizardFeatureException, UnknownWizardFeatureSetException;

    private final WizardFeatureSetFactories featureSetFactories;
    private final WizardMode mode;
}
