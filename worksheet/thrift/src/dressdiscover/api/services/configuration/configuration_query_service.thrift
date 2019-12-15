namespace logging_service_java org.dressdiscover.lib.services.configuration
namespace servlet_java org.dressdiscover.server.controllers.configuration
namespace validating_service_java org.dressdiscover.lib.services.configuration
namespace * dressdiscover.api.services.configuration

include "dressdiscover/api/models/collection/collection_id.thrift"
include "dressdiscover/api/models/configuration/collection_configuration.thrift"
include "dressdiscover/api/models/configuration/institution_configuration.thrift"
include "dressdiscover/api/models/institution/institution_id.thrift"
include "dressdiscover/api/services/io_exception.thrift"

service ConfigurationQueryService {
    collection_configuration.CollectionConfiguration
    get_collection_configuration(
        collection_id.CollectionId collection_id
    ) throws (
        io_exception.IoException e
    );

	institution_configuration.InstitutionConfiguration
	get_institution_configuration(
		institution_id.InstitutionId institution_id
	) throws (
		io_exception.IoException e
	);
}
