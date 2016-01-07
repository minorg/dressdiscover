package net.lab1318.costume.lib.services.collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.google.common.collect.ImmutableList;

import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.services.collection.NoSuchCollectionException;
import net.lab1318.costume.lib.services.TestData;

abstract class CollectionCommandServiceTest extends CollectionServiceTest {
    @Test
    public void testDeleteCollectionById() throws Exception {
        assertEquals(0, collectionQueryService.getCollections().size());
        final ImmutableList<CollectionEntry> expected = _putCollections();
        assertNotEquals(0, expected.size());
        for (final CollectionEntry collectionEntry : expected) {
            collectionQueryService.getCollectionById(collectionEntry.getId());
            collectionCommandService.deleteCollectionById(collectionEntry.getId());
            try {
                collectionQueryService.getCollectionById(collectionEntry.getId());
                fail();
            } catch (final NoSuchCollectionException e) {
            }
        }
    }

    @Test
    public void testDeleteCollections() throws Exception {
        assertEquals(0, collectionQueryService.getCollections().size());
        _putCollections();
        assertNotEquals(0, collectionQueryService.getCollections().size());
        collectionCommandService.deleteCollections();
        assertEquals(0, collectionQueryService.getCollections().size());
    }

    @Test
    public void testDeleteCollectionsByInstitutionId() throws Exception {
        assertEquals(0, collectionQueryService.getCollections().size());
        _putCollections();
        for (final InstitutionEntry institution : TestData.getInstance().getInstitutions()) {
            assertNotEquals(0, collectionQueryService.getCollectionsByInstitutionId(institution.getId()));
            collectionCommandService.deleteCollectionsByInstitutionId(institution.getId());
            assertEquals(0, collectionQueryService.getCollectionsByInstitutionId(institution.getId()).size());
        }
    }

    @Test
    public void testPutCollection() throws Exception {
        assertEquals(0, collectionQueryService.getCollections().size());
        _putCollections();
        assertEquals(TestData.getInstance().getCollections().size(), collectionQueryService.getCollections().size());
    }
}
