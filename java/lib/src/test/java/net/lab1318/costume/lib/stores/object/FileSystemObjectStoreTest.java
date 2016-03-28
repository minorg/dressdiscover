package net.lab1318.costume.lib.stores.object;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.thryft.waf.lib.logging.LoggingUtils;

import com.google.common.collect.ImmutableList;

import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.object.ObjectEntry;
import net.lab1318.costume.lib.CostumeProperties;
import net.lab1318.costume.testdata.TestData;

public final class FileSystemObjectStoreTest {
    @Before
    public void setUp() {
        store = new FileSystemObjectStore(CostumeProperties.load());
    }

    @After
    public void tearDown() throws Exception {
        for (final CollectionEntry collectionEntry : TestData.getInstance().getCollections().values()) {
            store.deleteObjectsByCollectionId(collectionEntry.getId(), logger, logMarker);
        }
    }

    @Test
    public void testDeleteObjectsByCollectionId() throws Exception {
        assertEquals(0, __getObjectCount());
        __putObjects();
        assertEquals(TestData.getInstance().getObjects().size(), __getObjectCount());
        for (final CollectionEntry collectionEntry : TestData.getInstance().getCollections().values()) {
            store.deleteObjectsByCollectionId(collectionEntry.getId(), logger, logMarker);
        }
        assertEquals(0, __getObjectCount());
    }

    @Test
    public void testGetObjects() throws Exception {
        __putObjects();
        for (final ObjectEntry objectEntry : store.getObjects(logger, logMarker)) {
            assertTrue(TestData.getInstance().getObjects().containsValue(objectEntry));
        }
    }

    @Test
    public void testPutObject() throws Exception {
        __putObjects();
    }

    private int __getObjectCount() throws Exception {
        return ImmutableList.copyOf(store.getObjects(logger, logMarker)).size();
    }

    private void __putObjects() throws Exception {
        for (final ObjectEntry objectEntry : TestData.getInstance().getObjects().values()) {
            store.putObject(logger, logMarker, objectEntry.getModel(), objectEntry.getId());
        }
    }

    private FileSystemObjectStore store;
    private final static Logger logger = LoggerFactory.getLogger(FileSystemObjectStoreTest.class);
    private final static Marker logMarker = LoggingUtils.getMarker(FileSystemObjectStoreTest.class);
}
