from collections import OrderedDict
import os.path
from pprint import pformat
import urllib
from xml.etree import ElementTree

from costume.api.models.agent.agent import Agent
from costume.api.models.agent.agent_name import AgentName
from costume.api.models.agent.agent_name_type import AgentNameType
from costume.api.models.agent.agent_role import AgentRole
from costume.api.models.agent.agent_set import AgentSet
from costume.api.models.date.date import Date
from costume.api.models.date.date_bound import DateBound
from costume.api.models.date.date_set import DateSet
from costume.api.models.date.date_type import DateType
from costume.api.models.description.description import Description
from costume.api.models.description.description_set import DescriptionSet
from costume.api.models.description.description_type import DescriptionType
from costume.api.models.image.image import Image
from costume.api.models.image.image_version import ImageVersion
from costume.api.models.institution.institution import Institution
from costume.api.models.location.location import Location
from costume.api.models.location.location_name import LocationName
from costume.api.models.location.location_name_type import LocationNameType
from costume.api.models.location.location_set import LocationSet
from costume.api.models.location.location_type import LocationType
from costume.api.models.object.object import Object
from costume.api.models.rights.rights import Rights
from costume.api.models.rights.rights_set import RightsSet
from costume.api.models.rights.rights_type import RightsType
from costume.api.models.subject.subject import Subject
from costume.api.models.subject.subject_set import SubjectSet
from costume.api.models.subject.subject_term import SubjectTerm
from costume.api.models.subject.subject_term_type import SubjectTermType
from costume.api.models.textref.textref import Textref
from costume.api.models.textref.textref_name import TextrefName
from costume.api.models.textref.textref_name_type import TextrefNameType
from costume.api.models.textref.textref_refid import TextrefRefid
from costume.api.models.textref.textref_refid_type import TextrefRefidType
from costume.api.models.textref.textref_set import TextrefSet
from costume.api.models.title.title import Title
from costume.api.models.title.title_set import TitleSet
from costume.api.models.title.title_type import TitleType
from costume.api.models.vocab import Vocab
from costume.api.models.vocab_ref import VocabRef
from costume.api.models.work_type.work_type import WorkType
from costume.api.models.work_type.work_type_set import WorkTypeSet
from costume.etl._loader import _Loader
from costume.etl.dcmi_types import DCMI_TYPES_BASE_URL
from bokeh._glyph_functions import text


