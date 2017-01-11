from collections import OrderedDict
import os.path

from dressdiscover.api.models.worksheet.worksheet_definition import WorksheetDefinition
from dressdiscover.api.models.worksheet.worksheet_feature_definition import WorksheetFeatureDefinition
from dressdiscover.api.models.worksheet.worksheet_feature_set_definition import WorksheetFeatureSetDefinition
from dressdiscover.api.models.worksheet.worksheet_feature_value_definition import WorksheetFeatureValueDefinition
from dressdiscover.api.models.worksheet.worksheet_feature_value_image import WorksheetFeatureValueImage
from dressdiscover.api.models.worksheet.worksheet_feature_value_image_rights import WorksheetFeatureValueImageRights


# Constants
ROOT_DIR_PATH = os.path.abspath(os.path.join(os.path.dirname(__file__), '..', '..'))
ANDROID_ASSETS_DIR_PATH = os.path.join(ROOT_DIR_PATH, 'cs', 'DressDiscover', 'DressDiscover.Droid', 'Assets')
TS_ASSETS_DIR_PATH = os.path.join(ROOT_DIR_PATH, 'ts', 'assets')
assert os.path.isdir(TS_ASSETS_DIR_PATH), TS_ASSETS_DIR_PATH
CC_BY_SA = 'Creative Commons Attribution-Share Alike'
PUBLIC_DOMAIN = 'Public domain'
THUMBNAIL_DIMENSIONS = (200, 200)


# Mutable helper classes
class Extent(object):
    def __init__(
        self,
        id_,
        features=None
     ):
        self.__id = id_
        self.__child_extents = []
        self.__features = []
        if features is not None:
            self.__features.extend(features)

    @property
    def child_extents(self):
        return self.__child_extents

    @property
    def id_(self):
        return self.__id

    @property
    def features(self):
        return self.__features

    def to_feature_set_definition(self):
        feature_set_definition_builder = \
            WorksheetFeatureSetDefinition.Builder().set_id(self.id_)

        if len(self.child_extents) > 0:
            feature_set_definition_builder.set_child_feature_sets(tuple(
                child_extent.to_feature_set_definition()
                for child_extent in self.child_extents
            ))

        if len(self.features) > 0:
            feature_set_definition_builder.set_features(tuple(
                feature.to_feature_definition(extent_id=self.id_)
                for feature in self.features
            ))

        return feature_set_definition_builder.build()


class Feature(object):
    def __init__(
        self,
        id_,
        values=None
    ):
        self.__id = id_
        if values is not None:
            if isinstance(values, list):
                values = tuple(values)
            assert isinstance(values, tuple)
            assert len(values) > 0
        self.__values = values

    @property
    def id_(self):
        return self.__id

    def replace_values(self, values):
        return Feature(id_=self.id_, values=values)

    @property
    def values(self):
        return self.__values

    def to_feature_definition(self, extent_id=None):
        unused_features_by_id.pop(self.id_, None)

        feature_definition_builder = \
            WorksheetFeatureDefinition.Builder()

        id_ = self.id_
        if extent_id is not None:
            if extent_id != id_:
                id_ = extent_id + ' ' + id_
            else:
                id_ = extent_id + ' Type'

        feature_definition_builder.set_id(id_)

        if self.values is not None:
            feature_definition_builder.set_values_(tuple(
                feature_value.to_feature_value_definition(feature_id=self.id_)
                for feature_value in self.values
            ))

        return feature_definition_builder.build()


class FeatureValue(object):
    def __init__(
        self,
        id_,
        description=None,
        description_rights=None,
        image_rights=None
    ):
        self.__id = id_
        self.__image_rights = image_rights

    @property
    def id_(self):
        return self.__id

    @property
    def image_rights(self):
        return self.__image_rights

    def to_feature_value_definition(self, feature_id):
        feature_value_id = self.id_

        feature_value_definition_builder = \
            WorksheetFeatureValueDefinition.Builder()\
                .set_id(feature_value_id)

        if self.image_rights is None:
            return feature_value_definition_builder.build()

        image_builder = WorksheetFeatureValueImage.Builder()
        image_builder.set_rights(self.image_rights)

