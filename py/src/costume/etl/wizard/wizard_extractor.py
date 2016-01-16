import json
import os.path
import shutil

from costume.etl._extractor import _Extractor
from yomeka.client.omeka_rest_api_client import OmekaRestApiClient


class WizardExtractor(_Extractor):
    OMEKA_COLLECTION_ID = 2
    OMEKA_ENDPOINT_URL = 'http://ardenkirkland.com/omekasandbox'

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

        item_dicts = []
        for item in self.__client.get_all_items(collection=self.OMEKA_COLLECTION_ID):
            item_dicts.append(json.loads(item.json))

        items_file_path = os.path.join(out_dir_path, 'items.json')
        with open(items_file_path, 'w+b') as f:
            f.write(json.dumps(item_dicts, indent=4))
            self._logger.info("wrote %d items to %s", len(item_dicts), items_file_path)
