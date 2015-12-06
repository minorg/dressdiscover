import argparse
import json
import os.path
from urllib2 import urlopen


DATA_DIR_PATH = os.path.abspath(os.path.join(os.path.dirname(__file__), '..', '..', 'data'))
assert os.path.isdir(DATA_DIR_PATH)


argument_parser = argparse.ArgumentParser()
argument_parser.add_argument('--api-key', required=True)
argument_parser.add_argument('--endpoint-url', required=True)
argument_parser.add_argument('--institution-id', required=True)
args = argument_parser.parse_args()


api_key = args.api_key
query_string = "?key=%(api_key)s&pretty_print=1" % locals()
endpoint_url = args.endpoint_url
if not endpoint_url.endswith('/'):
    endpoint_url = endpoint_url + '/'
institution_id = args.institution_id


out_dir_path = os.path.join(DATA_DIR_PATH, institution_id)
if not os.path.isdir(out_dir_path):
    os.makedirs(out_dir_path)


url = urlopen(endpoint_url + 'api/collections' + query_string)
try:
    collections_json = url.read()
    collections_file_path = os.path.join(out_dir_path, 'collections.json')
    with open(collections_file_path, 'w+b') as f:
        f.write(collections_json)
        print 'wrote', collections_file_path
finally:
    url.close()

for collection_dict in json.loads(collections_json):
    collection_id = str(collection_dict['id'])
    items_count = collection_dict['items']['count']
    page_i = 1
    item_dicts = []
    per_page = 50
    while True:
        print 'getting page', page_i, 'of collection', collection_id
        url = urlopen(endpoint_url + 'api/items' + query_string + "&collection=%(collection_id)s&page=%(page_i)s&per_page=%(per_page)s" % locals())
        try:
            items_json = url.read()
        finally:
            url.close()
        temp_item_dicts = json.loads(items_json)
        item_dicts.extend(temp_item_dicts)
        print 'retrieved', len(item_dicts), 'of', items_count, 'items from collection', collection_id
        if len(temp_item_dicts) < per_page:
            break
        page_i = page_i + 1
    collection_dir_path = os.path.join(out_dir_path, 'collection', str(collection_id))
    if not os.path.isdir(collection_dir_path):
        os.makedirs(collection_dir_path)
    items_file_path = os.path.join(collection_dir_path, 'items.json')
    with open(items_file_path, 'w+b') as f:
        f.write(json.dumps(item_dicts, indent=4))
        print 'wrote', len(item_dicts), 'items to', items_file_path
    break