#         file_extension = self.get('image_file_extension', 'jpg')
        file_extension = 'jpg'
        file_name = "%(feature_value_id)s.%(file_extension)s" % locals()

        full_size_file_path = os.path.join(TS_ASSETS_DIR_PATH, 'img', 'full_size', feature_id, file_name)
        if not os.path.isfile(full_size_file_path):
            raise ValueError("%(full_size_file_path)s does not exist" % locals())
        image_builder.set_full_size_url("img/full_size/%(feature_id)s/%(file_name)s" % locals())

        thumbnail_dir_path = os.path.join(TS_ASSETS_DIR_PATH, 'img', 'thumbnail', feature_id)
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

        return feature_value_definition_builder.build()


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
features_list = []


def closure_values():
    values = []
    values.append(FeatureValue('Buckle',
        description='Devices used for fastening consisting of a usually open rectangular or rounded frame and a tongue or catch attached to one side or a vertical bar attached across the center. Sometimes used alone as an ornament.',
        description_rights=aat_text_rights(),
        image_rights=eft_wikipedia_image_rights(source_file_name='Buckle.jpg')
    ))
    values.append(FeatureValue('Button',
        image_rights=wikipedia_image_rights(
            author='Marco Bernardini',
            source_file_name='Three_holes_buttons.jpg',
        )
    ))
    values.append(FeatureValue('Frog closure',
        image_rights=eft_wikipedia_image_rights(source_file_name='Frog_(fastening).jpg')
    ))
    values.append(FeatureValue('Hook-and-eye',
        image_rights=wikipedia_image_rights(
            author='Wikipedia user Eitan F',
            source_file_name='Hook_and_eye_clasp.JPG'
        )
    ))
    values.append(FeatureValue('Lacing',
        description='Cords, bands, or similar flexible devices used for fastening, especially by interlacing, such as in a knot or bow',
        description_rights=aat_text_rights(),
        image_rights=eft_wikipedia_image_rights(source_file_name='Lace_(fastening).jpg')
    ))
    values.append(FeatureValue('Zip',
        image_rights=wikipedia_image_rights(
            author='Wikipedia user Woodbine9',
            source_file_name='Coil_plastic_and_metal_zippers.jpg'
        )
    ))
    return values
features_list.append(Feature('Closure', values=closure_values()))


def collar_values():
    # TODO: https://en.wikipedia.org/wiki/Collar_(clothing)
    values = []
    values.append(FeatureValue('Band',
        description='Flat, stand-up collars, starched, wired, or otherwise stiffened, especially those commonly worn by men and women in the 17th century',
        description_rights=aat_text_rights(),
        image_rights=eft_wikipedia_image_rights(source_file_name='Band_(collar).jpg')
    ))
    values.append(FeatureValue('Bertha',
        description='A wide, flat, round collar, often of lace or sheer fabric, worn with a low neckline in the Victorian era and resurrected in the 1940s.',
        description_rights=wikipedia_text_rights(source_article_name='Collar_(clothing)'),
        image_rights=wikipedia_image_rights(
            author=PUBLIC_DOMAIN,
            license_=PUBLIC_DOMAIN,
            source_file_name='Portrait_of_Hannah_Fry_(by_Andrew_Geddes).jpg'
        )
    ))
    values.append(FeatureValue('Button-down',
        description='A collar with buttonholes on the points to fasten them to the body of the shirt.',
        description_rights=wikipedia_text_rights(source_article_name='Collar_(clothing)'),
        image_rights=wikipedia_image_rights(
            author='Wikipedia user ArnoldReinhold',
            license_=CC_BY_SA,
            source_file_name='Collar.agr.jpg'
        )
    ))
    values.append(FeatureValue('Clerical',
        description='A band collar worn as part of clerical clothing',
        description_rights=wikipedia_text_rights(source_article_name='Collar_(clothing)'),
        image_rights=wikipedia_image_rights(
            author='Wikipedia user John Sweepy',
            license_=PUBLIC_DOMAIN,
            source_file_name='FrJonathanMorris.jpg'
        )
    ))
    values.append(FeatureValue('Detachable',
        description='A collar made as a separate accessory to be worn with a band-collared shirt',
        description_rights=wikipedia_text_rights(source_article_name='Collar_(clothing)'),
        image_rights=wikipedia_image_rights(
            author='Wikipedia user Charlie Huang',
            license_=PUBLIC_DOMAIN,
            source_file_name='Grafton_starched-stiff_detachable_wing_collar.jpg'
        )
    ))
    values.append(FeatureValue('Jabot',
        description='Detachable, made-up cascades of soft fabric, often lace, worn at the center front of the neckline over other garments. ',
        description_rights=aat_text_rights(),
        image_rights=eft_wikipedia_image_rights(source_file_name='Jabot.jpg')
    ))
    # collar_characteristics = [
    #     feature_value('Attached'),
    #     feature_value('Bibbed'),
    #     feature_value('No collar'),
    #     feature_value('Peaked'),
    #     feature_value('Round'),
    # ]
    return values
