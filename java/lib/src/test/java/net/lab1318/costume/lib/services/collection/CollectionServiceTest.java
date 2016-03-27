package net.lab1318.costume.lib.services.collection;

import org.junit.After;
import org.junit.Before;

import com.google.common.collect.ImmutableList;

import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.services.collection.CollectionCommandService;
import net.lab1318.costume.api.services.collection.CollectionQueryService;
import net.lab1318.costume.api.services.institution.InstitutionCommandService;
import net.lab1318.costume.lib.services.ServiceTest;
import net.lab1318.costume.lib.services.TestData;
import net.lab1318.costume.lib.services.institution.InstitutionServiceTest;

public abstract class CollectionServiceTest extends ServiceTest {
    public static ImmutableList<CollectionEntry> putCollections(
            final InstitutionCommandService institutionCommandService,
            final CollectionCommandService collectionCommandService) throws Exception {
        InstitutionServiceTest.putInstitutions(institutionCommandService);

        for (final CollectionEntry collectionEntry : TestData.getInstance().getCollections().values()) {
            collectionCommandService.putCollection(collectionEntry.getId(), collectionEntry.getModel());
        }
        return ImmutableList.copyOf(TestData.getInstance().getCollections().values());
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
        InstitutionServiceTest.deleteInstitutions(institutionCommandService);
    }

    protected final ImmutableList<CollectionEntry> _putCollections() throws Exception {
        return putCollections(institutionCommandService, collectionCommandService);
    }

    protected CollectionCommandService collectionCommandService;
    protected CollectionQueryService collectionQueryService;
    private InstitutionCommandService institutionCommandService;
}
