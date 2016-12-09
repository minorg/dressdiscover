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

definitions = []
for extent, sub_extents in extents.iteritems():
    if sub_extents is None or len(sub_extents) == 0:
        sub_extents = [None]
    extent_definitions = []
    definitions.append(extent_definitions)
    for sub_extent in sub_extents:
        pass




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
