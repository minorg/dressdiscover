package org.dressdiscover.lib.services.object;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.dressdiscover.api.models.collection.CollectionEntry;
import org.dressdiscover.api.models.institution.InstitutionEntry;
import org.dressdiscover.api.models.object.ObjectEntry;
import org.dressdiscover.api.models.object.ObjectFacets;
import org.dressdiscover.api.models.object.ObjectSummaryEntry;
import org.dressdiscover.api.services.object.GetObjectSummariesOptions;
import org.dressdiscover.testdata.TestData;
import org.junit.Test;
import org.thryft.waf.lib.store.elasticsearch.ElasticSearchIndex;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

public final class ElasticSearchObjectSummaryQueryServiceTest extends ObjectServiceTest {
    @Test
    public void testGetObjectById() throws Exception {
        final ImmutableList<ObjectEntry> expected = _putObjects();
        for (final ObjectEntry entry : expected) {
            assertEquals(entry.getModel().getVraCore().get().getTitleSets(),
                    objectQueryService.getObjectById(entry.getId()).getVraCore().get().getTitleSets());
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

    @Test
    public void testGetObjectFacets() throws Exception {
        _putObjects();
        final ObjectFacets actual = objectSummaryQueryService
                .getObjectSummaries(
                        Optional.of(GetObjectSummariesOptions.builder().setIncludeFacets(true).setSize(0).build()))
                .getFacets().get();
        assertEquals(ImmutableSet.copyOf(TestData.getInstance().getCategories()), actual.getCategories().keySet());
        assertEquals(TestData.getInstance().getCollections().size(), actual.getCollections().size());
        assertEquals(TestData.getInstance().getInstitutions().size(), actual.getInstitutions().size());
        assertEquals(TestData.getInstance().getSubjects().size(), actual.getSubjectTermTexts().size());
    }

    @Test
    public void testGetObjectSummaries() throws Exception {
        final ImmutableList<ObjectEntry> expected = _putObjects();
        final ImmutableList<ObjectSummaryEntry> actual = objectSummaryQueryService
                .getObjectSummaries(Optional.of(GetObjectSummariesOptions.builder().setFrom_(0)
                        .setSize(ElasticSearchIndex.SEARCH_REQUEST_SIZE_MAX).build()))
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
