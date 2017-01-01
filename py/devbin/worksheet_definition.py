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
CC_BY_SA = 'Creative Commons Attribution-Share Alike'
PUBLIC_DOMAIN = 'Public domain'
THUMBNAIL_DIMENSIONS = (200, 200)


# Helper functions
def feature_value(
    description=None,
    description_rights=None,
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

def aat_text_rights():
    return \
        rights(
            author='The J. Paul Getty Trust',
            license_='Open Data Commons Attribution License',
            source_name='Art and Architecture Thesaurus (AAT)',
            source_url='http://www.getty.edu/research/tools/vocabularies/aat/'
        )

def eft_wikipedia_image_rights(source_file_name):
    return rights(
        author='David Ring',
        license_=PUBLIC_DOMAIN,
        source_name='Wikipedia / Europeana Fashion Thesaurus',
        source_url='https://commons.wikimedia.org/wiki/File:' + source_file_name
    )

def nypl_image_rights(
    author,
    source_url
):
    return rights(
        author=author,
        license_='Public Domain',
        source_name='New York Public Library',
        source_url=source_url,
    )

def wikipedia_text_rights(
    source_article_name,
    license_=CC_BY_SA
):
    return rights(
        author='Wikipedia',
        license_=license_,
        source_name='Wikipedia',
        source_url='https://en.wikipedia.org/wiki/' + source_article_name,
    )

def wikipedia_image_rights(
    author,
    source_file_name,
    license_=CC_BY_SA
):
    return rights(
        author=author,
        license_=license_,
        source_name='Wikipedia',
        source_url='https://commons.wikimedia.org/wiki/File:' + source_file_name,
    )




# Features
features = OrderedDict()

def closure_values():
    values = OrderedDict()
    values['Buckle'] = feature_value(
        description='Devices used for fastening consisting of a usually open rectangular or rounded frame and a tongue or catch attached to one side or a vertical bar attached across the center. Sometimes used alone as an ornament.',
        description_rights=aat_text_rights(),
        image_rights=eft_wikipedia_image_rights(source_file_name='Buckle.jpg')
    )
    values['Button'] = feature_value(
        image_rights=wikipedia_image_rights(
            author='Marco Bernardini',
            source_file_name='Three_holes_buttons.jpg',
        )
    )
    values['Cufflink'] = feature_value(
        description='Linked ornamental buttons or buttonlike devices for fastening a shirt cuff.',
        description_rights=aat_text_rights(),
        image_rights=eft_wikipedia_image_rights(source_file_name='Cuff_links.jpg')
    )
    values['Frog closure'] = feature_value(
        image_rights=eft_wikipedia_image_rights(source_file_name='Frog_(fastening).jpg')
    )
    values['Hook-and-eye'] = feature_value(
        image_rights=wikipedia_image_rights(
            author='Wikipedia user Eitan F',
            source_file_name='Hook_and_eye_clasp.JPG'
        )
    )
    values['Lacing'] = feature_value(
        description='Cords, bands, or similar flexible devices used for fastening, especially by interlacing, such as in a knot or bow',
        description_rights=aat_text_rights(),
        image_rights=eft_wikipedia_image_rights(source_file_name='Lace_(fastening).jpg')
    )
    values['Zip'] = feature_value(
        image_rights=wikipedia_image_rights(
            author='Wikipedia user Woodbine9',
            source_file_name='Coil_plastic_and_metal_zippers.jpg'
        )
    )
    return values
features['Closure'] = {'values': closure_values}


def collar_values():
    # TODO: https://en.wikipedia.org/wiki/Collar_(clothing)
    values = OrderedDict()
    values['Band'] = feature_value(
        description='Flat, stand-up collars, starched, wired, or otherwise stiffened, especially those commonly worn by men and women in the 17th century',
        description_rights=aat_text_rights(),
        image_rights=eft_wikipedia_image_rights(source_file_name='Band_(collar).jpg')
    )
    values['Bertha'] = feature_value(
        description='A wide, flat, round collar, often of lace or sheer fabric, worn with a low neckline in the Victorian era and resurrected in the 1940s.',
        description_rights=wikipedia_text_rights(source_article_name='Collar_(clothing)'),
        image_rights=wikipedia_image_rights(
            author=PUBLIC_DOMAIN,
            license_=PUBLIC_DOMAIN,
            source_file_name='Portrait_of_Hannah_Fry_(by_Andrew_Geddes).jpg'
        )
    )
    values['Button-down'] = feature_value(
        description='A collar with buttonholes on the points to fasten them to the body of the shirt.',
        description_rights=wikipedia_text_rights(source_article_name='Collar_(clothing)'),
        image_rights=wikipedia_image_rights(
            author='Wikipedia user ArnoldReinhold',
            license_=CC_BY_SA,
            source_file_name='Collar.agr.jpg'
        )
    )
    values['Clerical'] = feature_value(
        description='A band collar worn as part of clerical clothing',
        description_rights=wikipedia_text_rights(source_article_name='Collar_(clothing)'),
        image_rights=wikipedia_image_rights(
            author='Wikipedia user John Sweepy',
            license_=PUBLIC_DOMAIN,
            source_file_name='FrJonathanMorris.jpg'
        )
    )
    values['Detachable'] = feature_value(
        description='A collar made as a separate accessory to be worn with a band-collared shirt',
        description_rights=wikipedia_text_rights(source_article_name='Collar_(clothing)'),
        image_rights=wikipedia_image_rights(
            author='Wikipedia user Charlie Huang',
            license_=PUBLIC_DOMAIN,
            source_file_name='Grafton_starched-stiff_detachable_wing_collar.jpg'
        )
    )
    values['Jabot'] = feature_value(
        description='Detachable, made-up cascades of soft fabric, often lace, worn at the center front of the neckline over other garments. ',
        description_rights=aat_text_rights(),
        image_rights=eft_wikipedia_image_rights(source_file_name='Jabot.jpg')
    )
    # collar_characteristics = [
    #     feature_value('Attached'),
    #     feature_value('Bibbed'),
    #     feature_value('No collar'),
    #     feature_value('Peaked'),
    #     feature_value('Round'),
    # ]
    return values
features['Collar'] = {'values': collar_values()}


# colors = [
#     feature_value('Blue'),
#     feature_value('Brown'),
#     feature_value('Green'),
#     feature_value('Red'),
#     feature_value('White'),
# ]


def decoration_values():
    values = OrderedDict()
    values['Fringe'] = feature_value(
        description='Trimming consisting of long or short lengths of straight or twisted thread, cord, or tassel; often grouped or knotted in various designs',
        description_rights=aat_text_rights(),
        image_rights=eft_wikipedia_image_rights(source_file_name='Fringe_(fabric).jpg')
    )
    values['Knot'] = feature_value(
        image_rights=eft_wikipedia_image_rights(source_file_name='Knot_(decoration).jpg')
    )
    values['Lace'] = feature_value(
        image_rights=eft_wikipedia_image_rights(source_file_name='Lace_fragment.tif')
    )
    return values
features['Decoration'] = {'values': decoration_values()}


# interior_characteristics = [
#     feature_value('Attached underskirt'),
#     feature_value('Partially lined'),
#     feature_value('Lined'),
#     feature_value('Unlined'),
# ]


features['Label'] = {}


def material_values():
    values = OrderedDict()
    #     feature_value('Cotton'),
    values['Corduroy'] = feature_value(
        image_rights=wikipedia_image_rights(
            author='Wikipedia user Ludek',
            source_file_name='Mansestr.jpg',
        )
    )
    #     feature_value('Elastic'),
    #     feature_value('Plastic'),
    #     feature_value('Self-fabric'),
    #     feature_value(
    values['Net tulle'] = feature_value(
        image_rights=wikipedia_image_rights(
            author='Wikipedia user Carolus',
            source_file_name='Carolus_-Private_Collection_-_zwarte_tulekant.jpg',
        )
    )
#     feature_value('Velvet'),
    return values
features['Material'] = {'values': material_values()}


def neckline_values():
    values = OrderedDict()
    values['Boat neck'] = feature_value(
        image_rights=eft_wikipedia_image_rights(source_file_name='Boat_neck.jpg')
    )
    values['Round neck'] = feature_value(
        image_rights=eft_wikipedia_image_rights(source_file_name='Round_neck.jpg')
    )
    values['Ruffled neck'] = feature_value(
        image_rights=eft_wikipedia_image_rights(source_file_name='Ruffled_neck.jpg')
    )
    values['Square neck'] = feature_value(
        image_rights=eft_wikipedia_image_rights(source_file_name='Square_neck.jpg')
    )
    values['Surplice'] = feature_value(
        image_rights=eft_wikipedia_image_rights(source_file_name='Surplice_neckline.jpg')
    )
    values['V-neck'] = feature_value(
        image_rights=eft_wikipedia_image_rights(source_file_name='V-neck.jpg')
    )
    return values
features['Neckline'] = {'values': neckline_values()}


# pleats = [
#     feature_value('Inverted'),
# ]


def print_values():
    values = OrderedDict()
    #     feature_value('Abstracted floral'),
    #     feature_value('Checkerboard'),
    #     feature_value('Floral'),
    #     feature_value('Plaid'),
    # ]
    values['Plaid'] = feature_value(
        image_rights=wikipedia_image_rights(
            author=PUBLIC_DOMAIN,
            license_=PUBLIC_DOMAIN,
            source_file_name='Royal_stewart.jpg',
        )
    )
    return values
features['Print'] = { 'values': print_values() }


# pocket_characteristics = [
#     feature_value('Attached'),
#     feature_value('Open'),
# ]


def shoulder_values():
    values = OrderedDict()
    values['Epaulette'] = feature_value(
        description='Trimming consisting of long or short lengths of straight or twisted thread, cord, or tassel; often grouped or knotted in various designs',
        description_rights=aat_text_rights(),
        image_rights=eft_wikipedia_image_rights(source_file_name='Epaulette_(drawing).jpg')
    )
    return values
features['Shoulder'] = {'values': shoulder_values()}


def sleeve_values():
    # TODO: adapt from Wikipedia
    # https://en.wikipedia.org/wiki/Sleeve
    values = OrderedDict()
    # sleeve = [
    #     feature_value('Attached cuffs'),
    #     feature_value('Elbow-length'),
    #     feature_value('Sleeveless'),
    # ]
    values['Batwing'] = feature_value(
        image_rights=eft_wikipedia_image_rights(source_file_name='Batwing_sleeve.jpg')
    )
    values['Long'] = feature_value(
        image_rights=eft_wikipedia_image_rights(source_file_name='Long_sleeve.jpg')
    )
    values['One sleeve'] = feature_value(
        image_rights=eft_wikipedia_image_rights(source_file_name='One_sleeve.jpg')
    )
    values['Set-in'] = feature_value(
        image_rights=wikipedia_image_rights(
            author='Wikipedia user kellyhogaboom',
            source_file_name='Set_in_sleeve_blind_stitched.jpg',
        )
    )
    values['Short'] = feature_value(
        image_rights=eft_wikipedia_image_rights(source_file_name='Short_sleeve.jpg')
    )
    values['Short puffed'] = feature_value(
        image_rights=eft_wikipedia_image_rights(source_file_name='Short_puffed_sleeve.jpg')
    )
    values['Sleeveless'] = feature_value(
        image_rights=eft_wikipedia_image_rights(source_file_name='Sleeveless.jpg')
    )
features['Sleeve'] = {'values': sleeve_values()}


# techniques = [
#     feature_value('Piped trim'),
#     feature_value('Gathered'),
#     feature_value('Slightly gathered'),
#     feature_value('Smocked'),
# ]


def waistline_values():
    values = OrderedDict()
    values['Natural'] = feature_value(
        image_rights=nypl_image_rights(
            author=PUBLIC_DOMAIN,
            source_url='https://digitalcollections.nypl.org/items/a1974390-ab14-0132-a409-58d385a7bbd0',
        )
    )
    #     feature_value('Dropped'),
    #     feature_value('Natural'),
    #     feature_value('Undefined waistline'),
    # ]
    return values
features['Waistline'] = {'values': waistline_values()}


# Extents
# _horizontal_extents = [
#     'Left',
#     'Right',
#     'Both'
# ]
#
# _vertical_extents = [
#     'Whole',
#     'Top',
#     'Bottom',
# ]


every_extent_feature_ids = ['Decoration', 'Material', 'Print']
extents = OrderedDict()
extents['Whole Body'] = ['Label'] + every_extent_feature_ids
extents['Upper Body'] = upper_body_extents = OrderedDict()
for upper_body_extent_id in (
    'Neckline',
    'Collar',
    'Shoulder',
    'Sleeve',
    'Torso'
):
    if upper_body_extent_id in ('Shoulder', 'Sleeve'):
        upper_body_extents[upper_body_extent_id] = bilateral_extents = OrderedDict()
        for side in ('Left', 'Right'):
            bilateral_extents[side] = every_extent_feature_ids
    else:
        upper_body_extents[upper_body_extent_id] = every_extent_feature_ids
upper_body_extents[None] = every_extent_feature_ids
extents['Waistline'] = every_extent_feature_ids
for lower_body_extent_id in (
    'Hip',
    'Leg',
    'Foot'
):





#
# extents['Whole'] = (None, 'Top', 'Bottom')
# extents['Neckline'] = (None,)
# extents['Collar'] = (None,)
# extents['Shoulder'] = _horizontal_extents
# extents['Sleeve'] = _horizontal_extents
# extents['Cuff'] = _horizontal_extents
# extents['Front'] = _vertical_extents
# extents['Back'] = _vertical_extents
# extents['Interior'] = _vertical_extents


# More helper functions
def __define_feature_values(feature_id, feature_values_dict):
    feature_value_definitions = []
    for feature_value_id, feature_value in feature_values_dict.iteritems():
        feature_value_definition_builder = \
            WorksheetFeatureValueDefinition.Builder()\
                .set_id(feature_value_id)

        image_rights = feature_value.get('image_rights')
        if image_rights is None:
            continue

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
    return tuple(feature_value_definitions)




root_feature_set_definitions = []
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

        for feature_id, feature_dict in features.iteritems():
            if not __extent_has_feature(feature_dict, extent, sub_extent):
                continue

            feature_definition_builder = \
                WorksheetFeatureDefinition.Builder()

            if extent != feature_id:
                feature_definition_builder\
                    .set_id(' '.join(parent_feature_set_ids + [feature_id]))
            else:
                # Neckline Neckline -> Neckline Type
                feature_definition_builder.set_id(' '.join(parent_feature_set_ids + ['Type']))

            if 'values' in feature_dict:
                feature_definition_builder.set_values_(__define_feature_values(feature_id, feature_dict['values']))

            sub_extent_feature_definitions.append(feature_definition_builder.build())

        if sub_extent is not None:
            assert len(sub_extent_feature_definitions) > 0, extent
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
    js = 'var WORKSHEET_DEFINITION = ' + json.dumps(oprot.value) + "\n"

    file_name = 'worksheet_definition.js'
    for file_path in (
        os.path.join(ASSETS_DIR_PATH, 'js', file_name),
        os.path.join(ASSETS_DIR_PATH, '..', 'public', 'js', file_name)
    ):
        with open(file_path, 'w+b') as f:
            f.write(js)
