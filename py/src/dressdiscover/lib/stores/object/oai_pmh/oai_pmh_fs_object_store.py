from os.path import os
import urllib
from xml.etree import ElementTree

from com.google.common.collect import ImmutableList
from org.dressdiscover.api.services.object import NoSuchObjectException
from org.dressdiscover.lib.python import PythonApi

from dressdiscover.lib.stores._fs_store import _FsStore
from dressdiscover.lib.stores.object._py_object_store import _PyObjectStore
from dressdiscover.lib.stores.object.py_object_store_factory import PyObjectStoreFactory


class OaiPmhFsObjectStore(_PyObjectStore, _FsStore):
    TYPE_STRING = 'oaipmhfs'

    def __init__(self, data_directory_path, record_mapper, **kwds):
        _FsStore.__init__(self, data_directory_path=data_directory_path)
        if isinstance(record_mapper, basestring):
            record_mapper_class_qname_split = record_mapper.split('.')
            record_mapper_class = __import__('.'.join(record_mapper_class_qname_split[:-1]))
            for component in record_mapper_class_qname_split[1:]:
                record_mapper_class = getattr(record_mapper_class, component)
            record_mapper = record_mapper_class()
        self.__record_mapper = record_mapper

    def _get_object_by_id(self, logger, log_marker, object_id):
        record_identifier = object_id.getUnqualifiedObjectId()
        unquoted_record_identifier = urllib.unquote(record_identifier)
        safe_record_identifier = unquoted_record_identifier.replace('/', '_').replace(':', '_')
        file_path = os.path.join(self._data_dir_path, 'record', safe_record_identifier + '.xml')
        if not os.path.isfile(file_path):
            raise NoSuchObjectException
        return \
            self.__map_oai_pmh_record(
                collection_id=object_id.getCollectionId(),
                file_path=file_path,
                logger=logger,
                log_marker=log_marker
            ).model

    def _get_objects_by_collection_id(self, collection_id, logger, log_marker):
        objects = []
        for root_dir_path, _, file_names in os.walk(os.path.join(self._data_dir_path, 'record')):
            for file_name in file_names:
                file_path = os.path.join(root_dir_path, file_name)
                if not file_path.endswith('.xml'):
                    os.rename(file_path, file_path + '.xml')
                    file_path = file_path + '.xml'
                objects.append(
                    self.__map_oai_pmh_record(
                        collection_id=collection_id,
                        file_path=file_path,
                        logger=logger,
                        log_marker=log_marker
                ))
        return ImmutableList.copyOf(objects)

    def __map_oai_pmh_record(self, collection_id, file_path, logger, log_marker):
        return \
            self.__record_mapper.map_oai_pmh_record(
                collection_id,
                logger=logger,
                log_marker=log_marker,
                record_etree=ElementTree.parse(file_path)
            )

if PythonApi.getInstance() is not None:
    PythonApi.getInstance().getObjectStoreFactoryRegistry().registerObjectStoreFactory(PyObjectStoreFactory(OaiPmhFsObjectStore), OaiPmhFsObjectStore.TYPE_STRING)
