import __builtin__
import dressdiscover.api.models.worksheet.worksheet_state


class WorksheetCommandService(object):
    def delete_worksheet_state(
        self,
        accession_number=None,
    ):
        '''
        :type accession_number: str
        '''

        if accession_number is None:
            raise ValueError('accession_number is required')
        if not isinstance(accession_number, basestring):
            raise TypeError("expected accession_number to be a str but it is a %s" % getattr(__builtin__, 'type')(accession_number))

        self._delete_worksheet_state(accession_number=accession_number)

    def _delete_worksheet_state(
        self,
        accession_number,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._delete_worksheet_state')

    def put_worksheet_state(
        self,
        state=None,
    ):
        '''
        :type state: dressdiscover.api.models.worksheet.worksheet_state.WorksheetState
        '''

        if state is None:
            raise ValueError('state is required')
        if not isinstance(state, dressdiscover.api.models.worksheet.worksheet_state.WorksheetState):
            raise TypeError("expected state to be a dressdiscover.api.models.worksheet.worksheet_state.WorksheetState but it is a %s" % getattr(__builtin__, 'type')(state))

        self._put_worksheet_state(state=state)

    def _put_worksheet_state(
        self,
        state,
    ):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._put_worksheet_state')
