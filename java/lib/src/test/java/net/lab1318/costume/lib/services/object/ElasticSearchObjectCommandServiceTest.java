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
        assertEquals(0, objectQueryService.getObjectCount().intValue());
        _postObjects();
        assertNotEquals(0, objectQueryService.getObjectCount().intValue());
        objectCommandService.deleteObjects();
        assertEquals(0, objectQueryService.getObjectCount().intValue());
    }

    @Test
    public void testDeleteObjectsByCollectionId() throws Exception {
        _postObjects();
        for (final CollectionEntry collectionEntry : collectionQueryService.getCollections()) {
            assertNotEquals(0, objectQueryService.getObjectCountByCollectionId(collectionEntry.getId()).intValue());
            objectCommandService.deleteObjectsByCollectionId(collectionEntry.getId());
            assertEquals(0, objectQueryService.getObjectCountByCollectionId(collectionEntry.getId()).intValue());
        }
    }

    @Test
    public void testDeleteObjectsByInstitutionId() throws Exception {
        _postObjects();
        for (final InstitutionEntry institutionEntry : TestData.getInstance().getInstitutions()) {
            assertNotEquals(0, objectQueryService.getObjectCountByInstitutionId(institutionEntry.getId()).intValue());
            objectCommandService.deleteObjectsByInstitutionId(institutionEntry.getId());
            assertEquals(0, objectQueryService.getObjectCountByInstitutionId(institutionEntry.getId()).intValue());
        }
    }

    @Test
    public void testPostObject() throws Exception {
        assertEquals(0, objectQueryService.getObjectCount().intValue());
        _postObjects();
        assertEquals(TestData.getInstance().getObjects().size(), objectQueryService.getObjectCount().intValue());
    }
}
