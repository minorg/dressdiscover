namespace bean_java net.lab1318.costume.gui.models.object
namespace java net.lab1318.costume.api.models.object
namespace * costume.api.models.object

include "costume/api/models/model_metadata.thrift"
include "costume/api/models/agent/agent_set.thrift"
include "costume/api/models/collection/collection_id.thrift"
include "costume/api/models/component/component_set.thrift"
include "costume/api/models/condition/condition.thrift"
include "costume/api/models/color/color_set.thrift"
include "costume/api/models/date/date_set.thrift"
include "costume/api/models/description/description_set.thrift"
include "costume/api/models/gender/gender.thrift"
include "costume/api/models/image/image.thrift"
include "costume/api/models/inscription/inscription_set.thrift"
include "costume/api/models/institution/institution_id.thrift"
include "costume/api/models/material/material_set.thrift"
include "costume/api/models/measurements/measurements_set.thrift"
include "costume/api/models/relation/relation_set.thrift"
include "costume/api/models/rights/rights_set.thrift"
include "costume/api/models/structure/structure_set.thrift"
include "costume/api/models/subject/subject_set.thrift"
include "costume/api/models/technique/technique_set.thrift"
include "costume/api/models/textref/textref_set.thrift"
include "costume/api/models/title/title_set.thrift"
include "costume/api/models/view_type/view_type.thrift"
include "costume/api/models/work_type/work_type_set.thrift"
include "thryft/native/u32.thrift"

// @java_implements org.thryft.waf.api.models.Model
struct Object {
	1: collection_id.CollectionId collection_id;

	2: institution_id.InstitutionId institution_id;

	14: model_metadata.ModelMetadata model_metadata;

	3: title_set.TitleSet titles;

	20: optional agent_set.AgentSet agents;

	// @elastic_search_mapping {"index": "not_analyzed"}
	// @validation {"minLength": 1}
	18: optional list<string> categories;

	30: optional color_set.ColorSet colors;

	32: optional component_set.ComponentSet components;

	27: optional condition.Condition condition;

	10: optional date_set.DateSet dates;

	4: optional description_set.DescriptionSet descriptions;

	25: optional gender.Gender gender;

	// @validation {"minLength": 1}
	23: optional list<image.Image> images;

	17: optional inscription_set.InscriptionSet inscriptions;

	15: optional material_set.MaterialSet materials;

	31: optional measurements_set.MeasurementsSet measurements;

	// Dublin Core freetext provenance
	// @validation {"minLength": 1}
	5: optional string provenance;

	26: optional u32.u32 quantity;

	29: optional relation_set.RelationSet relations;

	22: optional rights_set.RightsSet rights;

	33: optional structure_set.StructureSet structures;

	21: optional subject_set.SubjectSet subjects;

	16: optional technique_set.TechniqueSet techniques;

	9: optional textref_set.TextrefSet textrefs;

	28: optional view_type.ViewType view_type;

	24: optional work_type_set.WorkTypeSet work_types;
}
