package net.lab1318.costume.lib.services.object;

import org.junit.After;
import org.junit.Before;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;

import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.models.object.ObjectEntry;
import net.lab1318.costume.api.models.object.ObjectQuery;
import net.lab1318.costume.api.services.collection.CollectionCommandService;
import net.lab1318.costume.api.services.collection.CollectionQueryService;
import net.lab1318.costume.api.services.institution.InstitutionCommandService;
import net.lab1318.costume.api.services.object.ObjectCommandService;
import net.lab1318.costume.api.services.object.ObjectQueryService;
import net.lab1318.costume.lib.services.ServiceTest;
import net.lab1318.costume.lib.services.TestData;

public abstract class ObjectServiceTest extends ServiceTest {
    @Before
    public void setUp() throws Exception {
        collectionCommandService = _getInjector().getInstance(CollectionCommandService.class);
        collectionQueryService = _getInjector().getInstance(CollectionQueryService.class);
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

    protected final int _getObjectCountByCollectionId(final CollectionId collectionId) throws Exception {
        return objectQueryService
                .getObjectCount(Optional.of(ObjectQuery.builder().setIncludeCollectionId(collectionId).build()))
                .intValue();
    }

    protected final int _getObjectCountByInstitutionId(final InstitutionId institutionId) throws Exception {
        return objectQueryService
                .getObjectCount(Optional.of(ObjectQuery.builder().setIncludeInstitutionId(institutionId).build()))
                .intValue();
    }

    protected final ImmutableList<ObjectEntry> _putObjects() throws Exception {
        for (final ObjectEntry objectEntry : TestData.getInstance().getObjects().values()) {
            objectCommandService.putObject(objectEntry.getId(), objectEntry.getModel());
        }
        Thread.sleep(1000); // Let writes settle
        return ImmutableList.copyOf(TestData.getInstance().getObjects().values());
    }

    private CollectionCommandService collectionCommandService;
    protected CollectionQueryService collectionQueryService;
    private InstitutionCommandService institutionCommandService;
    protected ObjectCommandService objectCommandService;
    protected ObjectQueryService objectQueryService;
}
