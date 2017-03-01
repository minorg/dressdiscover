from collections import OrderedDict
import os.path

from dressdiscover.api.models.qa.qa_image import QaImage
from dressdiscover.api.models.qa.qa_image_rights import QaImageRights
from dressdiscover.api.models.qa.qa_object import QaObject
from dressdiscover.api.models.qa.question import Question
from dressdiscover.api.models.qa.question_set import QuestionSet
from dressdiscover.api.models.qa.question_type import QuestionType
from dressdiscover.api.models.qa.question_value import QuestionValue
from dressdiscover.api.models.qa.question_value_range import QuestionValueRange


# Constants
ROOT_DIR_PATH = os.path.abspath(os.path.join(os.path.dirname(__file__), '..', '..'))
TS_ASSETS_DIR_PATH = os.path.join(ROOT_DIR_PATH, 'ts', 'qa', 'public')
assert os.path.isdir(TS_ASSETS_DIR_PATH), TS_ASSETS_DIR_PATH
CC_BY_SA = 'Creative Commons Attribution-Share Alike'
PUBLIC_DOMAIN = 'Public domain'
THUMBNAIL_DIMENSIONS = (200, 200)


# Outputs
QUESTION_SETS_BY_ID = OrderedDict()
OBJECTS = []
QUESTIONS_BY_ID = OrderedDict()

_IDS = {}

# Helper functions
def asset_url(asset_file_path):
    return os.path.relpath(asset_file_path, TS_ASSETS_DIR_PATH).replace(os.path.sep, '/')


def check_id(id_):
    assert not id_ in _IDS, id_
    _IDS[id_] = None


def met_rights(source_url):
    return rights(
        author='Metropolitan Museum of Art',
        license_=PUBLIC_DOMAIN,
        source_name='Metropolitan Museum of Art',
        source_url=source_url
    )


def object_(
    id_,
    image_rights,
    question_set_ids
):
    check_id(id_)

    object_id = id_

    object_builder = QaObject.Builder().set_id(object_id)

    image_builder = QaImage.Builder()
    image_builder.set_rights(image_rights)

    file_name = "%(object_id)s.jpg" % locals()

    full_size_file_path = os.path.join(TS_ASSETS_DIR_PATH, 'img', 'object', 'full_size', file_name)
    if not os.path.isfile(full_size_file_path):
        raise ValueError("%(full_size_file_path)s does not exist" % locals())
    image_builder.set_full_size_url(asset_url(full_size_file_path))

    image_builder.set_thumbnail_url(thumbnail(
        full_size_file_path=full_size_file_path,
        thumbnail_file_path=os.path.join(TS_ASSETS_DIR_PATH, 'img', 'object', 'thumbnail', file_name)
    ))

    object_builder.set_image(image_builder.build())

    for question_set_id in question_set_ids:
        assert question_set_id in QUESTION_SETS_BY_ID, question_set_id
    object_builder.set_question_set_ids(question_set_ids)

    return object_builder.build()


def question(
    id_,
    text,
    type_,
    value_range=None,
    values=None,
):
    check_id(id_)

    question_builder = Question.Builder().set_id(id_).set_text(text).set_type_(type_)
    if value_range is not None:
        question_builder.set_value_range(value_range)
    if values is not None:
        question_builder.set_values(values)
    question = question_builder.build()
    QUESTIONS_BY_ID[question.id] = question
    return question


def question_set(
    id_,
    question_ids,
    title,
):
    check_id(id_)

    question_set = \
        QuestionSet.Builder()\
            .set_id(id_)\
            .set_title(title)\
            .set_question_ids(question_ids)\
            .build()
    QUESTION_SETS_BY_ID[question_set.id] = question_set
    return question_set


def question_value(
    id_,
    text,
    image_rights=None
):
    check_id(id_)

    question_value_id = id_

    question_value_builder = QuestionValue.Builder().set_id(question_value_id).set_text(text)

    if image_rights is None:
        return question_value_builder.build()

    image_builder = QaImage.Builder()
    image_builder.set_rights(image_rights)

    file_name = "%(question_value_id)s.jpg" % locals()

    full_size_file_path = os.path.join(TS_ASSETS_DIR_PATH, 'img', 'question_value', 'full_size', file_name)
    if not os.path.isfile(full_size_file_path):
        raise ValueError("%(full_size_file_path)s does not exist" % locals())
    image_builder.set_full_size_url(asset_url(full_size_file_path))

    image_builder.set_thumbnail_url(thumbnail(
        full_size_file_path=full_size_file_path,
        thumbnail_file_path=os.path.join(TS_ASSETS_DIR_PATH, 'img', 'question_value', 'thumbnail', file_name)
    ))

    question_value_builder.set_image(image_builder.build())

    return question_value_builder.build()


