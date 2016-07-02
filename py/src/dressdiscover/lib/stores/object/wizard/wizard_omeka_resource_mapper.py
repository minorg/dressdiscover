import urllib

from com.google.common.base import Optional
from com.google.common.collect import ImmutableList
from com.google.common.primitives import UnsignedInteger
from org.dressdiscover.api.models import VocabRef, Vocab
from org.dressdiscover.api.models.collection import Collection, \
    CollectionEntry
from org.dressdiscover.api.models.image import Image, ImageVersion
from org.dressdiscover.api.models.object import ObjectId, Object, ObjectEntry
from org.dressdiscover.api.models.rights import RightsType, RightsSet, Rights
from org.dressdiscover.api.models.structure import StructureSet, Structure, \
    StructureType
from org.dressdiscover.api.models.title import TitleSet, Title, TitleType
from org.dressdiscover.api.models.view_type import ViewType
from org.thryft.native_ import Uri, Url

from dressdiscover.lib.stores.omeka_resource_mapper import OmekaResourceMapper


class WizardOmekaResourceMapper(OmekaResourceMapper):
    OMEKA_COLLECTIONS = \
{
 # u'14': 27,
 # u'Border Design Series from the Rexford Costume Research Archive': 11,
 u'Closure Placement': 17,
 u'Closure Type': 18,
 u'Components': 16,
 #u'Costume Core Vocabulary Terms': 13,
 #u'Costume Objects': 1,
 #u'Costume Objects Represented in the Rexford Costume Research Archive': 6,
 #u'Costumes in the Smith College Historic Costume Collection': 9,
 #u'Essays': 4,
 u'Hem': 31,
 u'Main Color': 15,
 u'Material': 23,
 u'Neckline': 19,
 #u'Notebook Series from the Rexford Costume Research Archive': 5,
 #u'Research Materials': 2,
 #u'Shawls Represented in the Rexford Costume Research Archive': 7,
 #u'Shawls in the Smith College Historic Costume Collection': 8,
 u'Skirt': 22,
 u'Sleeve Type': 14,
 u'Technique': 24,
 u'Torso': 20,
 u'Waist': 21,
 #u'Wrapper Series from the Rexford Costume Research Archive': 10,
 #u'Wrappers from the Smith College Historic Costume Collection': 12
 }

    OMEKA_ENDPOINT_URL = 'http://historicdress.org/omeka2/'

#     def __init__(self, *args, **kwds):
#         OmekaResourceMapper.__init__(self, *args, **kwds)
#         self.__omeka_collections = {}

    def map_omeka_collection(self, collection_store_uri, institution_id, omeka_collection):
