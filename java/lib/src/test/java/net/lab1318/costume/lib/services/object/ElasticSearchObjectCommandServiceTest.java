package net.lab1318.costume.lib.services.object;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import net.lab1318.costume.lib.services.TestData;

public final class ElasticSearchObjectCommandServiceTest extends ObjectServiceTest {
    @Test
    public void testDeleteObjects() throws Exception {
        assertEquals(0, objectQueryService.getObjects().size());
        _putObjects();
        assertNotEquals(0, objectQueryService.getObjects().size());
        objectCommandService.deleteObjects();
        assertEquals(0, objectQueryService.getObjects().size());
    }

    @Test
    public void testPutObjects() throws Exception {
        assertEquals(0, objectQueryService.getObjects().size());
        _putObjects();
        assertEquals(TestData.getInstance().getObjects().size(), objectQueryService.getObjects().size());
    }
}
