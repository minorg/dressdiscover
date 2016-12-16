from itertools import ifilterfalse
import __builtin__
import dressdiscover.api.models.worksheet.worksheet_definition
import dressdiscover.api.models.worksheet.worksheet_state


class WorksheetQueryService(object):
    def get_worksheet_accession_numbers(
        self,
    ):
        '''
        :rtype: tuple(str)
        '''

        get_worksheet_accession_numbers_return_value = self._get_worksheet_accession_numbers()

        if not (isinstance(get_worksheet_accession_numbers_return_value, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), get_worksheet_accession_numbers_return_value))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(get_worksheet_accession_numbers_return_value))

        return get_worksheet_accession_numbers_return_value

    def _get_worksheet_accession_numbers(
        self,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_worksheet_accession_numbers')

    def get_worksheet_definition(
        self,
    ):
        '''
        :rtype: dressdiscover.api.models.worksheet.worksheet_definition.WorksheetDefinition
        '''

        get_worksheet_definition_return_value = self._get_worksheet_definition()

        if not isinstance(get_worksheet_definition_return_value, dressdiscover.api.models.worksheet.worksheet_definition.WorksheetDefinition):
            raise TypeError(getattr(__builtin__, 'type')(get_worksheet_definition_return_value))

        return get_worksheet_definition_return_value

    def _get_worksheet_definition(
        self,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_worksheet_definition')

    def get_worksheet_state(
        self,
        accession_number=None,
    ):
        '''
        :type accession_number: str
        :rtype: dressdiscover.api.models.worksheet.worksheet_state.WorksheetState
        '''

        if accession_number is None:
            raise ValueError('accession_number is required')
        if not isinstance(accession_number, basestring):
            raise TypeError("expected accession_number to be a str but it is a %s" % getattr(__builtin__, 'type')(accession_number))

        get_worksheet_state_return_value = self._get_worksheet_state(accession_number=accession_number)

        if not isinstance(get_worksheet_state_return_value, dressdiscover.api.models.worksheet.worksheet_state.WorksheetState):
            raise TypeError(getattr(__builtin__, 'type')(get_worksheet_state_return_value))

        return get_worksheet_state_return_value

    def _get_worksheet_state(
        self,
        accession_number,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_worksheet_state')
