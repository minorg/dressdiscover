from collections import OrderedDict
import csv
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
from costume.api.models.textref.textref import Textref
from costume.api.models.textref.textref_name import TextrefName
from costume.api.models.textref.textref_name_type import TextrefNameType
from costume.api.models.textref.textref_refid import TextrefRefid
from costume.api.models.textref.textref_refid_type import TextrefRefidType
from costume.api.models.textref.textref_set import TextrefSet
from costume.api.models.title.title import Title
from costume.api.models.title.title_set import TitleSet
from costume.api.models.title.title_type import TitleType
from costume.api.models.view_type.view_type import ViewType
from costume.api.models.vocab import Vocab
from costume.api.models.vocab_ref import VocabRef
from costume.etl._loader import _Loader
from costume.etl.costume_core_controlled_vocabularies import COSTUME_CORE_CONTROLLED_VOCABULARIES


class WizardLoader(_Loader):
    def __init__(self, **kwds):
        _Loader.__init__(self, institution_id='wizard', **kwds)
        self.__collection_id = self._institution_id + '/wizard'

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
        with open(os.path.join(self._data_dir_path, 'wizard', 'features.csv')) as csv_file:
            for csv_row in csv.DictReader(csv_file):
                feature_name = csv_row['Feature name']
                if len(feature_name) == 0:
                    continue
                assert feature_name in COSTUME_CORE_CONTROLLED_VOCABULARIES, feature_name
                feature_value = csv_row['Feature value']
                assert len(feature_value) > 0
                assert feature_value in COSTUME_CORE_CONTROLLED_VOCABULARIES[feature_name], feature_value
                credit_line = csv_row['Credit line']
                if len(credit_line) == 0:
                    self._logger.debug("feature %s = %s has no credit line, skipping", feature_name, feature_value)
                    continue
                credit_line = credit_line.decode('ascii', 'ignore')
                full_size_image_url = csv_row['Full-size image URL']
                if len(full_size_image_url) == 0:
                    full_size_image_url = None
                license_ = csv_row['License']
                if len(license_) == 0:
                    self._logger.warn("feature %s = %s has no license, skipping", feature_name, feature_value)
                    continue
                license_vocab_ref = None
                if license_.lower() == 'public domain':
                    rights_type = RightsType.PUBLIC_DOMAIN
                elif license_ == 'CC0':
                    rights_type = RightsType.LICENSED
                    license_vocab_ref = \
                        VocabRef.Builder()\
                            .set_vocab(Vocab.CREATIVE_COMMONS)\
                            .set_uri('https://creativecommons.org/publicdomain/zero/1.0/')\
                            .build()
                elif license_.startswith('CC BY-SA '):
                    rights_type = RightsType.LICENSED
                    version = license_[len('CC BY-SA '):]
                    float(version)
                    license_vocab_ref = \
                        VocabRef.Builder()\
                            .set_vocab(Vocab.CREATIVE_COMMONS)\
                            .set_uri("https://creativecommons.org/licenses/by-sa/%s/" % version)\
                            .build()
                else:
                    raise NotImplementedError(license_)
                metadata_url = csv_row['Metadata URL']
                if len(metadata_url) == 0:
                    self._logger.warn("feature %s = %s has no metadata URL, skipping", feature_name, feature_value)
                    continue
                thumbnail_url = csv_row['Thumbnail URL']
                if len(thumbnail_url) == 0:
                    self._logger.warn("feature %s = %s has no thumbnail URL, skipping", feature_name, feature_value)
                    continue

                object_builder = Object.Builder()
                object_builder.collection_id = self.__collection_id
                object_builder.institution_id = self._institution_id
                object_builder.set_descriptions(
                    DescriptionSet.Builder().set_elements((
                        Description.Builder()
                            .set_text(credit_line)
                            .set_type(DescriptionType.CREDIT)
                            .build(),
                    ))
                    .build()
                )
                images = []
                if full_size_image_url is not None:
                    images.append(
                        Image.Builder()
                            .set_original(
                                ImageVersion.Builder()
                                    .set_url(full_size_image_url)
                                    .build()
                            )
                            .build()
                    )
                images.append(
                    Image.Builder()
                        .set_thumbnail(
                            ImageVersion.Builder()
                                .set_url(thumbnail_url)
                                .build()
                        )
                        .build()
                )
                object_builder.set_images(tuple(images))
                object_builder.model_metadata = self._new_model_metadata()
                object_builder.set_rights(
                    RightsSet.Builder().set_elements((
                        Rights.Builder()
                            .set_license_vocab_ref(license_vocab_ref)
                            .set_text(license_)
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
                if metadata_url is not None:
                    object_builder.set_textrefs(
                        TextrefSet.Builder().set_elements((
                            Textref.Builder()
                                .set_name(
                                    TextrefName.Builder()
                                        .set_text("Metadata URL")
                                        .set_type(TextrefNameType.ELECTRONIC)
                                        .build()
                                )
                                .set_refid(
                                    TextrefRefid.Builder()
                                        .set_href(metadata_url)
                                        .set_text(metadata_url)
                                        .set_type(TextrefRefidType.URI)
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

                object_ = object_builder.build()

                object_id = self.__collection_id + '/' + urllib.quote(feature_name + '=' + feature_value, '')

                objects_by_id[object_id] = object_

        self._put_objects_by_id(objects_by_id)
