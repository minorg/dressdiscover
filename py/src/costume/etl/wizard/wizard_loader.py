from collections import OrderedDict
import json
import os.path
import urllib

from costume.api.models.description.description import Description
from costume.api.models.description.description_set import DescriptionSet
from costume.api.models.description.description_type import DescriptionType
from costume.api.models.image.image import Image
from costume.api.models.image.image_version import ImageVersion
from costume.api.models.institution.institution import Institution
from costume.api.models.object.object import Object
from costume.api.models.rights.rights import Rights
from costume.api.models.rights.rights_set import RightsSet
from costume.api.models.rights.rights_type import RightsType
from costume.api.models.structure.structure import Structure
from costume.api.models.structure.structure_set import StructureSet
from costume.api.models.structure.structure_type import StructureType
from costume.api.models.title.title import Title
from costume.api.models.title.title_set import TitleSet
from costume.api.models.title.title_type import TitleType
from costume.api.models.view_type.view_type import ViewType
from costume.api.models.vocab import Vocab
from costume.api.models.vocab_ref import VocabRef
from costume.etl._loader import _Loader
from costume.etl.costume_core_controlled_vocabularies import COSTUME_CORE_CONTROLLED_VOCABULARIES
from yomeka.client.omeka_json_parser import OmekaJsonParser