features_list.append(Feature('Collar', values=collar_values()))


# colors = [
#     feature_value('Blue'),
#     feature_value('Brown'),
#     feature_value('Green'),
#     feature_value('Red'),
#     feature_value('White'),
# ]


def decoration_values():
    values = []
    values.append(FeatureValue('Fringe',
        description='Trimming consisting of long or short lengths of straight or twisted thread, cord, or tassel; often grouped or knotted in various designs',
        description_rights=aat_text_rights(),
        image_rights=eft_wikipedia_image_rights(source_file_name='Fringe_(fabric).jpg')
    ))
    values.append(FeatureValue('Knot',
        image_rights=eft_wikipedia_image_rights(source_file_name='Knot_(decoration).jpg')
    ))
    values.append(FeatureValue('Lace',
        image_rights=eft_wikipedia_image_rights(source_file_name='Lace_fragment.tif')
    ))
    return values
features_list.append(Feature('Decoration', values=decoration_values()))


def fabric_values():
    values = []
    #     feature_value('Cotton'),
    values.append(FeatureValue('Corduroy',
        image_rights=wikipedia_image_rights(
            author='Wikipedia user Ludek',
            source_file_name='Mansestr.jpg',
        )
    ))
    #     feature_value('Elastic'),
    #     feature_value('Plastic'),
    #     feature_value('Self-fabric'),
    #     feature_value(
    values.append(FeatureValue('Net tulle',
        image_rights=wikipedia_image_rights(
            author='Wikipedia user Carolus',
            source_file_name='Carolus_-Private_Collection_-_zwarte_tulekant.jpg',
        )
    ))
#     feature_value('Velvet'),
    return values
features_list.append(Feature('Fabric', values=fabric_values()))


def fiber_values():
    values = []
    #     feature_value('Cotton'),
    values.append(FeatureValue('Cotton',
    ))
    #     feature_value('Elastic'),
    #     feature_value('Plastic'),
    #     feature_value('Self-fabric'),
    #     feature_value(
    return values
features_list.append(Feature('Fiber', values=fiber_values()))



# interior_characteristics = [
#     feature_value('Attached underskirt'),
#     feature_value('Partially lined'),
#     feature_value('Lined'),
#     feature_value('Unlined'),
# ]


features_list.append(Feature('Label'))


