from collections import OrderedDict
from datetime import datetime
import json
import os.path
import sys
import traceback

import argparse

from costume.api.models.agent.agent import Agent
from costume.api.models.agent.agent_name import AgentName
from costume.api.models.agent.agent_name_type import AgentNameType
from costume.api.models.agent.agent_role import AgentRole
from costume.api.models.agent.agent_set import AgentSet
from costume.api.models.collection.collection import Collection
from costume.api.models.description.description import Description
from costume.api.models.description.description_set import DescriptionSet
from costume.api.models.description.description_type import DescriptionType
from costume.api.models.gender.gender import Gender
from costume.api.models.image.image import Image
from costume.api.models.image.image_type import ImageType
from costume.api.models.institution.institution import Institution
from costume.api.models.object.object import Object
from costume.api.models.object.object_entry import ObjectEntry
from costume.api.models.rights.rights import Rights
from costume.api.models.rights.rights_set import RightsSet
from costume.api.models.rights.rights_type import RightsType
from costume.api.models.subject.subject import Subject
from costume.api.models.subject.subject_set import SubjectSet
from costume.api.models.subject.subject_term import SubjectTerm
from costume.api.models.subject.subject_term_type import SubjectTermType
from costume.api.models.textref.textref import Textref
from costume.api.models.textref.textref_name import TextrefName
from costume.api.models.textref.textref_name_type import TextrefNameType
from costume.api.models.textref.textref_refid import TextrefRefid
from costume.api.models.textref.textref_refid_type import TextrefRefidType
from costume.api.models.textref.textref_set import TextrefSet
from costume.api.models.title.title import Title
from costume.api.models.title.title_set import TitleSet
from costume.api.models.title.title_type import TitleType
from costume.api.models.vocab import Vocab
from costume.api.models.vocab_ref import VocabRef
from costume.api.models.work_type.work_type import WorkType
from costume.api.models.work_type.work_type_set import WorkTypeSet
from costume.api.services.institution.no_such_institution_exception import NoSuchInstitutionException
from costume.lib.costume_properties import CostumeProperties
from model_utils import new_model_metadata
from services import Services


DATA_DIR_PATH = os.path.abspath(os.path.join(os.path.dirname(__file__), '..', '..', 'data'))
assert os.path.isdir(DATA_DIR_PATH)


DCMI_TYPES = (
    'Collection',
    'Dataset',
    'Event',
    'Image',
    'InteractiveResource',
    'MovingImage',
    'PhysicalObject',
    'Service',
    'Software',
    'Sound',
    'StillImage',
    'Text',
)

DCMI_TYPES_BASE_URL = 'http://purl.org/dc/dcmitype/'


argument_parser = argparse.ArgumentParser()
argument_parser.add_argument('--clean', action='store_true')
argument_parser.add_argument('--endpoint-url', required=True)
argument_parser.add_argument('--institution-id', required=True)
argument_parser.add_argument('--institution-title', required=True)
argument_parser.add_argument('--institution-url', required=True)
argument_parser.add_argument('--square-thumbnail-height-px', default=150)
argument_parser.add_argument('--square-thumbnail-width-px', default=150)
args = argument_parser.parse_args()


endpoint_url = args.endpoint_url
if not endpoint_url.endswith('/'):
    endpoint_url = endpoint_url + '/'
institution_id = args.institution_id
properties = CostumeProperties.load()
services = Services(properties=properties)


if args.clean:
    try:
        services.institution_command_service.delete_institution_by_id(institution_id)
    except NoSuchInstitutionException:
        pass


services.institution_command_service.put_institution(
    institution_id,
    Institution.Builder()
        .set_data_rights(
            RightsSet.Builder()
                .set_elements((
                    Rights.Builder()
                        .set_rights_holder(args.institution_title)
                        .set_text("Copyright %s %s" % (datetime.now().year, args.institution_title))
                        .set_type(RightsType.COPYRIGHTED)
                        .build()

                ,))
                .build()
        )
        .set_model_metadata(new_model_metadata())
        .set_title(args.institution_title)
        .set_url(args.institution_url)
        .build()
)



