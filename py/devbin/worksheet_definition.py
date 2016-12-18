from collections import OrderedDict
import os.path

from dressdiscover.api.models.worksheet.worksheet_definition import WorksheetDefinition
from dressdiscover.api.models.worksheet.worksheet_feature_definition import WorksheetFeatureDefinition
from dressdiscover.api.models.worksheet.worksheet_feature_set_definition import WorksheetFeatureSetDefinition
from dressdiscover.api.models.worksheet.worksheet_feature_value_definition import WorksheetFeatureValueDefinition
from dressdiscover.api.models.worksheet.worksheet_feature_value_image import WorksheetFeatureValueImage
from dressdiscover.api.models.worksheet.worksheet_feature_value_image_rights import WorksheetFeatureValueImageRights


# Constants
ASSETS_DIR_PATH = os.path.abspath(os.path.join(os.path.dirname(__file__), '..', '..', 'ts', 'assets'))
assert os.path.isdir(ASSETS_DIR_PATH), ASSETS_DIR_PATH
THUMBNAIL_DIMENSIONS = (200, 200)


# Helper functions
def feature(
    id_,
    parent_feature_set_ids,
    value_definitions
):
    return \
        WorksheetFeatureDefinition.Builder()\
            .set_id(' '.join(parent_feature_set_ids + [id_]))\
            .set_values_(tuple(value_definitions))\
            .build()

def feature_value(
    id_,
    image_rights=None
):
    builder = WorksheetFeatureValueDefinition.Builder().set_id(id_)
    if image_rights is not None:
        builder.set_image(image(id_=id_, rights=image_rights))
    return builder.build()

def image(
    id_,
    rights,
    file_extension='jpg'
):
    builder = WorksheetFeatureValueImage.Builder()
    builder.set_rights(rights)    
    
    file_name = "%(id_)s.%(file_extension)s" % locals()
    
    full_size_file_path = os.path.join(ASSETS_DIR_PATH, 'img', 'full_size', file_name)
    if not os.path.isfile(full_size_file_path):
        raise ValueError("%(full_size_file_path)s does not exist" % locals())
    builder.set_full_size_url("img/full_size/" + file_name)
    
    thumbnail_file_path = os.path.join(ASSETS_DIR_PATH, 'img', 'thumbnail', file_name)
    if not os.path.isfile(thumbnail_file_path):
        from PIL import Image  # @UnresolvedImport
        thumbnail = Image.open(full_size_file_path)
        # Use .resize and .thumbnail, because the latter preserves the aspect ratio,
        # which we don't want.
        thumbnail = thumbnail.resize(THUMBNAIL_DIMENSIONS)
        thumbnail.save(thumbnail_file_path)
        print "saved thumbnail to", thumbnail_file_path
    builder.set_thumbnail_url("img/thumbnail/" + file_name)
    
    return builder.build()

def rights(
    author,
    license_,
    source_name,
    source_url
):
    return \
        WorksheetFeatureValueImageRights.Builder()\
            .set_author(author)\
            .set_license(license_)\
            .set_source_name(source_name)\
            .set_source_url(source_url)\
            .build()


# Definitions
# decoration_applied = {
#     'Decoration': {
#         'Applied': [
#             'Embroidery',
#             'Sequins',
#             'Applique',
#         ]
#     }
# }
closures = [
    feature_value(
        id_='Button',
        image_rights=rights(
            author='Marco Bernardini',
            license_='CC-SA 3.0',
            source_name='Wikipedia',
            source_url='https://commons.wikimedia.org/wiki/File:Three_holes_buttons.jpg',
        ),
    ),
    feature_value('Hook and eye'),
    feature_value('Non-functional'),
    feature_value('Zip'),
]

collar_characteristics = [
    feature_value('Attached'),
    feature_value('Bibbed'),
    feature_value('No collar'),
    feature_value('Peaked'),
    feature_value('Round'),
]

colors = [
    feature_value('Blue'),
    feature_value('Brown'),
    feature_value('Green'),
    feature_value('Red'),
    feature_value('White'),
]

_vertical_extents = [
    'Whole',
    'Top',
    'Bottom',
]