#         for element_text in omeka_collection.element_texts:
#             if len(element_text.text) == 0:
#                 continue
#             if element_text.element_set.name == 'Dublin Core' and element_text.element.name == 'Title':
#                 self.__omeka_collections[element_text.text.strip()] = omeka_collection.id
#         import pprint; pprint.pprint(self.__omeka_collections)
        if not omeka_collection.id in self.OMEKA_COLLECTIONS.values():
            return
        collection_entry = OmekaResourceMapper.map_omeka_collection(self, collection_store_uri, institution_id, omeka_collection)
        return CollectionEntry(collection_entry.id, Collection.builder(collection_entry.model).setHidden(True).build())

    def map_omeka_item(
        self,
        collection_id,
        endpoint_url,
        logger,
        log_marker,
        omeka_item,
        omeka_item_files,
        square_thumbnail_height_px,
        square_thumbnail_width_px
    ):
        object_id = ObjectId.parse(str(collection_id) + '/' + str(omeka_item.id))

        vocab_ref = VocabRef.builder().setVocab(Vocab.COSTUME_CORE).build()

        feature_name = None
        omeka_collection_id = int(collection_id.getUnqualifiedCollectionId())
        for item in self.OMEKA_COLLECTIONS.iteritems():
            if item[1] == omeka_collection_id:
                feature_name = item[0]
                break
        assert feature_name is not None

        feature_value = None
        item_image_credit_line = item_image_license = None
        for element_text in omeka_item.element_texts:
            if len(element_text.text) == 0:
                continue

            if element_text.element_set.name == 'Dublin Core':
                if element_text.element.name == 'Title':
                    if feature_value is None:
                        feature_value = element_text.text
            elif element_text.element_set.name == 'Item Type Metadata':
                if element_text.element.name == 'Image Creator':
                    item_image_credit_line = element_text.text
                elif element_text.element.name == 'Image License':
                    item_image_license = element_text.text
            else:
                logger.warn(log_marker, "Omeka item {} has unknown element set name '{}'", omeka_item.id, element_text.element_set.name)

        object_builder = \
            Object.builder()\
                .setCollectionId(collection_id)\
                .setHidden(True)\
                .setInstitutionId(collection_id.getInstitutionId())\
                .setStructures(\
                    StructureSet.builder().setElements(ImmutableList.of(
                        Structure.builder()
                            .setText(feature_value)
                            .setType(
                                StructureType.builder()
                                    .setText(feature_name)
                                    .setVocabRef(vocab_ref)
                                    .build()
                            )
                            .build()
                        ))
                        .build()
                )\
                .setTitles(
                    TitleSet.builder().setElements(ImmutableList.of(
                        Title.builder()
                            .setText("%(feature_value)s" % locals())
                            .setType(TitleType.DESCRIPTIVE)
                            .build()
                    ))
                    .build()
                )\
                .setViewType(ViewType.DETAIL)

        images = []
        for file_ in omeka_item_files:
            if not file_.mime_type.startswith('image/'):
                continue

            image_credit_line = item_image_credit_line
            image_license = item_image_license
            for element_text in file_.element_texts:
                if element_text.element_set.name == 'Dublin Core':
                    if element_text.element.name == 'License':
                        image_license = element_text.text
                    elif element_text.element.name == 'Provenance':
                        image_credit_line = element_text.text

            if image_credit_line is None or len(image_credit_line) == 0:
                logger.warn(log_marker, "Omeka item {} has a file {} missing a Provenance", omeka_item.id, file_.id)
                continue

            if image_license is None or len(image_license) == 0:
                logger.warn(log_marker, "Omeka item {} has a file {} missing a License", omeka_item.id, file_.id)
                continue

            license_vocab_ref = None
            if image_license.lower() == 'public domain':
                rights_type = RightsType.PUBLIC_DOMAIN
            elif image_license == 'CC0':
                rights_type = RightsType.LICENSED
                license_vocab_ref = \
                    VocabRef.builder()\
                        .setVocab(Vocab.CREATIVE_COMMONS)\
                        .setUri(Uri.parse('https://creativecommons.org/publicdomain/zero/1.0/'))\
                        .build()
            elif image_license.startswith('CC BY-SA '):
                rights_type = RightsType.LICENSED
                version = image_license[len('CC BY-SA '):]
                float(version)
                license_vocab_ref = \
                    VocabRef.builder()\
                        .setVocab(Vocab.CREATIVE_COMMONS)\
                        .setUri(Uri.parse("https://creativecommons.org/licenses/by-sa/%s/" % version))\
                        .build()
            else:
                rights_type = RightsType.LICENSED

            image_builder = Image.builder()
            file_urls = file_.file_urls
            image_builder.setOriginal(ImageVersion.builder().setUrl(Url.parse(file_urls.original)).build())
            image_builder.setRights(
                RightsSet.builder().setElements(ImmutableList.of(
                    Rights.builder()
                        .setLicenseVocabRef(Optional.fromNullable(license_vocab_ref))
                        .setRightsHolder(image_credit_line)
                        .setText(image_license)
                        .setType(rights_type)
                        .build()
                ))
                .build()
            )
            if file_urls.square_thumbnail is None:
                logger.warn(log_marker, "Omeka item {} has a file {} missing a square thumbnail", omeka_item.id, file_.id)
                continue
            image_builder.setSquareThumbnail(
                ImageVersion.builder()
                    .setHeightPx(UnsignedInteger.valueOf(square_thumbnail_height_px))
                    .setUrl(Url.parse(file_urls.square_thumbnail))
                    .setWidthPx(UnsignedInteger.valueOf(square_thumbnail_width_px))
                    .build()
            )
            images.append(image_builder.build())
        if len(images) > 0:
            object_builder.setImages(ImmutableList.copyOf(images))
        else:
            logger.warn(log_marker, "Omeka item {} has no valid images", omeka_item.id)

        object_ = object_builder.build()

        object_id = ObjectId.parse(str(collection_id) + '/' + urllib.quote(feature_value, ''))

        return ObjectEntry(object_id, object_)
