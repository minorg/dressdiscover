package net.lab1318.costume.gui.presenters.objects;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.thryft.protocol.InputProtocolException;
import org.thryft.protocol.JacksonJsonInputProtocol;
import org.thryft.waf.gui.EventBus;
import org.vaadin.addons.lazyquerycontainer.LazyQueryContainer;

import com.google.common.base.Charsets;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.SystemError;
import com.vaadin.server.UserError;
import com.vaadin.ui.UI;

import net.lab1318.costume.api.models.collection.Collection;
import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.collection.CollectionQueryService;
import net.lab1318.costume.api.services.collection.NoSuchCollectionException;
import net.lab1318.costume.api.services.institution.InstitutionQueryService;
import net.lab1318.costume.api.services.institution.NoSuchInstitutionException;
import net.lab1318.costume.api.services.object.ObjectFacets;
import net.lab1318.costume.api.services.object.ObjectQuery;
import net.lab1318.costume.api.services.object.ObjectQueryService;
import net.lab1318.costume.api.services.object.ObjectQueryService.Messages.GetObjectByIdRequest;
import net.lab1318.costume.gui.models.object.ObjectSummaryEntryBeanQueryDefinition;
import net.lab1318.costume.gui.models.object.ObjectSummaryEntryBeanQueryFactory;
import net.lab1318.costume.gui.presenters.Presenter;
import net.lab1318.costume.gui.views.object_by_id.ObjectByIdView;
import net.lab1318.costume.gui.views.objects.ObjectsView;

@SessionScoped
public class ObjectsPresenter extends Presenter<ObjectsView> {
    @Inject
    public ObjectsPresenter(final CollectionQueryService collectionQueryService, final EventBus eventBus,
            final InstitutionQueryService institutionQueryService, final ObjectQueryService objectQueryService,
            final ObjectsView view) {
        super(eventBus, view);
        this.collectionQueryService = checkNotNull(collectionQueryService);
        this.institutionQueryService = checkNotNull(institutionQueryService);
        this.objectQueryService = checkNotNull(objectQueryService);
    }

    @Subscribe
    public void onGetObjectByIdRequest(final GetObjectByIdRequest request) {
        UI.getCurrent().getNavigator().navigateTo(ObjectByIdView.NAME + "/" + request.getId().toString());
    }

    @Override
    protected void _onViewEnter(final ViewChangeEvent event) {
        final ObjectQuery objectQuery;
        try {
            objectQuery = ObjectQuery.readAsStruct(
                    new JacksonJsonInputProtocol(URLDecoder.decode(event.getParameters(), Charsets.UTF_8.toString())));
        } catch (final InputProtocolException | UnsupportedEncodingException e) {
            _getView().setComponentError(new UserError("invalid query " + event.getParameters()));
            return;
        }

        final ObjectFacets availableObjectFacets;
        try {
            availableObjectFacets = objectQueryService
                    .getObjectFacets(Optional.of(ObjectQuery.builder(objectQuery).unsetFacetFilters().build()));
        } catch (final IoException e) {
            _getView().setComponentError(new SystemError("I/O exception", e));
            return;
        }

        final ObjectFacets resultObjectFacets;
        if (objectQuery.getFacetFilters().isPresent()) {
            try {
                resultObjectFacets = objectQueryService.getObjectFacets(Optional.of(objectQuery));
            } catch (final IoException e) {
                _getView().setComponentError(new SystemError("I/O exception", e));
                return;
            }
        } else {
            resultObjectFacets = availableObjectFacets;
        }

        ImmutableMap<CollectionId, Collection> collectionMap;
        {
            final ImmutableList<CollectionId> collectionIds = ImmutableList
                    .copyOf(availableObjectFacets.getCollections().keySet());
            final ImmutableList<Collection> collections;
            try {
                collections = collectionQueryService.getCollectionsByIds(collectionIds);
            } catch (final IoException e) {
                _getView().setComponentError(new SystemError("I/O exception", e));
                return;
            } catch (final NoSuchCollectionException e) {
                _getView().setComponentError(new SystemError("no such collection " + e.getId().get(), e));
                return;
            }
            checkState(collectionIds.size() == collections.size());
            final ImmutableMap.Builder<CollectionId, Collection> collectionMapBuilder = ImmutableMap.builder();
            for (int collectionI = 0; collectionI < collectionIds.size(); collectionI++) {
                collectionMapBuilder.put(collectionIds.get(collectionI), collections.get(collectionI));
            }
            collectionMap = collectionMapBuilder.build();
        }

        ImmutableMap<InstitutionId, Institution> institutionMap;
        {
            final ImmutableList<InstitutionId> institutionIds = ImmutableList
                    .copyOf(availableObjectFacets.getInstitutions().keySet());
            final ImmutableList<Institution> institutions;
            try {
                institutions = institutionQueryService.getInstitutionsByIds(institutionIds);
            } catch (final IoException e) {
                _getView().setComponentError(new SystemError("I/O exception", e));
                return;
            } catch (final NoSuchInstitutionException e) {
                _getView().setComponentError(new SystemError("no such institution " + e.getId().get(), e));
                return;
            }
            checkState(institutionIds.size() == institutions.size());
            final ImmutableMap.Builder<InstitutionId, Institution> institutionMapBuilder = ImmutableMap.builder();
            for (int institutionI = 0; institutionI < institutionIds.size(); institutionI++) {
                institutionMapBuilder.put(institutionIds.get(institutionI), institutions.get(institutionI));
            }
            institutionMap = institutionMapBuilder.build();
        }

        _getView().setModels(availableObjectFacets, collectionMap, institutionMap, objectQuery,
                new LazyQueryContainer(ObjectSummaryEntryBeanQueryDefinition.getInstance(),
                        ObjectSummaryEntryBeanQueryFactory.create(objectQuery, objectQueryService)),
                resultObjectFacets);
    }

    private final CollectionQueryService collectionQueryService;
    private final InstitutionQueryService institutionQueryService;
    private final ObjectQueryService objectQueryService;
}
