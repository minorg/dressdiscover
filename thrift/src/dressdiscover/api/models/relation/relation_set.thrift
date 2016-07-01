namespace bean_java org.dressdiscover.gui.models.relation
namespace java org.dressdiscover.api.models.relation
namespace * dressdiscover.api.models.relation

include "costume/api/models/relation/relation.thrift"

// VRA Core 4.0 relationSet element
// @java_implements net.lab1318.costume.api.models.ElementSet<net.lab1318.costume.api.models.relation.Relation>
struct RelationSet {
	// @validation {"minLength": 1}
	1: list<relation.Relation> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}