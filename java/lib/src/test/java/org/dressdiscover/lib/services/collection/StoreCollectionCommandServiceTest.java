package org.dressdiscover.lib.services.collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

import org.dressdiscover.api.models.collection.CollectionEntry;
import org.dressdiscover.api.models.institution.InstitutionEntry;
import org.dressdiscover.testdata.TestData;
import org.junit.Test;

import com.google.common.collect.ImmutableList;

import net.lab1318.costume.api.services.collection.NoSuchCollectionException;

public final class StoreCollectionCommandServiceTest extends CollectionServiceTest {
    @Test
    public void testDeleteCollectionById() throws Exception {
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
    public void testDeleteCollectionsByInstitutionId() throws Exception {
        _putCollections();
        for (final InstitutionEntry institution : TestData.getInstance().getInstitutions()) {
            assertNotEquals(0, collectionQueryService.getCollectionsByInstitutionId(institution.getId()));
            collectionCommandService.deleteCollectionsByInstitutionId(institution.getId());
            assertEquals(0, collectionQueryService.getCollectionsByInstitutionId(institution.getId()).size());
        }
    }

    @Test
    public void testPutCollection() throws Exception {
        _putCollections();
        assertEquals(TestData.getInstance().getCollections().size(),
                collectionQueryService.getCollectionsByInstitutionId(institutionId).size());
    }
}
