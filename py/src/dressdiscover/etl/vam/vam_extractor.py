import json
import os.path
import urllib2

from dressdiscover.etl._extractor import _Extractor


class VamExtractor(_Extractor):
    def _extract(self):
        museumobjects_dir_path = os.path.join(self._data_dir_path, 'extracted', 'vam', 'museumobject')
        museumobjects_file_path = os.path.join(self._data_dir_path, 'extracted', 'vam', 'museumobjects.json')
        if not os.path.isdir(museumobjects_dir_path):
            os.makedirs(museumobjects_dir_path)


        api_call_count = 0
        if not os.path.exists(museumobjects_file_path):
            museumobject_dicts = []
            offset = 0
            while True:
                url = urllib2.urlopen('http://www.vam.ac.uk/api/json/museumobject/?q=%22Textiles+and+Fashion+Collection%22&limit=45&offset=' + str(offset))
                try:
                    url_json = url.read()
                finally:
                    url.close()
                api_call_count = api_call_count + 1
                record_dicts = json.loads(url_json)['records']
                museumobject_dicts.extend(record_dicts)
                if len(record_dicts) < 45:
                    break
                offset = offset + len(record_dicts)
                self._logger.debug("%d: read %d records from offset %d", api_call_count, len(record_dicts), offset)
            self._logger.debug("%d: read %d records total", api_call_count, len(museumobject_dicts))
            with open(museumobjects_file_path, 'w+b') as f:
                f.write(json.dumps(museumobject_dicts))


        with open(museumobjects_file_path, 'rb') as f:
            museumobject_dicts = json.loads(f.read())
        for museumobject_dict in museumobject_dicts:
            object_number = museumobject_dict['fields']['object_number']
            museumobject_file_path = os.path.join(museumobjects_dir_path, str(object_number) + '.json')
            if os.path.isfile(museumobject_file_path):
                self._logger.debug('skipping %s', object_number)
                continue
            url = urllib2.urlopen('http://www.vam.ac.uk/api/json/museumobject/' + str(object_number))
            try:
                url_json = url.read()
            finally:
                url.close()
            api_call_count = api_call_count + 1
            with open(museumobject_file_path, 'w+b') as f:
                f.write(url_json)
            self._logger.debug("%d: read object %s", api_call_count, object_number)
