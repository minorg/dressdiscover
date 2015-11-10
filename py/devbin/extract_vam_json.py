import json
import os.path
import urllib2


DATA_DIR_PATH = os.path.abspath(os.path.join(os.path.dirname(__file__), '..', '..', 'data'))
assert os.path.isdir(DATA_DIR_PATH)
MUSEUMOBJECTS_DIR_PATH = os.path.join(DATA_DIR_PATH, 'vam', 'museumobject')
MUSEUMOBJECTS_FILE_PATH = os.path.join(DATA_DIR_PATH, 'vam', 'museumobjects.json')
if not os.path.isdir(MUSEUMOBJECTS_DIR_PATH):
    os.makedirs(MUSEUMOBJECTS_DIR_PATH)


api_call_count = 0
if not os.path.exists(MUSEUMOBJECTS_FILE_PATH):
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
        print api_call_count, 'read', len(record_dicts), 'records from offset', offset
    print api_call_count, 'read', len(museumobject_dicts), 'records total'
    with open(MUSEUMOBJECTS_FILE_PATH, 'w+b') as f:
        f.write(json.dumps(museumobject_dicts))


with open(MUSEUMOBJECTS_FILE_PATH, 'rb') as f:
    museumobject_dicts = json.loads(f.read())
for museumobject_dict in museumobject_dicts:
    object_number = museumobject_dict['fields']['object_number']
    museumobject_file_path = os.path.join(MUSEUMOBJECTS_DIR_PATH, str(object_number) + '.json')
    if os.path.isfile(museumobject_file_path):
        print 'skipping', object_number
        continue
    url = urllib2.urlopen('http://www.vam.ac.uk/api/json/museumobject/' + str(object_number))
    try:
        url_json = url.read()
    finally:
        url.close()
    api_call_count = api_call_count + 1
    with open(museumobject_file_path, 'w+b') as f:
        f.write(url_json)
    print api_call_count, 'read', object_number
