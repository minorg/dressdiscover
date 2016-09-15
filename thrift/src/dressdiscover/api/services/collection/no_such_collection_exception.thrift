namespace java org.dressdiscover.api.services.collection
namespace * dressdiscover.api.services.collection

include "dressdiscover/api/models/collection/collection_id.thrift"

// @java_extends org.thryft.waf.api.services.NoSuchModelException
exception NoSuchCollectionException {
	optional collection_id.CollectionId id;
}
