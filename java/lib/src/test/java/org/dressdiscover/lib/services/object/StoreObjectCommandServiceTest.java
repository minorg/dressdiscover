package org.dressdiscover.lib.services.object;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.dressdiscover.api.models.collection.CollectionEntry;
import org.dressdiscover.testdata.TestData;
import org.junit.Test;

public final class StoreObjectCommandServiceTest extends ObjectServiceTest {
    @Test
    public void testDeleteObjectsByCollectionId() throws Exception {
        _putObjects();
        for (final CollectionEntry collectionEntry : collectionQueryService
                .getCollectionsByInstitutionId(TestData.getInstance().getInstitutions().get(0).getId())) {
            assertNotEquals(0, _getObjectCountByCollectionId(collectionEntry.getId()));
            objectCommandService.deleteObjectsByCollectionId(collectionEntry.getId());
            objectSummaryElasticSearchIndex.refresh();
            assertEquals(0, _getObjectCountByCollectionId(collectionEntry.getId()));
        }
    }

    @Test
    public void testPutObject() throws Exception {
        assertEquals(0, _getObjectCount());
        _putObject();
        objectSummaryElasticSearchIndex.refresh();
        assertEquals(1, _getObjectCount());
    }

    @Test
    public void testPutObjects() throws Exception {
        assertEquals(0, _getObjectCount());
        _putObjects();
        objectSummaryElasticSearchIndex.refresh();
        assertEquals(TestData.getInstance().getObjects().size(), _getObjectCount());
    }

    @Test
    public void testResummarizeObjects() throws Exception {
        assertEquals(0, _getObjectCount());
        _putObjects();
        objectCommandService.resummarizeObjects();
        assertEquals(TestData.getInstance().getObjects().size(), _getObjectCount());
    }
}
