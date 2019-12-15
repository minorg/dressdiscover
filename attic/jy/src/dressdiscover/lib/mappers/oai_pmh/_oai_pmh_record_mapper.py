from dressdiscover.lib.mappers._mapper import _Mapper


class _OaiPmhRecordMapper(_Mapper):
    class _ObjectBuilder(_Mapper._ObjectBuilder):
        def __init__(self, record_identifier, **kwds):
            _Mapper._ObjectBuilder.__init__(self, **kwds)
            self.__record_identifier = record_identifier

        @property
        def record_identifier(self):
            return self.__record_identifier

    def map_oai_pmh_record(self, collection_id, logger, log_marker, record_etree):
        raise NotImplementedError
