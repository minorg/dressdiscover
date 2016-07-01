package org.dressdiscover.gui.presenters.wizard.query_wizard;

import org.dressdiscover.gui.events.wizard.WizardFeatureSetSelectionRequest;
import org.dressdiscover.gui.models.NameValuePairs;
import org.dressdiscover.gui.presenters.Presenter;
import org.dressdiscover.gui.views.wizard.query_wizard.QueryWizardFeatureView;
import org.dressdiscover.gui.views.wizard.query_wizard.QueryWizardStartView;
import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.UI;

import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.api.services.user.UserCommandService;
import net.lab1318.costume.api.services.user.UserQueryService;

@SessionScoped
public class QueryWizardStartPresenter extends Presenter<QueryWizardStartView> {
    @Inject
    public QueryWizardStartPresenter(final EventBus eventBus, final UserCommandService userCommandService,
            final UserQueryService userQueryService, final QueryWizardStartView view) {
        super(eventBus, userCommandService, userQueryService, view);
    }

    @Subscribe
    public void onWizardFeatureSetSelectionRequest(final WizardFeatureSetSelectionRequest event) {
        UI.getCurrent().getNavigator()
                .navigateTo(QueryWizardFeatureView.NAME + '/'
                        + new NameValuePairs(ImmutableMap.of("feature_set", event.getFeatureSetUrlName()))
                                .toUrlEncodedString());
    }

    @Override
    protected void _onViewEnter(final Optional<UserEntry> currentUser, final ViewChangeEvent event) {
        _getView().setModels();
    }
}