with open(os.path.join(DATA_DIR_PATH, institution_id, 'collections.json')) as f:
    collection_dicts = json.loads(f.read())


seen_omeka_item_ids = {}

for collection_dict in collection_dicts:
    omeka_collection_id = collection_dict['id']

    if not collection_dict['public']:
        print 'collection', omeka_collection_id, 'is not public, skipping'
        continue

    print 'reading collection', omeka_collection_id
    collection_id = institution_id + '/' + str(omeka_collection_id)

    collection_builder = \
        Collection.Builder()\
            .set_institution_id(institution_id)\
            .set_model_metadata(new_model_metadata())

    for element_text_dict in collection_dict['element_texts']:
        text = element_text_dict['text']
        if len(text) == 0:
            continue
        element_set_name = element_text_dict['element_set']['name']
        element_name = element_text_dict['element']['name']

        if element_set_name == 'Dublin Core':
            if element_name == 'Contributor':
                pass
            elif element_name == 'Description':
                collection_builder.set_description(text)
            elif element_name == 'Title':
                collection_builder.set_title(text)

    collection = collection_builder.build()

    # Don't put the collection until we're sure it has objects

    with open(os.path.join(DATA_DIR_PATH, institution_id, 'collection', str(omeka_collection_id), 'items.json')) as f:
        item_dicts = json.loads(f.read())
    print 'loading', len(item_dicts), 'items from collection', omeka_collection_id

    objects_by_id = OrderedDict()
    for item_i, item_dict in enumerate(item_dicts):
        omeka_item_id = item_dict['id']
        if omeka_item_id in seen_omeka_item_ids:
            raise RuntimeError('duplicate item id ' + str(omeka_item_id))
        seen_omeka_item_ids[omeka_item_id] = None

        object_id = collection_id + '/' + str(omeka_item_id)
        object_builder = \
            Object.Builder()\
                .set_collection_id(collection_id)\
                .set_institution_id(institution_id)\
                .set_model_metadata(new_model_metadata())

        agents = []
        categories = []
        descriptions = []
        identifiers = []
        include_object = True
        subjects = []
        textrefs = []
        titles = []
        work_types = []

        textrefs.append(
            Textref.Builder()
                .set_name(
                    TextrefName.Builder()
                        .set_text("Omeka item URL")
                        .set_type(TextrefNameType.ELECTRONIC)
                        .build()
                )
                .set_refid(
                    TextrefRefid.Builder()
                        .set_href(endpoint_url + 'items/show/' + str(omeka_item_id))
                        .set_text(endpoint_url + 'items/show/' + str(omeka_item_id))
                        .set_type(TextrefRefidType.URI)
                        .build()
                )
                .build()
        )

        for element_text_dict in item_dict['element_texts']:
            text = element_text_dict['text'].strip()
            if len(text) == 0:
                continue
            element_set_name = element_text_dict['element_set']['name']
            element_name = element_text_dict['element']['name']

            if element_set_name == 'Dublin Core':
                if element_name == 'Alternative Title':
                    titles.append(
                        Title.Builder()
                            .set_text(text)
                            .set_type(TitleType.DESCRIPTIVE)
                            .build()
                    )
                elif element_name == 'Contributor':
                    agents.append(
                        Agent.Builder()
                            .set_name(AgentName.Builder().set_text(text).set_type(AgentNameType.OTHER).build())
                            .set_role(
                                AgentRole.Builder()
                                    .set_text('contributor')
                                    .set_vocab_ref(
                                            VocabRef.Builder().set_vocab(Vocab.DC).build()
                                    )
                                    .build()
                                )
                            .build()
                    )
                elif element_name == 'Creator':
                    agents.append(
                        Agent.Builder()
                            .set_name(AgentName.Builder().set_text(text).set_type(AgentNameType.OTHER).build())
                            .set_role(
                                AgentRole.Builder()
                                    .set_text('creator')
                                    .set_vocab_ref(
                                            VocabRef.Builder().set_vocab(Vocab.DC).build()
                                    )
                                    .build()
                                )
                            .build()
                    )
                elif element_name == 'Date':
                    object_builder.set_date_text(text)
                elif element_name == 'Description':
                    descriptions.append(
                        Description.Builder()
                            .set_text(text)
                            .build()
                    )
                elif element_name == 'Identifier':
                    if not text in identifiers:
                        identifiers.append(text)
                elif element_name == 'Provenance':
                    object_builder.set_provenance(text)
                elif element_name == 'Rights':
                    object_builder.set_rights(
                        RightsSet.Builder()
                            .set_elements((
                                Rights.Builder()
                                    .set_rights_holder(args.institution_title)
                                    .set_text(text)
                                    .set_type(RightsType.UNDETERMINED)
                                    .build()
                            ,))
                            .build()
                    )
                elif element_name == 'Subject':
                    for text_split in text.split(';'):
                        text_split = text_split.strip()
                        if len(text_split) == 0:
                            continue
                        subjects.append(
                            Subject.Builder()
                                .set_terms((
                                    SubjectTerm.Builder()
                                        .set_text(text_split)
                                        .set_type(SubjectTermType.OTHER_TOPIC)
                                        .build()
                                ,))
                                .build()
                        )
                elif element_name == 'Title':
                    titles.append(
                        Title.Builder()
                            .set_pref(True)
                            .set_text(text)
                            .set_type(TitleType.DESCRIPTIVE)
                            .build()
                    )
                elif element_name == 'Type':
                    type_ = text.strip().replace(' ', '')
                    if type_ in DCMI_TYPES:
                        if type_ in ('Image', 'PhysicalObject', 'StillImage'):
                            work_types.append(
                                WorkType.Builder()
                                    .set_text(type_)
                                    .set_vocab_ref(
                                        VocabRef.Builder()
                                            .set_refid(type_)
                                            .set_vocab(Vocab.DCMI_TYPE)
                                            .set_uri(DCMI_TYPES_BASE_URL + type_)
                                            .build()
                                    )
                                    .build()
                            )
                        else:
                            include_object = False
                            break
                    else:
