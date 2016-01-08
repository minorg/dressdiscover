package net.lab1318.costume.lib.services.object;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.google.common.collect.ImmutableList;

import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.models.object.ObjectEntry;
import net.lab1318.costume.lib.services.TestData;

public final class FileSystemObjectQueryServiceTest extends ObjectServiceTest {
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
}
