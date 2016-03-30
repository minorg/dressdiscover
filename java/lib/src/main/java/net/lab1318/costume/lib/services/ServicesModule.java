package net.lab1318.costume.lib.services;

import com.google.inject.AbstractModule;

import net.lab1318.costume.api.services.collection.CollectionCommandService;
import net.lab1318.costume.api.services.collection.CollectionQueryService;
import net.lab1318.costume.api.services.institution.InstitutionCommandService;
import net.lab1318.costume.api.services.institution.InstitutionQueryService;
import net.lab1318.costume.api.services.object.ObjectCommandService;
import net.lab1318.costume.api.services.object.ObjectQueryService;
import net.lab1318.costume.api.services.object.ObjectSummaryQueryService;
import net.lab1318.costume.api.services.user.UserCommandService;
import net.lab1318.costume.api.services.user.UserQueryService;
import net.lab1318.costume.lib.services.collection.LoggingCollectionCommandService;
import net.lab1318.costume.lib.services.collection.LoggingCollectionQueryService;
import net.lab1318.costume.lib.services.collection.StoreCollectionCommandService;
import net.lab1318.costume.lib.services.collection.StoreCollectionQueryService;
import net.lab1318.costume.lib.services.collection.ValidatingCollectionCommandService;
import net.lab1318.costume.lib.services.collection.ValidatingCollectionQueryService;
import net.lab1318.costume.lib.services.institution.CachingInstitutionCommandService;
import net.lab1318.costume.lib.services.institution.CachingInstitutionQueryService;
import net.lab1318.costume.lib.services.institution.LoggingInstitutionCommandService;
import net.lab1318.costume.lib.services.institution.LoggingInstitutionQueryService;
import net.lab1318.costume.lib.services.institution.ValidatingInstitutionCommandService;
import net.lab1318.costume.lib.services.institution.ValidatingInstitutionQueryService;
import net.lab1318.costume.lib.services.object.ElasticSearchObjectSummaryQueryService;
import net.lab1318.costume.lib.services.object.LoggingObjectCommandService;
import net.lab1318.costume.lib.services.object.LoggingObjectQueryService;
import net.lab1318.costume.lib.services.object.LoggingObjectSummaryQueryService;
import net.lab1318.costume.lib.services.object.StoreObjectCommandService;
import net.lab1318.costume.lib.services.object.StoreObjectQueryService;
import net.lab1318.costume.lib.services.object.ValidatingObjectCommandService;
import net.lab1318.costume.lib.services.object.ValidatingObjectQueryService;
import net.lab1318.costume.lib.services.object.ValidatingObjectSummaryQueryService;
import net.lab1318.costume.lib.services.user.IterableUserQueryService;
import net.lab1318.costume.lib.services.user.JdbcUserCommandService;
import net.lab1318.costume.lib.services.user.JdbcUserQueryService;
import net.lab1318.costume.lib.services.user.LoggingUserCommandService;
import net.lab1318.costume.lib.services.user.LoggingUserQueryService;
import net.lab1318.costume.lib.services.user.ValidatingUserCommandService;
import net.lab1318.costume.lib.services.user.ValidatingUserQueryService;

public class ServicesModule extends AbstractModule {
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
                .to(CachingInstitutionCommandService.class).asEagerSingleton();
        bind(InstitutionCommandService.class).annotatedWith(ValidatingInstitutionCommandService.DELEGATE_NAME)
                .to(LoggingInstitutionCommandService.class).asEagerSingleton();
        bind(InstitutionCommandService.class).to(ValidatingInstitutionCommandService.class).asEagerSingleton();
    }

    protected void _configureInstitutionQueryService() {
        bind(InstitutionQueryService.class).annotatedWith(LoggingInstitutionQueryService.DELEGATE_NAME)
                .to(CachingInstitutionQueryService.class).asEagerSingleton();
        bind(InstitutionQueryService.class).annotatedWith(ValidatingInstitutionQueryService.DELEGATE_NAME)
                .to(LoggingInstitutionQueryService.class).asEagerSingleton();
        bind(InstitutionQueryService.class).to(ValidatingInstitutionQueryService.class).asEagerSingleton();
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
        _configureObjectCommandService();
        _configureObjectQueryService();
        _configureObjectSummaryQueryService();
        _configureUserCommandService();
        _configureUserQueryService();
    }
}