def rights(
    author,
    license_,
    source_name,
    source_url
):
    return \
        QaImageRights.Builder()\
            .set_author(author)\
            .set_license(license_)\
            .set_source_name(source_name)\
            .set_source_url(source_url)\
            .build()


def thumbnail(full_size_file_path, thumbnail_file_path):
    thumbnail_url = asset_url(thumbnail_file_path)
    if os.path.isfile(thumbnail_file_path):
        return thumbnail_url

    thumbnail_dir_path = os.path.dirname(thumbnail_file_path)
    from PIL import Image  # @UnresolvedImport
    thumbnail = Image.open(full_size_file_path)
    # Use .resize and .thumbnail, because the latter preserves the aspect ratio,
    # which we don't want.
    thumbnail = thumbnail.resize(THUMBNAIL_DIMENSIONS)
    if not os.path.isdir(thumbnail_dir_path):
        os.makedirs(thumbnail_dir_path)
    thumbnail.save(thumbnail_file_path)
    print "saved thumbnail to", thumbnail_file_path
    return thumbnail_url



# Question sets
def material_culture_question_set():
    questions = []

    questions.append(
        question(
            id_="58b6f5dcbfd8c5aa5d089b1f",
            text='Why have you chosen this object?',
            type_=QuestionType.TEXT
        )
    )

    questions.append(
        question(
            id_="58b6f61dbfd8c5aa5d089b20",
            text='What do you think this object is? What evidence or features of the object did you use to decide?',
            type_=QuestionType.TEXT
        )
    )

    questions.append(
        question(
            id_="58b6f772bfd8c5aa5d089b25",
            text='What was the most significant thing you noticed about the object?',
            type_=QuestionType.TEXT
        )
    )

    questions.append(
        question(
            id_="589f8f9c69cfa172fc69d28c",
            text='Is the object large or small?',
            type_=QuestionType.SELECT_ONE,
            values=(
                question_value(
                    id_="589f8fa569cfa172fc69d28d",
                    text='Large',
                ),
                question_value(
                    id_="589f8fb369cfa172fc69d28e",
                    text='Small',
                ),
            )
        )
    )

    questions.append(
        question(
            id_="58b6f907bfd8c5aa5d089b27",
            text='What color(s) is the object?',
            type_=QuestionType.COLORS,
        )
    )

    questions.append(
        question(
            id_="58b6f67cbfd8c5aa5d089b22",
            text='What material do you think the object is made out of?',
            type_=QuestionType.TEXT
        )
    )

    questions.append(
        question(
            id_="58a9d06abfd8c5aa5d089b1d",
            text='When do you think this object was made?',
            type_=QuestionType.DATE_RANGE,
            value_range=QuestionValueRange(start=1600, stop=2020, step=10),
        )
    )

#     questions.append(
#         question(
#             id_="58b6f6bbbfd8c5aa5d089b23",
#             text='For what activities would the garment have been worn?',
#             type_=QuestionType.TEXT
#         )
#     )

    questions.append(
        question(
            id_="58a9d264bfd8c5aa5d089b1e",
            text='Where do you think the object comes from?',
            type_=QuestionType.TEXT
        )
    )

    questions.append(
        question(
            id_="58b6fa13bfd8c5aa5d089b2a",
            text='Would the object belong to a man, a woman, or a child?',
            type_=QuestionType.SELECT_MULTIPLE,
            values=(
                question_value(
                    id_="58b6fa3dbfd8c5aa5d089b2b",
                    text='Man',
                ),
                question_value(
                    id_="58b6fa45bfd8c5aa5d089b2c",
                    text='Woman',
                ),
                question_value(
                    id_="58b6fa4bbfd8c5aa5d089b2d",
                    text='Child',
                ),
                question_value(
                    id_="58b6fa54bfd8c5aa5d089b2e",
                    text='Other',
                ),
            )
        )
    )

    questions.append(
        question(
            id_="58b6fb78bfd8c5aa5d089b36",
            text='Who do you think would have worn or used the object?',
            type_=QuestionType.TEXT
        )
    )

    questions.append(
        question(
            id_="58b6fbf8bfd8c5aa5d089b37",
            text='What season would you wear this object?',
            type_=QuestionType.SELECT_MULTIPLE,
            values=(
                question_value(
                    id_="58b6fbfebfd8c5aa5d089b38",
                    text='Spring',
                ),
                question_value(
                    id_="58b6fc05bfd8c5aa5d089b39",
                    text='Summer',
                ),
                question_value(
                    id_="58b6fc0bbfd8c5aa5d089b3a",
                    text='Fall',
                ),
                question_value(
                    id_="58b6fc12bfd8c5aa5d089b3b",
                    text='Winter',
                ),
            )
        )
    )

    questions.append(
        question(
            id_="58b6fc42bfd8c5aa5d089b3c",
            text='What time of day would you wear this object?',
            type_=QuestionType.SELECT_MULTIPLE,
            values=(
                question_value(
                    id_="58b6fc48bfd8c5aa5d089b3d",
                    text='Morning',
                ),
                question_value(
                    id_="58b6fc52bfd8c5aa5d089b3e",
                    text='Afternoon',
                ),
                question_value(
                    id_="58b6fc59bfd8c5aa5d089b3f",
                    text='Evening',
                ),
                question_value(
                    id_="58b6fc60bfd8c5aa5d089b40",
                    text='Night',
                ),
            )
        )
    )