def neckline_values():
    values = []
    values.append(FeatureValue('Boat neck',
        image_rights=eft_wikipedia_image_rights(source_file_name='Boat_neck.jpg')
    ))
    values.append(FeatureValue('Round neck',
        image_rights=eft_wikipedia_image_rights(source_file_name='Round_neck.jpg')
    ))
    values.append(FeatureValue('Ruffled neck',
        image_rights=eft_wikipedia_image_rights(source_file_name='Ruffled_neck.jpg')
    ))
    values.append(FeatureValue('Square neck',
        image_rights=eft_wikipedia_image_rights(source_file_name='Square_neck.jpg')
    ))
    values.append(FeatureValue('Surplice',
        image_rights=eft_wikipedia_image_rights(source_file_name='Surplice_neckline.jpg')
    ))
    values.append(FeatureValue('V-neck',
        image_rights=eft_wikipedia_image_rights(source_file_name='V-neck.jpg')
    ))
    return values
features_list.append(Feature('Neckline', values=neckline_values()))


# pleats = [
#     feature_value('Inverted'),
# ]


def print_values():
    values = []
    #     feature_value('Abstracted floral'),
    #     feature_value('Checkerboard'),
    #     feature_value('Floral'),
    #     feature_value('Plaid'),
    # ]
    values.append(FeatureValue('Plaid',
        image_rights=wikipedia_image_rights(
            author=PUBLIC_DOMAIN,
            license_=PUBLIC_DOMAIN,
            source_file_name='Royal_stewart.jpg',
        )
    ))
    return values
features_list.append(Feature('Print', values=print_values()))


# pocket_characteristics = [
#     feature_value('Attached'),
#     feature_value('Open'),
# ]


def shoulder_values():
    values = []
    values.append(FeatureValue('Epaulette',
        description='Trimming consisting of long or short lengths of straight or twisted thread, cord, or tassel; often grouped or knotted in various designs',
        description_rights=aat_text_rights(),
        image_rights=eft_wikipedia_image_rights(source_file_name='Epaulette_(drawing).jpg')
    ))
    return values
features_list.append(Feature('Shoulder', values=shoulder_values()))


def sleeve_values():
    # TODO: adapt from Wikipedia
    # https://en.wikipedia.org/wiki/Sleeve
    values = []
    # sleeve = [
    #     feature_value('Attached cuffs'),
    #     feature_value('Elbow-length'),
    #     feature_value('Sleeveless'),
    # ]
    values.append(FeatureValue('Batwing',
        image_rights=eft_wikipedia_image_rights(source_file_name='Batwing_sleeve.jpg')
    ))
    values.append(FeatureValue('Long',
        image_rights=eft_wikipedia_image_rights(source_file_name='Long_sleeve.jpg')
    ))
    values.append(FeatureValue('One sleeve',
        image_rights=eft_wikipedia_image_rights(source_file_name='One_sleeve.jpg')
    ))
    values.append(FeatureValue('Set-in',
        image_rights=wikipedia_image_rights(
            author='Wikipedia user kellyhogaboom',
            source_file_name='Set_in_sleeve_blind_stitched.jpg',
        )
    ))
    values.append(FeatureValue('Short',
        image_rights=eft_wikipedia_image_rights(source_file_name='Short_sleeve.jpg')
    ))
    values.append(FeatureValue('Short puffed',
        image_rights=eft_wikipedia_image_rights(source_file_name='Short_puffed_sleeve.jpg')
    ))
    values.append(FeatureValue('Sleeveless',
        image_rights=eft_wikipedia_image_rights(source_file_name='Sleeveless.jpg')
    ))
    return values
features_list.append(Feature('Sleeve', values=sleeve_values()))


# techniques = [
#     feature_value('Piped trim'),
#     feature_value('Gathered'),
#     feature_value('Slightly gathered'),
#     feature_value('Smocked'),
# ]


def waistline_values():
    values = []
    values.append(FeatureValue('Natural',
        image_rights=nypl_image_rights(
            author=PUBLIC_DOMAIN,
            source_url='https://digitalcollections.nypl.org/items/a1974390-ab14-0132-a409-58d385a7bbd0',
        )
    ))
    #     feature_value('Dropped'),
    #     feature_value('Natural'),
    #     feature_value('Undefined waistline'),
    # ]
    return values
features_list.append(Feature('Waistline', values=waistline_values()))


