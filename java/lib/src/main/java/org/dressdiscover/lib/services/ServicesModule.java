package org.dressdiscover.lib.services;

import static com.google.common.base.Preconditions.checkNotNull;

import org.dressdiscover.lib.DressDiscoverProperties;
import org.dressdiscover.lib.services.collection.LoggingCollectionCommandService;
import org.dressdiscover.lib.services.collection.LoggingCollectionQueryService;
import org.dressdiscover.lib.services.collection.StoreCollectionCommandService;
import org.dressdiscover.lib.services.collection.StoreCollectionQueryService;
import org.dressdiscover.lib.services.collection.ValidatingCollectionCommandService;
import org.dressdiscover.lib.services.collection.ValidatingCollectionQueryService;
import org.dressdiscover.lib.services.institution.LoggingInstitutionCommandService;
import org.dressdiscover.lib.services.institution.LoggingInstitutionQueryService;
import org.dressdiscover.lib.services.institution.StoreInstitutionCommandService;
import org.dressdiscover.lib.services.institution.StoreInstitutionQueryService;
import org.dressdiscover.lib.services.institution.ValidatingInstitutionCommandService;
import org.dressdiscover.lib.services.institution.ValidatingInstitutionQueryService;
import org.dressdiscover.lib.services.object.ElasticSearchObjectSummaryQueryService;
import org.dressdiscover.lib.services.object.LoggingObjectCommandService;
import org.dressdiscover.lib.services.object.LoggingObjectQueryService;
import org.dressdiscover.lib.services.object.LoggingObjectSummaryQueryService;
import org.dressdiscover.lib.services.object.StoreObjectCommandService;
import org.dressdiscover.lib.services.object.StoreObjectQueryService;
import org.dressdiscover.lib.services.object.ValidatingObjectCommandService;
import org.dressdiscover.lib.services.object.ValidatingObjectQueryService;
import org.dressdiscover.lib.services.object.ValidatingObjectSummaryQueryService;
import org.dressdiscover.lib.services.user.IterableUserQueryService;
import org.dressdiscover.lib.services.user.JdbcUserCommandService;
import org.dressdiscover.lib.services.user.JdbcUserQueryService;
import org.dressdiscover.lib.services.user.LoggingUserCommandService;
import org.dressdiscover.lib.services.user.LoggingUserQueryService;
import org.dressdiscover.lib.services.user.ValidatingUserCommandService;
import org.dressdiscover.lib.services.user.ValidatingUserQueryService;
import org.dressdiscover.lib.stores.institution.CachingInstitutionStore;
import org.dressdiscover.lib.stores.institution.FileSystemInstitutionStore;
import org.dressdiscover.lib.stores.institution.InstitutionStore;

import com.google.inject.AbstractModule;

import org.dressdiscover.api.services.collection.CollectionCommandService;
import org.dressdiscover.api.services.collection.CollectionQueryService;
import org.dressdiscover.api.services.institution.InstitutionCommandService;
import org.dressdiscover.api.services.institution.InstitutionQueryService;
import org.dressdiscover.api.services.object.ObjectCommandService;
import org.dressdiscover.api.services.object.ObjectQueryService;
import org.dressdiscover.api.services.object.ObjectSummaryQueryService;
import org.dressdiscover.api.services.user.UserCommandService;
import org.dressdiscover.api.services.user.UserQueryService;

public class ServicesModule extends AbstractModule {
    public ServicesModule(final DressDiscoverProperties properties) {
        this.properties = checkNotNull(properties);
    }

    protected void _configureCollectionCommandService() {
        bind(CollectionCommandService.class).annotatedWith(LoggingCollectionCommandService.DELEGATE_NAME)
                .to(StoreCollectionCommandService.class).asEagerSingleton();
        bind(CollectionCommandService.class).annotatedWith(ValidatingCollectionCommandService.DELEGATE_NAME)
                .to(LoggingCollectionCommandService.class).asEagerSingleton();
        bind(CollectionCommandService.class).to(ValidatingCollectionCommandService.class).asEagerSingleton();
    }

    protected void _configureCollectionQueryService() {
        bind(CollectionQueryService.class).annotatedWith(LoggingCollectionQueryService.DELEGATE_NAME)
                .to(StoreCollectionQueryService.class).asEagerSingleton();
        bind(CollectionQueryService.class).annotatedWith(ValidatingCollectionQueryService.DELEGATE_NAME)
                .to(LoggingCollectionQueryService.class).asEagerSingleton();
        bind(CollectionQueryService.class).to(ValidatingCollectionQueryService.class).asEagerSingleton();
    }

