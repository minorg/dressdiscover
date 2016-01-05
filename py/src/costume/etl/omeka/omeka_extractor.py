import json
import os.path

from costume.etl._extractor import _Extractor
from urllib2 import urlopen


class OmekaExtractor(_Extractor):
    def __init__(self, api_key, endpoint_url, institution_id, **kwds):
        _Extractor.__init__(self, **kwds)
        self.__api_key = api_key
        if not endpoint_url.endswith('/'):
            endpoint_url = endpoint_url + '/'
        self.__endpoint_url = endpoint_url
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
        api_key = self.__api_key
        query_string = "?key=%(api_key)s" % locals()
        endpoint_url = self.__endpoint_url
        institution_id = self.__institution_id

        out_dir_path = os.path.join(self._data_dir_path, 'extracted', institution_id)
        # Don't delete files, too expensive to retrieve
        # if args.clean:
        #     shutil.rmtree(out_dir_path, ignore_errors=True)
        if not os.path.isdir(out_dir_path):
            os.makedirs(out_dir_path)
        # files_out_dir_path = os.path.join(out_dir_path, 'files')
        # if not os.path.isdir(files_out_dir_path):
        #     os.makedirs(files_out_dir_path)

        collection_dicts = []
        for collection_dicts_page in self.__extract_paged_objects(endpoint_url + 'api/collections' + query_string):
            collection_dicts.extend(collection_dicts_page)
        collections_file_path = os.path.join(out_dir_path, 'collections.json')
        with open(collections_file_path, 'w+b') as f:
            f.write(json.dumps(collection_dicts))
            self._logger.info('wrote %s', collections_file_path)


        files_out_dir_path = os.path.join(out_dir_path, 'files_by_item_id')
        if not os.path.isdir(files_out_dir_path):
            os.makedirs(files_out_dir_path)
            for file_dicts_page in self.__extract_paged_objects(endpoint_url + 'api/files' + query_string):
                for file_dict in file_dicts_page:
                    file_id = file_dict['id']
                    item_id = file_dict['item']['id']
                    file_file_path = os.path.join(files_out_dir_path, str(item_id), str(file_id) + '.json')
                    if os.path.isfile(file_file_path):
                        self._logger.debug('%s already exists', file_file_path)
                        continue
                    if not os.path.isdir(os.path.dirname(file_file_path)):
                        os.makedirs(os.path.dirname(file_file_path))
                    with open(file_file_path, 'w+b') as f:
                        f.write(json.dumps(file_dict))
                        self._logger.info('wrote %s', file_file_path)


        for collection_dict in collection_dicts:
            collection_id = str(collection_dict['id'])
            collection_dir_path = os.path.join(out_dir_path, 'collection', str(collection_id))

            items_count = collection_dict['items']['count']
            item_dicts = []
            items_file_path = os.path.join(collection_dir_path, 'items.json')
            # Try to load an existing items file
            if not self._clean and os.path.isfile(items_file_path):
                with open(items_file_path, 'rb') as f:
                    item_dicts = json.load(f)
                if len(item_dicts) != items_count:
                    self._logger.info("cached items count %d does not match collection count %d", len(item_dicts), items_count)
                    item_dicts = []
                else:
                    self._logger.debug("loaded %d cached items from %s", len(item_dicts), items_file_path)

            if len(item_dicts) > 0:
                continue

            self._logger.debug("loading %d items from Omeka", items_count)
            for item_dicts_page in self.__extract_paged_objects(endpoint_url + 'api/items' + query_string + "&collection=%(collection_id)s" % locals()):
                item_dicts.extend(item_dicts_page)

            if not os.path.isdir(collection_dir_path):
                os.makedirs(collection_dir_path)
            with open(items_file_path, 'w+b') as f:
                f.write(json.dumps(item_dicts, indent=4))
                self._logger.info("wrote %d items to %s", len(item_dicts), items_file_path)

#     for item_dict in item_dicts:
#         item_id = item_dict['id']
#         try:
#             files = item_dict['files']
#             files_count = files['count']
#             if files_count == 0:
#                 continue
#             files_url = files['url']
#         except KeyError:
#             continue
#         expected_files_url = "%sapi/files?item=%d" % (endpoint_url, item_id)
#         assert files_url == expected_files_url, "%s vs. %s" % (files_url, expected_files_url)
#
#         files_file_path = os.path.join(files_out_dir_path, str(item_id), 'files.json')
#         if os.path.isfile(files_file_path):
#             continue
#
#         url = urlopen(files_url)
#         try:
#             files_json = url.read()
#         finally:
#             url.close()
#         if not os.path.isdir(os.path.dirname(files_file_path)):
#             os.makedirs(os.path.dirname(files_file_path))
#         with open(files_file_path, 'w+b') as f:
#             f.write(files_json)
#             print 'wrote', files_file_path


    def __extract_paged_objects(self, base_url, out_dir_path=None):
        page_i = 1
        per_page = 50
        total = 0
        while True:
            url = base_url + ('&' if '?' in base_url else '&') + "page=%(page_i)s&per_page=%(per_page)s" % locals()
            self._logger.debug("getting page %d of %s at %s", page_i, base_url, url)
            url = urlopen(url)
            try:
                call_json = url.read()
                call_result = json.loads(call_json)
                total = total + len(call_result)
            finally:
                url.close()
            self._logger.debug("retrieved %d objects from %s", total, base_url)
            yield call_result
            if len(call_result) < per_page:
                raise StopIteration
            page_i = page_i + 1
