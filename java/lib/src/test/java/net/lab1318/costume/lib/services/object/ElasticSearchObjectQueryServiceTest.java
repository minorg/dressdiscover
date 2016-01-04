package net.lab1318.costume.lib.services.object;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.UnsignedInteger;

import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.models.object.ObjectEntry;
import net.lab1318.costume.api.models.object.ObjectSummaryEntry;
import net.lab1318.costume.api.services.object.GetObjectSummariesOptions;
import net.lab1318.costume.api.services.object.ObjectFacets;
import net.lab1318.costume.lib.services.TestData;

public final class ElasticSearchObjectQueryServiceTest extends ObjectServiceTest {
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
        final ObjectFacets actual = objectQueryService.getObjectSummaries(Optional
                .of(GetObjectSummariesOptions.builder().setIncludeFacets(true).setSize(UnsignedInteger.ZERO).build()))
                .getFacets().get();
        assertEquals(TestData.getInstance().getAgents().size(), actual.getAgentNameTexts().size());
        assertEquals(ImmutableSet.copyOf(TestData.getInstance().getCategories()), actual.getCategories().keySet());
        assertEquals(TestData.getInstance().getCollections().size(), actual.getCollections().size());
        assertEquals(TestData.getInstance().getInstitutions().size(), actual.getInstitutions().size());
        assertEquals(TestData.getInstance().getSubjects().size(), actual.getSubjectTermTexts().size());
    }

    @Test
    public void testGetObjectSummaries() throws Exception {
        final ImmutableList<ObjectEntry> expected = _putObjects();
        final ImmutableList<ObjectSummaryEntry> actual = objectQueryService
                .getObjectSummaries(Optional.of(GetObjectSummariesOptions.builder().setFrom(UnsignedInteger.ZERO)
                        .setSize(UnsignedInteger.MAX_VALUE).build()))
                .getHits();
        assertEquals(TestData.getInstance().getObjects().size(), actual.size());
        for (final ObjectEntry expectedEntry : expected) {
            boolean found = false;
            for (final ObjectSummaryEntry actualEntry : actual) {
                if (actualEntry.getId().equals(expectedEntry.getId())) {
                    found = true;
                    break;
                }
            }
            assertTrue(found);
        }
    }
}
