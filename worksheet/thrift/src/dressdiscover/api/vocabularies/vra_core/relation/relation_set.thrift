namespace * dressdiscover.api.vocabularies.vra_core.relation

include "dressdiscover/api/vocabularies/vra_core/relation/relation.thrift"

// VRA Core 4.0 relationSet element
// @java_implements org.dressdiscover.api.vocabularies.vra_core.ElementSet<org.dressdiscover.api.vocabularies.vra_core.relation.Relation>
struct RelationSet {
	// @validation {"minLength": 1}
	1: list<relation.Relation> elements;

	// @validation {"minLength": 1}
	2: optional string display;

	// @validation {"minLength": 1}
	3: optional string notes;
}
