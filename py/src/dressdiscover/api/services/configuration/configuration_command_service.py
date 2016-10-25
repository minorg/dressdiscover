import __builtin__
import dressdiscover.api.models.configuration.collection_configuration
import dressdiscover.api.models.configuration.institution_configuration


class ConfigurationCommandService(object):
    def put_collection_configuration(
        self,
        collection_id=None,
        collection_configuration=None,
    ):
        '''
        :type collection_id: str
        :type collection_configuration: dressdiscover.api.models.configuration.collection_configuration.CollectionConfiguration
        '''

        if collection_id is None:
            raise ValueError('collection_id is required')
        if not isinstance(collection_id, dressdiscover.api.models.collection.collection_id.CollectionId):
            raise TypeError("expected collection_id to be a str but it is a %s" % getattr(__builtin__, 'type')(collection_id))
        if collection_configuration is None:
            raise ValueError('collection_configuration is required')
        if not isinstance(collection_configuration, dressdiscover.api.models.configuration.collection_configuration.CollectionConfiguration):
            raise TypeError("expected collection_configuration to be a dressdiscover.api.models.configuration.collection_configuration.CollectionConfiguration but it is a %s" % getattr(__builtin__, 'type')(collection_configuration))

        self._put_collection_configuration(collection_id=collection_id, collection_configuration=collection_configuration)

    def _put_collection_configuration(
        self,
        collection_id,
        collection_configuration,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._put_collection_configuration')

    def put_institution_configuration(
        self,
        institution_id=None,
        institution_configuration=None,
    ):
        '''
        :type institution_id: str
        :type institution_configuration: dressdiscover.api.models.configuration.institution_configuration.InstitutionConfiguration
        '''

        if institution_id is None:
            raise ValueError('institution_id is required')
        if not isinstance(institution_id, dressdiscover.api.models.institution.institution_id.InstitutionId):
            raise TypeError("expected institution_id to be a str but it is a %s" % getattr(__builtin__, 'type')(institution_id))
        if institution_configuration is None:
            raise ValueError('institution_configuration is required')
        if not isinstance(institution_configuration, dressdiscover.api.models.configuration.institution_configuration.InstitutionConfiguration):
            raise TypeError("expected institution_configuration to be a dressdiscover.api.models.configuration.institution_configuration.InstitutionConfiguration but it is a %s" % getattr(__builtin__, 'type')(institution_configuration))

        self._put_institution_configuration(institution_id=institution_id, institution_configuration=institution_configuration)

    def _put_institution_configuration(
        self,
        institution_id,
        institution_configuration,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._put_institution_configuration')
