package net.lab1318.costume.lib.services.object;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.junit.Test;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

import net.lab1318.costume.api.models.object.Object;
import net.lab1318.costume.api.models.object.ObjectEntry;
import net.lab1318.costume.api.models.object.ObjectId;
import net.lab1318.costume.lib.services.TestData;

public final class ElasticSearchObjectQueryServiceTest extends ObjectServiceTest {
    @Test
    public void testGetObjectById() throws Exception {
        final ImmutableMap<ObjectId, Object> expected = _putObjects();
        for (final Map.Entry<ObjectId, Object> entry : expected.entrySet()) {
            assertEquals(entry.getValue(), objectQueryService.getObjectById(entry.getKey()));
        }
    }

    @Test
    public void testGetObjects() throws Exception {
        final ImmutableMap<ObjectId, Object> expected = _putObjects();
        final ImmutableList<ObjectEntry> actual = objectQueryService.getObjects();
        assertEquals(TestData.getInstance().getObjects().size(), actual.size());
        for (final Map.Entry<ObjectId, Object> expectedEntry : expected.entrySet()) {
            boolean found = false;
            for (final ObjectEntry actualEntry : actual) {
                if (actualEntry.getId().equals(expectedEntry.getKey())) {
                    found = true;
                    assertEquals(expectedEntry.getValue(), actualEntry.getModel());
                    break;
                }
            }
            assertTrue(found);
        }
    }
}
