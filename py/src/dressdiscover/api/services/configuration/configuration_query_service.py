import __builtin__
import dressdiscover.api.models.configuration.collection_configuration
import dressdiscover.api.models.configuration.institution_configuration


class ConfigurationQueryService(object):
    def get_collection_configuration(
        self,
        collection_id=None,
    ):
        '''
        :type collection_id: str
        :rtype: dressdiscover.api.models.configuration.collection_configuration.CollectionConfiguration
        '''

        if collection_id is None:
            raise ValueError('collection_id is required')
        if not isinstance(collection_id, dressdiscover.api.models.collection.collection_id.CollectionId):
            raise TypeError("expected collection_id to be a str but it is a %s" % getattr(__builtin__, 'type')(collection_id))

        get_collection_configuration_return_value = self._get_collection_configuration(collection_id=collection_id)

        if not isinstance(get_collection_configuration_return_value, dressdiscover.api.models.configuration.collection_configuration.CollectionConfiguration):
            raise TypeError(getattr(__builtin__, 'type')(get_collection_configuration_return_value))

        return get_collection_configuration_return_value

    def _get_collection_configuration(
        self,
        collection_id,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_collection_configuration')

    def get_institution_configuration(
        self,
        institution_id=None,
    ):
        '''
        :type institution_id: str
        :rtype: dressdiscover.api.models.configuration.institution_configuration.InstitutionConfiguration
        '''

        if institution_id is None:
            raise ValueError('institution_id is required')
        if not isinstance(institution_id, dressdiscover.api.models.institution.institution_id.InstitutionId):
            raise TypeError("expected institution_id to be a str but it is a %s" % getattr(__builtin__, 'type')(institution_id))

        get_institution_configuration_return_value = self._get_institution_configuration(institution_id=institution_id)

        if not isinstance(get_institution_configuration_return_value, dressdiscover.api.models.configuration.institution_configuration.InstitutionConfiguration):
            raise TypeError(getattr(__builtin__, 'type')(get_institution_configuration_return_value))

        return get_institution_configuration_return_value

    def _get_institution_configuration(
        self,
        institution_id,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_institution_configuration')
