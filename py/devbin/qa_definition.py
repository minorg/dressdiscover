from collections import OrderedDict
import os.path

from dressdiscover.api.models.qa.qa_image import QaImage
from dressdiscover.api.models.qa.qa_image_rights import QaImageRights
from dressdiscover.api.models.qa.qa_object import QaObject
from dressdiscover.api.models.qa.question import Question
from dressdiscover.api.models.qa.question_set import QuestionSet
from dressdiscover.api.models.qa.question_value import QuestionValue


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
    assert not id_ in _IDS
    _IDS[id_] = None, id_


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
    values=None
):
    check_id(id_)

    question_builder = Question.Builder().set_id(id_).set_text(text)
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
            id_="589f8f9c69cfa172fc69d28c",
            text='Is it large or small?',
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

    with open(os.path.join(TS_ASSETS_DIR_PATH, 'js', 'definitions.js'), 'w+b') as f:
        f.write(js)
