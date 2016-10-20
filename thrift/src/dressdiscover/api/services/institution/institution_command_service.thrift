namespace java org.dressdiscover.api.services.institution
namespace json_rpc_client_py dressdiscover.client.services.institution
namespace logging_service_java org.dressdiscover.lib.services.institution
namespace servlet_java org.dressdiscover.server.controllers.institution
namespace validating_service_java org.dressdiscover.lib.services.institution
namespace * dressdiscover.api.services.institution

include "dressdiscover/api/models/institution/institution.thrift"
include "dressdiscover/api/models/institution/institution_id.thrift"
include "dressdiscover/api/services/institution/no_such_institution_exception.thrift"
include "dressdiscover/api/services/io_exception.thrift"

service InstitutionCommandService {
	void
	delete_institution_by_id(
		institution_id.InstitutionId id
	) throws (
		io_exception.IoException e1,
		no_such_institution_exception.NoSuchInstitutionException e2
	);

	void
	put_institution(
		institution_id.InstitutionId id,
		institution.Institution institution
	) throws (
		io_exception.IoException e
	);
}
