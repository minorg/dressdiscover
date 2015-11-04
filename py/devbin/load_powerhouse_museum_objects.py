from datetime import datetime
import json
import os.path

from costume.api.models.collection.collection import Collection
from costume.api.models.institution.institution import Institution
from costume.api.models.institution.institution_id import InstitutionId
from costume.client.services.collection.collection_command_service_json_rpc_client import CollectionCommandServiceJsonRpcClient
from costume.client.services.institution.institution_command_service_json_rpc_client import InstitutionCommandServiceJsonRpcClient
from costume.client.services.object.object_command_service_json_rpc_client import ObjectCommandServiceJsonRpcClient
from costume.lib.costume_properties import CostumeProperties
from costume.api.models.object.object import Object
from costume.api.services.institution.no_such_institution_exception import NoSuchInstitutionException
from costume.api.models.image.image import Image


PROPERTIES = CostumeProperties.load()


def parse_item(collection_id, item_dict):
    builder = Object.Builder()

    builder.collection_id = collection_id
    builder.description = item_dict.get('description')
    builder.institution_id = InstitutionId.POWERHOUSE_MUSEUM
    builder.provenance = item_dict.get('acquisition_credit_line')
    builder.source_id = str(item_dict['id'])
    builder.summary = item_dict.get('summary')

    title = item_dict.get('title')
    if title is None:
        title = item_dict.get('summary')
        if title is None:
            title = ''
    builder.title = title

    thumbnail_dict = item_dict.get('thumbnail')
    if len(thumbnail_dict) > 0:
        thumbnail_builder = Image.Builder()
        thumbnail_builder.url = thumbnail_dict['url']
        if 'height' in thumbnail_dict:
            thumbnail_builder.height_px = int(thumbnail_dict['height'])
        if 'width' in thumbnail_dict:
            thumbnail_builder.width_px = int(thumbnail_dict['width'])
        builder.thumbnail = thumbnail_builder.build()

    builder.url = item_dict['permanent_url']

    return builder.build()


institution_command_service = InstitutionCommandServiceJsonRpcClient(api_url=PROPERTIES.api_url)
collection_command_service = CollectionCommandServiceJsonRpcClient(api_url=PROPERTIES.api_url)
object_command_service = ObjectCommandServiceJsonRpcClient(api_url=PROPERTIES.api_url)


try:
    institution_command_service.delete_institution_by_id(InstitutionId.POWERHOUSE_MUSEUM)
except NoSuchInstitutionException:
    pass
institution_command_service.put_institution(
    InstitutionId.POWERHOUSE_MUSEUM,
    Institution.Builder()
        .set_copyright_notice("Copyright %s Powerhouse Museum, licensed Creative Commons Attribution Non-Commercial" % datetime.now().year)
        .set_title("Powerhouse Museum")
        .set_url('http://powerhousemuseum.com')
        .build()
)

collection_id = \
    collection_command_service.post_collection(
        Collection.Builder()
            .set_institution_id(InstitutionId.POWERHOUSE_MUSEUM)
            .set_title("Clothing and Dress")
            .build()
    )


with open(os.path.join(PROPERTIES.home_directory_path, 'data', 'powerhouse_museum_category_items.json')) as f:
    response = json.loads(f.read())
    for item_dict in response['items']:
        object_ = parse_item(collection_id=collection_id, item_dict=item_dict)
        object_command_service.post_object(object_)