#                         work_types.append(
#                             WorkType.Builder()
#                                 .set_text(text)
#                                 .build()
#                         )
                        include_object = False
                        break
                else:
                    print 'skipping item Dublin Core element', element_name, ':', text.encode('ascii', 'ignore')
            elif element_set_name == 'Item Type Metadata':
                if element_name == 'Accession Number':
                    textrefs.append(
                        Textref.Builder()
                            .set_name(
                                TextrefName.Builder()
                                    .set_text("Accession number")
                                    .set_type(TextrefNameType.CATALOG)
                                    .build()
                            )
                            .set_refid(
                                TextrefRefid.Builder()
                                    .set_text(text)
                                    .set_type(TextrefRefidType.OTHER)
                                    .build()
                            )
                            .build()
                    )
                elif element_name == 'Category':
                    categories.append(text)
                elif element_name == 'Classification':
                    categories.append(text)
                elif element_name == 'Condition':
                    descriptions.append(
                        Description.Builder()
                            .set_text(text)
                            .set_type(DescriptionType.CONDITION)
                            .build()
                    )
                elif element_name == 'Description':
                    descriptions.append(
                        Description.Builder()
                            .set_text(text)
                            .build()
                    )
                elif element_name == 'Description Main':
                    descriptions.append(
                        Description.Builder()
                            .set_text(text)
                            .set_type(DescriptionType.SUMMARY)
                            .build()
                    )
                elif element_name == 'Donor':
                    agents.append(
                        Agent.Builder()
                            .set_name(
                                AgentName.Builder()
                                    .set_text(text)
                                    .set_type(AgentNameType.OTHER)
                                    .build()
                                )
                            .set_role(
                                AgentRole.Builder()
                                    .set_text('donor')
                                    .build()
                                )
                            .build()
                    )
                elif element_name == 'Exhibition Notes':
                    descriptions.append(
                        Description.Builder()
                            .set_text(text)
                            .set_type(DescriptionType.EXHIBITION)
                            .build()
                    )
                elif element_name == 'Gender':
                    text = text.lower().split(',')[0]
                    if text == 'female':
                        gender = Gender.FEMALE
                    elif text == 'male':
                        gender = Gender.MALE
                    else:
                        raise NotImplementedError(text)
                    if object_builder.gender is not None:
                        assert object_builder.gender == gender, "%s vs. %s" % (object_builder.gender, gender)
                    object_builder.set_gender(gender)
                elif element_name == 'Private Information':
                    descriptions.append(
                        Description.Builder()
                            .set_text(text)
                            .set_type(DescriptionType.PRIVATE)
                            .build()
                    )
                elif element_name == 'Public Information':
                    descriptions.append(
                        Description.Builder()
                            .set_text(text)
                            .set_type(DescriptionType.PUBLIC)
                            .build()
                    )
                elif element_name == 'Quantity':
                    try:
                        quantity = int(text)
                    except ValueError:
                        print 'unparseable quantity', text
                        continue
                    if object_builder.quantity is not None:
                        assert object_builder.quantity == quantity, "%d vs. %d" % (object_builder.quantity, quantity)
                    object_builder.set_quantity(quantity)
                elif element_name == 'References':
                    textrefs.append(
                        Textref.Builder()
                            .set_name(
                                TextrefName.Builder()
                                    .set_text(text)
                                    .set_type(TextrefNameType.CORPUS)
                                    .build()
                            )
                            .set_refid(
                                TextrefRefid.Builder()
                                    .set_text("unparsed")
                                    .set_type(TextrefRefidType.CITATION)
                                    .build()
                            )
                            .build()
                    )
                elif element_name == 'Source Identifier':
                    if not text in identifiers:
                        identifiers.append(text)
                elif element_name == 'Wearer':
                    agents.append(
                        Agent.Builder()
                            .set_name(
                                AgentName.Builder()
                                    .set_text(text)
                                    .set_type(AgentNameType.PERSONAL)
                                    .build()
                                )
                            .set_role(
                                AgentRole.Builder()
                                    .set_text('wearer')
                                    .build()
                                )
                            .build()
                    )
                else:
                    print 'skipping item Item Type Metadata element', element_name, ':', text.encode('ascii', 'ignore')
            else:
                print 'skipping item', element_set_name, 'element set'

        if not include_object:
            print 'excluding item', omeka_item_id
            continue

        if len(agents) > 0:
            object_builder.set_agents(AgentSet.Builder().set_elements(tuple(agents)).build())
        if len(categories) > 0:
            object_builder.set_categories(tuple(categories))
        if len(descriptions) > 0:
            description_texts = {}
            description_i = 0
            while description_i < len(descriptions):
                description = descriptions[description_i]
                if description.text in description_texts:
                    del descriptions[description_i]
                else:
                    description_texts[description.text] = None
                    description_i = description_i + 1
            object_builder.set_descriptions(DescriptionSet.Builder().set_elements(tuple(descriptions)).build())
        for identifier in identifiers:
            textrefs.append(
                Textref.Builder()
                    .set_name(
                        TextrefName.Builder()
                            .set_text("Identifier")
                            .set_type(TextrefNameType.CATALOG)
                            .build()
                    )
                    .set_refid(
                        TextrefRefid.Builder()
                            .set_text(text)
                            .set_type(TextrefRefidType.OTHER)
                            .build()
                    )
                    .build()
            )
        if len(subjects) > 0:
            object_builder.set_subjects(SubjectSet.Builder().set_elements(tuple(subjects)).build())
        if len(textrefs) > 0:
            object_builder.set_textrefs(TextrefSet.Builder().set_elements(tuple(textrefs)).build())
        if len(titles) > 0:
            object_builder.set_titles(TitleSet.Builder().set_elements(tuple(titles)).build())
        else:
            print 'item', omeka_item_id, 'has no titles, excluding'
            continue
        if len(work_types) > 0:
            object_builder.set_work_types(WorkTypeSet.Builder().set_elements(tuple(work_types)).build())
        else:
            print 'item', omeka_item_id, 'has no work types, excluding'

        try:
            files_count = item_dict['files']['count']
        except KeyError:
            files_count = 0

        if files_count > 0:
            file_dicts = []
            files_dir_path = os.path.join(DATA_DIR_PATH, institution_id, 'files_by_item_id', str(omeka_item_id))
            if os.path.isdir(files_dir_path):
                for file_file_path in os.listdir(files_dir_path):
                    if not file_file_path.endswith('.json'):
                        continue
                    file_file_path = os.path.join(files_dir_path, file_file_path)
                    if not os.path.isfile(file_file_path):
                        continue
                    with open(file_file_path, 'rb') as f:
                        file_dict = json.load(f)
                        file_dicts.append(file_dict)
            images = []
            for file_dict in file_dicts:
                file_id = file_dict['id']
                file_mime_type = file_dict['mime_type']
                if not file_mime_type.startswith('image/'):
                    continue

                original_image_height = original_image_width = None
                for element_text_dict in file_dict['element_texts']:
                    text = element_text_dict['text']
                    if len(text) == 0:
                        continue
                    element_set_name = element_text_dict['element_set']['name']
                    element_name = element_text_dict['element']['name']
                    if element_set_name == 'Omeka Image File':
                        if element_name == 'Height':
                            original_image_height = int(text)
                        elif element_name == 'Width':
                            original_image_width = int(text)
