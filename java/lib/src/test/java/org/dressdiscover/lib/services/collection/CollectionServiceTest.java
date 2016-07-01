package org.dressdiscover.lib.services.collection;

import org.dressdiscover.api.models.collection.CollectionEntry;
import org.dressdiscover.api.models.institution.InstitutionId;
import org.dressdiscover.lib.services.ServiceTest;
import org.dressdiscover.lib.services.institution.InstitutionServiceTest;
import org.dressdiscover.testdata.TestData;
import org.junit.After;
import org.junit.Before;

import com.google.common.collect.ImmutableList;

import org.dressdiscover.api.services.collection.CollectionCommandService;
import org.dressdiscover.api.services.collection.CollectionQueryService;
import org.dressdiscover.api.services.institution.InstitutionCommandService;

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
        institutionId = TestData.getInstance().getInstitutions().get(0).getId();
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
    protected InstitutionId institutionId;
    private InstitutionCommandService institutionCommandService;
}
