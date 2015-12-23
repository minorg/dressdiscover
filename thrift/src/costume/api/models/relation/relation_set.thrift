namespace bean_java net.lab1318.costume.gui.models.relation
namespace java net.lab1318.costume.api.models.relation
namespace * costume.api.models.relation

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
