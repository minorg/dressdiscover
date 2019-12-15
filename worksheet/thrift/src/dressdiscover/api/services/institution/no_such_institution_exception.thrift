namespace * dressdiscover.api.services.institution

include "dressdiscover/api/models/institution/institution_id.thrift"

// @java_extends org.thryft.waf.api.services.NoSuchModelException
exception NoSuchInstitutionException {
	optional institution_id.InstitutionId id;
}
