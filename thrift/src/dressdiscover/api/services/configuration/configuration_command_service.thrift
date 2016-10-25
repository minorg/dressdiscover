namespace logging_service_java org.dressdiscover.lib.services.configuration
namespace servlet_java org.dressdiscover.server.controllers.configuration
namespace validating_service_java org.dressdiscover.lib.services.configuration
namespace * dressdiscover.api.services.configuration

include "dressdiscover/api/models/collection/collection_id.thrift"
include "dressdiscover/api/models/configuration/collection_configuration.thrift"
include "dressdiscover/api/models/configuration/institution_configuration.thrift"
include "dressdiscover/api/models/institution/institution_id.thrift"
include "dressdiscover/api/services/io_exception.thrift"

service ConfigurationCommandService {
    void
    put_collection_configuration(
        collection_id.CollectionId collection_id,
        collection_configuration.CollectionConfiguration collection_configuration
    ) throws (
        io_exception.IoException e
    );

	void
	put_institution_configuration(
		institution_id.InstitutionId institution_id,
		institution_configuration.InstitutionConfiguration institution_configuration
	) throws (
		io_exception.IoException e
	);
}
