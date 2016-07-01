package org.dressdiscover.gui.presenters.home;

import org.dressdiscover.gui.presenters.Presenter;
import org.dressdiscover.gui.views.home.HomeView;
import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

import org.dressdiscover.api.models.user.UserEntry;
import org.dressdiscover.api.services.user.UserCommandService;
import org.dressdiscover.api.services.user.UserQueryService;

@SessionScoped
public class HomePresenter extends Presenter<HomeView> {
    @Inject
    public HomePresenter(final EventBus eventBus, final UserCommandService userCommandService,
            final UserQueryService userQueryService, final HomeView view) {
        super(eventBus, userCommandService, userQueryService, view);
    }

    @Override
    protected void _onViewEnter(final Optional<UserEntry> currentUser, final ViewChangeEvent event) {
        _getView().setModels();
    }
}
