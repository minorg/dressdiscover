from collections import OrderedDict
import os.path

from dressdiscover.api.models.worksheet.worksheet_definition import WorksheetDefinition
from dressdiscover.api.models.worksheet.worksheet_feature_definition import WorksheetFeatureDefinition
from dressdiscover.api.models.worksheet.worksheet_feature_set_definition import WorksheetFeatureSetDefinition
from dressdiscover.api.models.worksheet.worksheet_feature_value_definition import WorksheetFeatureValueDefinition
from dressdiscover.api.models.worksheet.worksheet_feature_value_image import WorksheetFeatureValueImage
from dressdiscover.api.models.worksheet.worksheet_feature_value_image_rights import WorksheetFeatureValueImageRights
from _nsis import out


# Constants
ASSETS_DIR_PATH = os.path.abspath(os.path.join(os.path.dirname(__file__), '..', '..', 'ts', 'assets'))
assert os.path.isdir(ASSETS_DIR_PATH), ASSETS_DIR_PATH
PUBLIC_DOMAIN = 'Public domain'
THUMBNAIL_DIMENSIONS = (200, 200)


# Helper functions
def feature_value(
    image_rights=None
):
    out = {}
    if image_rights is not None:
        out['image_rights'] = image_rights
    return out

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

def wikipedia_rights(
    author,
    source_url,
    license_='Creative Commons Attribution-Share Alike'
):
    return rights(
        author=author,
        license_=license_,
        source_name='Wikipedia',
        source_url=source_url,
    )
    
def nypl_rights(
    author,
    source_url
):
    return rights(
        author=author,
        license_='Public Domain',
        source_name='New York Public Library',
        source_url=source_url,
    )
    


# Features
# decoration_applied = {
#     'Decoration': {
#         'Applied': [
#             'Embroidery',
#             'Sequins',
#             'Applique',
#         ]
#     }
# }

features = OrderedDict()

closures = OrderedDict()
closures['Button'] = feature_value(
    image_rights=wikipedia_rights(
        author='Marco Bernardini',
        source_url='https://commons.wikimedia.org/wiki/File:Three_holes_buttons.jpg',
    )
)
closures['Hook-and-eye'] = feature_value(
    image_rights=wikipedia_rights(
        author='Wikipedia user Eitan F',
        source_url='https://en.wikipedia.org/wiki/Hook-and-eye_closure#/media/File:Hook_and_eye_clasp.JPG'
    )
)
closures['Zip'] = feature_value(
    image_rights=wikipedia_rights(
        author='Wikipedia user Woodbine9',
        source_url='https://commons.wikimedia.org/wiki/File:Coil_plastic_and_metal_zippers.jpg'
    )    
)
#feature_value('Non-functional'),
features['Closure'] = {'values': closures}


# collar_characteristics = [
#     feature_value('Attached'),
#     feature_value('Bibbed'),
#     feature_value('No collar'),
#     feature_value('Peaked'),
#     feature_value('Round'),
# ]

colors = [
    feature_value('Blue'),
    feature_value('Brown'),
    feature_value('Green'),
    feature_value('Red'),
    feature_value('White'),
]

interior_characteristics = [
    feature_value('Attached underskirt'),
    feature_value('Partially lined'),
    feature_value('Lined'),
    feature_value('Unlined'),
]

features['Label'] = {'extents': (('Whole', None),)}

materials = OrderedDict()
#     feature_value('Cotton'),
materials['Corduroy'] = feature_value(
    image_rights=wikipedia_rights(
        author='Wikipedia user Ludek',
        source_url='https://commons.wikimedia.org/wiki/File:Mansestr.jpg',
    )
)
#     feature_value('Elastic'),
#     feature_value('Plastic'),
#     feature_value('Self-fabric'),
#     feature_value(
materials['Net tulle'] = feature_value(
    image_rights=wikipedia_rights(
        author='Wikipedia user Carolus',
        source_url='https://commons.wikimedia.org/wiki/File:Carolus_-Private_Collection_-_zwarte_tulekant.jpg',
    )
)
features['Material'] = {'values': materials}
#     feature_value('Velvet'),

pleats = [
    feature_value('Inverted'),
]


prints = OrderedDict()
#     feature_value('Abstracted floral'),
#     feature_value('Checkerboard'),
#     feature_value('Floral'),
#     feature_value('Plaid'),
# ]
prints['Plaid'] = feature_value(
    image_rights=wikipedia_rights(
        author=PUBLIC_DOMAIN,
        license_=PUBLIC_DOMAIN,
        source_url='https://commons.wikimedia.org/wiki/File:Royal_stewart.jpg',
    )
)
features['Print'] = { 'values': prints }

pocket_characteristics = [
    feature_value('Attached'),
    feature_value('Open'),
]