class TxfcLoader(_Loader):
    _RIGHTS_HOLDER = "University of North Texas"
    _UNTL_NS = '{http://digital2.library.unt.edu/untl/}'

    class _ObjectBuilder(object):
        def __init__(self, record_identifier, **kwds):
            self.__object_builder = Object.Builder(**kwds)
            self.__record_identifier = record_identifier
            self.agents = []
            self.dates = []
            self.descriptions = []
            self.end_date_bound = None
            self.images = []
            self.locations = []
            self.rights = []
            self.start_date_bound = None
            self.subjects = []
            self.textrefs = []
            self.titles = []
            self.work_types = []

        def build(self):
            if self.start_date_bound is not None and self.end_date_bound is not None:
                self.dates.append(
                    Date.Builder()
                        .set_earliest_date(self.start_date_bound)
                        .set_latest_date(self.end_date_bound)
                        .set_type(DateType.CREATION)
                        .build()
                )

            if len(self.agents) > 0:
                self.__object_builder.set_agents(AgentSet.Builder().set_elements(tuple(self.agents)).build())
            if len(self.dates) > 0:
                self.__object_builder.set_dates(DateSet.Builder().set_elements(tuple(self.dates)).build())
            if len(self.descriptions) > 0:
                self.__object_builder.set_descriptions(DescriptionSet.Builder().set_elements(tuple(self.descriptions)).build())
            if len(self.images) > 0:
                self.__object_builder.set_images(tuple(self.images))
            if len(self.locations) > 0:
                self.__object_builder.set_locations(LocationSet.Builder().set_elements(tuple(self.locations)).build())
            if len(self.rights) > 0:
                self.__object_builder.set_rights(RightsSet.Builder().set_elements(tuple(self.rights)).build())
            if len(self.subjects) > 0:
                self.__object_builder.set_subjects(SubjectSet.Builder().set_elements(tuple(self.subjects)).build())
            if len(self.textrefs) > 0:
                self.__object_builder.set_textrefs(TextrefSet.Builder().set_elements(tuple(self.textrefs)).build())
            if len(self.titles) > 0:
                self.__object_builder.set_titles(TitleSet.Builder().set_elements(tuple(self.titles)).build())
            if len(self.work_types) > 0:
                self.__object_builder.set_work_types(WorkTypeSet.Builder().set_elements(tuple(self.work_types)).build())
            return self.__object_builder.build()

        @property
        def record_identifier(self):
            return self.__record_identifier

    def __init__(self, **kwds):
        _Loader.__init__(self, institution_id='untvca', **kwds)
        self.__collection_id = self._institution_id + '/txfc'

        agent_qualifiers = {}
        agent_qualifiers_etree = ElementTree.parse(os.path.join(self._data_dir_path, 'extracted', 'txfc', 'agent-qualifiers.xml'))
        RDF_NS = '{http://www.w3.org/1999/02/22-rdf-syntax-ns#}'
        RDFS_NS = '{http://www.w3.org/2000/01/rdf-schema#}'
        for property_etree in agent_qualifiers_etree.iter():
            if property_etree.tag != RDF_NS + 'Property':
                continue
            agent_qualifier_code = property_etree.attrib[RDF_NS + 'about'].rsplit('#', 2)[-1]
            for label_etree in property_etree.iter(RDFS_NS + 'label'):
                agent_qualifier_label = label_etree.text
                assert len(agent_qualifier_label) > 0
                break
            agent_qualifiers[agent_qualifier_code] = agent_qualifier_label
        self.__agent_qualifiers = agent_qualifiers

        self.__location_names_by_extent = {}

    def _load(self, dry_run):
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
                                    .set_rights_holder(self._RIGHTS_HOLDER)
                                    .set_text("The contents of Texas Fashion Collection, hosted by the University of North Texas Libraries (digital content including images, text, and sound and video recordings) are made publicly available by the collection-holding partners for use in research, teaching, and private study. For the full terms of use, see http://digital.library.unt.edu/terms-of-use/")
                                    .set_type(RightsType.COPYRIGHTED)
                                    .build()
    
                            ,))
                            .build()
                    )
                    .set_model_metadata(self._new_model_metadata())
                    .set_title("University of North Texas")
                    .set_url('http://digital.library.unt.edu/explore/collections/TXFC/')
                    .build()
            )

        if dry_run:
            self._logger.info("dry run, not putting collection %s", self.__collection_id)
        else:
            self._put_collection(
                collection_id=self.__collection_id,
                title="Texas Fashion Collection"
            )

        objects_by_id = OrderedDict()
        for root_dir_path, _, file_names in os.walk(os.path.join(self._data_dir_path, 'extracted', 'txfc', 'record')):
            for file_name in file_names:
                file_path = os.path.join(root_dir_path, file_name)
                if not file_path.endswith('.xml'):
                    os.rename(file_path, file_path + '.xml')
                    file_path = file_path + '.xml'
                record_etree = ElementTree.parse(file_path)
                object_id, object_ = self.__parse_record(record_etree)
                objects_by_id[object_id] = object_

        self._logger.info("Location names by extent:\n%s", pformat(self.__location_names_by_extent))

        if dry_run:
            self._logger.info("dry run, not putting %d objects to collection %s", len(objects_by_id), self.__collection_id)
        else:
            self._logger.info("putting %d objects to collection %s", len(objects_by_id), self.__collection_id)
            self._put_objects_by_id(objects_by_id)

    def __parse_date(self, text, circa=None):
        date_bound_builder = DateBound.Builder().set_text(text)
        
        if text[-1] == 'u':
            date_bound_builder.set_circa(True)
            text = text[:-1] + '0'
        elif text[-1] == '~':
            date_bound_builder.set_circa(True)
            text = text[:-1]
        elif circa is not None:
            date_bound_builder.set_circa(circa)
        
        self._parse_certain_date(
            date_bound_builder=date_bound_builder,
            text=text
        )
        
        return date_bound_builder.build()
    
    def __parse_date_range(self, text):
        original_text = text
        
        text = text.lstrip('[').rstrip(']')

        if text[-1] == '~':
            text = text[:-1]
            circa = True
        else:
            circa = False
        
        date_range = None
        for separator in ('/', '..'):
            text_split = text.split(separator)
            if len(text_split) != 2:
                continue
            try:
                int(text_split[0])
                int(text_split[1])
                years = True
            except ValueError:
                years = False
            if years:
                date_range = \
                    self.__parse_date(text_split[0], circa=circa),\
                    self.__parse_date(text_split[1], circa=circa)
                break
        
        if date_range is None:
            earliest_date = latest_date = self.__parse_date(text, circa=circa)
            date_range = earliest_date, latest_date
        
        if date_range[0].parsed_date_time is None or date_range[1].parsed_date_time is None:
            self._logger.warn("unable to parse date range '%s'", original_text)
        else:
            self._logger.debug("parsed date range '%s' from '%s'", date_range, original_text)
        return date_range

    def __parse_record(self, record_etree):
        # info:ark/67531/metadc114731
        record_identifier = record_etree.find('header').find('identifier').text
        assert record_identifier.startswith('info:ark/')
        object_id = self.__collection_id + '/' + urllib.quote(record_identifier, '')

        metadata_etree = record_etree.find('metadata').find(self._UNTL_NS + 'metadata')

        object_builder = \
            self._ObjectBuilder(
                collection_id=self.__collection_id,
                institution_id=self._institution_id,
                model_metadata=self._new_model_metadata(),
                record_identifier=record_identifier
            )

        for etree in metadata_etree:
            assert etree.tag.startswith(self._UNTL_NS)
            tag = etree.tag[len(self._UNTL_NS):]
            method_name = '_parse_record_metadata_' + tag + '_element'
            try:
                method = getattr(self, method_name)
            except AttributeError:
                self._logger.warn("no such method '%s' for record %s with text '%s'", method_name, record_identifier, etree.text)
                continue
            method(
                element=etree,
                object_builder=object_builder
            )

        return object_id, object_builder.build()

    def __parse_record_metadata_agent_element(self, element, object_builder):
        agent_builder = Agent.Builder()

        qualifier = element.attrib.get('qualifier', None)
        if qualifier is None:
            self._logger.warn("ignoring agent element without qualifier on record %s", object_builder.record_identifier)
            return

        role = AgentRole.Builder().set_text(self.__agent_qualifiers[qualifier]).build()
        agent_builder.set_role(role)

        info = element.find(self._UNTL_NS + 'info')
        if info is not None and len(info.text) > 0:
            agent_builder.attribution = info.text

        name = element.find(self._UNTL_NS + 'name')
        if name is not None and len(name.text) > 0:
            name_text = name.text
        else:
            self._logger.warn("ignoring agent element with empty name text on record %s", object_builder.record_identifier)
            return

        type_ = element.find(self._UNTL_NS + 'type')
        if type_ is not None and len(type_.text) > 0:
            if type_.text == 'org':
                name_type = AgentNameType.CORPORATE
            elif type_.text == 'per':
                name_type = AgentNameType.PERSONAL
            elif type_.text == 'event':
                name_type = AgentNameType.OTHER
            else:
                raise NotImplementedError(type_.text)
        else:
            name_type = AgentNameType.OTHER

        agent_builder.name = AgentName.Builder().set_text(name_text).set_type(name_type).build()

        object_builder.agents.append(agent_builder.build())

    def _parse_record_metadata_collection_element(self, element, object_builder):
        assert element.text == 'TXFC', element.text

    def _parse_record_metadata_institution_element(self, element, object_builder):
        assert element.text == 'UNTCVA', element.text

    def _parse_record_metadata_language_element(self, element, object_builder):
        pass # Ignore

    def _parse_record_metadata_contributor_element(self, **kwds):
        self.__parse_record_metadata_agent_element(**kwds)

    def _parse_record_metadata_coverage_element(self, element, object_builder):
        text = element.text.strip()
        if len(text) == 0:
            return

        qualifier = element.attrib.get('qualifier', None)
        if qualifier is None:
            self._logger.warn("coverage element without qualifier on record %s", object_builder.record_identifier)
            return

        if qualifier == 'date':
            pass # Same as date element
        elif qualifier == 'eDate':
            if object_builder.end_date_bound is not None:
                self._logger.warn("record %s has multiple eDate's", object_builder.record_identifier)
            earliest_date, latest_date = self.__parse_date_range(text)
            if earliest_date != latest_date:
                self._logger.warn("record %s has a eDate range: %s", object_builder.record_identifier, text)
            object_builder.end_date_bound = latest_date
        elif qualifier == 'placeName':
            text_parts = [text_part.strip() for text_part in text.split(' - ')]
            self._logger.debug('place name from record %s: %s', object_builder.record_identifier, text)

            location_names_by_extent = {}
            location_names_by_extent['nation'] = nation = text_parts.pop(0)

            if len(text_parts) > 0:
                text_part = text_parts.pop(0)
                if nation == 'United States':
                    extent = 'state'
                else:
                    extent = 'region (geographic)'
                location_names_by_extent[extent] = text_part

            if len(text_parts) >= 2:
                text_part = text_parts.pop(0)
                if nation == 'United States':
                    extent = 'county'
                else:
                    extent = 'province'
                location_names_by_extent[extent] = text_part

            if len(text_parts) == 2:
                # 'Millburn Township', "Short Hills'
                # 'New York City', 'Brooklyn Borough'
                text_part = text_parts.pop(0)
                assert nation == 'United States', text_parts
                location_names_by_extent['township'] = text_part

            if len(text_parts) > 0:
                location_names_by_extent['inhabited place'] = text_parts.pop(0)

            assert len(text_parts) == 0, text

            for extent, text in location_names_by_extent.iteritems():
                location_names_temp = self.__location_names_by_extent.setdefault(extent, [])
                if not text in location_names_temp:
                    location_names_temp.append(text)

            object_builder.locations.append(
                Location.Builder()
                    .set_names(tuple(
                        LocationName.Builder()
                            .set_extent(extent)
                            .set_text(text)
                            .set_type(LocationNameType.GEOGRAPHIC)
                            .build()
                        for extent, text in location_names_by_extent.iteritems()
                    ))
                    .set_type(LocationType.OTHER)
                    .build()
            )
        elif qualifier == 'sDate':
            if object_builder.start_date_bound is not None:
                self._logger.warn("record %s has multiple sDate's", object_builder.record_identifier)
            earliest_date, latest_date = self.__parse_date_range(text)
            if earliest_date != latest_date:
                self._logger.warn("record %s has a sDate range: %s", object_builder.record_identifier, text)
            object_builder.start_date_bound = earliest_date
        else:
            self._logger.warn("unknown coverage qualifier '%s' on record %s", qualifier, object_builder.record_identifier)

    def _parse_record_metadata_creator_element(self, **kwds):
        self.__parse_record_metadata_agent_element(**kwds)

    def _parse_record_metadata_date_element(self, element, object_builder):
        text = element.text.strip()
        if len(text) == 0:
            return

        date_type = DateType.CREATION
        qualifier = element.attrib.get('qualifier', None)
        if qualifier is not None:
            if qualifier == 'accepted':
                date_type = DateType.ACCESSION
            elif qualifier == 'creation':
                date_type = DateType.CREATION
            else:
                self._logger.warn("unknown date qualifier '%s' on record %s", qualifier, object_builder.record_identifier)

        earliest_date, latest_date = self.__parse_date_range(text)
        object_builder.dates.append(
            Date.Builder()
                .set_earliest_date(earliest_date)
                .set_latest_date(latest_date)
                .set_type(date_type)
                .build()
        )

    def _parse_record_metadata_description_element(self, element, object_builder):
        text = element.text.strip()
        if len(text) == 0:
            return

        description_type = None
        qualifier = element.attrib.get('qualifier', None)
        if qualifier is not None:
            if qualifier == 'content':
                description_type = None
            elif qualifier == 'physical':
                description_type = DescriptionType.PHYSICAL
            else:
                self._logger.warn("unknown description qualifier '%s'", qualifier)

        object_builder.descriptions.append(
            Description.Builder()
                .set_text(text)
                .set_type(description_type)
                .build()
        )

    def _parse_record_metadata_format_element(self, element, object_builder):
        # WorkType will be picked up by resourceType
        assert element.text in ('image', 'video'), element.text

    def _parse_record_metadata_identifier_element(self, element, object_builder):
        text = element.text.strip()
        if len(text) == 0:
            return

        qualifier = element.attrib.get('qualifier', None)
        if qualifier in ('ARK', 'LOCAL-CONT-NO', 'OTHER'):
            pass
        elif qualifier == 'itemURL':
            object_builder.textrefs.append(
                Textref.Builder()
                    .set_name(
                        TextrefName.Builder()
                            .set_text("Item URL")
                            .set_type(TextrefNameType.ELECTRONIC)
                            .build()
                    )
                    .set_refid(
                        TextrefRefid.Builder()
                            .set_href(text)
                            .set_text(text)
                            .set_type(TextrefRefidType.URI)
                            .build()
                    )
                    .build()
            )
        elif qualifier == 'thumbnailURL':
            object_builder.images.append(
                Image.Builder()
                    .set_full_size(
                        ImageVersion.Builder()
                            .set_url("http://digital.library.unt.edu/ark:" + object_builder.record_identifier[len('info:ark'):] + '/m1/1/med_res/')
                            .set_width_px(75)
                            .build()
                    )
                    .set_original(
                        ImageVersion.Builder()
                            .set_url("http://digital.library.unt.edu/ark:" + object_builder.record_identifier[len('info:ark'):] + '/m1/1/high_res/')
                            .set_width_px(75)
                            .build()
                    )
                    .set_square_thumbnail(
                        ImageVersion.Builder()
                            .set_height_px(75)
                            .set_url("http://digital.library.unt.edu/ark:" + object_builder.record_identifier[len('info:ark'):] + '/m1/1/square/')
                            .set_width_px(75)
                            .build()
                    )
                    .set_thumbnail(
                        ImageVersion.Builder()
                            .set_url(text)
                            .build()
                    )
                    .build()
            )
        elif qualifier is not None:
            self._logger.warn("ignoring unknown identifier qualifier '%s' on record %s", qualifier, object_builder.record_identifier)

    def _parse_record_metadata_meta_element(self, element, object_builder):
        text = element.text.strip()
        if len(text) == 0:
            return

        qualifier = element.attrib.get('qualifier', None)
        if qualifier is None:
            self._logger.warn("meta element without qualifier on record %s", object_builder.record_identifier)
            return

        if qualifier in (
            'ark',
            'hidden',
            'meta-id',
            'metadataCreationDate',
            'metadataCreator',
            'metadataModifier',
            'metadataModificationDate',
            'system',
        ):
            pass
        else:
            self._logger.warn("ignoring unknown meta qualifier '%s' on record %s", qualifier, object_builder.record_identifier)

    def _parse_record_metadata_note_element(self, element, object_builder):
        text = element.text.strip()
        if len(text) == 0:
            return

        qualifier = element.attrib.get('qualifier', None)
        if qualifier == 'digitalPreservation':
            object_builder.descriptions.append(
                Description.Builder()
                    .set_text(text)
                    .set_type(DescriptionType.HISTORY)
                    .build()
            )
        elif qualifier == 'display':
            object_builder.descriptions.append(
                Description.Builder()
                    .set_text(text)
                    .set_type(DescriptionType.PUBLIC)
                    .build()
            )
        elif qualifier == 'nonDisplay':
            pass
        else:
            object_builder.descriptions.append(
                Description.Builder()
                    .set_text(text)
                    .set_type(DescriptionType.HISTORY)
                    .build()
            )
