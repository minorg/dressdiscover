import argparse
import json
import os.path
import urllib2

from costume.lib.costume_properties import CostumeProperties


DATA_DIR_PATH = os.path.abspath(os.path.join(os.path.dirname(__file__), '..', '..', 'data'))
assert os.path.isdir(DATA_DIR_PATH)
ITEMS_DIR_PATH = os.path.join(DATA_DIR_PATH, 'powerhouse_museum', 'item')
CATEGORY_ITEMS_FILE_PATH = os.path.join(DATA_DIR_PATH, 'powerhouse_museum', 'category_items.json')
if not os.path.isdir(ITEMS_DIR_PATH):
    os.makedirs(ITEMS_DIR_PATH)


argument_parser = argparse.ArgumentParser()
argument_parser.add_argument('--api-key', required=True)
args = argument_parser.parse_args()


api_call_count = 0
api_key = args.api_key
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
            print api_call_count, 'read', len(item_dicts), 'items from start', start, 'of category', category
            if len(item_dicts) < 100:
                break
            start = start + len(item_dicts)
    print api_call_count, 'read', len(category_item_dicts), 'items total'
    with open(CATEGORY_ITEMS_FILE_PATH, 'w+b') as f:
        f.write(json.dumps(category_item_dicts))


with open(CATEGORY_ITEMS_FILE_PATH, 'rb') as f:
    category_item_dicts = json.loads(f.read())
for category_item_dict in category_item_dicts:
    item_id = category_item_dict['id']

    item_file_path = os.path.join(ITEMS_DIR_PATH, str(item_id) + '.json')
    if os.path.isfile(item_file_path):
        print 'skipping', item_id
        continue

    url = urllib2.urlopen("http://api.powerhousemuseum.com/api/v1/item/%(item_id)s/json/?api_key=%(api_key)s" % locals())
    try:
        url_json = url.read()
    finally:
        url.close()
    api_call_count = api_call_count + 1
    with open(item_file_path, 'w+b') as f:
        f.write(url_json)
    print api_call_count, 'read', item_id
    if api_call_count == 200:
        break
