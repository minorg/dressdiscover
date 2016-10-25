namespace * dressdiscover.api.services.configuration

include "dressdiscover/api/models/collection/collection_id.thrift"

// @java_extends org.thryft.waf.api.services.NoSuchModelException
exception NoSuchCollectionConfigurationException {
	optional collection_id.CollectionId id;
}
