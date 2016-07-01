namespace bean_java org.dressdiscover.gui.models.institution
namespace java org.dressdiscover.api.models.institution
namespace * costume.api.models.institution

include "costume/api/models/institution/institution.thrift"
include "costume/api/models/institution/institution_id.thrift"

// @java_implements org.thryft.waf.api.models.ModelEntry<net.lab1318.costume.api.models.institution.Institution, net.lab1318.costume.api.models.institution.InstitutionId>
struct InstitutionEntry {
	institution_id.InstitutionId id;
	institution.Institution model;
}
