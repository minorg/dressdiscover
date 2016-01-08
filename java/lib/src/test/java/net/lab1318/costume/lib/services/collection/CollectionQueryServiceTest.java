package net.lab1318.costume.lib.services.collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.google.common.collect.ImmutableList;

import net.lab1318.costume.api.models.collection.Collection;
import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.lib.services.TestData;

public abstract class CollectionQueryServiceTest extends CollectionServiceTest {
    @Test
    public void testGetCollectionById() throws Exception {
        final ImmutableList<CollectionEntry> expected = _putCollections();
        for (final CollectionEntry collectionEntry : expected) {
            assertEquals(collectionEntry.getModel(), collectionQueryService.getCollectionById(collectionEntry.getId()));
        }
    }

    @Test
    public void testGetCollections() throws Exception {
        final ImmutableList<CollectionEntry> expected = _putCollections();
        final ImmutableList<CollectionEntry> actual = collectionQueryService.getCollections();
        assertEquals(expected.size(), actual.size());
        for (final CollectionEntry expectedEntry : expected) {
            boolean found = false;
            for (final CollectionEntry actualEntry : actual) {
                if (actualEntry.getId().equals(expectedEntry.getId())) {
                    found = true;
                    assertEquals(expectedEntry.getModel(), actualEntry.getModel());
                    break;
                }
            }
            assertTrue(found);
        }
    }

    @Test
    public void testGetCollectionsByIds() throws Exception {
        final ImmutableList<CollectionEntry> expected = _putCollections();
        final ImmutableList.Builder<CollectionId> idsBuilder = ImmutableList.builder();
        for (final CollectionEntry entry : expected) {
            idsBuilder.add(entry.getId());
        }
        final ImmutableList<Collection> actual = collectionQueryService.getCollectionsByIds(idsBuilder.build());
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i).getModel(), actual.get(i));
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
