from os.path import os
import urllib
from xml.etree import ElementTree

from com.google.common.collect import ImmutableList
from net.lab1318.costume.api.services.object import NoSuchObjectException
from net.lab1318.costume.lib.stores.object import ObjectStore

from dressdiscover.lib.stores.object.py_object_store_factory import PyObjectStoreFactory
from net.lab1318.costume.lib.python import PythonApi


class OaiPmhFsObjectStore(ObjectStore):
    URI_SCHEME = 'oaipmhfs'

    def __init__(self, record_mapper, uri, **kwds):
        if isinstance(record_mapper, basestring):
            record_mapper_class_qname_split = record_mapper.split('.')
            record_mapper_class = __import__('.'.join(record_mapper_class_qname_split[:-1]))
            for component in record_mapper_class_qname_split[1:]:
                record_mapper_class = getattr(record_mapper_class, component)
            record_mapper = record_mapper_class()
        self.__record_mapper = record_mapper
        self.__uri = uri
        self.__data_dir_path = self.__uri.path.get()[1:].replace('/', os.path.sep)

    def getObjectById(self, logger, log_marker, object_id):
        record_identifier = object_id.getUnqualifiedObjectId()
        record_identifier = urllib.unquote(record_identifier)
        file_path = os.path.join(self.__data_dir_path, 'record', record_identifier + '.xml')
        if not os.path.isfile(file_path):
            raise NoSuchObjectException
        return self.__map_oai_pmh_record(collection_id=object_id.getCollectionId(), file_path=file_path)

    def getObjectsByCollectionId(self, collection_id, logger, log_marker):
        objects = []
        for root_dir_path, _, file_names in os.walk(os.path.join(self.__data_dir_path, 'record')):
            for file_name in file_names:
                file_path = os.path.join(root_dir_path, file_name)
                if not file_path.endswith('.xml'):
                    os.rename(file_path, file_path + '.xml')
                    file_path = file_path + '.xml'
                objects.append(self.__map_oai_pmh_record(collection_id=collection_id, file_path=file_path))
        return ImmutableList.copyOf(objects)

    def __map_oai_pmh_record(self, collection_id, file_path):
        return self.__record_mapper.map_oai_pmh_record(collection_id, record_etree=ElementTree.parse(file_path))

if PythonApi.getInstance() is not None:
    PythonApi.getInstance().getObjectStoreFactoryRegistry().registerObjectStoreFactory(PyObjectStoreFactory(OaiPmhFsObjectStore), OaiPmhFsObjectStore.URI_SCHEME)
