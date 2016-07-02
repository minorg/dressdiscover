from org.dressdiscover.api.models.object import Object


class _OaiPmhRecordMapper(object):
    class _ObjectBuilder(object):
        def __init__(self, collection_id, institution_id, logger, log_marker, record_identifier, **kwds):
            self.__object_builder = Object.builder().setCollectionId(collection_id).setInstitutionId(institution_id)
            self.__logger = logger
            self.__log_marker = log_marker
            self.__record_identifier = record_identifier

        def build(self):
            raise NotImplementedError

        @property
        def _object_builder(self):
            return self.__object_builder

        @property
        def logger(self):
            return self.__logger

        @property
        def log_marker(self):
            return self.__log_marker

        @property
        def record_identifier(self):
            return self.__record_identifier

    def map_oai_pmh_record(self, collection_id, logger, log_marker, record_etree):
        raise NotImplementedError
