namespace java org.dressdiscover.api.services.institution
namespace json_rpc_client_py costume.client.services.institution
namespace logging_service_java net.lab1318.costume.lib.services.institution
namespace servlet_java net.lab1318.costume.server.controllers.institution
namespace validating_service_java net.lab1318.costume.lib.services.institution
namespace * costume.api.services.institution

include "costume/api/models/institution/institution.thrift"
include "costume/api/models/institution/institution_id.thrift"
include "costume/api/services/io_exception.thrift"
include "costume/api/services/institution/no_such_institution_exception.thrift"

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
