namespace * dressdiscover.api.models.configuration

include "dressdiscover/api/models/configuration/institution_configuration.thrift"
include "dressdiscover/api/models/institution/institution_id.thrift"

// @java_implements org.thryft.waf.api.models.ModelEntry<org.dressdiscover.api.models.configuration.InstitutionConfiguration, org.dressdiscover.api.models.institution.InstitutionId>
struct InstitutionConfigurationEntry {
    institution_id.InstitutionId id;
    institution_configuration.InstitutionConfiguration model;
}
