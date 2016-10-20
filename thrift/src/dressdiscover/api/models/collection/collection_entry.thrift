namespace * dressdiscover.api.models.collection

include "dressdiscover/api/models/collection/collection.thrift"
include "dressdiscover/api/models/collection/collection_id.thrift"

// @java_implements org.thryft.waf.api.models.ModelEntry<org.dressdiscover.api.models.collection.Collection, org.dressdiscover.api.models.collection.CollectionId>
struct CollectionEntry {
	collection_id.CollectionId id;
	collection.Collection model;
}
