from collections import OrderedDict
import os.path
import urllib
from xml.etree import ElementTree

from costume.api.models.agent.agent import Agent
from costume.api.models.agent.agent_name import AgentName
from costume.api.models.agent.agent_name_type import AgentNameType
from costume.api.models.agent.agent_role import AgentRole
from costume.api.models.agent.agent_set import AgentSet
from costume.api.models.collection.collection import Collection
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
from costume.api.models.object.object import Object
from costume.api.models.object.object_entry import ObjectEntry
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
from costume.etl._loader import _Loader


class TxfcLoader(_Loader):
    _UNTL_NS = '{http://digital2.library.unt.edu/untl/}'

    class _ObjectBuilder(object):
        def __init__(self, record_identifier, **kwds):
            self.__object_builder = Object.Builder(**kwds)
            self.__record_identifier = record_identifier
            self.agents = []
            self.dates = []
            self.descriptions = []
            self.images = []
            self.subjects = []
            self.textrefs = []
            self.titles = []

        def build(self):
            if len(self.agents) > 0:
                self.__object_builder.set_agents(AgentSet.Builder().set_elements(tuple(self.agents)).build())
            if len(self.dates) > 0:
                self.__object_builder.set_dates(DateSet.Builder().set_elements(tuple(self.dates)).build())
            if len(self.descriptions) > 0:
                self.__object_builder.set_descriptions(DescriptionSet.Builder().set_elements(tuple(self.descriptions)).build())
            if len(self.images) > 0:
                self.__object_builder.set_images(tuple(self.images))
            if len(self.subjects) > 0:
                self.__object_builder.set_subjects(SubjectSet.Builder().set_elements(tuple(self.subjects)).build())
            if len(self.textrefs) > 0:
                self.__object_builder.set_textrefs(TextrefSet.Builder().set_elements(tuple(self.textrefs)).build())
            if len(self.titles) > 0:
                self.__object_builder.set_titles(TitleSet.Builder().set_elements(tuple(self.titles)).build())
            return self.__object_builder.build()

        @property
        def record_identifier(self):
            return self.__record_identifier

    def __init__(self, **kwds):
        _Loader.__init__(self, institution_id='untvca', **kwds)
        self.__collection_id = self._institution_id + '/txfc'

    def _load(self):
        self._services.institution_command_service.put_institution(
            self._institution_id,
            Institution.Builder()
                .set_data_rights(
                    RightsSet.Builder()
                        .set_elements((
                            Rights.Builder()
                                .set_rights_holder("University of North Texas")
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

        self._services.collection_command_service.put_collection(
            self.__collection_id,
            Collection.Builder()
                .set_institution_id(self._institution_id)
                .set_model_metadata(self._new_model_metadata())
                .set_title("Texas Fashion Collection")
                .build()
        )

        objects_by_id = OrderedDict()
        for root_dir_path, _, file_names in os.walk(os.path.join(self._data_dir_path, 'txfc', 'record')):
            for file_name in file_names:
                file_path = os.path.join(root_dir_path, file_name)
                if not file_path.endswith('.xml'):
                    os.rename(file_path, file_path + '.xml')
                    file_path = file_path + '.xml'
                record_etree = ElementTree.parse(file_path)
                object_id, object_ = self.__parse_record(record_etree)
                objects_by_id[object_id] = object_

        self._logger.debug("putting %d objects to the service", len(objects_by_id))
        self._services.object_command_service.put_objects(
            tuple(ObjectEntry(object_id, object_)
                  for object_id, object_ in objects_by_id.iteritems())
        )
        self._logger.info("put %d objects to the service", len(objects_by_id))

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

        # TODO: translate the qualifier to AAT
        # http://digital2.library.unt.edu/vocabularies/agent-qualifiers/
        qualifier = element.attrib.get('qualifier', None)
        if qualifier is None:
            self._logger.warn("ignoring agent element without qualifier on record %s", object_builder.record_identifier)
            return

        role = AgentRole.Builder().set_text(qualifier).build()
        agent_builder.set_role(role)

        info = element.find(self._UNTL_NS + 'info')
        if info is not None and len(info.text) > 0:
            agent_builder.attribution = info.text

        name = element.find(self._UNTL_NS + 'name')
        if name is not None and len(name.text) > 0:
            name_text = name.text
        else:
            self._logger.warn("ignoring agent element with enmpty name text on record %s", object_builder.record_identifier)
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
                self._logger.warn("unknown date qualifier '%s'", qualifier)

        date_bound = DateBound.Builder().set_text(text).build()
        object_builder.dates.append(
            Date.Builder()
                .set_earliest_date(date_bound)
                .set_latest_date(date_bound)
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

    def _parse_record_metadata_identifier_element(self, element, object_builder):
        text = element.text.strip()
        if len(text) == 0:
            return

        qualifier = element.attrib.get('qualifier', None)
        if qualifier == 'itemURL':
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

    def _parse_record_metadata_subject_element(self, element, object_builder):
        text = element.text.strip()
        if len(text) == 0:
            return

        try:
            qualifier = element.attrib['qualifier']
        except KeyError:
            self._logger.warn("ignoring subject element without qualifier on record %s", object_builder.record_identifier)
            return

        try:
            vocab = getattr(Vocab, qualifier)
        except AttributeError:
            if qualifier in ('named_person', 'UNTL-BS',):
                return
            self._logger.warn("unknown subject vocabulary '%s'", qualifier)
            return

        object_builder.subjects.append(
            Subject.Builder()
                .set_terms((
                    SubjectTerm.Builder()
                        .set_text(text)
                        .set_type(SubjectTermType.OTHER_TOPIC)
                        .set_vocab_ref(VocabRef.Builder().set_vocab(vocab).build())
                        .build()
                ,))
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
