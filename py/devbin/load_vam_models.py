from datetime import datetime
import json
import os.path

from argparse import ArgumentParser

from costume.api.models.collection.collection import Collection
from costume.api.models.institution.institution import Institution
from costume.api.models.material.material import Material
from costume.api.models.material.material_set import MaterialSet
from costume.api.models.material.material_type import MaterialType
from costume.api.models.object.object import Object
from costume.api.models.rights.rights import Rights
from costume.api.models.rights.rights_set import RightsSet
from costume.api.models.rights.rights_type import RightsType
from costume.api.models.technique.technique import Technique
from costume.api.models.technique.technique_set import TechniqueSet
from costume.api.services.institution.no_such_institution_exception import NoSuchInstitutionException
from costume.lib.costume_properties import CostumeProperties
from model_utils import new_model_metadata, get_nonempty_value
from services import Services
from costume.api.models.inscription.inscription_set import InscriptionSet
from costume.api.models.inscription.inscription import Inscription
from costume.api.models.inscription.inscription_text import InscriptionText
from costume.api.models.inscription.inscription_text_type import InscriptionTextType


INSTITUTION_ID = 'vam'
COLLECTION_ID = INSTITUTION_ID + '/' + 't&f'
properties = CostumeProperties.load()
services = Services(properties=properties)


def parse_museumobject(museumobject_dict):
    object_id = COLLECTION_ID + '/' + museumobject_dict['object_number']

    object_builder = Object.Builder()

    category_dicts = get_nonempty_value(museumobject_dict, 'categories')
    if category_dicts is not None:
        categories = []
        for category_dict in category_dicts:
            categories.append(category_dict['fields']['name'])
        object_builder.set_categories(tuple(categories))

    object_builder.collection_id = COLLECTION_ID

    object_builder.date_text = get_nonempty_value(museumobject_dict, 'date_text')

    object_builder.description = get_nonempty_value(museumobject_dict, 'descriptive_line')

    object_builder.institution_id = INSTITUTION_ID

    marks = get_nonempty_value(museumobject_dict, 'marks')
    if marks is not None:
        object_builder.set_inscriptions(
            InscriptionSet(
                inscriptions=(
                    Inscription.Builder()
                        .set_texts((
                            InscriptionText.Builder()
                                .set_type(InscriptionTextType.MARK)
                                .set_value(marks)
                                .build(),
                        ))
                        .build(),
                )
            )
        )

    material_dicts = get_nonempty_value(museumobject_dict, 'materials')
    if material_dicts is not None:
        materials = []
        for material_dict in material_dicts:
            material_dict = material_dict['fields']
            materials.append(
                Material.Builder()
                    .set_text(material_dict['name'])
                    .set_type(MaterialType.OTHER)
                    .build()
            )
        object_builder.materials = MaterialSet(materials=tuple(materials))

    object_builder.model_metadata = new_model_metadata()

    object_builder.physical_description = get_nonempty_value(museumobject_dict, 'physical_description')

    technique_dicts = museumobject_dict.get('techniques')
    if technique_dicts is not None and len(technique_dicts) > 0:
        techniques = []
        for technique_dict in technique_dicts:
            technique_dict = technique_dict['fields']
            techniques.append(
                Technique.Builder()
                    .set_text(technique_dict['name'])
                    .build()
            )
        object_builder.techniques = TechniqueSet(techniques=tuple(techniques))

    title = get_nonempty_value(museumobject_dict, 'title')
    if title is None:
        title = museumobject_dict.get('object')
        assert title is not None and len(title) > 0
    object_builder.title = title

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
                        .set_rights_holder("Victoria and Albert Museum")
                        .set_text("Copyright %s Victoria and Albert Museum" % datetime.now().year)
                        .set_type(RightsType.COPYRIGHTED)
                        .build()

                ,))
                .build()
        )
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
                museumobject_dict = json.loads(f.read())[0]

        object_id, object_ = parse_museumobject(museumobject_dict['fields'])
        services.object_command_service.put_object(object_id, object_)
