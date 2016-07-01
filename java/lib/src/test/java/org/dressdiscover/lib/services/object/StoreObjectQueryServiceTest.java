package org.dressdiscover.lib.services.object;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.dressdiscover.api.models.collection.CollectionEntry;
import org.dressdiscover.api.models.institution.InstitutionEntry;
import org.dressdiscover.api.models.object.ObjectEntry;
import org.dressdiscover.testdata.TestData;
import org.junit.Test;

import com.google.common.collect.ImmutableList;

public final class StoreObjectQueryServiceTest extends ObjectServiceTest {
    @Test
    public void testGetObjectById() throws Exception {
        final ImmutableList<ObjectEntry> expected = _putObjects();
        for (final ObjectEntry entry : expected) {
            assertEquals(entry.getModel().getTitles(), objectQueryService.getObjectById(entry.getId()).getTitles());
        }
    }

    @Test
    public void testGetObjectCount() throws Exception {
        final ImmutableList<ObjectEntry> expected = _putObjects();
        assertEquals(expected.size(), _getObjectCount());
    }

    @Test
    public void testGetObjectCountByCollectionId() throws Exception {
        _putObjects();
        for (final InstitutionEntry institutionEntry : TestData.getInstance().getInstitutions()) {
            for (final CollectionEntry collectionEntry : collectionQueryService
                    .getCollectionsByInstitutionId(institutionEntry.getId())) {
                assertNotEquals(0, _getObjectCountByCollectionId(collectionEntry.getId()));
            }
        }
    }

    @Test
    public void testGetObjectCountByInstitutionId() throws Exception {
        _putObjects();
        for (final InstitutionEntry institutionEntry : TestData.getInstance().getInstitutions()) {
            assertNotEquals(0, _getObjectCountByInstitutionId(institutionEntry.getId()));
        }
    }
}
