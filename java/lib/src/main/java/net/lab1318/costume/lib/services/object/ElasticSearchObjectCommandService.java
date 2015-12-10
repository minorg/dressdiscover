package net.lab1318.costume.lib.services.object;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;

import org.elasticsearch.index.query.FilterBuilders;
import org.elasticsearch.index.query.QueryBuilders;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.models.object.Object;
import net.lab1318.costume.api.models.object.ObjectEntry;
import net.lab1318.costume.api.models.object.ObjectId;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.object.ObjectCommandService;
import net.lab1318.costume.lib.services.ServiceExceptionHelper;
import net.lab1318.costume.lib.services.object.LoggingObjectCommandService.Markers;
import net.lab1318.costume.lib.stores.object.ObjectElasticSearchIndex;

@Singleton
public class ElasticSearchObjectCommandService implements ObjectCommandService {
	@Inject
	public ElasticSearchObjectCommandService(final ObjectElasticSearchIndex elasticSearchIndex) {
		this.elasticSearchIndex = checkNotNull(elasticSearchIndex);
	}

	@Override
	public void deleteObjects() throws IoException {
		try {
			elasticSearchIndex.deleteIndex(logger, Markers.DELETE_OBJECTS);
			elasticSearchIndex.createIndex(logger, Markers.DELETE_OBJECTS);
		} catch (final IOException e) {
			throw ServiceExceptionHelper.wrapException(e, "error deleting objects");
		}
	}

	@Override
	public void deleteObjectsByCollectionId(final CollectionId collectionId) throws IoException {
		try {
			elasticSearchIndex
					.deleteModels(logger, Markers.DELETE_OBJECTS_BY_COLLECTION_ID,
							QueryBuilders.filteredQuery(QueryBuilders.matchAllQuery(),
									FilterBuilders.termFilter(Object.FieldMetadata.COLLECTION_ID.getThriftProtocolKey(),
											collectionId.toString())));
		} catch (final IOException e) {
			throw ServiceExceptionHelper.wrapException(e, "error deleting objects by collection id");
		}
	}

	@Override
	public void deleteObjectsByInstitutionId(final InstitutionId institutionId) throws IoException {
		try {
			elasticSearchIndex
					.deleteModels(logger, Markers.DELETE_OBJECTS_BY_INSTITUTION_ID,
							QueryBuilders.filteredQuery(QueryBuilders.matchAllQuery(),
									FilterBuilders.termFilter(
											Object.FieldMetadata.INSTITUTION_ID.getThriftProtocolKey(),
											institutionId.toString())));
		} catch (final IOException e) {
			throw ServiceExceptionHelper.wrapException(e, "error deleting objects by institution id");
		}
	}

	@Override
	public void putObject(final ObjectId id, final Object object) throws IoException {
		try {
			elasticSearchIndex.putModel(logger, Markers.PUT_OBJECT, new ObjectEntry(id, object));
		} catch (final IOException e) {
			throw ServiceExceptionHelper.wrapException(e, "error putting object");
		}
	}

	@Override
	public void putObjects(final ImmutableList<ObjectEntry> objects) throws IoException {
		try {
			elasticSearchIndex.putModels(logger, Markers.PUT_OBJECTS, objects);
		} catch (final IOException e) {
			throw ServiceExceptionHelper.wrapException(e, "error putting objects");
		}
	}

	private final ObjectElasticSearchIndex elasticSearchIndex;
	private final static Logger logger = LoggerFactory.getLogger(ElasticSearchObjectCommandService.class);
}
