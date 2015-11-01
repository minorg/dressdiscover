package net.lab1318.costume.gui.presenters.institution;

import static com.google.common.base.Preconditions.checkNotNull;

import org.notaweb.gui.EventBus;
import org.notaweb.gui.presenters.Presenter;

import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.SystemError;
import com.vaadin.server.UserError;

import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.institution.InstitutionQueryService;
import net.lab1318.costume.api.services.institution.NoSuchInstitutionException;
import net.lab1318.costume.gui.views.institution.InstitutionByIdView;

@SessionScoped
public class InstitutionByIdPresenter extends Presenter<InstitutionByIdView> {
    @Inject
    public InstitutionByIdPresenter(final EventBus eventBus, final InstitutionQueryService userQueryService,
            final InstitutionByIdView view) {
        super(eventBus, view);
        this.institutionQueryService = checkNotNull(userQueryService);
    }

    @Override
    protected void _onViewEnter(final ViewChangeEvent event) {
        InstitutionId institutionId;
        try {
            institutionId = InstitutionId.valueOf(event.getParameters().toUpperCase());
        } catch (final IllegalArgumentException e) {
            _getView().setComponentError(new UserError("no such institution " + event.getParameters()));
            return;
        }

        __refreshView(institutionId);
    }

    private void __refreshView(final InstitutionId institutionId) {
        Institution institution;
        try {
            institution = institutionQueryService.getInstitutionById(institutionId);
        } catch (final IoException e) {
            _getView().setComponentError(new SystemError("I/O exception", e));
            return;
        } catch (final NoSuchInstitutionException e) {
            _getView().setComponentError(new UserError("no such institution " + institutionId));
            return;
        }

        // _getView().setInstitutionEntry(new InstitutionEntry(institutionId,
        // institution));
    }

    private final InstitutionQueryService institutionQueryService;
}
