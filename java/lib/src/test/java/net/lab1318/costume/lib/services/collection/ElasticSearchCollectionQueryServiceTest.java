package net.lab1318.costume.lib.services.collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.junit.Test;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

import net.lab1318.costume.api.models.collection.Collection;
import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.lib.services.TestData;

public final class ElasticSearchCollectionQueryServiceTest extends CollectionServiceTest {
    @Test
    public void testGetCollectionById() throws Exception {
        final ImmutableMap<CollectionId, Collection> expected = _putCollections();
        for (final Map.Entry<CollectionId, Collection> entry : expected.entrySet()) {
            assertEquals(entry.getValue(), collectionQueryService.getCollectionById(entry.getKey()));
        }
    }

    @Test
    public void testGetCollections() throws Exception {
        final ImmutableMap<CollectionId, Collection> expected = _putCollections();
        final ImmutableList<CollectionEntry> actual = collectionQueryService.getCollections();
        assertEquals(TestData.getInstance().getCollections().size(), actual.size());
        for (final Map.Entry<CollectionId, Collection> expectedEntry : expected.entrySet()) {
            boolean found = false;
            for (final CollectionEntry actualEntry : actual) {
                if (actualEntry.getId().equals(expectedEntry.getKey())) {
                    found = true;
                    assertEquals(expectedEntry.getValue(), actualEntry.getModel());
                    break;
                }
            }
            assertTrue(found);
        }
    }

    @Test
    public void testGetCollectionsByInstitutionId() throws Exception {
        _putCollections();
        for (final InstitutionEntry institution : TestData.getInstance().getInstitutions()) {
            assertNotEquals(0, collectionQueryService.getCollectionsByInstitutionId(institution.getId()));
        }
    }
}