    protected void _configureInstitutionCommandService() {
        bind(InstitutionCommandService.class).annotatedWith(LoggingInstitutionCommandService.DELEGATE_NAME)
                .to(StoreInstitutionCommandService.class).asEagerSingleton();
        bind(InstitutionCommandService.class).annotatedWith(ValidatingInstitutionCommandService.DELEGATE_NAME)
                .to(LoggingInstitutionCommandService.class).asEagerSingleton();
        bind(InstitutionCommandService.class).to(ValidatingInstitutionCommandService.class).asEagerSingleton();
    }

    protected void _configureInstitutionQueryService() {
        bind(InstitutionQueryService.class).annotatedWith(LoggingInstitutionQueryService.DELEGATE_NAME)
                .to(StoreInstitutionQueryService.class).asEagerSingleton();
        bind(InstitutionQueryService.class).annotatedWith(ValidatingInstitutionQueryService.DELEGATE_NAME)
                .to(LoggingInstitutionQueryService.class).asEagerSingleton();
        bind(InstitutionQueryService.class).to(ValidatingInstitutionQueryService.class).asEagerSingleton();
    }

    protected void _configureInstitutionStore() {
        bind(InstitutionStore.class).to(
                properties.getCacheInstitutions() ? CachingInstitutionStore.class : FileSystemInstitutionStore.class);
    }

    protected void _configureObjectCommandService() {
        bind(ObjectCommandService.class).annotatedWith(LoggingObjectCommandService.DELEGATE_NAME)
                .to(StoreObjectCommandService.class).asEagerSingleton();
        bind(ObjectCommandService.class).annotatedWith(ValidatingObjectCommandService.DELEGATE_NAME)
                .to(LoggingObjectCommandService.class).asEagerSingleton();
        bind(ObjectCommandService.class).to(ValidatingObjectCommandService.class).asEagerSingleton();
    }

    protected void _configureObjectQueryService() {
        bind(ObjectQueryService.class).annotatedWith(LoggingObjectQueryService.DELEGATE_NAME)
                .to(StoreObjectQueryService.class).asEagerSingleton();
        bind(ObjectQueryService.class).annotatedWith(ValidatingObjectQueryService.DELEGATE_NAME)
                .to(LoggingObjectQueryService.class).asEagerSingleton();
        bind(ObjectQueryService.class).to(ValidatingObjectQueryService.class).asEagerSingleton();
    }

    protected void _configureObjectSummaryQueryService() {
        bind(ObjectSummaryQueryService.class).annotatedWith(LoggingObjectSummaryQueryService.DELEGATE_NAME)
                .to(ElasticSearchObjectSummaryQueryService.class).asEagerSingleton();
        bind(ObjectSummaryQueryService.class).annotatedWith(ValidatingObjectSummaryQueryService.DELEGATE_NAME)
                .to(LoggingObjectSummaryQueryService.class).asEagerSingleton();
        bind(ObjectSummaryQueryService.class).to(ValidatingObjectSummaryQueryService.class).asEagerSingleton();
    }

    protected void _configureUserCommandService() {
        bind(UserCommandService.class).annotatedWith(LoggingUserCommandService.DELEGATE_NAME)
                .to(JdbcUserCommandService.class).asEagerSingleton();
        bind(UserCommandService.class).annotatedWith(ValidatingUserCommandService.DELEGATE_NAME)
                .to(LoggingUserCommandService.class).asEagerSingleton();
        bind(UserCommandService.class).to(ValidatingUserCommandService.class).asEagerSingleton();
    }

    protected void _configureUserQueryService() {
        bind(IterableUserQueryService.class).annotatedWith(LoggingUserQueryService.DELEGATE_NAME)
                .to(JdbcUserQueryService.class).asEagerSingleton();
        bind(UserQueryService.class).annotatedWith(LoggingUserQueryService.DELEGATE_NAME).to(JdbcUserQueryService.class)
                .asEagerSingleton();
        bind(UserQueryService.class).annotatedWith(ValidatingUserQueryService.DELEGATE_NAME)
                .to(LoggingUserQueryService.class).asEagerSingleton();
        bind(UserQueryService.class).to(ValidatingUserQueryService.class).asEagerSingleton();
    }

    @Override
    protected void configure() {
        _configureCollectionCommandService();
        _configureCollectionQueryService();
        _configureInstitutionCommandService();
        _configureInstitutionQueryService();
        _configureInstitutionStore();
        _configureObjectCommandService();
        _configureObjectQueryService();
        _configureObjectSummaryQueryService();
        _configureUserCommandService();
        _configureUserQueryService();
    }

    private final DressDiscoverProperties properties;
}
