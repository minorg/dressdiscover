namespace java org.dressdiscover.api.services.institution
namespace json_rpc_client_py dressdiscover.client.services.institution
namespace logging_service_java org.dressdiscover.lib.services.institution
namespace servlet_java org.dressdiscover.server.controllers.institution
namespace validating_service_java org.dressdiscover.lib.services.institution
namespace * dressdiscover.api.services.institution

include "dressdiscover/api/models/institution/institution.thrift"
include "dressdiscover/api/models/institution/institution_entry.thrift"
include "dressdiscover/api/models/institution/institution_id.thrift"
include "dressdiscover/api/services/io_exception.thrift"
include "dressdiscover/api/services/institution/no_such_institution_exception.thrift"

service InstitutionQueryService {
	institution.Institution
	get_institution_by_id(
		institution_id.InstitutionId id
	) throws (
		io_exception.IoException e1,
		no_such_institution_exception.NoSuchInstitutionException e2
	);

	list<institution_entry.InstitutionEntry>
	get_institutions(
	) throws (
		io_exception.IoException e
	);

	list<institution.Institution>
	get_institutions_by_ids(
		list<institution_id.InstitutionId> ids
	) throws (
		io_exception.IoException e1,
		no_such_institution_exception.NoSuchInstitutionException e2
	);
}
