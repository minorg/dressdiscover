namespace bean_java org.dressdiscover.gui.models.institution
namespace java org.dressdiscover.api.models.institution
namespace * dressdiscover.api.models.institution

include "dressdiscover/api/models/institution/institution.thrift"
include "dressdiscover/api/models/institution/institution_id.thrift"

// @java_implements org.thryft.waf.api.models.ModelEntry<org.dressdiscover.api.models.institution.Institution, org.dressdiscover.api.models.institution.InstitutionId>
struct InstitutionEntry {
	institution_id.InstitutionId id;
	institution.Institution model;
}
