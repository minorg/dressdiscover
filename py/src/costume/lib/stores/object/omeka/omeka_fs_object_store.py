import json
from os.path import os

from costume.lib.stores.object.omeka._omeka_object_store import _OmekaObjectStore
from yomeka.client.omeka_json_parser import OmekaJsonParser


class OmekaFsObjectStore(_OmekaObjectStore):
    def __init__(self, *args, **kwds):
        _OmekaObjectStore.__init__(self, *args, **kwds)
        self.__data_dir_path = self._uri.path.get()[1:].replace('/', os.path.sep)

    def getObjectById(self, logger, logMarker, objectId):
        file_path = os.path.join(self.__data_dir_path, 'extracted', 'collection', str(objectId.getCollectionId().getUnqualifiedCollectionId()), 'items.json')
        with open(file_path) as f:
            omeka_item = OmekaJsonParser().parse_item_dict(json.loads(f.read()))
            return \
                self._mapper.map_omeka_item(
                    collection_id=objectId.getCollectionId(),
                    omeka_item=omeka_item,
                    omeka_item_files=self.__get_omeka_item_files(institution_id=objectId.getInstitutionId(), omeka_item=omeka_item)
                )

    def __get_omeka_item_files(self, institution_id, omeka_item):
        files_dir_path = os.path.join(self.__data_dir_path, 'extracted', str(institution_id), 'files_by_item_id', str(omeka_item.id))
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

