namespace java org.dressdiscover.api.services.object
namespace * dressdiscover.api.services.object

include "dressdiscover/api/models/object/object_id.thrift"

// @java_extends org.thryft.waf.api.services.NoSuchModelException
exception NoSuchObjectException {
    optional object_id.ObjectId id;
}