sleeves = OrderedDict()
# sleeve = [
#     feature_value('Attached cuffs'),
#     feature_value('Elbow-length'),
#     feature_value('Set-in'),
#     feature_value('Sleeveless'),
# ]
sleeves['Set-in'] = feature_value(
    image_rights=wikipedia_rights(
        author='Wikipedia user kellyhogaboom',
        source_url='https://commons.wikimedia.org/wiki/File:Set_in_sleeve_blind_stitched.jpg',
    )
)
features['Sleeves'] = {'extents': (('Sleeves', None),), 'values': sleeves}

techniques = [
    feature_value('Piped trim'),
    feature_value('Gathered'),
    feature_value('Slightly gathered'),
    feature_value('Smocked'),
]

waistline = OrderedDict()
waistline['Natural'] = feature_value(
    image_rights=nypl_rights(
        author=PUBLIC_DOMAIN,
        source_url='https://digitalcollections.nypl.org/items/a1974390-ab14-0132-a409-58d385a7bbd0',
    )
)
#     feature_value('Dropped'),
#     feature_value('Natural'),
#     feature_value('Undefined waistline'),
# ]
features['Waistline'] = {'extents': (('Whole', None),), 'values': waistline}


# Extents
_vertical_extents = [
    'Whole',
    'Top',
    'Bottom',
]

extents = OrderedDict()
extents['Whole'] = (None, 'Top', 'Bottom')
extents['Collar'] = (None,)
extents['Shoulders'] = (None,)
extents['Sleeves'] = (None,)
extents['Front'] = _vertical_extents
extents['Back'] = _vertical_extents
extents['Interior'] = _vertical_extents


extent_feature_set_definitions = []
for extent, sub_extents in extents.iteritems():
    extent_child_feature_set_definitions = []
    extent_feature_definitions = []
        
    for sub_extent in sub_extents:
        assert extent != sub_extent

        parent_feature_set_ids = [extent]
        if sub_extent is None:
            sub_extent_feature_definitions = extent_feature_definitions
        else:
            sub_extent_feature_definitions = []
            parent_feature_set_ids.append(sub_extent)

        for feature_id, feature in features.iteritems():
            feature_extents = feature.get('extents')
            if feature_extents is not None:
                include_feature = False
                for feature_extent in feature_extents:
                    feature_extent, feature_sub_extent = feature_extent
                    if feature_extent == extent and feature_sub_extent == sub_extent:
                        include_feature = True
                        break
                if not include_feature:
                    continue
            
            feature_definition_builder = \
                WorksheetFeatureDefinition.Builder()\
                    .set_id(' '.join(parent_feature_set_ids + [feature_id]))

            if 'values' in feature:
                feature_value_definitions = []
                for feature_value_id, feature_value in feature['values'].iteritems():
                    feature_value_definition_builder = \
                        WorksheetFeatureValueDefinition.Builder()\
                            .set_id(feature_value_id)
                    
                    image_rights = feature_value.get('image_rights')
                    if image_rights is not None:
                        image_builder = WorksheetFeatureValueImage.Builder()
                        image_builder.set_rights(image_rights)    
    
                        file_extension = feature_value.get('image_file_extension', 'jpg')                     
                        file_name = "%(feature_value_id)s.%(file_extension)s" % locals()
                         
                        full_size_file_path = os.path.join(ASSETS_DIR_PATH, 'img', 'full_size', feature_id, file_name)
                        if not os.path.isfile(full_size_file_path):
                            raise ValueError("%(full_size_file_path)s does not exist" % locals())
                        image_builder.set_full_size_url("img/full_size/%(feature_id)s/%(file_name)s" % locals())
                         
                        thumbnail_dir_path = os.path.join(ASSETS_DIR_PATH, 'img', 'thumbnail', feature_id)
                        thumbnail_file_path = os.path.join(thumbnail_dir_path, file_name)
                        if not os.path.isfile(thumbnail_file_path):
                            from PIL import Image  # @UnresolvedImport
                            thumbnail = Image.open(full_size_file_path)
                            # Use .resize and .thumbnail, because the latter preserves the aspect ratio,
                            # which we don't want.
                            thumbnail = thumbnail.resize(THUMBNAIL_DIMENSIONS)
                            if not os.path.isdir(thumbnail_dir_path):
                                os.makedirs(thumbnail_dir_path)
                            thumbnail.save(thumbnail_file_path)
                            print "saved thumbnail to", thumbnail_file_path
                        image_builder.set_thumbnail_url("img/thumbnail/%(feature_id)s/%(file_name)s" % locals())
    
                        feature_value_definition_builder.set_image(image_builder.build())
    
                    feature_value_definitions.append(feature_value_definition_builder.build())
                    
                feature_definition_builder.set_values_(tuple(feature_value_definitions))
            
            sub_extent_feature_definitions.append(feature_definition_builder.build())
                
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
    js = 'var WORKSHEET_DEFINITION = ' + json.dumps(oprot.value, indent=4) + "\n"
    
    file_name = 'worksheet_definition.js'
    for file_path in (
        os.path.join(ASSETS_DIR_PATH, 'js', file_name),
        os.path.join(ASSETS_DIR_PATH, '..', 'public', 'js', file_name)
    ):
        with open(file_path, 'w+b') as f:
            f.write(js)
