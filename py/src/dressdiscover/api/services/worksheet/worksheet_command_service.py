import __builtin__
import dressdiscover.api.models.worksheet.worksheet_state


class WorksheetCommandService(object):
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
