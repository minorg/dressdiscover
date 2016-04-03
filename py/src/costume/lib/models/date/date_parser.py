from datetime import datetime
from java.util import Date

from net.lab1318.costume.api.models.date import DateTimeGranularity


try:
    import dateparser
except ImportError:
    dateparser = None

# try:
#     import pytz
# except ImportError:
#     pytz = None


class DateParser(object):
    @staticmethod
    def parse_certain_date(date_bound_builder, text):
        parsed_date_time = None
        parsed_date_time_granularity = None

        try:
            year = int(text)
            parsed_date_time = Date(year - 1900, 1, 1)
            parsed_date_time_granularity = DateTimeGranularity.YEAR
        except ValueError:
            pass

        if parsed_date_time is None:
            if dateparser is not None:
                parser = dateparser.date.DateDataParser(languages=('en',))
                date_data = parser.get_date_data(text)
                parsed_date_time = date_data['date_obj']
                if parsed_date_time is not None:
                    period = date_data['period']
                    if period == 'day':
                        parsed_date_time = parsed_date_time.replace(hour=0, minute=0, second=0, microsecond=0)
                        parsed_date_time_granularity = DateTimeGranularity.DAY
                    elif period == 'month':
                        parsed_date_time = parsed_date_time.replace(day=1, hour=0, minute=0, second=0, microsecond=0)
                        parsed_date_time_granularity = DateTimeGranularity.MONTH
                    elif period == 'year':
                        parsed_date_time = parsed_date_time.replace(day=1, month=1, hour=0, minute=0, second=0, microsecond=0)
                        parsed_date_time_granularity = DateTimeGranularity.YEAR
                    else:
                        raise NotImplementedError(period)

        if parsed_date_time is not None:
            # parsed_date_time = parsed_date_time.replace(tzinfo=pytz.utc)

            if parsed_date_time.year > datetime.now().year or parsed_date_time.year < 1000:
#                 self._logger.debug("parsed date time has year out of range: '%s' from '%s'", parsed_date_time, text)
                return

            date_bound_builder.setParsedDateTime(Date((parsed_date_time - datetime.utcfromtimestamp(0)).total_seconds() * 1000.0))
            if parsed_date_time_granularity is not None:
                date_bound_builder.setParsedDateTimeGranularity(parsed_date_time_granularity)
#             self._logger.debug("parsed date '%s' from %s at granularity '%s'", parsed_date_time, text, parsed_date_time_granularity)
