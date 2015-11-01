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
        assertEquals(0, objectQueryService.getObjects().size());
        _postObjects();
        assertNotEquals(0, objectQueryService.getObjects().size());
        objectCommandService.deleteObjects();
        assertEquals(0, objectQueryService.getObjects().size());
    }

    @Test
    public void testDeleteObjectsByCollectionId() throws Exception {
        _postObjects();
        for (final CollectionEntry collectionEntry : collectionQueryService.getCollections()) {
            assertNotEquals(0, objectQueryService.getObjectsByCollectionId(collectionEntry.getId()).size());
            objectCommandService.deleteObjectsByCollectionId(collectionEntry.getId());
            assertEquals(0, objectQueryService.getObjectsByCollectionId(collectionEntry.getId()).size());
        }
    }

    @Test
    public void testDeleteObjectsByInstitutionId() throws Exception {
        _postObjects();
        for (final InstitutionEntry institutionEntry : TestData.getInstance().getInstitutions()) {
            assertNotEquals(0, objectQueryService.getObjectsByInstitutionId(institutionEntry.getId()).size());
            objectCommandService.deleteObjectsByInstitutionId(institutionEntry.getId());
            assertEquals(0, objectQueryService.getObjectsByInstitutionId(institutionEntry.getId()).size());
        }
    }

    @Test
    public void testPostObject() throws Exception {
        assertEquals(0, objectQueryService.getObjects().size());
        _postObjects();
        assertEquals(TestData.getInstance().getObjects().size(), objectQueryService.getObjects().size());
    }
}
