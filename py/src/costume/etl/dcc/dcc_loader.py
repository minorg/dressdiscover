from StringIO import StringIO
import csv
from decimal import Decimal
from pprint import pprint
import urllib2

from costume.api.models.collection.collection import Collection
from costume.api.models.institution.institution import Institution
from costume.api.models.location.location import Location
from costume.api.models.location.location_coordinates import LocationCoordinates
from costume.api.models.location.location_set import LocationSet
from costume.api.models.location.location_type import LocationType
from costume.etl._loader import _Loader


class DccLoader(_Loader):
    CSV_URL = 'https://docs.google.com/spreadsheets/d/1GnFBP1CadJHNVg2zQ5jMfkAARBMXo62qiZGGwXlgQpE/export?format=csv'

    def _load(self, dry_run):
        csv_url = urllib2.urlopen(self.CSV_URL)
        try:
            csv_str = csv_url.read()
        finally:
            csv_url.close()

        csv_file = StringIO(csv_str)
        for row in csv.DictReader(csv_file):
            pprint(row)

            institution_id = row['Institution ID']

            if dry_run:
                self._logger.info("dry run, not putting institution %s", institution_id)
            else:
                self._services.institution_command_service.put_institution(
                    institution_id,
                    Institution.Builder()
                        .set_external(True)
                        .set_locations(self.__get_locations('Collection', row))
                        .set_model_metadata(self._new_model_metadata())
                        .set_title(row['Institution Title'])
                        .set_url(row['Institution URL'])
                        .build()
                )

            collection_id = institution_id + '/' + row['Collection ID']
            if dry_run:
                self._logger.info("dry run, not putting collection %s", collection_id)
            else:
                self._services.collection_command_service.put_collection(
                    collection_id,
                    Collection.Builder()
                        .set_external(True)
                        .set_institution_id(institution_id)
                        .set_locations(self.__get_locations('Institution', row))
                        .set_model_metadata(self._new_model_metadata())
                        .set_title(row['Collection Title'])
                        .set_url(row['Collection URL'])
                        .build()
                )

    def __get_locations(self, key_prefix, row):
        latitude = row[key_prefix + ' Latitude']
        longitude = row[key_prefix + ' Longitude']

        if len(latitude) == 0 or len(longitude) == 0:
            return

        location_builder = Location.Builder()
        location_builder\
            .set_coordinates(
                LocationCoordinates.Builder()
                    .set_latitude(Decimal(latitude))
                    .set_longitude(Decimal(longitude))
                    .build()
                )\
            .set_type(LocationType.OTHER)

        return LocationSet(elements=(location_builder.build(),))
