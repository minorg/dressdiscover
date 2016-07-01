namespace java org.dressdiscover.api.services.collection
namespace * costume.api.services.collection

include "costume/api/models/collection/collection_id.thrift"

exception NoSuchCollectionException {
	optional collection_id.CollectionId id;
}
