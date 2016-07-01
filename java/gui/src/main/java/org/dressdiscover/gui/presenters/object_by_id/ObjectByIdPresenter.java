package org.dressdiscover.gui.presenters.object_by_id;

import static com.google.common.base.Preconditions.checkNotNull;

import org.dressdiscover.api.models.object.ObjectId;
import org.dressdiscover.gui.events.object_by_id.ObjectAddMetadataRequest;
import org.dressdiscover.gui.events.object_by_id.ObjectElementSelectionRequest;
import org.dressdiscover.gui.events.object_by_id.ObjectMoreLikeThisRequest;
import org.dressdiscover.gui.models.NameValuePairs;
import org.dressdiscover.gui.presenters.Presenter;
import org.dressdiscover.gui.views.object_by_id.ObjectByIdView;
import org.dressdiscover.gui.views.wizard.catalog_wizard.CatalogWizardStartView;
import org.thryft.waf.gui.EventBus;
import org.thryft.waf.lib.stores.ElasticSearchIndex;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.eventbus.Subscribe;
import com.google.common.primitives.UnsignedInteger;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.SystemError;
import com.vaadin.server.UserError;
import com.vaadin.ui.UI;

import net.lab1318.costume.api.models.collection.Collection;
import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.models.object.InvalidObjectIdException;
import net.lab1318.costume.api.models.object.Object;
import net.lab1318.costume.api.models.object.ObjectEntry;
import net.lab1318.costume.api.models.object.ObjectQuery;
import net.lab1318.costume.api.models.object.ObjectSummaryEntry;
import net.lab1318.costume.api.models.relation.Relation;
import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.collection.CollectionQueryService;
import net.lab1318.costume.api.services.collection.NoSuchCollectionException;
import net.lab1318.costume.api.services.institution.InstitutionQueryService;
import net.lab1318.costume.api.services.institution.NoSuchInstitutionException;
import net.lab1318.costume.api.services.object.GetObjectSummariesOptions;
import net.lab1318.costume.api.services.object.NoSuchObjectException;
import net.lab1318.costume.api.services.object.ObjectQueryService;
import net.lab1318.costume.api.services.object.ObjectSummaryQueryService;
import net.lab1318.costume.api.services.user.UserCommandService;
import net.lab1318.costume.api.services.user.UserQueryService;

@SessionScoped
public class ObjectByIdPresenter extends Presenter<ObjectByIdView> {
    @Inject
    public ObjectByIdPresenter(final CollectionQueryService collectionQueryService, final EventBus eventBus,
            final InstitutionQueryService institutionQueryService, final ObjectQueryService objectQueryService,
            final ObjectSummaryQueryService objectSummaryQueryService, final UserCommandService userCommandService,
            final UserQueryService userQueryService, final ObjectByIdView view) {
        super(eventBus, userCommandService, userQueryService, view);
        this.collectionQueryService = checkNotNull(collectionQueryService);
        this.institutionQueryService = checkNotNull(institutionQueryService);
        this.objectQueryService = checkNotNull(objectQueryService);
        this.objectSummaryQueryService = checkNotNull(objectSummaryQueryService);
    }

    @Subscribe
    public void onObjectAddMetadataRequest(final ObjectAddMetadataRequest event) {
        UI.getCurrent().getNavigator()
                .navigateTo(CatalogWizardStartView.NAME + '/'
                        + new NameValuePairs(ImmutableMap.of("object_id", event.getObjectId().toString()))
                                .toUrlEncodedString());
    }

    @Subscribe
    public void onObjectElementSelectionRequest(final ObjectElementSelectionRequest event) {
        _navigateTo(ObjectQuery.builder().setCollectionId(event.getObjectId().getCollectionId())
                .setInstitutionId(event.getObjectId().getInstitutionId()).setFacetFilters(event.getFilter()).build());
    }

    @Subscribe
    public void onObjectMoreLikeThisRequest(final ObjectMoreLikeThisRequest event) {
        _navigateTo(ObjectQuery.builder().setCollectionId(event.getObjectId().getCollectionId())
                .setInstitutionId(event.getObjectId().getInstitutionId()).setMoreLikeObjectId(event.getObjectId())
                .build());
    }

