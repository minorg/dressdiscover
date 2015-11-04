package net.lab1318.costume.gui.presenters.institution;

import org.notaweb.gui.EventBus;
import org.notaweb.gui.presenters.Presenter;

import com.google.common.collect.ImmutableList;
import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.SystemError;
import com.vaadin.ui.UI;

import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.institution.InstitutionQueryService;
import net.lab1318.costume.api.services.institution.InstitutionQueryService.Messages.GetInstitutionByIdRequest;
import net.lab1318.costume.gui.views.institution.InstitutionByIdView;
import net.lab1318.costume.gui.views.institution.InstitutionsView;

@SessionScoped
public class InstitutionsPresenter extends Presenter<InstitutionsView> {
    @Inject
    public InstitutionsPresenter(final EventBus eventBus, final Injector injector, final InstitutionsView view) {
        super(eventBus, view);
        institutionQueryService = injector.getInstance(InstitutionQueryService.class);
    }

    @Subscribe
    public void onGetInstitutionByIdRequest(final GetInstitutionByIdRequest request) {
        UI.getCurrent().getNavigator()
                .navigateTo(InstitutionByIdView.NAME + "/" + request.getId().name().toLowerCase());
    }

    @Override
    protected void _onViewEnter(final ViewChangeEvent event) {
        final ImmutableList<InstitutionEntry> institutions;
        try {
            institutions = institutionQueryService.getInstitutions();
        } catch (final IoException e) {
            _getView().setComponentError(new SystemError("I/O exception", e));
            return;
        }
        _getView().setModels(institutions);
    }

    private final InstitutionQueryService institutionQueryService;
}