# Track which features are used to make sure they're all incorporated
features_by_id = OrderedDict()
for feature in features_list:
    features_by_id[feature.id_] = feature
unused_features_by_id = features_by_id.copy()


every_extent_features = [features_by_id[feature_id]
                         for feature_id in ['Closure', 'Decoration', 'Fabric', 'Fiber', 'Print']]
sides = ('Left', 'Right')
extents = []

extents.append(Extent('Whole Body', features=[features_by_id['Label']] + every_extent_features))

upper_body_extent = Extent('Upper Body', features=every_extent_features)
extents.append(upper_body_extent)
for upper_body_child_extent_id in (
    'Head Covering',
    'Neckline',
    'Collar',
    'Shoulder',
    'Sleeve',
    'Cuff',
    'Hand Covering',
    'Torso',
):
    upper_body_child_extent = Extent(upper_body_child_extent_id)
    upper_body_extent.child_extents.append(upper_body_child_extent)

    # Add features first so they can be present on Left-Right
    for feature in every_extent_features:
        if upper_body_child_extent_id == 'Cuff' and feature.id_ == 'Closure':
            upper_body_child_extent.features.append(feature.replace_values(list(feature.values) + [FeatureValue('Cufflink',
                description='Linked ornamental buttons or buttonlike devices for fastening a shirt cuff.',
                description_rights=aat_text_rights(),
                image_rights=eft_wikipedia_image_rights(source_file_name='Cuff_links.jpg')
            )]))
        else:
            upper_body_child_extent.features.append(feature)

    if upper_body_child_extent_id in features_by_id:
        upper_body_child_extent.features.append(features_by_id[upper_body_child_extent_id])

    if upper_body_child_extent_id in ('Hand Covering', 'Cuff', 'Shoulder', 'Sleeve'):
        for side in sides:
            side_extent = Extent(side + ' ' + upper_body_child_extent_id, features=upper_body_child_extent.features)
            upper_body_child_extent.child_extents.append(side_extent)

extents.append(Extent('Waistline', every_extent_features + [features_by_id['Waistline']]))

lower_body_extent = Extent('Lower Body', features=every_extent_features)
extents.append(lower_body_extent)
for lower_body_child_extent_id in (
    'Hip',
    'Leg',
    'Foot',
):
    lower_body_child_extent = Extent(lower_body_child_extent_id, features=every_extent_features)
    lower_body_extent.child_extents.append(lower_body_child_extent)

    for side in sides:
        side_extent = Extent(side + ' ' + lower_body_child_extent_id, features=lower_body_child_extent.features)
        lower_body_child_extent.child_extents.append(side_extent)

# Build up tree
root_feature_set_definitions = []
for extent in extents:
    root_feature_set_definitions.append(extent.to_feature_set_definition())
assert len(unused_features_by_id) == 0, unused_features_by_id.keys()


WORKSHEET_DEFINITION = \
    WorksheetDefinition(
        root_feature_set=\
            WorksheetFeatureSetDefinition(
                child_feature_sets=tuple(root_feature_set_definitions),
                id='root',
            )
    )


if __name__ == '__main__':
    import json
    from thryft.protocol.builtins_output_protocol import BuiltinsOutputProtocol
    oprot = BuiltinsOutputProtocol()
    WORKSHEET_DEFINITION.write(oprot)
    json_ = json.dumps(oprot.value)
    js = 'var WORKSHEET_DEFINITION = ' + json_ + "\n"

    js_file_name = 'worksheet_definition.js'
    json_file_name = 'worksheet_definition.json'
    for file_path, contents in (
        (os.path.join(TS_ASSETS_DIR_PATH, 'js', js_file_name), js),
        (os.path.join(TS_ASSETS_DIR_PATH, '..', 'public', 'js', js_file_name), js),
        (os.path.join(ANDROID_ASSETS_DIR_PATH, json_file_name), json),
    ):
        with open(file_path, 'w+b') as f:
            f.write(js)
