package net.lab1318.costume.gui.presenters.institution;

import static com.google.common.base.Preconditions.checkNotNull;

import org.notaweb.gui.EventBus;
import org.notaweb.gui.presenters.Presenter;

import com.google.common.collect.ImmutableList;
import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.SystemError;
import com.vaadin.server.UserError;
import com.vaadin.ui.UI;

import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.models.institution.InvalidInstitutionIdException;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.collection.CollectionQueryService;
import net.lab1318.costume.api.services.collection.CollectionQueryService.Messages.GetCollectionByIdRequest;
import net.lab1318.costume.api.services.institution.InstitutionQueryService;
import net.lab1318.costume.api.services.institution.NoSuchInstitutionException;
import net.lab1318.costume.gui.views.collection.CollectionByIdView;
import net.lab1318.costume.gui.views.institution.InstitutionByIdView;

@SessionScoped
public class InstitutionByIdPresenter extends Presenter<InstitutionByIdView> {
    @Inject
    public InstitutionByIdPresenter(final CollectionQueryService collectionQueryService, final EventBus eventBus,
            final InstitutionQueryService institutionQueryService, final InstitutionByIdView view) {
        super(eventBus, view);
        this.collectionQueryService = checkNotNull(collectionQueryService);
        this.institutionQueryService = checkNotNull(institutionQueryService);
    }

    @Subscribe
    public void onGetCollectionByIdRequest(final GetCollectionByIdRequest request) {
        UI.getCurrent().getNavigator().navigateTo(CollectionByIdView.NAME + "/" + request.getId().toString());
    }

    @Override
    protected void _onViewEnter(final ViewChangeEvent event) {
        InstitutionId institutionId;
        try {
            institutionId = InstitutionId.parse(event.getParameters().toUpperCase());
        } catch (final InvalidInstitutionIdException e) {
            _getView().setComponentError(new UserError("no such institution " + event.getParameters()));
            return;
        }

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

        ImmutableList<CollectionEntry> collections;
        try {
            collections = collectionQueryService.getCollectionsByInstitutionId(institutionId);
        } catch (final IoException e) {
            _getView().setComponentError(new SystemError("I/O exception", e));
            return;
        }

        _getView().setModels(collections, new InstitutionEntry(institutionId, institution));
    }

    private final CollectionQueryService collectionQueryService;
    private final InstitutionQueryService institutionQueryService;
}
