namespace java net.lab1318.costume.api.services.institution
namespace * costume.api.services.institution

include "costume/api/models/institution/institution_id.thrift"

exception NoSuchInstitutionException {
	optional institution_id.InstitutionId id;
}
