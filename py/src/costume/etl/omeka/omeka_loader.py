from collections import OrderedDict, Counter
from datetime import datetime
import json
import os.path

from costume.etl._institution_loader import _InstitutionLoader
from yomeka.client.omeka_json_parser import OmekaJsonParser


class OmekaLoader(_InstitutionLoader):
    def __init__(
        self,
        endpoint_url,
        institution_title,
        institution_url,
        square_thumbnail_height_px,
        square_thumbnail_width_px,
        **kwds
    ):
        _InstitutionLoader.__init__(self, **kwds)
        if not endpoint_url.endswith('/'):
            endpoint_url = endpoint_url + '/'
        self.__endpoint_url = endpoint_url
        self.__institution_title = institution_title
        self.__institution_url = institution_url
        self.__square_thumbnail_height_px = square_thumbnail_height_px
        self.__square_thumbnail_width_px = square_thumbnail_width_px
        self.__vocabulary_used = {}

    @classmethod
    def _add_arguments(cls, argument_parser):
        _InstitutionLoader._add_arguments(argument_parser)
        cls._add_institution_arguments(argument_parser)
        argument_parser.add_argument('--square-thumbnail-height-px', default=150)
        argument_parser.add_argument('--square-thumbnail-width-px', default=150)

    @classmethod
    def _add_institution_arguments(cls, argument_parser):
        argument_parser.add_argument('--endpoint-url', required=True)
        argument_parser.add_argument('--institution-id', required=True)
        argument_parser.add_argument('--institution-title', required=True)
        argument_parser.add_argument('--institution-url', required=True)

    def _load(self, dry_run):
        self.__vocabulary_used = {}

        self._load_institution(dry_run=dry_run)

        vocabulary_used_alphabetical = OrderedDict()
        for element_set_name in sorted(self.__vocabulary_used.keys()):
            vocabulary_used_element_set = vocabulary_used_alphabetical.setdefault(element_set_name, OrderedDict())
            for element_name in sorted(self.__vocabulary_used[element_set_name].keys()):
                vocabulary_used_element = vocabulary_used_element_set.setdefault(element_name, OrderedDict())
                for text in sorted(self.__vocabulary_used[element_set_name][element_name].keys()):
                    vocabulary_used_element[text] = self.__vocabulary_used[element_set_name][element_name][text]
        vocabulary_used_file_path = os.path.join(self._data_dir_path, 'extracted', self._institution_id, 'vocabulary_used.json')
        with open(vocabulary_used_file_path, 'w+b') as f:
            json.dump(vocabulary_used_alphabetical, f, indent=4)

    def _load_collection(self, dry_run, omeka_collection):
        self._logger.debug("reading collection %d", omeka_collection.id)

        collection_id = self._institution_id + '/' + str(omeka_collection.id)

        collection_builder = \
            Collection.Builder()\
                .set_institution_id(self._institution_id)\
                .set_model_metadata(self._new_model_metadata())

        for element_text in omeka_collection.element_texts:
            if len(element_text.text) == 0:
                continue

            if element_text.element_set.name == 'Dublin Core':
                if element_text.element.name == 'Contributor':
                    pass
                elif element_text.element.name == 'Description':
                    collection_builder.set_description(element_text.text)
                elif element_text.element.name == 'Title':
                    collection_builder.set_title(element_text.text)

        collection = collection_builder.build()

        if dry_run:
            self._logger.info("dry run, not putting collection %s", collection_id)
        else:
            self._services.collection_command_service.put_collection(collection_id, collection)

    def _load_collections(self, dry_run, omeka_collections, skip_private=True):
        for omeka_collection in omeka_collections:
            if skip_private and not omeka_collection.public:
                self._logger.info("collection %d is not public, skipping", omeka_collection.id)
                continue

            self._load_collection(
                dry_run=dry_run,
                omeka_collection=omeka_collection
            )

    def _load_institution(self, dry_run):
        if dry_run:
            self._logger.info("dry run, not putting institution %s", self._institution_id)
        else:
            self._services.institution_command_service.put_institution(
                self._institution_id,
                Institution.Builder()
                    .set_data_rights(
                        RightsSet.Builder()
                            .set_elements((
                                Rights.Builder()
                                    .set_rights_holder(self.__institution_title)
                                    .set_text("Copyright %s %s" % (datetime.now().year, self.__institution_title))
                                    .set_type(RightsType.COPYRIGHTED)
                                    .build()

                            ,))
                            .build()
                    )
                    .set_model_metadata(self._new_model_metadata())
                    .set_title(self.__institution_title)
                    .set_url(self.__institution_url)
                    .build()
            )

        self._load_collections(
            dry_run=dry_run,
            omeka_collections=self._read_omeka_collections()
        )

    def _read_omeka_collections(self):
        file_path = os.path.join(self._data_dir_path, 'extracted', self._institution_id, 'collections.json')
        self._logger.info("reading collections from %s", file_path)
        with open(file_path) as f:
            return OmekaJsonParser().parse_collection_dicts(json.loads(f.read()))

    def _read_omeka_items(self, omeka_collection):
        file_path = os.path.join(self._data_dir_path, 'extracted', self._institution_id, 'collection', str(omeka_collection.id), 'items.json')
        self._logger.info("reading items from %s", file_path)
        with open(file_path) as f:
            return OmekaJsonParser().parse_item_dicts(json.loads(f.read()))

    def _update_vocabulary_used(self, element_set_name, element_name, text):
        self.__vocabulary_used.setdefault(element_set_name, {}).setdefault(element_name, Counter())[text] += 1
