namespace controller_cs DressDiscover.Server.Controllers.Worksheet
namespace cs DressDiscover.Api.Services.Worksheet
namespace * dressdiscover.api.services.worksheet

include "dressdiscover/api/services/io_exception.thrift"

service WorksheetPingQueryService {
    string
    ping(string message)
    throws (
        io_exception.IoException e
    );
}
