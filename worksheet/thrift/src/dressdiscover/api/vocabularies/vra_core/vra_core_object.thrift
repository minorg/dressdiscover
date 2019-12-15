namespace * dressdiscover.api.vocabularies.vra_core

include "dressdiscover/api/vocabularies/vra_core/agent/agent_set.thrift"
include "dressdiscover/api/vocabularies/vra_core/cultural_context/cultural_context_set.thrift"
include "dressdiscover/api/vocabularies/vra_core/date/date_set.thrift"
include "dressdiscover/api/vocabularies/vra_core/description/description_set.thrift"
include "dressdiscover/api/vocabularies/vra_core/inscription/inscription_set.thrift"
include "dressdiscover/api/vocabularies/vra_core/location/location_set.thrift"
include "dressdiscover/api/vocabularies/vra_core/material/material_set.thrift"
include "dressdiscover/api/vocabularies/vra_core/measurements/measurements_set.thrift"
include "dressdiscover/api/vocabularies/vra_core/relation/relation_set.thrift"
include "dressdiscover/api/vocabularies/vra_core/rights/rights_set.thrift"
include "dressdiscover/api/vocabularies/vra_core/subject/subject_set.thrift"
include "dressdiscover/api/vocabularies/vra_core/technique/technique_set.thrift"
include "dressdiscover/api/vocabularies/vra_core/textref/textref_set.thrift"
include "dressdiscover/api/vocabularies/vra_core/title/title_set.thrift"
include "dressdiscover/api/vocabularies/vra_core/work_type/work_type_set.thrift"

struct VraCoreObject {
    // @validation {"minLength": 1}
    1: optional list<agent_set.AgentSet> agent_sets;

    // @validation {"minLength": 1}
    2: optional list<cultural_context_set.CulturalContextSet> cultural_context_sets;

    // @validation {"minLength": 1}
    3: optional list<date_set.DateSet> date_sets;

    // @validation {"minLength": 1}
    4: optional list<description_set.DescriptionSet> description_sets;

    // @validation {"minLength": 1}
    5: optional list<inscription_set.InscriptionSet> inscription_sets;

    // @validation {"minLength": 1}
    6: optional list<location_set.LocationSet> location_sets;

    // @validation {"minLength": 1}
    7: optional list<material_set.MaterialSet> material_sets;

    // @validation {"minLength": 1}
    8: optional list<measurements_set.MeasurementsSet> measurements_sets;

    // @validation {"minLength": 1}
    9: optional list<relation_set.RelationSet> relation_sets;

    // @validation {"minLength": 1}
    10: optional list<rights_set.RightsSet> rights_sets;

    // @validation {"minLength": 1}
    11: optional list<subject_set.SubjectSet> subject_sets;

    // @validation {"minLength": 1}
    12: optional list<technique_set.TechniqueSet> technique_sets;

    // @validation {"minLength": 1}
    13: optional list<textref_set.TextrefSet> textref_sets;

    // @validation {"minLength": 1}
    14: optional list<title_set.TitleSet> title_sets;

    // @validation {"minLength": 1}
    15: optional list<work_type_set.WorkTypeSet> work_type_sets;
}
