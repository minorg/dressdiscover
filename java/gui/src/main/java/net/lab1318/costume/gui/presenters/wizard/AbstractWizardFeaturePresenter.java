package net.lab1318.costume.gui.presenters.wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.thryft.waf.gui.EventBus;
import org.thryft.waf.gui.views.View;

import com.google.common.base.Charsets;
import com.google.common.base.Optional;
import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.SystemError;
import com.vaadin.server.UserError;

import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.user.UserCommandService;
import net.lab1318.costume.api.services.user.UserQueryService;
import net.lab1318.costume.gui.events.wizard.WizardFeatureBackRequest;
import net.lab1318.costume.gui.events.wizard.WizardFeatureFinishRequest;
import net.lab1318.costume.gui.events.wizard.WizardFeatureGotoRequest;
import net.lab1318.costume.gui.events.wizard.WizardFeatureNextRequest;
import net.lab1318.costume.gui.events.wizard.WizardFeatureRefreshRequest;
import net.lab1318.costume.gui.models.wizard.UnknownWizardFeatureSetException;
import net.lab1318.costume.gui.models.wizard.WizardFeature;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSet;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSetFactories;
import net.lab1318.costume.gui.models.wizard.WizardMode;
import net.lab1318.costume.gui.presenters.Presenter;

@SessionScoped
public abstract class AbstractWizardFeaturePresenter<ViewT extends View> extends Presenter<ViewT> {
    @Inject
    protected AbstractWizardFeaturePresenter(final EventBus eventBus,
            final WizardFeatureSetFactories featureSetFactories, final WizardMode mode,
            final UserCommandService userCommandService, final UserQueryService userQueryService, final ViewT view) {
        super(eventBus, userCommandService, userQueryService, view);
        this.mode = checkNotNull(mode);
        this.featureSetFactories = checkNotNull(featureSetFactories);
    }

    @Subscribe
    public final void onWizardFeatureBackRequest(final WizardFeatureBackRequest event) {
        if (event.getCurrentFeature().getPreviousFeature().isPresent()) {
            _navigateToFeature(event.getCurrentFeature().getPreviousFeature().get(), event.getFeatureSet());
        }
    }

    @Subscribe
    public final void onWizardFeatureFinishRequest(final WizardFeatureFinishRequest event) {
        _navigateToSummary(event.getFeatureSet());
    }

    @Subscribe
    public final void onWizardFeatureGotoRequest(final WizardFeatureGotoRequest event) {
        _navigateToFeature(event.getFeatureSet().getFeatureByName(event.getFeatureName()), event.getFeatureSet());
    }

    @Subscribe
    public final void onWizardFeatureNextRequest(final WizardFeatureNextRequest event) {
        if (event.getCurrentFeature().getNextFeature().isPresent()) {
            _navigateToFeature(event.getCurrentFeature().getNextFeature().get(), event.getFeatureSet());
        } else {
            _navigateToSummary(event.getFeatureSet());
        }
    }

    @Subscribe
    public final void onWizardFeatureRefreshEvent(final WizardFeatureRefreshRequest event) {
        _navigateToFeature(event.getCurrentFeature(), event.getFeatureSet());
    }

    protected abstract void _navigateToFeature(final WizardFeature feature, final WizardFeatureSet featureSet);

    protected abstract void _navigateToSummary(final WizardFeatureSet featureSet);

    @Override
    protected final void _onViewEnter(final Optional<UserEntry> currentUser, final ViewChangeEvent event) {
        if (event.getParameters().isEmpty()) {
            _getView().setComponentError(new UserError("missing feature set"));
            return;
        }

        final String[] parametersSplit = event.getParameters().split("/", 2);
        WizardFeatureSet featureSet;
        try {
            featureSet = featureSetFactories.createFeatureSetFromUrlString(mode, parametersSplit[0]);
        } catch (final IoException e) {
            _getView().setComponentError(new SystemError("I/O exception", e));
            return;
        } catch (final UnknownWizardFeatureSetException e) {
            _getView().setComponentError(new UserError(e.getMessage()));
            return;
        }

        String featureName;
        try {
            featureName = parametersSplit.length >= 2 ? URLDecoder.decode(parametersSplit[1], Charsets.UTF_8.name())
                    : "";
        } catch (final UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
        if (featureName.isEmpty()) {
            _navigateToFeature(featureSet.getFeatures().get(0), featureSet);
            return;
        }

        WizardFeature currentFeature;
        try {
            currentFeature = featureSet.getFeatureByName(featureName);
        } catch (final IllegalArgumentException e) {
            _getView().setComponentError(new UserError("no such feature " + featureName));
            return;
        }

        _refreshView(currentFeature, featureSet);
    }

    protected abstract void _refreshView(final WizardFeature currentFeature, final WizardFeatureSet featureSet);

    private final WizardFeatureSetFactories featureSetFactories;
    private final WizardMode mode;
}
