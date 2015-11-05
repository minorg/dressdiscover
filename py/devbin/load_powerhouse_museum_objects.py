from datetime import datetime
import json
import os.path

from costume.api.models.collection.collection import Collection
from costume.api.models.institution.institution import Institution
from costume.client.services.collection.collection_command_service_json_rpc_client import CollectionCommandServiceJsonRpcClient
from costume.client.services.institution.institution_command_service_json_rpc_client import InstitutionCommandServiceJsonRpcClient
from costume.client.services.object.object_command_service_json_rpc_client import ObjectCommandServiceJsonRpcClient
from costume.lib.costume_properties import CostumeProperties
from costume.api.models.object.object import Object
from costume.api.services.institution.no_such_institution_exception import NoSuchInstitutionException
from costume.api.models.image.image import Image


PROPERTIES = CostumeProperties.load()

INSTITUTION_ID = 'powerhouse_museum'


def parse_item(collection_id, item_dict):
    object_id = collection_id + '/' + str(item_dict['id'])

    object_builder = Object.Builder()

    object_builder.collection_id = collection_id
    object_builder.description = item_dict.get('description')
    object_builder.institution_id = INSTITUTION_ID
    object_builder.provenance = item_dict.get('acquisition_credit_line')
    object_builder.summary = item_dict.get('summary')

    title = item_dict.get('title')
    if title is None:
        title = item_dict.get('summary')
        if title is None:
            title = ''
    object_builder.title = title

    thumbnail_dict = item_dict.get('thumbnail')
    if len(thumbnail_dict) > 0:
        thumbnail_builder = Image.Builder()
        thumbnail_builder.url = thumbnail_dict['url']
        if 'height' in thumbnail_dict:
            thumbnail_builder.height_px = int(thumbnail_dict['height'])
        if 'width' in thumbnail_dict:
            thumbnail_builder.width_px = int(thumbnail_dict['width'])
        object_builder.thumbnail = thumbnail_builder.build()

    object_builder.url = item_dict['permanent_url']

    return object_id, object_builder.build()


institution_command_service = InstitutionCommandServiceJsonRpcClient(api_url=PROPERTIES.api_url)
collection_command_service = CollectionCommandServiceJsonRpcClient(api_url=PROPERTIES.api_url)
object_command_service = ObjectCommandServiceJsonRpcClient(api_url=PROPERTIES.api_url)


try:
    institution_command_service.delete_institution_by_id(INSTITUTION_ID)
except NoSuchInstitutionException:
    pass
institution_command_service.put_institution(
    INSTITUTION_ID,
    Institution.Builder()
        .set_copyright_notice("Copyright %s Powerhouse Museum, licensed Creative Commons Attribution Non-Commercial" % datetime.now().year)
        .set_title("Powerhouse Museum")
        .set_url('http://powerhousemuseum.com')
        .build()
)

collection_id = INSTITUTION_ID + '/10'
collection_command_service.put_collection(
    collection_id,
    Collection.Builder()
        .set_institution_id(INSTITUTION_ID)
        .set_title("Clothing and Dress")
        .build()
)


with open(os.path.join(PROPERTIES.home_directory_path, 'data', 'powerhouse_museum_category_items.json')) as f:
    response = json.loads(f.read())
    for item_dict in response['items']:
        object_id, object_ = parse_item(collection_id=collection_id, item_dict=item_dict)
        object_command_service.put_object(object_id, object_)
