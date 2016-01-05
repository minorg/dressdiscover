import json
import os.path
import urllib2

from costume.etl._extractor import _Extractor


class PowerhouseMuseumExtractor(_Extractor):
    def __init__(self, api_key, **kwds):
        self.__api_key = api_key

    @classmethod
    def _add_arguments(cls, argument_parser):
        _Extractor._add_arguments(argument_parser)
        argument_parser.add_argument('--api-key', required=True)

    def _extract(self):
        ITEMS_DIR_PATH = os.path.join(self._data_dir_path, 'extracted', 'powerhouse_museum', 'item')
        CATEGORY_ITEMS_FILE_PATH = os.path.join(self._data_dir_path, 'extracted', 'powerhouse_museum', 'category_items.json')
        if not os.path.isdir(ITEMS_DIR_PATH):
            os.makedirs(ITEMS_DIR_PATH)


        api_call_count = 0
        api_key = self.__api_key
        if not os.path.exists(CATEGORY_ITEMS_FILE_PATH):
            category_item_dicts = []
            for category in ('10', '80'):
                start = 0
                while True:
                    url = urllib2.urlopen("http://api.powerhousemuseum.com/api/v1/category/%(category)s/items/json/?api_key=%(api_key)s&start=%(start)d&limit=100" % locals())
                    try:
                        url_json = url.read()
                    finally:
                        url.close()
                    api_call_count = api_call_count + 1
                    item_dicts = json.loads(url_json)['items']
                    category_item_dicts.extend(item_dicts)
                    self._logger.debug("%d: read %d items from start %d of category %s", api_call_count, len(item_dicts), start, category)
                    if len(item_dicts) < 100:
                        break
                    start = start + len(item_dicts)
            self._logger.debug("%d: read %d items total", api_call_count, len(category_item_dicts))
            with open(CATEGORY_ITEMS_FILE_PATH, 'w+b') as f:
                f.write(json.dumps(category_item_dicts))


        with open(CATEGORY_ITEMS_FILE_PATH, 'rb') as f:
            category_item_dicts = json.loads(f.read())
        for category_item_dict in category_item_dicts:
            item_id = category_item_dict['id']

            item_file_path = os.path.join(ITEMS_DIR_PATH, str(item_id) + '.json')
            if os.path.isfile(item_file_path):
                self._logger.debug("skipping %s", item_id)
                continue

            url = urllib2.urlopen("http://api.powerhousemuseum.com/api/v1/item/%(item_id)s/json/?api_key=%(api_key)s" % locals())
            try:
                url_json = url.read()
            finally:
                url.close()
            api_call_count = api_call_count + 1
            with open(item_file_path, 'w+b') as f:
                f.write(url_json)
            self._logger.debug("%d: read item %s", api_call_count, item_id)
            if api_call_count == 200:
                break
