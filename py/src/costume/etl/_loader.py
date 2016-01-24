from datetime import datetime

from costume.api.models.collection.collection import Collection
from costume.api.models.model_metadata import ModelMetadata
from costume.api.models.object.object_entry import ObjectEntry
from costume.api.services.institution.no_such_institution_exception import NoSuchInstitutionException
from costume.etl._main import _Main
from costume.lib.costume_properties import CostumeProperties
from services import Services


class _Loader(_Main):
    def __init__(self, institution_id, clean=False, dry_run=False, **kwds):
        _Main.__init__(self, **kwds)
        self.__clean = clean
        self.__dry_run = dry_run
        self.__institution_id = institution_id
        self.__properties = CostumeProperties.load()
        self.__services = Services(properties=self.__properties)

    @classmethod
    def _add_arguments(cls, argument_parser):
        argument_parser.add_argument('--clean', action='store_true')
        argument_parser.add_argument('--dry-run', action='store_true')

    def _clean(self):
        if self.__dry_run:
            self._logger.info("dry run, not deleting insittution %s", self._institution_id)
            return
        try:
            self._services.institution_command_service.delete_institution_by_id(self._institution_id)
        except NoSuchInstitutionException:
            self._logger.debug("institution %s does not exist (yet)", self._institution_id)

    @staticmethod
    def __get_nonempty_value(dict_, key):
        value = dict_.get(key)
        if value is None:
            return None
        elif len(value) == 0:
            return None
        return value

    @property
    def _institution_id(self):
        return self.__institution_id

    def _load(self):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__)

    @staticmethod
    def _new_model_metadata():
        datetime_now = datetime.now()
        return ModelMetadata.Builder().set_ctime(datetime_now).set_mtime(datetime_now).build()

    @property
    def _properties(self):
        return self.__properties

    def _run(self):
        if self.__clean:
            self._clean()
        self._load(dry_run=self.__dry_run)

    @property
    def _services(self):
        return self.__services

    def _put_collection(self, collection_id, title, hidden=None):
        self._services.collection_command_service.put_collection(
            collection_id,
            Collection.Builder()
                .set_hidden(hidden)
                .set_institution_id(self._institution_id)
                .set_model_metadata(self._new_model_metadata())
                .set_title(title)
                .build()
        )

    def _put_objects_by_id(self, objects_by_id):
        if len(objects_by_id) == 0:
            return
        self._logger.debug("putting %d objects to the service", len(objects_by_id))
        self._services.object_command_service.put_objects(
            tuple(ObjectEntry(object_id, object_)
                  for object_id, object_ in objects_by_id.iteritems())
        )
        self._logger.info("put %d objects to the service", len(objects_by_id))
