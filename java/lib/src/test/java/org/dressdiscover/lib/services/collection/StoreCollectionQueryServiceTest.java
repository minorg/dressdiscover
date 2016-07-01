package org.dressdiscover.lib.services.collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.dressdiscover.api.models.collection.Collection;
import org.dressdiscover.api.models.collection.CollectionEntry;
import org.dressdiscover.api.models.collection.CollectionId;
import org.dressdiscover.api.models.institution.InstitutionEntry;
import org.dressdiscover.testdata.TestData;
import org.junit.Test;

import com.google.common.collect.ImmutableList;

public final class StoreCollectionQueryServiceTest extends CollectionServiceTest {
    @Test
    public void testGetCollectionById() throws Exception {
        final ImmutableList<CollectionEntry> expected = _putCollections();
        for (final CollectionEntry collectionEntry : expected) {
            assertEquals(collectionEntry.getModel(), collectionQueryService.getCollectionById(collectionEntry.getId()));
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