from datetime import datetime
import json
import os.path

from dressdiscover.api.models.collection.collection import Collection
from dressdiscover.api.models.inscription.inscription import Inscription
from dressdiscover.api.models.inscription.inscription_set import InscriptionSet
from dressdiscover.api.models.inscription.inscription_text import InscriptionText
from dressdiscover.api.models.inscription.inscription_text_type import InscriptionTextType
from dressdiscover.api.models.institution.institution import Institution
from dressdiscover.api.models.material.material import Material
from dressdiscover.api.models.material.material_set import MaterialSet
from dressdiscover.api.models.material.material_type import MaterialType
from dressdiscover.api.models.object.object import Object
from dressdiscover.api.models.rights.rights import Rights
from dressdiscover.api.models.rights.rights_set import RightsSet
from dressdiscover.api.models.rights.rights_type import RightsType
from dressdiscover.api.models.technique.technique import Technique
from dressdiscover.api.models.technique.technique_set import TechniqueSet
from dressdiscover.etl._institution_loader import _InstitutionLoader


class VamLoader(_InstitutionLoader):
    INSTITUTION_ID = 'vam'
    COLLECTION_ID = INSTITUTION_ID + '/' + 't&f'

    def __init__(self, **kwds):
        _InstitutionLoader.__init__(self, institution_id=self.INSTITUTION_ID, **kwds)

    def _load(self):
        self._services.institution_command_service.put_institution(
            self._institution_Id,
            Institution.Builder()
                .set_data_rights(
                    RightsSet.Builder()
                        .set_rights((
                            Rights.Builder()
                                .set_rights_holder("Victoria and Albert Museum")
                                .set_text("Copyright %s Victoria and Albert Museum" % datetime.now().year)
                                .set_type(RightsType.COPYRIGHTED)
                                .build()

                        ,))
                        .build()
                )
                .set_model_metadata(self._new_model_metadata())
                .set_title("Victoria and Albert Museum")
                .set_url('http://www.vam.ac.uk')
                .build()
        )


        self._services.collection_command_service.put_collection(
            self.COLLECTION_ID,
            Collection.Builder()
                .set_institution_id(self.__institution_id)
                .set_model_metadata(self._new_model_metadata())
                .set_title("Textiles and Fashion Collection")
                .build()
        )


        DATA_DIR_PATH = os.path.abspath(os.path.join(os.path.dirname(__file__), '..', '..', 'data'))
        MUSEUMOBJECTS_DIR_PATH = os.path.join(DATA_DIR_PATH, 'vam', 'museumobject')

        object_count = 0
        for root_dir_path, _, file_names in os.walk(MUSEUMOBJECTS_DIR_PATH):
            for file_name in file_names:
                if not file_name.endswith('.json'):
                    continue
                with open(os.path.join(root_dir_path, file_name), 'rb') as f:
                    museumobject_dict = json.loads(f.read())[0]
                object_id, object_ = self.__parse_museumobject(museumobject_dict['fields'])
                self._services.object_command_service.put_object(object_id, object_)
                self._logger.info("put object %s (#%d)", object_id, object_count)
                object_count = object_count + 1

    def __parse_museumobject(self, museumobject_dict):
        object_id = self.COLLECTION_ID + '/' + museumobject_dict['object_number']

        object_builder = Object.Builder()

        category_dicts = self._get_nonempty_value(museumobject_dict, 'categories')
        if category_dicts is not None:
            categories = []
            for category_dict in category_dicts:
                categories.append(category_dict['fields']['name'])
            object_builder.set_categories(tuple(categories))

        object_builder.collection_id = self.COLLECTION_ID

        object_builder.date_text = self._get_nonempty_value(museumobject_dict, 'date_text')

        object_builder.description = self._get_nonempty_value(museumobject_dict, 'descriptive_line')

        object_builder.institution_id = self._institution_id

        marks = self._get_nonempty_value(museumobject_dict, 'marks')
        if marks is not None:
            object_builder.set_inscriptions(
                InscriptionSet(
                    inscriptions=(
                        Inscription.Builder()
                            .set_texts((
                                InscriptionText.Builder()
                                    .set_text(marks)
                                    .set_type(InscriptionTextType.MARK)
                                    .build(),
                            ))
                            .build(),
                    )
                )
            )

        material_dicts = self._get_nonempty_value(museumobject_dict, 'materials')
        if material_dicts is not None:
            materials = []
            for material_dict in material_dicts:
                material_dict = material_dict['fields']
                if len(material_dict['name']) == 0:
                    continue
                materials.append(
                    Material.Builder()
                        .set_text(material_dict['name'])
                        .set_type(MaterialType.OTHER)
                        .build()
                )
            object_builder.materials = MaterialSet(materials=tuple(materials))

        object_builder.model_metadata = self._new_model_metadata()

        object_builder.physical_description = self._get_nonempty_value(museumobject_dict, 'physical_description')

        technique_dicts = museumobject_dict.get('techniques')
        if technique_dicts is not None and len(technique_dicts) > 0:
            techniques = []
            for technique_dict in technique_dicts:
                technique_dict = technique_dict['fields']
                if len(technique_dict['name']) == 0:
                    continue
                techniques.append(
                    Technique.Builder()
                        .set_text(technique_dict['name'])
                        .build()
                )
            object_builder.techniques = TechniqueSet(techniques=tuple(techniques))

        title = self._get_nonempty_value(museumobject_dict, 'title')
        if title is None:
            title = museumobject_dict.get('object')
            assert title is not None and len(title) > 0
        object_builder.title = title

        return object_id, object_builder.build()
