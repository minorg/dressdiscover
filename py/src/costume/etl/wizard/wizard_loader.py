from collections import OrderedDict
from os.path import os

from costume.api.models.collection.collection import Collection
from costume.api.models.institution.institution import Institution
from costume.api.models.object.object_entry import ObjectEntry
from costume.etl._loader import _Loader


class WizardLoader(_Loader):
    def __init__(self, **kwds):
        _Loader.__init__(self, institution_id='untvca', **kwds)
        self.__collection_id = self._institution_id + '/txfc'

    def _load(self):
        self._services.institution_command_service.put_institution(
            self._institution_id,
            Institution.Builder()
                .set_model_metadata(self._new_model_metadata())
                .set_title("Wizard views")
                .build()
        )

        self._services.collection_command_service.put_collection(
            self.__collection_id,
            Collection.Builder()
                .set_institution_id(self._institution_id)
                .set_model_metadata(self._new_model_metadata())
                .set_title("Texas Fashion Collection")
                .build()
        )

        objects_by_id = OrderedDict()
        for root_dir_path, _, file_names in os.walk(os.path.join(self._data_dir_path, 'extracted', 'txfc', 'record')):
            for file_name in file_names:
                file_path = os.path.join(root_dir_path, file_name)
                if not file_path.endswith('.xml'):
                    os.rename(file_path, file_path + '.xml')
                    file_path = file_path + '.xml'
                object_id, object_ = self.__parse_record(record_etree)
                objects_by_id[object_id] = object_

        self._logger.debug("putting %d objects to the service", len(objects_by_id))
        self._services.object_command_service.put_objects(
            tuple(ObjectEntry(object_id, object_)
                  for object_id, object_ in objects_by_id.iteritems())
        )
        self._logger.info("put %d objects to the service", len(objects_by_id))

