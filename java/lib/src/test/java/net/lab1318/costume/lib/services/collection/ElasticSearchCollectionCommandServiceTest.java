package net.lab1318.costume.lib.services.collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import net.lab1318.costume.lib.services.TestData;

public final class ElasticSearchCollectionCommandServiceTest extends CollectionServiceTest {
    @Test
    public void testDeleteCollections() throws Exception {
        assertEquals(0, collectionQueryService.getCollections().size());
        _putCollections();
        assertNotEquals(0, collectionQueryService.getCollections().size());
        collectionCommandService.deleteCollections();
        assertEquals(0, collectionQueryService.getCollections().size());
    }

    @Test
    public void testPutCollections() throws Exception {
        assertEquals(0, collectionQueryService.getCollections().size());
        _putCollections();
        assertEquals(TestData.getInstance().getCollections().size(), collectionQueryService.getCollections().size());
    }
}
