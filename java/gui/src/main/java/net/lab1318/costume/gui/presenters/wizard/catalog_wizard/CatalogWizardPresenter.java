package net.lab1318.costume.gui.presenters.wizard.catalog_wizard;

import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.api.services.user.UserCommandService;
import net.lab1318.costume.api.services.user.UserQueryService;
import net.lab1318.costume.gui.presenters.Presenter;
import net.lab1318.costume.gui.views.wizard.catalog_wizard.CatalogWizardView;

@SessionScoped
public class CatalogWizardPresenter extends Presenter<CatalogWizardView> {
    @Inject
    public CatalogWizardPresenter(final EventBus eventBus, final UserCommandService userCommandService,
            final UserQueryService userQueryService, final CatalogWizardView view) {
        super(eventBus, userCommandService, userQueryService, view);
    }

    @Override
    protected void _onViewEnter(final Optional<UserEntry> currentUser, final ViewChangeEvent event) {
        _getView().setModels();
    }
}