#             self._logger.warn("ignoring unknown note qualifier '%s' on record %s", qualifier, object_builder.record_identifier)

    def _parse_record_metadata_primarySource_element(self, **kwds):
        pass # Ignore

    def _parse_record_metadata_publisher_element(self, **kwds):
        pass # Ignore

    def _parse_record_metadata_resourceType_element(self, element, object_builder):
        text = element.text.strip()
        if len(text) == 0:
            return

        if text == 'physical-object':
            text = 'PhysicalObject'
        elif text == 'video':
            text = 'MovingImage'
        else:
            raise NotImplementedError(text)

        object_builder.work_types.append(
            WorkType.Builder()\
                .set_text(text)\
                .set_vocab_ref(
                    VocabRef.Builder()
                        .set_refid(text)\
                        .set_vocab(Vocab.DCMI_TYPE)\
                        .set_uri(DCMI_TYPES_BASE_URL + text)\
                        .build()
                )\
                .build()
        )

    def _parse_record_metadata_rights_element(self, element, object_builder):
        text = element.text.strip()
        if len(text) == 0:
            return

        qualifier = element.attrib.get('qualifier', None)
        if qualifier is None:
            self._logger.warn("rights element without qualifier on record %s", object_builder.record_identifier)
            return

        if qualifier == 'access':
            assert text == 'public', text
        elif qualifier == 'license':
            if text == 'by-nc-nd':
                license_vocab_ref = \
                    VocabRef.Builder()\
                        .set_vocab(Vocab.CREATIVE_COMMONS)\
                        .set_uri('https://creativecommons.org/licenses/by-nc-nd/2.0/')\
                        .build()
            else:
                license_vocab_ref = None
                self._logger.warn("ignoring unknown license text '%s' on record %s", text, object_builder.record_identifier)

            object_builder.rights.append(
                Rights.Builder()
                    .set_license_vocab_ref(license_vocab_ref)
                    .set_rights_holder(self._RIGHTS_HOLDER)
                    .set_text(text)
                    .set_type(RightsType.LICENSED)
                    .build()
            )
        elif qualifier == 'statement':
            object_builder.rights.append(
                Rights.Builder()
                    .set_rights_holder(self._RIGHTS_HOLDER)
                    .set_text(text)
                    .set_type(RightsType.COPYRIGHTED)
                    .build()
            )
        else:
            self._logger.warn("ignoring unknown rights qualifier '%s' on record %s", qualifier, object_builder.record_identifier)

    def _parse_record_metadata_subject_element(self, element, object_builder):
        text = element.text.strip()
        if len(text) == 0:
            return

        subject_term_builder = \
            SubjectTerm.Builder()\
                .set_text(text)\
                .set_type(SubjectTermType.OTHER_TOPIC)\

        qualifier = element.get('qualifier', None)
        if qualifier is not None:
            try:
                vocab = getattr(Vocab, qualifier)
                subject_term_builder.set_vocab_ref(VocabRef.Builder().set_vocab(vocab).build())
            except AttributeError:
                if qualifier not in ('named_person', 'UNTL-BS',):
                    self._logger.warn("unknown subject vocabulary '%s'", qualifier)

        object_builder.subjects.append(
            Subject.Builder()
                .set_terms((subject_term_builder.build(),))
                .build()
        )

    def _parse_record_metadata_title_element(self, element, object_builder):
        text = element.text.strip()
        if len(text) == 0:
            return

        title_type = TitleType.DESCRIPTIVE
        qualifier = element.attrib.get('qualifier', None)
        if qualifier is not None:
            if qualifier in ('addedtitle', 'alternatetitle', 'officialtitle', 'sorttitle'):
                title_type = TitleType.DESCRIPTIVE
            elif qualifier == 'other':
                title_type = TitleType.OTHER
            elif qualifier == 'paralleltitle':
                title_type = TitleType.TRANSLATED
            elif qualifier == 'seriestitle':
                title_type = TitleType.REPOSITORY
            else:
                self._logger.warn("unknown title qualifier '%s' on record %s", qualifier, object_builder.record_identifier)

        object_builder.titles.append(
            Title.Builder()
                .set_text(element.text)
                .set_type(title_type)
                .build()
        )
