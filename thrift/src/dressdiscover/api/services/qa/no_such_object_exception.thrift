namespace * dressdiscover.api.services.qa

include "dressdiscover/api/models/qa/qa_object_id.thrift"

// @java_extends org.thryft.waf.api.services.NoSuchModelException
exception NoSuchObjectException {
    optional qa_object_id.QaObjectId id;
}