# What time of day would you wear this?

    questions.append(
        question(
            id_="58b6f738bfd8c5aa5d089b24",
            text='What sort of insight might this object give you about the environment and/or period of time it came/comes from?',
            type_=QuestionType.TEXT
        )
    )

    questions.append(
        question(
            id_="58b6fa8cbfd8c5aa5d089b2f",
            text='How does it make you feel when you look at it?',
            type_=QuestionType.TEXT
        )
    )

    questions.append(
        question(
            id_="58b6fab7bfd8c5aa5d089b30",
            text='Do you think the object was expensive? Why?',
            type_=QuestionType.SELECT_ONE,
            values=(
                question_value(
                    id_="58b6fb0cbfd8c5aa5d089b31",
                    text='Very expensive',
                ),
                question_value(
                    id_="58b6fb17bfd8c5aa5d089b32",
                    text='Expensive',
                ),
                question_value(
                    id_="58b6fb1fbfd8c5aa5d089b33",
                    text='Affordable',
                ),
                question_value(
                    id_="58b6fb26bfd8c5aa5d089b34",
                    text='Inexpensive',
                ),
                question_value(
                    id_="58b6fb2dbfd8c5aa5d089b35",
                    text='Very inexpensive',
                ),
            )
        )
    )

    questions.append(
        question(
            id_="58b6f646bfd8c5aa5d089b21",
            text='Can you think of any experience that might relate to this object?',
            type_=QuestionType.TEXT
        )
    )

    return \
        question_set(
            id_='589f8edd69cfa172fc69d28b',
            title='Material Culture',
            question_ids=tuple(question.id for question in questions)
        )
MATERIAL_CULTURE_QUESTION_SET = material_culture_question_set()


# Objects
OBJECTS.append(
    object_(
        id_="589f8fbe69cfa172fc69d28f",
        image_rights=met_rights(source_url='http://images.metmuseum.org/CRDImages/ci/original/26.359a-b_front_CP4.jpg'),
        question_set_ids=frozenset((
            MATERIAL_CULTURE_QUESTION_SET.id,
        ),),
    )
)


if __name__ == '__main__':
    import json
    from thryft.protocol.builtins_output_protocol import BuiltinsOutputProtocol

    def to_json_array(object_list):
        objects_json = []
        for object_ in object_list:
            oprot = BuiltinsOutputProtocol()
            object_.write(oprot)
            objects_json.append(oprot.value)
        return objects_json

    objects_json = to_json_array(OBJECTS)
    question_sets_json = to_json_array(QUESTION_SETS_BY_ID.itervalues())
    questions_json = to_json_array(QUESTIONS_BY_ID.itervalues())

    js = """\
var OBJECTS = %s;

var QUESTION_SETS = %s;

var QUESTIONS = %s;
""" % (
    json.dumps(objects_json, indent=4),
    json.dumps(question_sets_json, indent=4),
    json.dumps(questions_json, indent=4),
)
    js = js.replace("\r\n", "\n")

    with open(os.path.join(TS_ASSETS_DIR_PATH, 'js', 'definitions.js'), 'w+b') as f:
        f.write(js)
