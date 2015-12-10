import argparse
import json
import os.path
from urllib2 import urlopen
import shutil


DATA_DIR_PATH = os.path.abspath(os.path.join(os.path.dirname(__file__), '..', '..', 'data'))
assert os.path.isdir(DATA_DIR_PATH)


argument_parser = argparse.ArgumentParser()
argument_parser.add_argument('--api-key', required=True)
argument_parser.add_argument('--clean', action='store_true')
argument_parser.add_argument('--endpoint-url', required=True)
argument_parser.add_argument('--institution-id', required=True)
args = argument_parser.parse_args()


api_key = args.api_key
query_string = "?key=%(api_key)s" % locals()
endpoint_url = args.endpoint_url
if not endpoint_url.endswith('/'):
    endpoint_url = endpoint_url + '/'
institution_id = args.institution_id


def __extract_paged_objects(base_url, out_dir_path=None):
    page_i = 1
    per_page = 50
    total = 0
    while True:
        url = base_url + ('&' if '?' in base_url else '&') + "page=%(page_i)s&per_page=%(per_page)s" % locals()
        print 'getting page', page_i, 'of', base_url, 'at', url
        url = urlopen(url)
        try:
            call_json = url.read()
            call_result = json.loads(call_json)
            total = total + len(call_result)
        finally:
            url.close()
        print 'retrieved', total, 'objects from', base_url
        yield call_result
        if len(call_result) < per_page:
            raise StopIteration
        page_i = page_i + 1


out_dir_path = os.path.join(DATA_DIR_PATH, institution_id)
# Don't delete files, too expensive to retrieve
# if args.clean:
#     shutil.rmtree(out_dir_path, ignore_errors=True)
if not os.path.isdir(out_dir_path):
    os.makedirs(out_dir_path)
# files_out_dir_path = os.path.join(out_dir_path, 'files')
# if not os.path.isdir(files_out_dir_path):
#     os.makedirs(files_out_dir_path)


collection_dicts = []
for collection_dicts_page in __extract_paged_objects(endpoint_url + 'api/collections' + query_string):
    collection_dicts.extend(collection_dicts_page)
collections_file_path = os.path.join(out_dir_path, 'collections.json')
with open(collections_file_path, 'w+b') as f:
    f.write(json.dumps(collection_dicts))
    print 'wrote', collections_file_path


files_out_dir_path = os.path.join(out_dir_path, 'files_by_item_id')
if not os.path.isdir(files_out_dir_path):
    os.makedirs(files_out_dir_path)
    for file_dicts_page in __extract_paged_objects(endpoint_url + 'api/files' + query_string):
        for file_dict in file_dicts_page:
            file_id = file_dict['id']
            item_id = file_dict['item']['id']
            file_file_path = os.path.join(files_out_dir_path, str(item_id), str(file_id) + '.json')
            if os.path.isfile(file_file_path):
                print file_file_path, 'already exists'
                continue
            if not os.path.isdir(os.path.dirname(file_file_path)):
                os.makedirs(os.path.dirname(file_file_path))
            with open(file_file_path, 'w+b') as f:
                f.write(json.dumps(file_dict))
                print 'wrote', file_file_path


for collection_dict in collection_dicts:
    collection_id = str(collection_dict['id'])
    collection_dir_path = os.path.join(out_dir_path, 'collection', str(collection_id))

    items_count = collection_dict['items']['count']
    item_dicts = []
    items_file_path = os.path.join(collection_dir_path, 'items.json')
    # Try to load an existing items file
    if not args.clean and os.path.isfile(items_file_path):
        with open(items_file_path, 'rb') as f:
            item_dicts = json.load(f)
        if len(item_dicts) != items_count:
            print 'cached items count', len(item_dicts), 'does not match collection count', items_count
            item_dicts = []
        else:
            print 'loaded', len(item_dicts), 'cached items from', items_file_path

    if len(item_dicts) > 0:
        continue

    print 'loading', items_count, 'items from Omeka'
    for item_dicts_page in __extract_paged_objects(endpoint_url + 'api/items' + query_string + "&collection=%(collection_id)s" % locals()):
        item_dicts.extend(item_dicts_page)

    if not os.path.isdir(collection_dir_path):
        os.makedirs(collection_dir_path)
    with open(items_file_path, 'w+b') as f:
        f.write(json.dumps(item_dicts, indent=4))
        print 'wrote', len(item_dicts), 'items to', items_file_path

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
