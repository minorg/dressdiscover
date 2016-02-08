package net.lab1318.costume.lib.services.object;

import org.junit.After;
import org.junit.Before;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.UnsignedInteger;

import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.models.object.ObjectEntry;
import net.lab1318.costume.api.models.object.ObjectQuery;
import net.lab1318.costume.api.services.collection.CollectionCommandService;
import net.lab1318.costume.api.services.collection.CollectionQueryService;
import net.lab1318.costume.api.services.institution.InstitutionCommandService;
import net.lab1318.costume.api.services.object.GetObjectSummariesOptions;
import net.lab1318.costume.api.services.object.ObjectCommandService;
import net.lab1318.costume.api.services.object.ObjectQueryService;
import net.lab1318.costume.api.services.object.ObjectSummaryQueryService;
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
		objectSummaryQueryService = _getInjector().getInstance(ObjectSummaryQueryService.class);
		tearDown();
	}

	@After
	public void tearDown() throws Exception {
		objectCommandService.deleteObjects();
		collectionCommandService.deleteCollections();
		institutionCommandService.deleteInstitutions();
		Thread.sleep(1000);
	}

	protected final int _getObjectCount() throws Exception {
		return _getObjectCount(Optional.absent());
	}

	protected final int _getObjectCount(final Optional<ObjectQuery> query) throws Exception {
		return objectSummaryQueryService
				.getObjectSummaries(
						Optional.of(GetObjectSummariesOptions.builder().setSize(UnsignedInteger.ZERO).build()), query)
				.getTotalHits().intValue();
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
			Thread.sleep(500); // Let writes settle
			return objectEntry;
		}
		throw new IllegalStateException();
	}

	protected final ImmutableList<ObjectEntry> _putObjects() throws Exception {
		objectCommandService.putObjects(ImmutableList.copyOf(TestData.getInstance().getObjects().values()));
		Thread.sleep(1000); // Let writes settle
		return ImmutableList.copyOf(TestData.getInstance().getObjects().values());
	}

	private CollectionCommandService collectionCommandService;
	protected CollectionQueryService collectionQueryService;
	private InstitutionCommandService institutionCommandService;
	protected ObjectCommandService objectCommandService;
	protected ObjectQueryService objectQueryService;
	protected ObjectSummaryQueryService objectSummaryQueryService;
}
