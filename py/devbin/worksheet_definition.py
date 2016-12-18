from collections import OrderedDict

from dressdiscover.api.models.worksheet.worksheet_definition import WorksheetDefinition
from dressdiscover.api.models.worksheet.worksheet_feature_definition import WorksheetFeatureDefinition
from dressdiscover.api.models.worksheet.worksheet_feature_set_definition import WorksheetFeatureSetDefinition
from dressdiscover.api.models.worksheet.worksheet_feature_value_definition import WorksheetFeatureValueDefinition
from dressdiscover.api.models.worksheet.worksheet_feature_value_image import WorksheetFeatureValueImage


# Helper functions
def define_feature(
    id_,
    parent_feature_set_ids,
    value_definitions
):
    return \
        WorksheetFeatureDefinition.Builder()\
            .set_id(' '.join(parent_feature_set_ids + [id_]))\
            .set_values_(tuple(value_definitions))\
            .build()


def define_feature_value(
    id_,
    image_file_extension='jpg',
    image_rights=None
):
    builder = WorksheetFeatureValueDefinition.Builder().set_id(id_)
    if image_rights is not None:
        builder\
            .set_image(
                WorksheetFeatureValueImage.Builder()
                    .set_full_size_url("img/full_size/%(id_)s.%(image_file_extension)s" % locals())
                    .set_rights(image_rights)
                    .set_thumbnail_url("img/thumbnail/%(id_)s.%(image_file_extension)s" % locals())
                    .build()
                )
    return builder.build()


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
    define_feature_value('Button'),
    define_feature_value('Hook and eye'),
    define_feature_value('Non-functional'),
    define_feature_value('Zip'),
]

collar_characteristics = [
    define_feature_value('Attached'),
    define_feature_value('Bibbed'),
    define_feature_value('No collar'),
    define_feature_value('Peaked'),
    define_feature_value('Round'),
]

colors = [
    define_feature_value('Blue'),
    define_feature_value('Brown'),
    define_feature_value('Green'),
    define_feature_value('Red'),
    define_feature_value('White'),
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
    define_feature_value('Attached underskirt'),
    define_feature_value('Partially lined'),
    define_feature_value('Lined'),
    define_feature_value('Unlined'),
]

materials = [
    define_feature_value('Cotton'),
    define_feature_value('Elastic'),
    define_feature_value('Plastic'),
    define_feature_value('Self-fabric'),
    define_feature_value('Net tulle'),
    define_feature_value('Velvet'),
]

pleats = [
    define_feature_value('Inverted'),
]

prints = [
    define_feature_value('Abstracted floral'),
    define_feature_value('Checkerboard'),
    define_feature_value('Floral'),
    define_feature_value('Plaid'),
]

pocket_characteristics = [
    define_feature_value('Attached'),
    define_feature_value('Open'),
]

sleeve_characteristics = [
    define_feature_value('Attached cuffs'),
    define_feature_value('Elbow-length'),
    define_feature_value('Set-in'),
    define_feature_value('Sleeveless'),
]

techniques = [
    define_feature_value('Piped trim'),
    define_feature_value('Gathered'),
    define_feature_value('Slightly gathered'),
    define_feature_value('Smocked'),
]

waistline_characteristics = [
    define_feature_value('Dropped'),
    define_feature_value('Natural'),
    define_feature_value('Undefined waistline'),
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

        sub_extent_feature_definitions.append(define_feature(
            id_='Material',
            parent_feature_set_ids=parent_feature_set_ids,
            value_definitions=materials
        ))
        sub_extent_feature_definitions.append(define_feature(
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
    import json
    from thryft.protocol.builtins_output_protocol import BuiltinsOutputProtocol
    oprot = BuiltinsOutputProtocol()
    WORKSHEET_DEFINITION.write(oprot)
    print json.dumps(oprot.value, indent=2)

