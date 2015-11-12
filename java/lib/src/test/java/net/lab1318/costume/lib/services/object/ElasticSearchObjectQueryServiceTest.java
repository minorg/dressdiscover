package net.lab1318.costume.lib.services.object;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.google.common.collect.ImmutableList;
import com.google.common.primitives.UnsignedInteger;

import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.models.object.ObjectEntry;
import net.lab1318.costume.api.services.object.GetObjectsOptions;
import net.lab1318.costume.api.services.object.ObjectFacets;
import net.lab1318.costume.lib.services.TestData;

public final class ElasticSearchObjectQueryServiceTest extends ObjectServiceTest {
    @Test
    public void testGetObjectById() throws Exception {
        final ImmutableList<ObjectEntry> expected = _putObjects();
        for (final ObjectEntry entry : expected) {
            assertEquals(entry.getModel().getTitle(), objectQueryService.getObjectById(entry.getId()).getTitle());
        }
    }

    @Test
    public void testGetObjectCount() throws Exception {
        final ImmutableList<ObjectEntry> expected = _putObjects();
        assertEquals(expected.size(), objectQueryService.getObjectCount().intValue());
    }

    @Test
    public void testGetObjectCountByCollectionId() throws Exception {
        _putObjects();
        for (final CollectionEntry collectionEntry : collectionQueryService.getCollections()) {
            assertNotEquals(0, _getObjectCountByCollectionId(collectionEntry.getId()));
        }
    }

    @Test
    public void testGetObjectCountByInstitutionId() throws Exception {
        _putObjects();
        for (final InstitutionEntry institutionEntry : TestData.getInstance().getInstitutions()) {
            assertNotEquals(0, _getObjectCountByInstitutionId(institutionEntry.getId()));
        }
    }

    @Test
    public void testGetObjectFacets() throws Exception {
        _putObjects();
        final ObjectFacets actual = objectQueryService.getObjectFacets();
        assertEquals(TestData.getInstance().getCollections().size(), actual.getCollectionHits().size());
        assertEquals(TestData.getInstance().getInstitutions().size(), actual.getInstitutionHits().size());
    }

    @Test
    public void testGetObjects() throws Exception {
        final ImmutableList<ObjectEntry> expected = _putObjects();
        final ImmutableList<ObjectEntry> actual = objectQueryService.getObjects(
                GetObjectsOptions.builder().setFrom(UnsignedInteger.ZERO).setSize(UnsignedInteger.MAX_VALUE).build());
        assertEquals(TestData.getInstance().getObjects().size(), actual.size());
        for (final ObjectEntry expectedEntry : expected) {
            boolean found = false;
            for (final ObjectEntry actualEntry : actual) {
                if (actualEntry.getId().equals(expectedEntry.getId())) {
                    found = true;
                    assertEquals(expectedEntry.getModel(), actualEntry.getModel());
                    break;
                }
            }
            assertTrue(found);
        }
    }
}
