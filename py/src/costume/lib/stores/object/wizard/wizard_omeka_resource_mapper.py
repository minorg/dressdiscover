import urllib

from com.google.common.base import Optional
from com.google.common.collect import ImmutableList
from com.google.common.primitives import UnsignedInteger
from net.lab1318.costume.api.models import VocabRef, Vocab
from net.lab1318.costume.api.models.collection import Collection, \
    CollectionEntry
from net.lab1318.costume.api.models.image import Image, ImageVersion
from net.lab1318.costume.api.models.object import ObjectId, Object, ObjectEntry
from net.lab1318.costume.api.models.rights import RightsType, RightsSet, Rights
from net.lab1318.costume.api.models.structure import StructureSet, Structure, \
    StructureType
from net.lab1318.costume.api.models.title import TitleSet, Title, TitleType
from net.lab1318.costume.api.models.view_type import ViewType
from org.thryft.native_ import Uri, Url

from costume.lib.stores.omeka_resource_mapper import OmekaResourceMapper


class WizardOmekaResourceMapper(OmekaResourceMapper):
    OMEKA_COLLECTIONS = {
        'Closure Type': 18,
        'Neckline': 19,
        'Sleeve Type': 14
    }

    OMEKA_ENDPOINT_URL = 'http://historicdress.org/omeka2/'

    def map_omeka_collection(self, collection_store_uri, institution_id, omeka_collection):
        if not omeka_collection.id in self.OMEKA_COLLECTIONS.values():
            return
        collection_entry = OmekaResourceMapper.map_omeka_collection(self, collection_store_uri, institution_id, omeka_collection)
        return CollectionEntry(collection_entry.id, Collection.Builder(collection_entry.model).setHidden(True).build())

    def map_omeka_item(self, collection_id, endpoint_url, omeka_item, omeka_item_files, square_thumbnail_height_px, square_thumbnail_width_px):
        object_id = ObjectId.parse(str(collection_id) + '/' + str(omeka_item.id))

        vocab_ref = VocabRef.Builder().setVocab(Vocab.COSTUME_CORE).build()

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
                self._logger.warn("Omeka item %d has unknown element set name '%s'", omeka_item.id, element_text.element_set.name)

        object_builder = \
            Object.Builder()\
                .setCollectionId(collection_id)\
                .setHidden(True)\
                .setInstitutionId(collection_id.getInstitutionId())\
                .setStructures(\
                    StructureSet.Builder().setElements(ImmutableList.of(
                        Structure.Builder()
                            .setText(feature_value)
                            .setType(
                                StructureType.Builder()
                                    .setText(feature_value)
                                    .setVocabRef(vocab_ref)
                                    .build()
                            )
                            .build()
                        ))
                        .build()
                )\
                .setTitles(
                    TitleSet.Builder().setElements(ImmutableList.of(
                        Title.Builder()
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
                self._logger.warn("Omeka item %d has a file %d missing a Provenance", omeka_item.id, file_.id)
                continue

            if image_license is None or len(image_license) == 0:
                self._logger.warn("Omeka item %d has a file %d missing a License", omeka_item.id, file_.id)
                continue

            license_vocab_ref = None
            if image_license.lower() == 'public domain':
                rights_type = RightsType.PUBLIC_DOMAIN
            elif image_license == 'CC0':
                rights_type = RightsType.LICENSED
                license_vocab_ref = \
                    VocabRef.Builder()\
                        .setVocab(Vocab.CREATIVE_COMMONS)\
                        .setUri(Uri.parse('https://creativecommons.org/publicdomain/zero/1.0/'))\
                        .build()
            elif image_license.startswith('CC BY-SA '):
                rights_type = RightsType.LICENSED
                version = image_license[len('CC BY-SA '):]
                float(version)
                license_vocab_ref = \
                    VocabRef.Builder()\
                        .setVocab(Vocab.CREATIVE_COMMONS)\
                        .setUri(Uri.parse("https://creativecommons.org/licenses/by-sa/%s/" % version))\
                        .build()
            else:
                rights_type = RightsType.LICENSED

            image_builder = Image.Builder()  # @UndefinedVariable
            file_urls = file_.file_urls
            image_builder.setOriginal(ImageVersion.Builder().setUrl(Url.parse(file_urls.original)).build())
            image_builder.setRights(
                RightsSet.Builder().setElements(ImmutableList.of(
                    Rights.Builder()
                        .setLicenseVocabRef(Optional.fromNullable(license_vocab_ref))
                        .setRightsHolder(image_credit_line)
                        .setText(image_license)
                        .setType(rights_type)
                        .build()
                ))
                .build()
            )
            if file_urls.square_thumbnail is None:
                self._logger.warn("Omeka item %d has a file %d missing a square thumbnail", omeka_item.id, file_.id)
                continue
            image_builder.setSquareThumbnail(
                ImageVersion.Builder()
                    .setHeightPx(UnsignedInteger.valueOf(square_thumbnail_height_px))
                    .setUrl(Url.parse(file_urls.square_thumbnail))
                    .setWidthPx(UnsignedInteger.valueOf(square_thumbnail_width_px))
                    .build()
            )
            images.append(image_builder.build())
        if len(images) > 0:
            object_builder.setImages(ImmutableList.copyOf(images))
        else:
            self._logger.warn("Omeka item %d has no valid images", omeka_item.id)

        object_ = object_builder.build()

        object_id = ObjectId.parse(str(collection_id) + '/' + urllib.quote(feature_value, ''))

        return ObjectEntry(object_id, object_)
