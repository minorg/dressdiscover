import json
import os.path
import shutil
import urllib2

from costume.etl._extractor import _Extractor
from yomeka.client.omeka_rest_api_client import OmekaRestApiClient


class WizardExtractor(_Extractor):
    OMEKA_COLLECTIONS = {
        'Closure Type': 18,
        'Neckline': 19,
        'Sleeve Type': 14
    }

    OMEKA_ENDPOINT_URL = 'http://historicdress.org/omeka2/'

    def __init__(self, api_key, **kwds):
        _Extractor.__init__(self, **kwds)
        self.__client = OmekaRestApiClient(api_key=api_key, endpoint_url=self.OMEKA_ENDPOINT_URL)

    @classmethod
    def _add_arguments(cls, argument_parser):
        _Extractor._add_arguments(argument_parser)
        argument_parser.add_argument('--api-key', required=True)

    def _clean(self):
        out_dir_path = os.path.join(self._data_dir_path, 'extracted', 'wizard')
        shutil.rmtree(out_dir_path)

    def _extract(self):
        out_dir_path = os.path.join(self._data_dir_path, 'extracted', 'wizard')
        if not os.path.isdir(out_dir_path):
            os.makedirs(out_dir_path)

        for omeka_collection_title, omeka_collection_id in self.OMEKA_COLLECTIONS.iteritems():
            collection_out_dir_path = os.path.join(out_dir_path, 'collection', omeka_collection_title)
            if not os.path.isdir(collection_out_dir_path):
                os.makedirs(collection_out_dir_path)

            item_dicts = []
            for item in self.__client.get_all_items(collection=omeka_collection_id):
                files = self.__client.get_all_files(item=item.id)
                for file_ in files:
                    file_dir_path = os.path.join(out_dir_path, 'files_by_item_id', str(file_.item_id))
                    if not os.path.isdir(file_dir_path):
                        os.makedirs(file_dir_path)

                    original_file_url = urllib2.urlopen(file_.file_urls.original)
                    try:
                        original_file_data = original_file_url.read()
                    finally:
                        original_file_url.close()
                    file_data_file_path = os.path.join(file_dir_path, str(file_.id) + '.' + file_.mime_type.split('/')[-1])
                    with open(file_data_file_path, 'w+b') as file_data_f:
                        file_data_f.write(original_file_data)
                        self._logger.info('wrote %s', file_data_file_path)

                    file_json_file_path = os.path.join(file_dir_path, str(file_.id) + '.json')
                    with open(file_json_file_path, 'w+b') as f:
                        f.write(file_.json)
                        self._logger.info('wrote %s', file_json_file_path)

                item_dicts.append(json.loads(item.json))

            items_file_path = os.path.join(collection_out_dir_path, 'items.json')
            with open(items_file_path, 'w+b') as f:
                f.write(json.dumps(item_dicts, indent=4))
                self._logger.info("wrote %d items to %s", len(item_dicts), items_file_path)
