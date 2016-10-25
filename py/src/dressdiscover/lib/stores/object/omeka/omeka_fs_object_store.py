import json
from os.path import os

from com.google.common.collect import ImmutableList
from dressdiscover.lib.stores._fs_store import _FsStore
from dressdiscover.lib.stores.object.omeka._omeka_object_store import _OmekaObjectStore
from dressdiscover.lib.stores.object.py_object_store_factory import PyObjectStoreFactory
from org.dressdiscover.api.services.object import NoSuchObjectException
from org.dressdiscover.lib.python import PythonApi
from yomeka.client.omeka_json_parser import OmekaJsonParser


class OmekaFsObjectStore(_OmekaObjectStore, _FsStore):
    TYPE_STRING = 'omekafs'

    def __init__(self, *args, **kwds):
        _OmekaObjectStore.__init__(self, *args, **kwds)
        _FsStore.__init__(self, uri=self._uri)

    def getObjectById(self, logger, log_marker, object_id):
        for omeka_item in self.__get_omeka_items(collection_id=object_id.getCollectionId()):
            if str(omeka_item.id) == str(object_id.getUnqualifiedObjectId()):
                try:
                    object_entry = \
                        self._map_omeka_item(
                            collection_id=object_id.getCollectionId(),
                            logger=logger,
                            log_marker=log_marker,
                            omeka_item=omeka_item,
                            omeka_item_files=self.__get_omeka_item_files(institution_id=object_id.getInstitutionId(), omeka_item=omeka_item)
                        )
                    assert object_entry is not None
                    return object_entry.model
                except ValueError:
                    raise NoSuchObjectException
        raise NoSuchObjectException

    def getObjectsByCollectionId(self, collection_id, logger, log_marker):
        objects = []
        for omeka_item in self.__get_omeka_items(collection_id=collection_id):
            try:
                objects.append(
                    self._map_omeka_item(
                        collection_id=collection_id,
                        logger=logger,
                        log_marker=log_marker,
                        omeka_item=omeka_item,
                        omeka_item_files=self.__get_omeka_item_files(institution_id=collection_id.getInstitutionId(), omeka_item=omeka_item)
                    )
                )
            except ValueError, e:
                logger.debug(log_marker, str(e))
        return ImmutableList.copyOf(objects)

    def __get_omeka_item_files(self, institution_id, omeka_item):
        files_dir_path = os.path.join(self._data_dir_path, str(institution_id), 'files_by_item_id', str(omeka_item.id))
        if not os.path.isdir(files_dir_path):
            return tuple()
        omeka_item_files = []
        for file_file_path in os.listdir(files_dir_path):
            if not file_file_path.endswith('.json'):
                continue
            file_file_path = os.path.join(files_dir_path, file_file_path)
            if not os.path.isfile(file_file_path):
                continue
            with open(file_file_path, 'rb') as f:
                file_dict = json.load(f)
                omeka_item_files.append(OmekaJsonParser().parse_file_dict(file_dict))
        return tuple(omeka_item_files)

    def __get_omeka_items(self, collection_id):
        items_file_path = os.path.join(self._data_dir_path, str(collection_id.getInstitutionId()), 'collection', str(collection_id.getUnqualifiedCollectionId()), 'items.json')
        with open(items_file_path) as f:
            return OmekaJsonParser().parse_item_dicts(json.loads(f.read()))

PythonApi.getInstance().getObjectStoreFactoryRegistry().registerObjectStoreFactory(PyObjectStoreFactory(OmekaFsObjectStore), OmekaFsObjectStore.TYPE_STRING)
