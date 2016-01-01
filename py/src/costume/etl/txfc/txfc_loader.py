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

        object_builder = Object.Builder()

        object_builder.collection_id = self.__collection_id

        agents = []
        for contributor_etree in metadata_etree.iter(self._UNTL_NS + 'contributor'):
            agents.extend(self.__parse_record_agent(contributor_etree))
        for creator_etree in metadata_etree.iter(self._UNTL_NS + 'creator'):
            agents.extend(self.__parse_record_agent(creator_etree))
        if len(agents) > 0:
            object_builder.set_agents(AgentSet.Builder().set_elements(tuple(agents)).build())

        self.__parse_record_dates(
            date_etrees=metadata_etree.iter(self._UNTL_NS + 'date'),
            object_builder=object_builder
        )

        self.__parse_record_descriptions(
            description_etrees=metadata_etree.iter(self._UNTL_NS + 'description'),
            object_builder=object_builder
        )

        self.__parse_record_identifiers(
            identifier_etrees=metadata_etree.iter(self._UNTL_NS + 'identifier'),
            object_builder=object_builder,
            record_identifier=record_identifier
        )

        object_builder.institution_id = self._institution_id
        object_builder.model_metadata = self._new_model_metadata()

        self.__parse_record_subjects(
            subject_etrees=metadata_etree.iter(self._UNTL_NS + 'subject'),
            object_builder=object_builder
        )

        self.__parse_record_titles(
            title_etrees=metadata_etree.iter(self._UNTL_NS + 'title'),
            object_builder=object_builder,
            record_identifier=record_identifier
        )

        return object_id, object_builder.build()

    def __parse_record_agent(self, agent_etree):
        if not 'qualifier' in agent_etree.attrib:
            return tuple()

        agent_builder = Agent.Builder()

        # TODO: translate the qualifier to AAT
        # http://digital2.library.unt.edu/vocabularies/agent-qualifiers/
        qualifier = agent_etree.attrib['qualifier']
        role = AgentRole.Builder().set_text(qualifier).build()
        agent_builder.set_role(role)

        info = agent_etree.find(self._UNTL_NS + 'info')
        if info is not None and len(info.text) > 0:
            agent_builder.attribution = info.text

        name = agent_etree.find(self._UNTL_NS + 'name')
        if name is not None and len(name.text) > 0:
            name_text = name.text
        else:
            return tuple()

        type_ = agent_etree.find(self._UNTL_NS + 'type')
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

        return (agent_builder.build(),)

    def __parse_record_dates(self, date_etrees, object_builder):
        dates = []
        for date_etree in date_etrees:
            if len(date_etree.text) == 0:
                continue

            date_type = DateType.CREATION
            try:
                qualifier = date_etree.attrib['qualifier']
                if qualifier == 'accepted':
                    date_type = DateType.ACCESSION
                elif qualifier == 'creation':
                    date_type = DateType.CREATION
                else:
                    self._logger.warn("unknown date qualifier '%s'", qualifier)
            except KeyError:
                pass

            date_bound = DateBound.Builder().set_text(date_etree.text).build()
            dates.append(
                Date.Builder()
                    .set_earliest_date(date_bound)
                    .set_latest_date(date_bound)
                    .set_type(date_type)
                    .build()
            )
        if len(dates) > 0:
            object_builder.set_dates(DateSet.Builder().set_elements(tuple(dates)).build())

    def __parse_record_descriptions(self, description_etrees, object_builder):
        descriptions = []
        for description_etree in description_etrees:
            if len(description_etree.text) == 0:
                continue

            description_type = None
            try:
                qualifier = description_etree.attrib['qualifier']
                if qualifier == 'content':
                    description_type = None
                elif qualifier == 'physical':
                    description_type = DescriptionType.PHYSICAL
                else:
                    self._logger.warn("unknown description qualifier '%s'", qualifier)
            except KeyError:
                pass

            descriptions.append(
                Description.Builder()
                    .set_text(description_etree.text)
                    .set_type(description_type)
                    .build()
            )
        if len(descriptions) > 0:
            object_builder.set_descriptions(DescriptionSet.Builder().set_elements(tuple(descriptions)).build())

    def __parse_record_identifiers(self, identifier_etrees, object_builder, record_identifier):
        images = []
        textrefs = []
        for identifier_etree in identifier_etrees:
            if len(identifier_etree.text) == 0:
                continue
            qualifier = identifier_etree.attrib['qualifier']
            if qualifier == 'itemURL':
                textrefs.append(
                    Textref.Builder()
                        .set_name(
                            TextrefName.Builder()
                                .set_text("Item URL")
                                .set_type(TextrefNameType.ELECTRONIC)
                                .build()
                        )
                        .set_refid(
                            TextrefRefid.Builder()
                                .set_href(identifier_etree.text)
                                .set_text(identifier_etree.text)
                                .set_type(TextrefRefidType.URI)
                                .build()
                        )
                        .build()
                )
            elif qualifier == 'thumbnailURL':
                images.append(
                    Image.Builder()
                        .set_full_size(
                            ImageVersion.Builder()
                                .set_url("http://digital.library.unt.edu/ark:" + record_identifier[len('info:ark'):] + '/m1/1/med_res/')
                                .set_width_px(75)
                                .build()
                        )
                        .set_original(
                            ImageVersion.Builder()
                                .set_url("http://digital.library.unt.edu/ark:" + record_identifier[len('info:ark'):] + '/m1/1/high_res/')
                                .set_width_px(75)
                                .build()
                        )
                        .set_square_thumbnail(
                            ImageVersion.Builder()
                                .set_height_px(75)
                                .set_url("http://digital.library.unt.edu/ark:" + record_identifier[len('info:ark'):] + '/m1/1/square/')
                                .set_width_px(75)
                                .build()
                        )
                        .set_thumbnail(
                            ImageVersion.Builder()
                                .set_url(identifier_etree.text)
                                .build()
                        )
                        .build()
                )
        if len(images)> 0:
            object_builder.set_images(tuple(images))
        if len(textrefs) > 0:
            object_builder.set_textrefs(TextrefSet.Builder().set_elements(tuple(textrefs)).build())

    def __parse_record_subjects(self, subject_etrees, object_builder):
        subjects = []
        for subject_etree in subject_etrees:
            if len(subject_etree.text) == 0:
                continue
            try:
                qualifier = subject_etree.attrib['qualifier']
            except KeyError:
                continue
            try:
                vocab = getattr(Vocab, qualifier)
            except AttributeError:
                if qualifier in ('named_person', 'UNTL-BS',):
                    continue
                self._logger.warn("unknown subject vocabulary '%s'", qualifier)
                continue
            subjects.append(
                Subject.Builder()
                    .set_terms((
                        SubjectTerm.Builder()
                            .set_text(subject_etree.text)
                            .set_type(SubjectTermType.OTHER_TOPIC)
                            .set_vocab_ref(VocabRef.Builder().set_vocab(vocab).build())
                            .build()
                    ,))
                    .build()
            )
        if len(subjects) > 0:
            object_builder.set_subjects(SubjectSet.Builder().set_elements(tuple(subjects)).build())

    def __parse_record_titles(self, title_etrees, object_builder, record_identifier):
        titles = []
        for title_etree in title_etrees:
            if len(title_etree.text) == 0:
                continue

            title_type = TitleType.DESCRIPTIVE
            try:
                qualifier = title_etree.attrib['qualifier']
                if qualifier in ('addedtitle', 'alternatetitle', 'officialtitle', 'sorttitle'):
                    title_type = TitleType.DESCRIPTIVE
                elif qualifier == 'other':
                    title_type = TitleType.OTHER
                elif qualifier == 'paralleltitle':
                    title_type = TitleType.TRANSLATED
                elif qualifier == 'seriestitle':
                    title_type = TitleType.REPOSITORY
                else:
                    self._logger.warn("unknown title qualifier '%s' on record %s", qualifier, record_identifier)
            except KeyError:
                pass

            titles.append(
                Title.Builder()
                    .set_text(title_etree.text)
                    .set_type(title_type)
                    .build()
            )
        if len(titles) > 0:
            object_builder.set_titles(TitleSet.Builder().set_elements(tuple(titles)).build())
