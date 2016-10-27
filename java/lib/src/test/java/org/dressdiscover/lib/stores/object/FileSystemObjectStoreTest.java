package org.dressdiscover.lib.stores.object;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.dressdiscover.api.models.collection.CollectionEntry;
import org.dressdiscover.api.models.collection.CollectionId;
import org.dressdiscover.api.models.object.ObjectEntry;
import org.dressdiscover.lib.properties.GlobalProperties;
import org.dressdiscover.lib.properties.StoreProperties;
import org.dressdiscover.lib.stores.StoreTest;
import org.dressdiscover.testdata.TestData;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.thryft.waf.lib.logging.LoggingUtils;

import com.google.common.collect.ImmutableList;

public final class FileSystemObjectStoreTest extends StoreTest {
    @Before
    public void setUp() {
        store = new FileSystemObjectStore(
                new File(_getInjector().getInstance(StoreProperties.class).getDataDirectoryPath()),
                _getInjector().getInstance(GlobalProperties.class));
    }

    @After
    public void tearDown() throws Exception {
        for (final CollectionEntry collectionEntry : TestData.getInstance().getCollections().values()) {
            store.deleteObjectsByCollectionId(collectionEntry.getId(), logger, logMarker);
        }
    }

    @Test
    public void testDeleteObjectsByCollectionId() throws Exception {
        __putObjects();
        for (final CollectionEntry collectionEntry : TestData.getInstance().getCollections().values()) {
            assertEquals(TestData.getInstance().getObjects().column(collectionEntry.getId()).size(),
                    __getObjectCount(collectionEntry.getId()));
            store.deleteObjectsByCollectionId(collectionEntry.getId(), logger, logMarker);
            assertEquals(0, __getObjectCount(collectionEntry.getId()));
        }
    }

    @Test
    public void testGetObjectsByCollectionId() throws Exception {
        __putObjects();

        for (final CollectionEntry collectionEntry : TestData.getInstance().getCollections().values()) {
            for (final ObjectEntry objectEntry : store.getObjectsByCollectionId(collectionEntry.getId(), logger,
                    logMarker)) {
                assertTrue(TestData.getInstance().getObjects().containsValue(objectEntry));
            }
        }
    }

    @Test
    public void testPutObject() throws Exception {
        __putObjects();
    }

    private int __getObjectCount(final CollectionId collectionId) throws Exception {
        return ImmutableList.copyOf(store.getObjectsByCollectionId(collectionId, logger, logMarker)).size();
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
