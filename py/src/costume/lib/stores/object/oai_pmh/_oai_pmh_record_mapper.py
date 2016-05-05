from costume.api.models.object.object import Object


class _OaiPmhRecordMapper(object):
    class _ObjectBuilder(object):
        def __init__(self, record_identifier, **kwds):
            self.__object_builder = Object.Builder(**kwds)
            self.__record_identifier = record_identifier

        def build(self):
            raise NotImplementedError

        @property
        def _object_builder(self):
            return self.__object_builder

        @property
        def record_identifier(self):
            return self.__record_identifier

    def map_oai_pmh_record(self, collection_id, record_etree):
        raise NotImplementedError
