namespace java org.dressdiscover.api.services.institution
namespace * costume.api.services.institution

include "costume/api/models/institution/institution_id.thrift"

exception NoSuchInstitutionException {
	optional institution_id.InstitutionId id;
}
