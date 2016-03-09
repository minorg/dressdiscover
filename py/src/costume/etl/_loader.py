from datetime import datetime

import dateparser
import pytz

from costume.api.models.collection.collection import Collection
from costume.api.models.date.date_time_granularity import DateTimeGranularity
from costume.api.models.model_metadata import ModelMetadata
from costume.api.models.object.object_entry import ObjectEntry
from costume.etl._main import _Main
from costume.lib.costume_properties import CostumeProperties
from services import Services


class _Loader(_Main):
    def __init__(self, clean=False, dry_run=False, **kwds):
        _Main.__init__(self, **kwds)
        self.__clean = clean
        self.__dry_run = dry_run
        self.__properties = CostumeProperties.load()
        self.__services = Services(properties=self.__properties)

    @classmethod
    def _add_arguments(cls, argument_parser):
        argument_parser.add_argument('--clean', action='store_true')
        argument_parser.add_argument('--dry-run', action='store_true')

    @property
    def _dry_run(self):
        return self.__dry_run

    @staticmethod
    def __get_nonempty_value(dict_, key):
        value = dict_.get(key)
        if value is None:
            return None
        elif len(value) == 0:
            return None
        return value

    def _load(self):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__)

    @staticmethod
    def _new_model_metadata():
        datetime_now = datetime.now()
        return ModelMetadata.Builder().set_ctime(datetime_now).set_mtime(datetime_now).build()

    def _parse_certain_date(self, date_bound_builder, text):
        parsed_date_time = None
        parsed_date_time_granularity = None

        try:
            year = int(text)
            parsed_date_time = datetime(year, 1, 1)
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
            parsed_date_time = parsed_date_time.replace(tzinfo=pytz.utc)

            if parsed_date_time.year > datetime.now().year or parsed_date_time.year < 1000:
                self._logger.debug("parsed date time has year out of range: '%s' from '%s'", parsed_date_time, text)
                return

            date_bound_builder.set_parsed_date_time(parsed_date_time)
            if parsed_date_time_granularity is not None:
                date_bound_builder.set_parsed_date_time_granularity(parsed_date_time_granularity)
            self._logger.debug("parsed date '%s' from %s at granularity '%s'", parsed_date_time, text, parsed_date_time_granularity)

    @property
    def _properties(self):
        return self.__properties

    def _put_collection(self, collection_id, institution_id, title, hidden=None):
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

    def _run(self):
        if self.__clean:
            self._clean()
        self._load(dry_run=self.__dry_run)

    @property
    def _services(self):
        return self.__services
