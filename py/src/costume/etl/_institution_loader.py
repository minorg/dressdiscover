from costume.api.services.institution.no_such_institution_exception import NoSuchInstitutionException
from costume.etl._loader import _Loader


class _InstitutionLoader(_Loader):
    def __init__(self, institution_id, **kwds):
        _Loader.__init__(self, **kwds)
        self.__institution_id = institution_id

    def _clean(self):
        if self._dry_run:
            self._logger.info("dry run, not deleting insittution %s", self._institution_id)
            return
        try:
            self._services.institution_command_service.delete_institution_by_id(self._institution_id)
        except NoSuchInstitutionException:
            self._logger.debug("institution %s does not exist (yet)", self._institution_id)

    @property
    def _institution_id(self):
        return self.__institution_id

    def _put_collection(self, **kwds):
        _Loader._put_collection(self, institution_id=self.__institution_id, **kwds)
