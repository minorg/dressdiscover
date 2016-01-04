package net.lab1318.costume.lib.services.object;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.lib.services.TestData;

public final class ElasticSearchObjectCommandServiceTest extends ObjectServiceTest {
    @Test
    public void testDeleteObjects() throws Exception {
        assertEquals(0, _getObjectCount());
        _putObjects();
        Thread.sleep(1000); // Let writes settle
        assertNotEquals(0, _getObjectCount());
        objectCommandService.deleteObjects();
        Thread.sleep(1000); // Let writes settle
        assertEquals(0, _getObjectCount());
    }

    @Test
    public void testDeleteObjectsByCollectionId() throws Exception {
        _putObjects();
        for (final CollectionEntry collectionEntry : collectionQueryService.getCollections()) {
            assertNotEquals(0, _getObjectCountByCollectionId(collectionEntry.getId()));
            objectCommandService.deleteObjectsByCollectionId(collectionEntry.getId());
            Thread.sleep(1000); // Let writes settle
            assertEquals(0, _getObjectCountByCollectionId(collectionEntry.getId()));
        }
    }

    @Test
    public void testDeleteObjectsByInstitutionId() throws Exception {
        _putObjects();
        for (final InstitutionEntry institutionEntry : TestData.getInstance().getInstitutions()) {
            assertNotEquals(0, _getObjectCountByInstitutionId(institutionEntry.getId()));
            objectCommandService.deleteObjectsByInstitutionId(institutionEntry.getId());
            Thread.sleep(1000); // Let writes settle
            assertEquals(0, _getObjectCountByInstitutionId(institutionEntry.getId()));
        }
    }

    @Test
    public void testPutObject() throws Exception {
        assertEquals(0, _getObjectCount());
        _putObject();
        Thread.sleep(1000); // Let writes settle
        assertEquals(1, _getObjectCount());
    }

    @Test
    public void testPutObjects() throws Exception {
        assertEquals(0, _getObjectCount());
        _putObjects();
        Thread.sleep(1000); // Let writes settle
        assertEquals(TestData.getInstance().getObjects().size(), _getObjectCount());
    }
}
