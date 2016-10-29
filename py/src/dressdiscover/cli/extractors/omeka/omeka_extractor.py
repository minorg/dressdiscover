import json
import os.path

from dressdiscover.cli.extractors._extractor import _Extractor
from yomeka.client.omeka_rest_api_client import OmekaRestApiClient


class OmekaExtractor(_Extractor):
    def __init__(self, api_key, endpoint_url, institution_id, **kwds):
        _Extractor.__init__(self, **kwds)
        self.__client = OmekaRestApiClient(api_key=api_key, endpoint_url=endpoint_url)
        self.__institution_id = institution_id

    @classmethod
    def _add_arguments(cls, argument_parser):
        _Extractor._add_arguments(argument_parser)
        argument_parser.add_argument('--api-key', required=True)
        cls._add_institution_arguments(argument_parser)

    @classmethod
    def _add_institution_arguments(cls, argument_parser):
        argument_parser.add_argument('--endpoint-url', required=True)
        argument_parser.add_argument('--institution-id', required=True)

    def _extract(self):
        institution_id = self.__institution_id

        out_dir_path = os.path.join(self._data_dir_path, institution_id)
        # Don't delete files, too expensive to retrieve
        # if args.clean:
        #     shutil.rmtree(out_dir_path, ignore_errors=True)
        if not os.path.isdir(out_dir_path):
            os.makedirs(out_dir_path)
        # files_out_dir_path = os.path.join(out_dir_path, 'files')
        # if not os.path.isdir(files_out_dir_path):
        #     os.makedirs(files_out_dir_path)

        collections = []
        collection_dicts = []
        for collection in self.__client.get_all_collections():
            collections.append(collection)
            collection_dicts.append(json.loads(collection.json))
        collections_file_path = os.path.join(out_dir_path, 'collections.json')
        with open(collections_file_path, 'w+b') as f:
            f.write(json.dumps(collection_dicts, indent=4))
            self._logger.info('wrote %s', collections_file_path)


        files_out_dir_path = os.path.join(out_dir_path, 'files_by_item_id')
        if not os.path.isdir(files_out_dir_path):
            os.makedirs(files_out_dir_path)
            for file_ in self.__client.get_all_files():
                file_file_path = os.path.join(files_out_dir_path, str(file_.item_id), str(file_.id) + '.json')
                if os.path.isfile(file_file_path):
                    self._logger.debug('%s already exists', file_file_path)
                    continue
                if not os.path.isdir(os.path.dirname(file_file_path)):
                    os.makedirs(os.path.dirname(file_file_path))
                with open(file_file_path, 'w+b') as f:
                    f.write(file_.json)
                    self._logger.info('wrote %s', file_file_path)


        for collection in collections:
            collection_dir_path = os.path.join(out_dir_path, 'collection', str(collection.id))

            item_dicts = []
            items_file_path = os.path.join(collection_dir_path, 'items.json')
            # Try to load an existing items file
            if not self._clean and os.path.isfile(items_file_path):
                with open(items_file_path, 'rb') as f:
                    item_dicts = json.load(f)
                if len(item_dicts) != collection.items_count:
                    self._logger.info("cached items count %d does not match collection count %d", len(item_dicts), collection.items_count)
                    item_dicts = []
                else:
                    self._logger.debug("loaded %d cached items from %s", len(item_dicts), items_file_path)

            if len(item_dicts) > 0:
                continue

            self._logger.debug("loading %d items from Omeka", collection.items_count)
            for item in self.__client.get_all_items(collection=collection.id):
                item_dicts.append(json.loads(item.json))

            if not os.path.isdir(collection_dir_path):
                os.makedirs(collection_dir_path)
            with open(items_file_path, 'w+b') as f:
                f.write(json.dumps(item_dicts, indent=4))
                self._logger.info("wrote %d items to %s", len(item_dicts), items_file_path)