extents = OrderedDict()
extents['Whole'] = _vertical_extents
extents['Collar'] = []
extents['Shoulders'] = []
extents['Sleeves'] = []
extents['Front'] = _vertical_extents
extents['Back'] = _vertical_extents
extents['Interior'] = _vertical_extents

interior_characteristics = [
    feature_value('Attached underskirt'),
    feature_value('Partially lined'),
    feature_value('Lined'),
    feature_value('Unlined'),
]

materials = [
    feature_value('Cotton'),
    feature_value('Elastic'),
    feature_value('Plastic'),
    feature_value('Self-fabric'),
    feature_value(
        id_='Net tulle',
        image_rights=rights(
            author='Wikipedia user Carolus',
            license_='CC-SA 3.0',
            source_name='Wikipedia',
            source_url='https://commons.wikimedia.org/wiki/File:Carolus_-Private_Collection_-_zwarte_tulekant.jpg',
        )
    ),
    feature_value('Velvet'),
]

pleats = [
    feature_value('Inverted'),
]

prints = [
    feature_value('Abstracted floral'),
    feature_value('Checkerboard'),
    feature_value('Floral'),
    feature_value('Plaid'),
]

pocket_characteristics = [
    feature_value('Attached'),
    feature_value('Open'),
]

sleeve_characteristics = [
    feature_value('Attached cuffs'),
    feature_value('Elbow-length'),
    feature_value('Set-in'),
    feature_value('Sleeveless'),
]

techniques = [
    feature_value('Piped trim'),
    feature_value('Gathered'),
    feature_value('Slightly gathered'),
    feature_value('Smocked'),
]

waistline_characteristics = [
    feature_value('Dropped'),
    feature_value('Natural'),
    feature_value('Undefined waistline'),
]


extent_feature_set_definitions = []
for extent, sub_extents in extents.iteritems():
    extent_child_feature_set_definitions = []
    extent_feature_definitions = []

    if extent == 'Whole':
        extent_feature_definitions.append(
            WorksheetFeatureDefinition.Builder()
                .set_id('Label')
                .build()
            )

    if sub_extents is None or len(sub_extents) == 0:
        sub_extents = [None]
    for sub_extent in sub_extents:
        if extent == sub_extent:
            continue

        parent_feature_set_ids = [extent]
        if sub_extent is None:
            sub_extent_feature_definitions = extent_feature_definitions
        else:
            sub_extent_feature_definitions = []
            parent_feature_set_ids.append(sub_extent)

        sub_extent_feature_definitions.append(feature(
            id_='Material',
            parent_feature_set_ids=parent_feature_set_ids,
            value_definitions=materials
        ))
        sub_extent_feature_definitions.append(feature(
            id_='Print',
            parent_feature_set_ids=parent_feature_set_ids,
            value_definitions=prints
        ))
        # TODO: append technique etc. here

        if sub_extent is not None:
            extent_child_feature_set_definitions.append(
                WorksheetFeatureSetDefinition.Builder()
                    .set_features(tuple(sub_extent_feature_definitions))
                    .set_id(sub_extent)
                    .build()
            )

    extent_feature_set_definition_builder = \
        WorksheetFeatureSetDefinition.Builder().set_id(extent)
    if len(extent_child_feature_set_definitions) > 0:
        extent_feature_set_definition_builder.set_child_feature_sets(tuple(extent_child_feature_set_definitions))
    if len(extent_feature_definitions) > 0:
        extent_feature_set_definition_builder.set_features(tuple(extent_feature_definitions))
    extent_feature_set_definitions.append(extent_feature_set_definition_builder.build())

WORKSHEET_DEFINITION = \
    WorksheetDefinition(
        root_feature_set=\
            WorksheetFeatureSetDefinition(
                child_feature_sets=tuple(extent_feature_set_definitions),
                id='root',
            )
    )


if __name__ == '__main__':
    with open(os.path.join(ASSETS_DIR_PATH, 'js', 'worksheet_definition.js'), 'w+b') as f:
        import json
        from thryft.protocol.builtins_output_protocol import BuiltinsOutputProtocol
        oprot = BuiltinsOutputProtocol()
        WORKSHEET_DEFINITION.write(oprot)
        f.write('var WORKSHEET_DEFINITION = ' + json.dumps(oprot.value, indent=4) + "\n")

