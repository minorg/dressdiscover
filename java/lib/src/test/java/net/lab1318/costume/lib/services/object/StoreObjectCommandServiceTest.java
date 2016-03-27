package net.lab1318.costume.lib.services.object;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.lib.services.TestData;

public final class StoreObjectCommandServiceTest extends ObjectServiceTest {
    @Test
    public void testDeleteObjectsByCollectionId() throws Exception {
        _putObjects();
        for (final CollectionEntry collectionEntry : collectionQueryService.getCollections()) {
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