#                             else:
#                                 print 'skipping image file element', element_name

                for name, file_url in file_dict['file_urls'].iteritems():
                    if file_url is None or len(file_url) == 0:
                        continue
                    image_builder = Image.Builder().set_url(file_url)
                    if name == 'fullsize':
                        image_builder.set_type(ImageType.FULL_SIZE)
                    elif name == 'original':
                        if original_image_height is not None:
                            image_builder.set_height_px(original_image_height)
                        if original_image_width is not None:
                            image_builder.set_width_px(original_image_width)
                        image_builder.set_type(ImageType.ORIGINAL)
                    elif name == 'square_thumbnail':
                        image_builder.set_height_px(args.square_thumbnail_height_px)
                        image_builder.set_type(ImageType.SQUARE_THUMBNAIL)
                        image_builder.set_width_px(args.square_thumbnail_width_px)
                    elif name == 'thumbnail':
                        image_builder.set_type(ImageType.THUMBNAIL)
                    else:
                        raise NotImplementedError(name)
                    images.append(image_builder.build())

            if len(images) > 0:
                object_builder.set_images(tuple(images))

        try:
            object_ = object_builder.build()
        except ValueError:
            print >>sys.stderr, 'error building object from item', omeka_item_id
            traceback.print_exc()
            continue

        objects_by_id[object_id] = object_

        print 'loaded %d/%d' % (item_i + 1, len(item_dicts)), 'items from collection', omeka_collection_id

    if len(objects_by_id) == 0:
        print 'collection', omeka_collection_id, 'has no objects, skipping'
        continue

    services.collection_command_service.put_collection(collection_id, collection)

    print 'putting', len(objects_by_id), 'objects to collection', omeka_collection_id
    services.object_command_service.put_objects(
        tuple(ObjectEntry(object_id, object_)
              for object_id, object_ in objects_by_id.iteritems())
    )
