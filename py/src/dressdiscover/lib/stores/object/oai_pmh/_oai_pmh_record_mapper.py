import logging

from org.dressdiscover.api.models.object import Object


class _OaiPmhRecordMapper(object):
    class _ObjectBuilder(object):
        def __init__(self, collection_id, institution_id, record_identifier, **kwds):
            self.__object_builder = Object.builder().setCollectionId(collection_id).setInstitutionId(institution_id)
            self.__record_identifier = record_identifier

        def build(self):
            raise NotImplementedError

        @property
        def _object_builder(self):
            return self.__object_builder

        @property
        def record_identifier(self):
            return self.__record_identifier

    def __init__(self):
        object.__init__(self)
        self._logger = logging.getLogger(self.__class__.__module__ + '.' + self.__class__.__name__)

    def map_oai_pmh_record(self, collection_id, record_etree):
        raise NotImplementedError
