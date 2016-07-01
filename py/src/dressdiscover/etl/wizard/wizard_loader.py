from collections import OrderedDict
import json
import os.path
import urllib

from dressdiscover.api.models.image.image import Image
from dressdiscover.api.models.image.image_version import ImageVersion
from dressdiscover.api.models.institution.institution import Institution
from dressdiscover.api.models.object.object import Object
from dressdiscover.api.models.rights.rights import Rights
from dressdiscover.api.models.rights.rights_set import RightsSet
from dressdiscover.api.models.rights.rights_type import RightsType
from dressdiscover.api.models.structure.structure import Structure
from dressdiscover.api.models.structure.structure_set import StructureSet
from dressdiscover.api.models.structure.structure_type import StructureType
from dressdiscover.api.models.title.title import Title
from dressdiscover.api.models.title.title_set import TitleSet
from dressdiscover.api.models.title.title_type import TitleType
from dressdiscover.api.models.view_type.view_type import ViewType
from dressdiscover.api.models.vocab import Vocab
from dressdiscover.api.models.vocab_ref import VocabRef
from dressdiscover.etl._institution_loader import _InstitutionLoader
from dressdiscover.etl.costume_core.costume_core_controlled_vocabularies import COSTUME_CORE_CONTROLLED_VOCABULARIES
from yomeka.client.omeka_json_parser import OmekaJsonParser


class WizardLoader(_InstitutionLoader):
    INSTITUTION_ID = 'wizard'
    COLLECTION_ID = INSTITUTION_ID + '/wizard'
    SQUARE_THUMBNAIL_HEIGHT_PX = 200
    SQUARE_THUMBNAIL_WIDTH_PX = 200

    def __init__(self, **kwds):
        _InstitutionLoader.__init__(self, institution_id=WizardLoader.INSTITUTION_ID, **kwds)

    def _load(self, dry_run):
        if not dry_run:
            self._services.institution_command_service.put_institution(
                self._institution_id,
                Institution.Builder()
                    .set_hidden(True)
                    .set_model_metadata(self._new_model_metadata())
                    .set_title("Wizard views")
                    .build()
            )

            self._put_collection(
                collection_id=self.COLLECTION_ID,
                hidden=True,
                title='Wizard views'
            )

        objects_by_id = OrderedDict()

        vocab_ref = VocabRef(vocab=Vocab.COSTUME_CORE)

        features_dir_path = os.path.join(self._data_dir_path, 'extracted', 'wizard', 'collection')
        for feature_name in os.listdir(features_dir_path):
            feature_dir_path = os.path.join(features_dir_path, feature_name)
            if not os.path.isdir(feature_dir_path):
                continue

            with open(os.path.join(feature_dir_path, 'items.json')) as f:
                items = OmekaJsonParser().parse_item_dicts(json.load(f))

            for item in items:
                feature_value = None
                item_image_credit_line = item_image_license = None
                for element_text in item.element_texts:
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
                        self._logger.warn("Omeka item %d has unknown element set name '%s'", item.id, element_text.element_set.name)

                available_feature_values = COSTUME_CORE_CONTROLLED_VOCABULARIES.get(feature_name)
                if available_feature_values is None:
                    self._logger.warn("Omeka item %d has an invalid feature name '%s'", item.id, feature_name)
                    continue
                if not feature_value in available_feature_values:
                    self._logger.warn("Omeka item %d has an invalid feature value '%s' for feature name '%s'", item.id, feature_value, feature_name)

                object_builder = Object.Builder()
                object_builder.collection_id = self.COLLECTION_ID
                object_builder.hidden = True
                object_builder.institution_id = self._institution_id
                object_builder.model_metadata = self._new_model_metadata()
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

                files = []
                files_dir_path = os.path.join(self._data_dir_path, 'extracted', 'wizard', 'files_by_item_id', str(item.id))
                if os.path.isdir(files_dir_path):
                    for file_file_path in os.listdir(files_dir_path):
                        if not file_file_path.endswith('.json'):
                            continue
                        file_file_path = os.path.join(files_dir_path, file_file_path)
                        if not os.path.isfile(file_file_path):
                            continue
                        with open(file_file_path, 'rb') as f:
                            files.append(OmekaJsonParser().parse_file_dict(json.load(f)))

                if len(files) == 0:
                    self._logger.warn("Omeka item %d has no files", item.id)
                    continue

                images = []
                for file_ in files:
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
                        self._logger.warn("Omeka item %d has a file %d missing a Provenance", item.id, file_.id)
                        continue

                    if image_license is None or len(image_license) == 0:
                        self._logger.warn("Omeka item %d has a file %d missing a License", item.id, file_.id)
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
                        rights_type = RightsType.LICENSED

                    image_builder = Image.Builder()
                    file_urls = file_.file_urls
                    image_builder.set_original(ImageVersion.Builder().set_url(file_urls.original).build())
                    image_builder.set_rights(
                        RightsSet.Builder().set_elements((
                            Rights.Builder()
                                .set_license_vocab_ref(license_vocab_ref)
                                .set_rights_holder(image_credit_line)
                                .set_text(image_license)
                                .set_type(rights_type)
                                .build(),
                        ))
                        .build()
                    )
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

        if not dry_run:
            self._put_objects_by_id(objects_by_id)
