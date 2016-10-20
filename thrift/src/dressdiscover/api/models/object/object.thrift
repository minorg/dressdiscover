namespace bean_java org.dressdiscover.gui.models.object
namespace java org.dressdiscover.api.models.object
namespace * dressdiscover.api.models.object

include "dressdiscover/api/models/collection/collection_id.thrift"
include "dressdiscover/api/models/image/image.thrift"
include "dressdiscover/api/models/institution/institution_id.thrift"
include "dressdiscover/api/vocabularies/costume_core/closure/closure_set.thrift"
include "dressdiscover/api/vocabularies/costume_core/component/component_set.thrift"
include "dressdiscover/api/vocabularies/costume_core/condition/condition.thrift"
include "dressdiscover/api/vocabularies/costume_core/color/color_set.thrift"
include "dressdiscover/api/vocabularies/costume_core/gender/gender.thrift"
include "dressdiscover/api/vocabularies/costume_core/structure/structure_set.thrift"
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
include "dressdiscover/api/vocabularies/vra_core/view_type/view_type.thrift"
include "dressdiscover/api/vocabularies/vra_core/work_type/work_type_set.thrift"

// @java_implements org.thryft.waf.api.models.Model
struct Object {
	1: collection_id.CollectionId collection_id;

	2: institution_id.InstitutionId institution_id;

	3: title_set.TitleSet titles;

	20: optional agent_set.AgentSet agents;

	// @validation {"minLength": 1}
	18: optional list<string> categories;

	34: optional closure_set.ClosureSet closures;

	30: optional color_set.ColorSet colors;

	32: optional component_set.ComponentSet components;

	27: optional condition.Condition condition;

	35: optional cultural_context_set.CulturalContextSet cultural_contexts;

	10: optional date_set.DateSet dates;

	4: optional description_set.DescriptionSet descriptions;

	25: optional gender.Gender gender;

	// @validation {"acceptance": true}
	37: optional bool hidden;

	// @validation {"minLength": 1}
	23: optional list<image.Image> images;

	17: optional inscription_set.InscriptionSet inscriptions;

	36: optional location_set.LocationSet locations;

	15: optional material_set.MaterialSet materials;

	31: optional measurements_set.MeasurementsSet measurements;

	// Dublin Core freetext provenance
	// @validation {"minLength": 1}
	5: optional string provenance;

    // @validation {"min": 1}
	26: optional i32 quantity;

	29: optional relation_set.RelationSet relations;

	22: optional rights_set.RightsSet rights;

	33: optional structure_set.StructureSet structures;

	21: optional subject_set.SubjectSet subjects;

	16: optional technique_set.TechniqueSet techniques;

	9: optional textref_set.TextrefSet textrefs;

	28: optional view_type.ViewType view_type;

	24: optional work_type_set.WorkTypeSet work_types;
}
