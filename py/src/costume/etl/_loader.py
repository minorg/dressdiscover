from costume.api.services.institution.no_such_institution_exception import NoSuchInstitutionException
from costume.etl._main import _Main
from costume.lib.costume_properties import CostumeProperties
from services import Services


class _Loader(_Main):
    def __init__(self, institution_id, clean=False, **kwds):
        _Main.__init__(self, **kwds)
        self.__clean = clean
        self.__institution_id = institution_id
        self.__properties = CostumeProperties.load()
        self.__services = Services(properties=self.__properties)

    @classmethod
    def _add_arguments(cls, argument_parser):
        argument_parser.add_argument('--clean', action='store_true')

    def _clean(self):
        try:
            self._services.institution_command_service.delete_institution_by_id(self._institution_id)
        except NoSuchInstitutionException:
            self._logger.debug("institution %s does not exist (yet)", self._institution_id)

    @property
    def _institution_id(self):
        return self.__institution_id

    def _load(self):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__)

    @property
    def _properties(self):
        return self.__properties

    def _run(self):
        if self.__clean:
            self._clean()
        self._load()

    @property
    def _services(self):
        return self.__services
