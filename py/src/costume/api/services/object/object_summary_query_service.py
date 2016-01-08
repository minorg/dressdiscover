import __builtin__
import costume.api.services.object.get_object_summaries_options
import costume.api.services.object.get_object_summaries_result
import costume.api.services.object.object_query


class ObjectSummaryQueryService(object):
    def get_object_summaries(
        self,
        options=None,
        query=None,
    ):
        '''
        :type options: costume.api.services.object.get_object_summaries_options.GetObjectSummariesOptions or None
        :type query: costume.api.services.object.object_query.ObjectQuery or None
        :rtype: costume.api.services.object.get_object_summaries_result.GetObjectSummariesResult
        '''

        if options is not None:
            if not isinstance(options, costume.api.services.object.get_object_summaries_options.GetObjectSummariesOptions):
                raise TypeError("expected options to be a costume.api.services.object.get_object_summaries_options.GetObjectSummariesOptions but it is a %s" % getattr(__builtin__, 'type')(options))
        if query is not None:
            if not isinstance(query, costume.api.services.object.object_query.ObjectQuery):
                raise TypeError("expected query to be a costume.api.services.object.object_query.ObjectQuery but it is a %s" % getattr(__builtin__, 'type')(query))

        get_object_summaries_return_value = self._get_object_summaries(options=options, query=query)

        if not isinstance(get_object_summaries_return_value, costume.api.services.object.get_object_summaries_result.GetObjectSummariesResult):
            raise TypeError(getattr(__builtin__, 'type')(get_object_summaries_return_value))

        return get_object_summaries_return_value

    def _get_object_summaries(
        self,
        options,
        query,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_object_summaries')
