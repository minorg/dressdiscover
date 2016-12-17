from collections import OrderedDict

from dressdiscover.api.models.worksheet.worksheet_definition import WorksheetDefinition
from dressdiscover.api.models.worksheet.worksheet_feature_definition import WorksheetFeatureDefinition
from dressdiscover.api.models.worksheet.worksheet_feature_set_definition import WorksheetFeatureSetDefinition
from dressdiscover.api.models.worksheet.worksheet_feature_value_definition import WorksheetFeatureValueDefinition
from dressdiscover.api.models.worksheet.worksheet_feature_value_image import WorksheetFeatureValueImage


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
    'Button',
    'Hook and eye',
    'Non-functional',
    'Zip'
]

collar_characteristics = [
    'Attached',
    'Bibbed',
    'No collar',
    'Peaked',
    'Round',
]

colors = [
    'Blue',
    'Brown',
    'Green',
    'Red',
    'White',
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
    'Attached underskirt',
    'Partially lined',
    'Lined',
    'Unlined'
]

materials = [
    'Cotton',
    'Elastic',
    'Plastic',
    'Self-fabric',
    'Net tulle',
    'Velvet',
]

pleats = [
    'Inverted',
]

prints = [
    'Abstracted floral',
    'Checkerboard',
    'Floral',
    'Plaid',
]

pocket_characteristics = [
    'Attached',
    'Open'
]

sleeve_characteristics = [
    'Attached cuffs',
    'Elbow-length',
    'Set-in',
    'Sleeveless',
]

techniques = [
    'Piped trim',
    'Gathered',
    'Slightly gathered',
    'Smocked',
]

waistline_characteristics = [
    'Dropped',
    'Natural',
    'Undefined waistline',
]

# TODO: label as text in Whole


def __to_enum_feature_definition(id_, values_list):
    value_definitions = []
    for value in values_list:
        value_definitions.append(
            WorksheetFeatureValueDefinition.Builder()
                .set_id(value)
                .set_image(
                    WorksheetFeatureValueImage.Builder()
                        .set_full_size_url("img/feature_value_placeholder_full_size.png")
                        .set_rights("Placeholder rights")
                        .set_thumbnail_url("img/feature_value_placeholder_thumbnail.png")
                        .build()
                    )
                .build()
        )
    return \
        WorksheetFeatureDefinition.Builder()\
            .set_id(id_)\
            .set_values_(tuple(value_definitions))\
            .build()


extent_feature_set_definitions = []
for extent, sub_extents in extents.iteritems():
    if sub_extents is None or len(sub_extents) == 0:
        sub_extents = [None]
    extent_child_feature_set_definitions = []
    extent_feature_definitions = []
    for sub_extent in sub_extents:
        if extent == sub_extent:
            continue

        feature_id_prefix = extent
        if sub_extent is None:
            sub_extent_feature_definitions = extent_feature_definitions
        else:
            feature_id_prefix = feature_id_prefix + ' ' + sub_extent
            sub_extent_feature_definitions = []
        feature_id_prefix = feature_id_prefix + ' '

        sub_extent_feature_definitions.append(__to_enum_feature_definition(feature_id_prefix + 'Material', materials))
        sub_extent_feature_definitions.append(__to_enum_feature_definition(feature_id_prefix + 'Print', prints))
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

