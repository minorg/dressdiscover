from StringIO import StringIO
import csv
import urllib2

from costume.etl._loader import _Loader


class DccLoader(_Loader):
    CSV_URL = 'https://docs.google.com/spreadsheets/d/1GnFBP1CadJHNVg2zQ5jMfkAARBMXo62qiZGGwXlgQpE/export?format=csv'

    def _load(self):
        csv_url = urllib2.urlopen(self.CSV_URL)
        try:
            csv_str = csv_url.read()
        finally:
            csv_url.close()

        with StringIO(csv_str) as csv_file:
            for row in csv.DictReader(csv_file):
                print row
