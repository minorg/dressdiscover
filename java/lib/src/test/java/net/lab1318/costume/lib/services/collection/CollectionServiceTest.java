package net.lab1318.costume.lib.services.collection;

import org.junit.After;
import org.junit.Before;

import com.google.common.collect.ImmutableMap;

import net.lab1318.costume.api.models.collection.Collection;
import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.services.collection.CollectionCommandService;
import net.lab1318.costume.api.services.collection.CollectionQueryService;
import net.lab1318.costume.api.services.institution.InstitutionCommandService;
import net.lab1318.costume.lib.services.ServiceTest;
import net.lab1318.costume.lib.services.TestData;
import net.lab1318.costume.lib.services.institution.InstitutionServiceTest;

public abstract class CollectionServiceTest extends ServiceTest {
    public static ImmutableMap<CollectionId, Collection> putCollections(
            final InstitutionCommandService institutionCommandService,
            final CollectionCommandService collectionCommandService) throws Exception {
        InstitutionServiceTest.putInstitutions(institutionCommandService);

        final ImmutableMap.Builder<CollectionId, Collection> resultBuilder = ImmutableMap.builder();
        for (final Collection collection : TestData.getInstance().getCollections().values()) {
            resultBuilder.put(collectionCommandService.postCollection(collection), collection);
        }
        Thread.sleep(1000); // Let writes settle
        return resultBuilder.build();
    }

    @Before
    public void setUp() throws Exception {
        collectionCommandService = _getInjector().getInstance(CollectionCommandService.class);
        collectionQueryService = _getInjector().getInstance(CollectionQueryService.class);
        institutionCommandService = _getInjector().getInstance(InstitutionCommandService.class);
        tearDown();
    }

    @After
    public void tearDown() throws Exception {
        collectionCommandService.deleteCollections();
        institutionCommandService.deleteInstitutions();
    }

    protected final ImmutableMap<CollectionId, Collection> _putCollections() throws Exception {
        return putCollections(institutionCommandService, collectionCommandService);
    }

    protected CollectionCommandService collectionCommandService;
    protected CollectionQueryService collectionQueryService;
    private InstitutionCommandService institutionCommandService;
}