class WizardLoader(_Loader):
    INSTITUTION_ID = 'wizard'
    COLLECTION_ID = INSTITUTION_ID + '/wizard'
    SQUARE_THUMBNAIL_HEIGHT_PX = 200
    SQUARE_THUMBNAIL_WIDTH_PX = 200

    def __init__(self, **kwds):
        _Loader.__init__(self, institution_id=WizardLoader.INSTITUTION_ID, **kwds)

    def _load(self):
        self._services.institution_command_service.put_institution(
            self._institution_id,
            Institution.Builder()
                .set_hidden(True)
                .set_model_metadata(self._new_model_metadata())
                .set_title("Wizard views")
                .build()
        )

        self._put_collection(
            collection_id=self.__collection_id,
            hidden=True,
            title='Wizard views'
        )

        objects_by_id = OrderedDict()

        vocab_ref = VocabRef(vocab=Vocab.COSTUME_CORE)

        with open(os.path.join(self._data_dir_path, 'extracted', 'wizard', 'items.json')) as f:
            items = OmekaJsonParser().parse_item_dicts(json.load(f))

        for item in items:
            feature_name = feature_value = image_credit_line = image_license = None
            for element_text in item.element_texts:
                if element_text.element_set.name == 'Dublin Core':
                    if element_text.element.name == 'Title':
                        title = element_text.text
                        title_split = title.split('>', 2)
                        if len(title_split) != 2:
                            self._logger.warn("Omeka item %d has an invalid title: %s", item.id, title)
                            break
                        feature_name = title_split[0].strip()
                        feature_value = title_split[1].strip()
                        if len(feature_name) == 0 or len(feature_value) == 0:
                            feature_name = feature_value = None
                            self._logger.warn("Omeka item %d has an ill-formed title: %s", item.id, title)
                            break
                elif element_text.element_set.name == 'Item Type Metadata':
                    if element_text.element.name == 'Image credit line':
                        image_credit_line = element_text.text
                    elif element_text.element.name == 'Image license':
                        image_license = element_text.text

            if feature_name is None or feature_value is None:
                self._logger.warn("Omeka item %d has an invalid title", item.id)
                continue
            available_feature_values = COSTUME_CORE_CONTROLLED_VOCABULARIES.get(feature_name)
            if available_feature_values is None:
                self._logger.warn("Omeka item %d has an invalid feature name '%s'", item.id, feature_name)
                continue
            if not feature_value in available_feature_values:
                self._logger.warn("Omeka item %d has an invalid feature value '%s' for feature name '%s'", item.id, feature_value, feature_name)
                continue

            if image_credit_line is None or len(image_credit_line) == 0:
                self._logger.warn("Omeka item %d missing an image credit element", item.id)
                continue

            if image_license is None or len(image_license) == 0:
                self._logger.warn("Omeka item %d missing an image license element", item.id)
                continue

            license_vocab_ref = None
            if image_license.lower() == 'public domain':
                rights_type = RightsType.PUBLIC_DOMAIN
            elif image_license == 'CC0':
                rights_type = RightsType.LICENSED
                license_vocab_ref = \
                    VocabRef.Builder()\
                        .set_vocab(Vocab.CREATIVE_COMMONS)\
                        .set_uri('https://creativecommons.org/publicdomain/zero/1.0/')\
                        .build()
            elif image_license.startswith('CC BY-SA '):
                rights_type = RightsType.LICENSED
                version = image_license[len('CC BY-SA '):]
                float(version)
                license_vocab_ref = \
                    VocabRef.Builder()\
                        .set_vocab(Vocab.CREATIVE_COMMONS)\
                        .set_uri("https://creativecommons.org/licenses/by-sa/%s/" % version)\
                        .build()
            else:
                raise NotImplementedError(image_license)

            object_builder = Object.Builder()
            object_builder.collection_id = self.COLLECTION_ID
            object_builder.institution_id = self._institution_id
            object_builder.set_descriptions(
                DescriptionSet.Builder().set_elements((
                    Description.Builder()
                        .set_text(image_credit_line)
                        .set_type(DescriptionType.CREDIT)
                        .build(),
                ))
                .build()
            )
            object_builder.model_metadata = self._new_model_metadata()
            object_builder.set_rights(
                RightsSet.Builder().set_elements((
                    Rights.Builder()
                        .set_license_vocab_ref(license_vocab_ref)
                        .set_text(image_license)
                        .set_type(rights_type)
                        .build(),
                ))
                .build()
            )
            object_builder.set_structures(
                StructureSet.Builder().set_elements((
                    Structure.Builder()
                        .set_text(feature_value)
                        .set_type(
                            StructureType.Builder()
                                .set_text(feature_name)
                                .set_vocab_ref(vocab_ref)
                                .build()
                        )
                        .build(),
                    ))
                    .build()
            )
            object_builder.set_titles(
                TitleSet.Builder().set_elements((
                    Title.Builder()
                        .set_text("%(feature_value)s" % locals())
                        .set_type(TitleType.DESCRIPTIVE)
                        .build(),
                ))
                .build()
            )
            object_builder.set_view_type(ViewType.DETAIL)

            files = self.__client.get_all_files(item=item.id)
            if len(files) == 0:
                self._logger.warn("Omeka item %d has no files", item.id)
                continue

            images = []
            for file_ in files:
                if not file_.mime_type.startswith('image/'):
                    continue
                image_builder = Image.Builder()
                file_urls = file_.file_urls
                image_builder.set_original(ImageVersion.Builder().set_url(file_urls.original).build())
                if file_urls.square_thumbnail is None:
                    self._logger.warn("Omeka item %d has a file %d missing a square thumbnail", item.id, file_.id)
                    continue
                image_builder.set_square_thumbnail(
                    ImageVersion.Builder()
                        .set_height_px(self.SQUARE_THUMBNAIL_HEIGHT_PX)
                        .set_url(file_urls.square_thumbnail)
                        .set_width_px(self.SQUARE_THUMBNAIL_WIDTH_PX)
                        .build()
                )
                images.append(image_builder.build())
            if len(images) ==  0:
                self._logger.warn("Omeka item %d has no valid images", item.id)
                continue
            object_builder.set_images(tuple(images))

            object_ = object_builder.build()

            object_id = self.COLLECTION_ID + '/' + urllib.quote(feature_name + '=' + feature_value, '')

            objects_by_id[object_id] = object_

        self._put_objects_by_id(objects_by_id)
