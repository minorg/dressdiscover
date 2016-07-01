namespace java org.dressdiscover.api.services.collection
namespace * dressdiscover.api.services.collection

include "dressdiscover/api/models/collection/collection_id.thrift"

exception NoSuchCollectionException {
	optional collection_id.CollectionId id;
}