    @Override
    protected void _onViewEnter(final Optional<UserEntry> currentUser, final ViewChangeEvent event) {
        ObjectId objectId;
        try {
            objectId = ObjectId.parse(event.getParameters());
        } catch (final InvalidObjectIdException e) {
            _getView().setComponentError(new UserError("no such object " + event.getParameters()));
            return;
        }

        try {
            Object object;
            try {
                object = objectQueryService.getObjectById(objectId);
            } catch (final NoSuchCollectionException e) {
                _getView().setComponentError(new UserError("no such collection " + objectId));
                return;
            } catch (final NoSuchInstitutionException e) {
                _getView().setComponentError(new UserError("no such institution " + objectId));
                return;
            } catch (final NoSuchObjectException e) {
                _getView().setComponentError(new UserError("no such object " + objectId));
                return;
            }

            Collection collection;
            try {
                collection = collectionQueryService.getCollectionById(object.getCollectionId());
            } catch (final NoSuchCollectionException e) {
                _getView().setComponentError(new UserError("no such collection " + object.getCollectionId()));
                return;
            } catch (final NoSuchInstitutionException e) {
                _getView().setComponentError(new UserError("no such institution " + object.getInstitutionId()));
                return;
            }

            Institution institution;
            try {
                institution = institutionQueryService.getInstitutionById(collection.getInstitutionId());
            } catch (final NoSuchInstitutionException e) {
                _getView().setComponentError(new UserError("no such institution " + collection.getInstitutionId()));
                return;
            }

            final ImmutableMap<ObjectId, ObjectSummaryEntry> relatedObjectSummaryEntries;
            if (object.getRelations().isPresent()) {
                final ImmutableSet.Builder<ObjectId> relatedObjectIdsBuilder = ImmutableSet.builder();
                for (final Relation relation : object.getRelations().get().getElements()) {
                    if (!relation.getRelids().isPresent()) {
                        continue;
                    }
                    for (final ObjectId relid : relation.getRelids().get()) {
                        if (relid.equals(objectId)) {
                            continue;
                        }
                        relatedObjectIdsBuilder.add(relid);
                    }
                }
                final ImmutableSet<ObjectId> relatedObjectIds = relatedObjectIdsBuilder.build();
                if (!relatedObjectIds.isEmpty()) {
                    final ImmutableMap.Builder<ObjectId, ObjectSummaryEntry> relatedObjectSummaryEntriesBuilder = ImmutableMap
                            .builder();
                    for (final ObjectSummaryEntry objectSummaryEntry : objectSummaryQueryService
                            .getObjectSummaries(
                                    Optional.of(GetObjectSummariesOptions.builder()
                                            .setSize(
                                                    UnsignedInteger.valueOf(ElasticSearchIndex.SEARCH_REQUEST_SIZE_MAX))
                                            .build()),
                                    Optional.of(ObjectQuery.builder().setObjectIds(relatedObjectIds).build()))
                            .getHits()) {
                        relatedObjectSummaryEntriesBuilder.put(objectSummaryEntry.getId(), objectSummaryEntry);
                    }
                    relatedObjectSummaryEntries = relatedObjectSummaryEntriesBuilder.build();
                } else {
                    relatedObjectSummaryEntries = ImmutableMap.of();
                }
            } else {
                relatedObjectSummaryEntries = ImmutableMap.of();
            }

            _getView().setModels(new CollectionEntry(object.getCollectionId(), collection),
                    new InstitutionEntry(collection.getInstitutionId(), institution), new ObjectEntry(objectId, object),
                    relatedObjectSummaryEntries);
        } catch (final IoException e) {
            _getView().setComponentError(new SystemError("I/O exception", e));
            return;
        }
    }

    private final ObjectSummaryQueryService objectSummaryQueryService;
    private final CollectionQueryService collectionQueryService;
    private final InstitutionQueryService institutionQueryService;
    private final ObjectQueryService objectQueryService;
}
