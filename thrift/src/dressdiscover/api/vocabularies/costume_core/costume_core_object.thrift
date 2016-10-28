namespace * dressdiscover.api.vocabularies.costume_core

include "dressdiscover/api/vocabularies/costume_core/closure/closure_set.thrift"
include "dressdiscover/api/vocabularies/costume_core/color/color_set.thrift"
include "dressdiscover/api/vocabularies/costume_core/component/component_set.thrift"
include "dressdiscover/api/vocabularies/costume_core/condition/condition.thrift"
include "dressdiscover/api/vocabularies/costume_core/gender/gender.thrift"
include "dressdiscover/api/vocabularies/costume_core/structure/structure_set.thrift"
include "dressdiscover/api/vocabularies/costume_core/view_type/view_type.thrift"

struct CostumeCoreObject {
    // @validation {"minLength": 1}
    1: optional list<closure_set.ClosureSet> closure_sets;

    // @validation {"minLength": 1}
    2: optional list<color_set.ColorSet> color_sets;

    // @validation {"minLength": 1}
    3: optional list<component_set.ComponentSet> component_sets;

    4: optional condition.Condition condition;

    5: optional gender.Gender gender;

    // @validation {"minLength": 1}
    6: optional list<structure_set.StructureSet> structure_sets;

    7: optional view_type.ViewType view_type;
}
