package net.lab1318.costume.lib.services;

import com.google.inject.AbstractModule;

import net.lab1318.costume.api.services.collection.CollectionCommandService;
import net.lab1318.costume.api.services.collection.CollectionQueryService;
import net.lab1318.costume.api.services.institution.InstitutionCommandService;
import net.lab1318.costume.api.services.institution.InstitutionQueryService;
import net.lab1318.costume.api.services.object.ObjectCommandService;
import net.lab1318.costume.api.services.object.ObjectQueryService;
import net.lab1318.costume.lib.services.collection.ElasticSearchCollectionCommandService;
import net.lab1318.costume.lib.services.collection.ElasticSearchCollectionQueryService;
import net.lab1318.costume.lib.services.collection.LoggingCollectionCommandService;
import net.lab1318.costume.lib.services.collection.LoggingCollectionQueryService;
import net.lab1318.costume.lib.services.collection.ValidatingCollectionCommandService;
import net.lab1318.costume.lib.services.collection.ValidatingCollectionQueryService;
import net.lab1318.costume.lib.services.institution.ElasticSearchInstitutionCommandService;
import net.lab1318.costume.lib.services.institution.ElasticSearchInstitutionQueryService;
import net.lab1318.costume.lib.services.institution.LoggingInstitutionCommandService;
import net.lab1318.costume.lib.services.institution.LoggingInstitutionQueryService;
import net.lab1318.costume.lib.services.institution.ValidatingInstitutionCommandService;
import net.lab1318.costume.lib.services.institution.ValidatingInstitutionQueryService;
import net.lab1318.costume.lib.services.object.ElasticSearchObjectCommandService;
import net.lab1318.costume.lib.services.object.ElasticSearchObjectQueryService;
import net.lab1318.costume.lib.services.object.LoggingObjectCommandService;
import net.lab1318.costume.lib.services.object.LoggingObjectQueryService;
import net.lab1318.costume.lib.services.object.ValidatingObjectCommandService;
import net.lab1318.costume.lib.services.object.ValidatingObjectQueryService;

public class ServicesModule extends AbstractModule {
    protected void _configureCollectionCommandService() {
        bind(CollectionCommandService.class).annotatedWith(LoggingCollectionCommandService.DELEGATE_NAME)
                .to(ElasticSearchCollectionCommandService.class).asEagerSingleton();
        bind(CollectionCommandService.class).annotatedWith(ValidatingCollectionCommandService.DELEGATE_NAME)
                .to(LoggingCollectionCommandService.class).asEagerSingleton();
        bind(CollectionCommandService.class).to(ValidatingCollectionCommandService.class).asEagerSingleton();
    }

    protected void _configureCollectionQueryService() {
        bind(CollectionQueryService.class).annotatedWith(LoggingCollectionQueryService.DELEGATE_NAME)
                .to(ElasticSearchCollectionQueryService.class).asEagerSingleton();
        bind(CollectionQueryService.class).annotatedWith(ValidatingCollectionQueryService.DELEGATE_NAME)
                .to(LoggingCollectionQueryService.class).asEagerSingleton();
        bind(CollectionQueryService.class).to(ValidatingCollectionQueryService.class).asEagerSingleton();
    }

    protected void _configureInstitutionCommandService() {
        bind(InstitutionCommandService.class).annotatedWith(LoggingInstitutionCommandService.DELEGATE_NAME)
                .to(ElasticSearchInstitutionCommandService.class).asEagerSingleton();
        bind(InstitutionCommandService.class).annotatedWith(ValidatingInstitutionCommandService.DELEGATE_NAME)
                .to(LoggingInstitutionCommandService.class).asEagerSingleton();
        bind(InstitutionCommandService.class).to(ValidatingInstitutionCommandService.class).asEagerSingleton();
    }

    protected void _configureInstitutionQueryService() {
        bind(InstitutionQueryService.class).annotatedWith(LoggingInstitutionQueryService.DELEGATE_NAME)
                .to(ElasticSearchInstitutionQueryService.class).asEagerSingleton();
        bind(InstitutionQueryService.class).annotatedWith(ValidatingInstitutionQueryService.DELEGATE_NAME)
                .to(LoggingInstitutionQueryService.class).asEagerSingleton();
        bind(InstitutionQueryService.class).to(ValidatingInstitutionQueryService.class).asEagerSingleton();
    }

    protected void _configureObjectCommandService() {
        bind(ObjectCommandService.class).annotatedWith(LoggingObjectCommandService.DELEGATE_NAME)
                .to(ElasticSearchObjectCommandService.class).asEagerSingleton();
        bind(ObjectCommandService.class).annotatedWith(ValidatingObjectCommandService.DELEGATE_NAME)
                .to(LoggingObjectCommandService.class).asEagerSingleton();
        bind(ObjectCommandService.class).to(ValidatingObjectCommandService.class).asEagerSingleton();
    }

    protected void _configureObjectQueryService() {
        bind(ObjectQueryService.class).annotatedWith(LoggingObjectQueryService.DELEGATE_NAME)
                .to(ElasticSearchObjectQueryService.class).asEagerSingleton();
        bind(ObjectQueryService.class).annotatedWith(ValidatingObjectQueryService.DELEGATE_NAME)
                .to(LoggingObjectQueryService.class).asEagerSingleton();
        bind(ObjectQueryService.class).to(ValidatingObjectQueryService.class).asEagerSingleton();
    }

    @Override
    protected void configure() {
        _configureCollectionCommandService();
        _configureCollectionQueryService();
        _configureInstitutionCommandService();
        _configureInstitutionQueryService();
        _configureObjectCommandService();
        _configureObjectQueryService();
    }
}
