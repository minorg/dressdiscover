package net.lab1318.costume.gui.presenters.object_by_id;

import static com.google.common.base.Preconditions.checkNotNull;

import org.thryft.waf.gui.EventBus;

import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.SystemError;
import com.vaadin.server.UserError;

import net.lab1318.costume.api.models.collection.Collection;
import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.models.object.InvalidObjectIdException;
import net.lab1318.costume.api.models.object.Object;
import net.lab1318.costume.api.models.object.ObjectEntry;
import net.lab1318.costume.api.models.object.ObjectId;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.collection.CollectionQueryService;
import net.lab1318.costume.api.services.collection.NoSuchCollectionException;
import net.lab1318.costume.api.services.institution.InstitutionQueryService;
import net.lab1318.costume.api.services.institution.NoSuchInstitutionException;
import net.lab1318.costume.api.services.object.NoSuchObjectException;
import net.lab1318.costume.api.services.object.ObjectQueryService;
import net.lab1318.costume.gui.presenters.Presenter;
import net.lab1318.costume.gui.views.object_by_id.ObjectByIdView;

@SessionScoped
public class ObjectByIdPresenter extends Presenter<ObjectByIdView> {
    @Inject
    public ObjectByIdPresenter(final CollectionQueryService collectionQueryService, final EventBus eventBus,
            final InstitutionQueryService institutionQueryService, final ObjectQueryService objectQueryService,
            final ObjectByIdView view) {
        super(eventBus, view);
        this.collectionQueryService = checkNotNull(collectionQueryService);
        this.institutionQueryService = checkNotNull(institutionQueryService);
        this.objectQueryService = checkNotNull(objectQueryService);
    }

    @Override
    protected void _onViewEnter(final ViewChangeEvent event) {
        final ObjectId objectId;
        try {
            objectId = ObjectId.parse(event.getParameters());
        } catch (final InvalidObjectIdException e) {
            _getView().setComponentError(new UserError("no such object " + event.getParameters()));
            return;
        }

        Object object;
        try {
            object = objectQueryService.getObjectById(objectId);
        } catch (final IoException e) {
            _getView().setComponentError(new SystemError("I/O exception", e));
            return;
        } catch (final NoSuchObjectException e) {
            _getView().setComponentError(new UserError("no such object " + objectId));
            return;
        }

        Collection collection;
        try {
            collection = collectionQueryService.getCollectionById(object.getCollectionId());
        } catch (final IoException e) {
            _getView().setComponentError(new SystemError("I/O exception", e));
            return;
        } catch (final NoSuchCollectionException e) {
            _getView().setComponentError(new UserError("no such collection " + object.getCollectionId()));
            return;
        }

        Institution institution;
        try {
            institution = institutionQueryService.getInstitutionById(collection.getInstitutionId());
        } catch (final IoException e) {
            _getView().setComponentError(new SystemError("I/O exception", e));
            return;
        } catch (final NoSuchInstitutionException e) {
            _getView().setComponentError(new UserError("no such institution " + collection.getInstitutionId()));
            return;
        }

        _getView().setModels(new CollectionEntry(object.getCollectionId(), collection),
                new InstitutionEntry(collection.getInstitutionId(), institution), new ObjectEntry(objectId, object));
    }

    private final CollectionQueryService collectionQueryService;
    private final InstitutionQueryService institutionQueryService;
    private final ObjectQueryService objectQueryService;
}
