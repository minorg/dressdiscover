package org.dressdiscover.lib.services.object;

import org.dressdiscover.api.models.object.ObjectEntry;
import org.dressdiscover.lib.services.object.ObjectSummarizer;
import org.dressdiscover.testdata.TestData;
import org.junit.Test;

public final class ObjectSummarizerTest {
    @Test
    public void runTest() {
        for (final ObjectEntry objectEntry : TestData.getInstance().getObjects().values()) {
            ObjectSummarizer.getInstance().summarizeObject(objectEntry.getModel());
        }
    }
}
