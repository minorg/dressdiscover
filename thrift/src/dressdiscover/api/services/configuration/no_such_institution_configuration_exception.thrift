namespace * dressdiscover.api.services.configuration

include "dressdiscover/api/models/institution/institution_id.thrift"

// @java_extends org.thryft.waf.api.services.NoSuchModelException
exception NoSuchInstitutionConfigurationException {
	optional institution_id.InstitutionId id;
}
