from datetime import datetime
import json
import os.path

from argparse import ArgumentParser

from costume.api.models.collection.collection import Collection
from costume.api.models.institution.institution import Institution
from costume.api.models.object.object import Object
from costume.api.services.institution.no_such_institution_exception import NoSuchInstitutionException
from costume.lib.costume_properties import CostumeProperties
from services import Services
from model_utils import new_model_metadata, get_nonempty_string


INSTITUTION_ID = 'vam'
COLLECTION_ID = INSTITUTION_ID + '/' + 't&f'
properties = CostumeProperties.load()
services = Services(properties=properties)


def parse_museumobject(museumobject_dict):
    object_id = COLLECTION_ID + '/' + museumobject_dict['object_number']

    object_builder = Object.Builder()

    object_builder.collection_id = COLLECTION_ID
    object_builder.description = get_nonempty_string(museumobject_dict, 'descriptive_line')
    object_builder.institution_id = INSTITUTION_ID
    object_builder.model_metadata = new_model_metadata()
    object_builder.physical_description = get_nonempty_string(museumobject_dict, 'physical_description')
    title = get_nonempty_string(museumobject_dict, 'title')
    if title is None:
        title = museumobject_dict.get('object')
        assert title is not None and len(title) > 0
    object_builder.title = title

    object_builder.date_text = get_nonempty_string(museumobject_dict, 'date_text')

    return object_id, object_builder.build()


argument_parser = ArgumentParser()
argument_parser.add_argument('--clean', action='store_true')
argument_parser.add_argument('--details', action='store_true')
args = argument_parser.parse_args()


if args.clean:
    try:
        services.institution_command_service.delete_institution_by_id(INSTITUTION_ID)
    except NoSuchInstitutionException:
        pass


services.institution_command_service.put_institution(
    INSTITUTION_ID,
    Institution.Builder()
        .set_copyright_notice("Copyright %s Victoria and Albert Museum" % datetime.now().year)
        .set_model_metadata(new_model_metadata())
        .set_title("Victoria and Albert Museum")
        .set_url('http://www.vam.ac.uk')
        .build()
)


services.collection_command_service.put_collection(
    COLLECTION_ID,
    Collection.Builder()
        .set_institution_id(INSTITUTION_ID)
        .set_model_metadata(new_model_metadata())
        .set_title("Textiles and Fashion Collection")
        .build()
)


# TODO:
# Search for records in T&F
# Load them all without details
# If --details, go through existing records, filling them in up to 3000 records


with open(os.path.join(properties.home_directory_path, 'data', 'vam_museumobjects.json')) as f:
    response = json.loads(f.read())
    for museumobject_dict in response['records']:
        if museumobject_dict['fields']['object_number'] == 'O13814':
            with open(os.path.join(properties.home_directory_path, 'data', 'vam_museumobject_detail.json')) as f:
                museum_object_dict = json.loads(f.read())[0]

        object_id, object_ = parse_museumobject(museumobject_dict['fields'])
        services.object_command_service.put_object(object_id, object_)
