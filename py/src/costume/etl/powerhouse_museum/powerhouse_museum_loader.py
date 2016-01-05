from datetime import datetime
import json
import os.path

from costume.api.models.collection.collection import Collection
from costume.api.models.image.image import Image
from costume.api.models.institution.institution import Institution
from costume.api.models.object.object import Object
from costume.api.models.rights.rights import Rights
from costume.api.models.rights.rights_set import RightsSet
from costume.api.models.rights.rights_type import RightsType
from costume.etl._loader import _Loader


class PowerhouseMuseumLoader(_Loader):
    INSTITUTION_ID = 'powerhouse_museum'
    COLLECTION_ID = INSTITUTION_ID + '/10'

    def __init__(self, **kwds):
        _Loader.__init__(self, institution_id=self.INSTITUTION_ID, **kwds)

    def _load(self):
        self._services.institution_command_service.put_institution(
            self._institution_id,
            Institution.Builder()
                .set_data_rights(
                    RightsSet.Builder()
                        .set_rights((
                            Rights.Builder()
                                .set_rights_holder("Powerhouse Museum")
                                .set_text("Copyright %s Powerhouse Museum, licensed Creative Commons Attribution Non-Commercial" % datetime.now().year)
                                .set_type(RightsType.COPYRIGHTED)
                                .build()

                        ,))
                        .build()
                )
                .set_model_metadata(self._new_model_metadata())
                .set_title("Powerhouse Museum")
                .set_url('http://powerhousemuseum.com')
                .build()
        )

        self._services.collection_command_service.put_collection(
            self.COLLECTION_ID,
            Collection.Builder()
                .set_institution_id(self._institution_id)
                .set_model_metadata(self._new_model_metadata())
                .set_title("Clothing and Dress")
                .build()
        )


        object_count = 0
        for root_dir_path, _, file_names in os.walk(os.path.join(self._data_dir_path, 'extracted', 'powerhouse_museum', 'item')):
            for file_name in file_names:
                if not file_name.endswith('.json'):
                    continue
                with open(os.path.join(root_dir_path, file_name), 'rb') as f:
                    item_dict = json.loads(f.read())['item']
                object_id, object_ = self.__parse_item(item_dict)
                self._services.object_command_service.put_object(object_id, object_)
                self._logger.info("put object %s (#%d)", object_id, object_count)
                object_count = object_count + 1

    def __parse_item(self, item_dict):
        object_id = self.COLLECTION_ID + '/' + str(item_dict['id'])

        object_builder = Object.Builder()

        object_builder.collection_id = self.COLLECTION_ID
        object_builder.description = self._get_nonempty_value(item_dict, 'description')
        object_builder.history_notes = self._get_nonempty_value(item_dict, 'history_notes')
        object_builder.institution_id = self._institution_id
        object_builder.model_metadata = self._new_model_metadata()
        object_builder.provenance = self._get_nonempty_value(item_dict, 'acquisition_credit_line')
        object_builder.summary = self._get_nonempty_value(item_dict, 'summary')

        title = self._get_nonempty_value(item_dict, 'title')
        if title is None:
            title = self._get_nonempty_value(item_dict, 'summary')
            if title is None:
                title = ''
        object_builder.title = title

        terms_dicts = self._get_nonempty_value(item_dict, 'terms')
        if terms_dicts is not None:
            categories = []
            for terms_dict in terms_dicts:
                term = terms_dict['term']
                if len(term) == 0:
                    continue
                categories.append(term)
            if len(categories) > 0:
                object_builder.categories = tuple(categories)

        thumbnail_dict = item_dict.get('thumbnail')
        if len(thumbnail_dict) > 0:
            thumbnail_builder = Image.Builder()
            thumbnail_builder.url = thumbnail_dict['url']
            if 'height' in thumbnail_dict:
                thumbnail_builder.height_px = int(thumbnail_dict['height'])
            if 'width' in thumbnail_dict:
                thumbnail_builder.width_px = int(thumbnail_dict['width'])
            object_builder.thumbnail = thumbnail_builder.build()

        object_builder.url = self._get_nonempty_value(item_dict, 'permanent_url')

        return object_id, object_builder.build()
