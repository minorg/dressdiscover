package net.lab1318.costume.lib.services.object;

import org.junit.Test;

import net.lab1318.costume.api.models.object.ObjectEntry;
import net.lab1318.costume.testdata.TestData;

public final class ObjectSummarizerTest {
    @Test
    public void runTest() {
        for (final ObjectEntry objectEntry : TestData.getInstance().getObjects().values()) {
            ObjectSummarizer.getInstance().summarizeObject(objectEntry.getModel());
        }
    }
}
