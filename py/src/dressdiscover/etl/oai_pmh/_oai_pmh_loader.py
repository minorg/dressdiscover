from collections import OrderedDict
from os.path import os
import urllib
from xml.etree import ElementTree

from dressdiscover.api.models.object.object import Object
from dressdiscover.etl._institution_loader import _InstitutionLoader


class _OaiPmhLoader(_InstitutionLoader):
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

    def __init__(self, collection_id, **kwds):
        _InstitutionLoader.__init__(self, **kwds)
        self.__collection_id = collection_id

    @property
    def _collection_id(self):
        return self.__collection_id

    def _load(self, dry_run):
        if dry_run:
            self._logger.info("dry run, not putting institution %s", self._institution_id)
        else:
            self._put_institution()

        if dry_run:
            self._logger.info("dry run, not putting collection %s", self.__collection_id)
        else:
            self._put_collection()

        objects_by_id = self._parse_records()

        if dry_run:
            self._logger.info("dry run, not putting %d objects to collection %s", len(objects_by_id), self.__collection_id)
        else:
            self._logger.info("putting %d objects to collection %s", len(objects_by_id), self.__collection_id)
            self._put_objects_by_id(objects_by_id)

    def _parse_record(self, record_etree):
        # info:ark/67531/metadc114731
        record_identifier = record_etree.find('header').find('identifier').text
        object_id = self.__collection_id + '/' + urllib.quote(record_identifier, '')

        metadata_etree = record_etree.find('metadata')

        result = \
            self._parse_record_metadata(
                object_id=object_id,
                record_identifier=record_identifier,
                record_metadata_etree=metadata_etree
            )
        if result is None:
            self._logger.debug("ignoring record %s", record_identifier)
        return result

    def _parse_record_metadata(self, object_id, record_identifier, record_metadata_etree):
        raise NotImplementedError

    def _parse_records(self):
        objects_by_id = OrderedDict()
        for root_dir_path, _, file_names in os.walk(os.path.join(self._data_dir_path, 'extracted', self._institution_id, 'record')):
            for file_name in file_names:
                file_path = os.path.join(root_dir_path, file_name)
                if not file_path.endswith('.xml'):
                    os.rename(file_path, file_path + '.xml')
                    file_path = file_path + '.xml'
                record_etree = ElementTree.parse(file_path)
                result = self._parse_record(record_etree)
                if result is None:
                    continue
                object_id, object_ = result
                objects_by_id[object_id] = object_
        return objects_by_id

    def _put_collection(self):
        raise NotImplementedError

    def _put_institution(self):
        raise NotImplementedError
