package net.lab1318.costume.gui.presenters.collection;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.notaweb.gui.EventBus;
import org.notaweb.gui.presenters.Presenter;
import org.vaadin.addons.lazyquerycontainer.AbstractBeanQuery;
import org.vaadin.addons.lazyquerycontainer.BeanQueryFactory;
import org.vaadin.addons.lazyquerycontainer.LazyQueryContainer;
import org.vaadin.addons.lazyquerycontainer.LazyQueryDefinition;
import org.vaadin.addons.lazyquerycontainer.QueryDefinition;

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
import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.collection.InvalidCollectionIdException;
import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.models.object.Object;
import net.lab1318.costume.api.models.object.ObjectEntry;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.collection.CollectionQueryService;
import net.lab1318.costume.api.services.collection.NoSuchCollectionException;
import net.lab1318.costume.api.services.institution.InstitutionQueryService;
import net.lab1318.costume.api.services.institution.NoSuchInstitutionException;
import net.lab1318.costume.api.services.object.ObjectQueryService;
import net.lab1318.costume.api.services.object.ObjectQueryService.Messages.GetObjectByIdRequest;
import net.lab1318.costume.gui.models.object.ObjectBeanWithId;
import net.lab1318.costume.gui.views.collection.CollectionByIdView;
import net.lab1318.costume.gui.views.object.ObjectByIdView;

@SessionScoped
public class CollectionByIdPresenter extends Presenter<CollectionByIdView> {
    @SuppressWarnings("serial")
    public final static class ObjectBeanQuery extends AbstractBeanQuery<ObjectBeanWithId> {
        public ObjectBeanQuery(final QueryDefinition definition, final Map<String, java.lang.Object> queryConfiguration,
                final java.lang.Object[] sortPropertyIds, final boolean[] sortStates) {
            super(definition, queryConfiguration, sortPropertyIds, sortStates);
            this.collectionId = (CollectionId) queryConfiguration.get("collectionId");
            this.objectQueryService = (ObjectQueryService) queryConfiguration.get("objectQueryService");
        }

        @Override
        public int size() {
            try {
                return objectQueryService.getObjectCountByCollectionId(collectionId).intValue();
            } catch (final IoException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        protected ObjectBeanWithId constructBean() {
            throw new UnsupportedOperationException();
        }

        @Override
        protected List<ObjectBeanWithId> loadBeans(final int startIndex, final int count) {
            final List<ObjectBeanWithId> beans = new ArrayList<>();
            try {
                for (final ObjectEntry entry : objectQueryService.getObjectsByCollectionId(collectionId,
                        UnsignedInteger.valueOf(startIndex), UnsignedInteger.valueOf(count))) {
                    beans.add(new ObjectBeanWithId(entry));
                }
            } catch (final IoException e) {
                throw new RuntimeException(e);
            }
            return beans;
        }

        @Override
        protected void saveBeans(final List<ObjectBeanWithId> added, final List<ObjectBeanWithId> modified,
                final List<ObjectBeanWithId> removed) {
            throw new UnsupportedOperationException();
        }

        private final CollectionId collectionId;
        private final ObjectQueryService objectQueryService;
    }

    @Inject
    public CollectionByIdPresenter(final CollectionQueryService collectionQueryService, final EventBus eventBus,
            final InstitutionQueryService institutionQueryService, final ObjectQueryService objectQueryService,
            final CollectionByIdView view) {
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
        CollectionId collectionId;
        try {
            collectionId = CollectionId.parse(event.getParameters());
        } catch (final InvalidCollectionIdException e) {
            _getView().setComponentError(new UserError("no such collection " + event.getParameters()));
            return;
        }

        Collection collection;
        try {
            collection = collectionQueryService.getCollectionById(collectionId);
        } catch (final IoException e) {
            _getView().setComponentError(new SystemError("I/O exception", e));
            return;
        } catch (final NoSuchCollectionException e) {
            _getView().setComponentError(new UserError("no such collection " + collectionId));
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

        final BeanQueryFactory<ObjectBeanQuery> objectBeanQueryFactory = new BeanQueryFactory<ObjectBeanQuery>(
                ObjectBeanQuery.class);
        final Map<String, java.lang.Object> queryConfiguration = new HashMap<>();
        queryConfiguration.put("collectionId", collectionId);
        queryConfiguration.put("objectQueryService", objectQueryService);
        objectBeanQueryFactory.setQueryConfiguration(queryConfiguration);

        final LazyQueryDefinition queryDefinition = new LazyQueryDefinition(true, 10, "id");
        for (final Object.FieldMetadata field : Object.FieldMetadata.values()) {
            queryDefinition.addProperty(field.getThriftName(), field.getJavaType().getRawType(), null, true, false);
        }

        _getView().setModels(new CollectionEntry(collectionId, collection),
                new InstitutionEntry(collection.getInstitutionId(), institution),
                new LazyQueryContainer(queryDefinition, objectBeanQueryFactory));
    }

    private final CollectionQueryService collectionQueryService;
    private final InstitutionQueryService institutionQueryService;
    private final ObjectQueryService objectQueryService;
}
