package net.lab1318.costume.lib.services.object;

import org.junit.After;
import org.junit.Before;

import com.google.common.collect.ImmutableMap;

import net.lab1318.costume.api.models.object.Object;
import net.lab1318.costume.api.models.object.ObjectId;
import net.lab1318.costume.api.services.collection.CollectionCommandService;
import net.lab1318.costume.api.services.institution.InstitutionCommandService;
import net.lab1318.costume.api.services.object.ObjectCommandService;
import net.lab1318.costume.api.services.object.ObjectQueryService;
import net.lab1318.costume.lib.services.ServiceTest;
import net.lab1318.costume.lib.services.TestData;

abstract class ObjectServiceTest extends ServiceTest {
    @Before
    public void setUp() throws Exception {
        collectionCommandService = _getInjector().getInstance(CollectionCommandService.class);
        institutionCommandService = _getInjector().getInstance(InstitutionCommandService.class);
        objectCommandService = _getInjector().getInstance(ObjectCommandService.class);
        objectQueryService = _getInjector().getInstance(ObjectQueryService.class);
        tearDown();
    }

    @After
    public void tearDown() throws Exception {
        objectCommandService.deleteObjects();
        collectionCommandService.deleteCollections();
        institutionCommandService.deleteInstitutions();
    }

    protected final ImmutableMap<ObjectId, Object> _putObjects() throws Exception {
        final ImmutableMap.Builder<ObjectId, Object> resultBuilder = ImmutableMap.builder();
        for (final Object object : TestData.getInstance().getObjects().values()) {
            resultBuilder.put(objectCommandService.postObject(object), object);
        }
        Thread.sleep(1000); // Let writes settle
        return resultBuilder.build();
    }

    private CollectionCommandService collectionCommandService;
    private InstitutionCommandService institutionCommandService;
    protected ObjectCommandService objectCommandService;
    protected ObjectQueryService objectQueryService;
}
