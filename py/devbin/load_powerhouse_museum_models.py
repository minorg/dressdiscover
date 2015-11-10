from datetime import datetime
import json
import os.path

from costume.api.models.collection.collection import Collection
from costume.api.models.institution.institution import Institution
from costume.lib.costume_properties import CostumeProperties
from costume.api.models.object.object import Object
from costume.api.services.institution.no_such_institution_exception import NoSuchInstitutionException
from costume.api.models.image.image import Image
from services import Services
from model_utils import new_model_metadata, get_nonempty_value
from argparse import ArgumentParser
from costume.api.models.rights.rights_set import RightsSet
from costume.api.models.rights.rights import Rights
from costume.api.models.rights.rights_type import RightsType


properties = CostumeProperties.load()
services = Services(properties=properties)

INSTITUTION_ID = 'powerhouse_museum'
COLLECTION_ID = INSTITUTION_ID + '/10'

def parse_item(item_dict):
    object_id = COLLECTION_ID + '/' + str(item_dict['id'])

    object_builder = Object.Builder()

    object_builder.collection_id = COLLECTION_ID
    object_builder.description = get_nonempty_value(item_dict, 'description')
    object_builder.history_notes = get_nonempty_value(item_dict, 'history_notes')
    object_builder.institution_id = INSTITUTION_ID
    object_builder.model_metadata = new_model_metadata()
    object_builder.provenance = get_nonempty_value(item_dict, 'acquisition_credit_line')
    object_builder.summary = get_nonempty_value(item_dict, 'summary')

    title = get_nonempty_value(item_dict, 'title')
    if title is None:
        title = get_nonempty_value(item_dict, 'summary')
        if title is None:
            title = ''
    object_builder.title = title

    terms_dicts = get_nonempty_value(item_dict, 'terms')
    if terms_dicts is not None:
        categories = []
        for terms_dict in terms_dicts:
            term = terms_dict['term']
            if len(term) == 0:
                continue
            categories.append(term)
        if len(categories) > 0:
            object_builder.categories = tuple(categories)

    thumbnail_dict = item_dict.get('thumbnail')
    if len(thumbnail_dict) > 0:
        thumbnail_builder = Image.Builder()
        thumbnail_builder.url = thumbnail_dict['url']
        if 'height' in thumbnail_dict:
            thumbnail_builder.height_px = int(thumbnail_dict['height'])
        if 'width' in thumbnail_dict:
            thumbnail_builder.width_px = int(thumbnail_dict['width'])
        object_builder.thumbnail = thumbnail_builder.build()

    object_builder.url = get_nonempty_value(item_dict, 'permanent_url')

    return object_id, object_builder.build()


argument_parser = ArgumentParser()
argument_parser.add_argument('--clean', action='store_true')
args = argument_parser.parse_args()


if args.clean:
    try:
        services.institution_command_service.delete_institution_by_id(INSTITUTION_ID)
    except NoSuchInstitutionException:
        pass

services.institution_command_service.put_institution(
    INSTITUTION_ID,
    Institution.Builder()
        .set_data_rights(
            RightsSet.Builder()
                .set_rights((
                    Rights.Builder()
                        .set_rights_holder("Powerhouse Museum")
                        .set_text("Copyright %s Powerhouse Museum, licensed Creative Commons Attribution Non-Commercial" % datetime.now().year)
                        .set_type(RightsType.COPYRIGHTED)
                        .build()

                ,))
                .build()
        )
        .set_model_metadata(new_model_metadata())
        .set_title("Powerhouse Museum")
        .set_url('http://powerhousemuseum.com')
        .build()
)

services.collection_command_service.put_collection(
    COLLECTION_ID,
    Collection.Builder()
        .set_institution_id(INSTITUTION_ID)
        .set_model_metadata(new_model_metadata())
        .set_title("Clothing and Dress")
        .build()
)


DATA_DIR_PATH = os.path.abspath(os.path.join(os.path.dirname(__file__), '..', '..', 'data'))
assert os.path.isdir(DATA_DIR_PATH)
object_count = 0
for root_dir_path, _, file_names in os.walk(os.path.join(DATA_DIR_PATH, 'powerhouse_museum', 'item')):
    for file_name in file_names:
        if not file_name.endswith('.json'):
            continue
        with open(os.path.join(root_dir_path, file_name), 'rb') as f:
            item_dict = json.loads(f.read())['item']
        object_id, object_ = parse_item(item_dict)
        services.object_command_service.put_object(object_id, object_)
        print 'put object', object_id, '(#', object_count, ')'
        object_count = object_count + 1
