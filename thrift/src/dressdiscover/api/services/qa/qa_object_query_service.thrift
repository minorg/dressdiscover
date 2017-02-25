namespace * dressdiscover.api.services.qa

include "dressdiscover/api/models/qa/qa_object.thrift"
include "dressdiscover/api/models/qa/qa_object_id.thrift"
include "dressdiscover/api/services/io_exception.thrift"
include "dressdiscover/api/services/qa/no_such_object_exception.thrift"

service QaObjectQueryService {
    qa_object.QaObject
    get_object_by_id(
        qa_object_id.QaObjectId id
    ) throws (
        io_exception.IoException e1,
        no_such_object_exception.NoSuchObjectException e2
    );

    list<qa_object.QaObject>
    get_objects(
    ) throws (
        io_exception.IoException e
    );
}
