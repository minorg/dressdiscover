package org.dressdiscover.lib.services.object;

import static org.junit.Assert.assertEquals;

import org.dressdiscover.api.models.collection.CollectionId;
import org.dressdiscover.api.models.institution.InstitutionId;
import org.dressdiscover.api.models.object.ObjectEntry;
import org.dressdiscover.api.models.object.ObjectQuery;
import org.dressdiscover.api.services.IoException;
import org.dressdiscover.api.services.collection.CollectionCommandService;
import org.dressdiscover.api.services.collection.CollectionQueryService;
import org.dressdiscover.api.services.institution.InstitutionCommandService;
import org.dressdiscover.api.services.institution.InstitutionQueryService;
import org.dressdiscover.api.services.object.GetObjectSummariesOptions;
import org.dressdiscover.api.services.object.ObjectCommandService;
import org.dressdiscover.api.services.object.ObjectQueryService;
import org.dressdiscover.api.services.object.ObjectSummaryQueryService;
import org.dressdiscover.lib.services.ServiceTest;
import org.dressdiscover.lib.services.collection.CollectionServiceTest;
import org.dressdiscover.lib.services.institution.InstitutionServiceTest;
import org.dressdiscover.lib.stores.object.ObjectSummaryElasticSearchIndex;
import org.dressdiscover.testdata.TestData;
import org.junit.After;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.thryft.waf.lib.logging.LoggingUtils;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;

public abstract class ObjectServiceTest extends ServiceTest {
    @Before
    public void setUp() throws Exception {
        collectionQueryService = _getInjector().getInstance(CollectionQueryService.class);
        institutionCommandService = _getInjector().getInstance(InstitutionCommandService.class);
        institutionQueryService = _getInjector().getInstance(InstitutionQueryService.class);
        objectCommandService = _getInjector().getInstance(ObjectCommandService.class);
        objectQueryService = _getInjector().getInstance(ObjectQueryService.class);
        objectSummaryElasticSearchIndex = _getInjector().getInstance(ObjectSummaryElasticSearchIndex.class);
        objectSummaryQueryService = _getInjector().getInstance(ObjectSummaryQueryService.class);

        tearDown();

        CollectionServiceTest.putCollections(institutionCommandService,
                _getInjector().getInstance(CollectionCommandService.class));
    }

    @After
    public void tearDown() throws Exception {
        InstitutionServiceTest.deleteInstitutions(institutionCommandService);
        objectSummaryElasticSearchIndex.deleteModels(logger, logMarker);
        try {
            objectSummaryElasticSearchIndex.refresh();
        } catch (final IoException e) {
        }
        assertEquals(0, objectSummaryElasticSearchIndex.countModels(logger, logMarker));
    }

    protected final int _getObjectCount() throws Exception {
        return _getObjectCount(Optional.absent());
    }

    protected final int _getObjectCount(final Optional<ObjectQuery> query) throws Exception {
        return objectSummaryQueryService
                .getObjectSummaries(Optional.of(GetObjectSummariesOptions.builder().setSize(0).build()), query)
                .getTotalHits();
    }

    protected final int _getObjectCountByCollectionId(final CollectionId collectionId) throws Exception {
        return _getObjectCount(Optional.of(ObjectQuery.builder().setCollectionId(collectionId).build()));
    }

    protected final int _getObjectCountByInstitutionId(final InstitutionId institutionId) throws Exception {
        return _getObjectCount(Optional.of(ObjectQuery.builder().setInstitutionId(institutionId).build()));
    }

    protected final ObjectEntry _putObject() throws Exception {
        for (final ObjectEntry objectEntry : TestData.getInstance().getObjects().values()) {
            objectCommandService.putObject(objectEntry.getId(), objectEntry.getModel());
            objectSummaryElasticSearchIndex.refresh();
            return objectEntry;
        }
        throw new IllegalStateException();
    }

    protected final ImmutableList<ObjectEntry> _putObjects() throws Exception {
        objectCommandService.putObjects(ImmutableList.copyOf(TestData.getInstance().getObjects().values()));
        while (true) {
            try {
                objectSummaryElasticSearchIndex.refresh();
            } catch (final IoException e) {
                break;
            }

            if (objectSummaryElasticSearchIndex.countModels(logger, logMarker) >= TestData.getInstance().getObjects()
                    .size()) {
                break;
            }
            Thread.sleep(100);
        }
        return ImmutableList.copyOf(TestData.getInstance().getObjects().values());
    }

    protected CollectionQueryService collectionQueryService;
    private InstitutionCommandService institutionCommandService;
    protected InstitutionQueryService institutionQueryService;
    protected ObjectCommandService objectCommandService;
    protected ObjectQueryService objectQueryService;
    protected ObjectSummaryElasticSearchIndex objectSummaryElasticSearchIndex;
    protected ObjectSummaryQueryService objectSummaryQueryService;
    private final static Logger logger = LoggerFactory.getLogger(ObjectServiceTest.class);
    private final static Marker logMarker = LoggingUtils.getMarker(ObjectServiceTest.class);
}
