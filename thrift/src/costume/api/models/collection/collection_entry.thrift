namespace bean_java net.lab1318.costume.gui.models.collection
namespace java net.lab1318.costume.api.models.collection
namespace * costume.api.models.collection

include "costume/api/models/collection/collection.thrift"
include "costume/api/models/collection/collection_id.thrift"

// @java_implements org.thryft.waf.api.models.ModelEntry<net.lab1318.costume.api.models.collection.Collection, net.lab1318.costume.api.models.collection.CollectionId>
struct CollectionEntry {
	collection_id.CollectionId id;
	collection.Collection model;
}
