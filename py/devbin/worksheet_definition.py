from dressdiscover.api.models.worksheet.worksheet_definition import WorksheetDefinition
from dressdiscover.api.models.worksheet.worksheet_enum_feature_definition import WorksheetEnumFeatureDefinition
from dressdiscover.api.models.worksheet.worksheet_feature_definition import WorksheetFeatureDefinition
from dressdiscover.api.models.worksheet.worksheet_feature_set_definition import WorksheetFeatureSetDefinition

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

extents = {
    'Whole': _vertical_extents,
    'Collar': [],
    'Shoulders': [],
    'Sleeves': [],
    'Front': _vertical_extents,
    'Back': _vertical_extents,
    'Interior': _vertical_extents,
}

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


root_feature_sets = []
for extent, sub_extents in extents.iteritems():
    if sub_extents is None or len(sub_extents) == 0:
        sub_extents = [None]
    extent_definitions = []
    for sub_extent in sub_extents:
        pass

WORKSHEET_DEFINITION = \
    WorksheetDefinition(
        root_feature_set_definition=\
            WorksheetFeatureSetDefinition(
                child_feature_sets=tuple(root_feature_sets),
                id='root',
            )
    )



# definitions = {
#     'Head/Neck': {
#     },
#     'Torso/Pelvis': {
#         'Main Garment (Top)': {
#             'Bodice Back': decoration_applied,
#             'Bodice Front': decoration_applied,
#         }
#     }
# }
