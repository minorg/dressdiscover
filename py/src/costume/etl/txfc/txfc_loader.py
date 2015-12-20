from collections import OrderedDict
import os.path
import sys
import urllib
from xml.etree import ElementTree

from costume.api.models.agent.agent import Agent
from costume.api.models.agent.agent_name import AgentName
from costume.api.models.agent.agent_name_type import AgentNameType
from costume.api.models.agent.agent_role import AgentRole
from costume.api.models.agent.agent_set import AgentSet
from costume.api.models.collection.collection import Collection
from costume.api.models.image.image import Image
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
from costume.api.models.vocab import Vocab
from costume.api.models.vocab_ref import VocabRef
from costume.etl._loader import _Loader


class TxfcLoader(_Loader):
    def __init_(self, **kwds):
        _Loader.__init__(self, institution_id='untvca', **kwds)
        self.__collection_id = self._institution_id + '/txfc'

    def _load(self):
        self._services.institution_command_service.put_institution(
            self._institution_id,
            Institution.Builder()
                .set_data_rights(
                    RightsSet.Builder()
                        .set_rights((
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
            self._collection_id,
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
        object_id = self._collection_id + '/' + urllib.quote(record_identifier, '')

        untl_ns = '{http://digital2.library.unt.edu/untl/}'
        metadata_etree = record_etree.find('metadata').find(untl_ns + 'metadata')

        object_builder = Object.Builder()

        object_builder.collection_id = self._collection_id

        def parse_agent(agent_etree):
            if not 'qualifier' in agent_etree.attrib:
                return tuple()

            agent_builder = Agent.Builder()

            # TODO: translate the qualifier to AAT
            # http://digital2.library.unt.edu/vocabularies/agent-qualifiers/
            qualifier = agent_etree.attrib['qualifier']
            role = AgentRole.Builder().set_text(qualifier).build()
            agent_builder.set_role(role)

            info = agent_etree.find(untl_ns + 'info')
            if info is not None and len(info.text) > 0:
                agent_builder.attribution = info.text

            name = agent_etree.find(untl_ns + 'name')
            if name is not None and len(name.text) > 0:
                name_text = name.text
            else:
                return tuple()

            type_ = agent_etree.find(untl_ns + 'type')
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

        agents = []
        for contributor_etree in metadata_etree.iter(untl_ns + 'contributor'):
            agents.extend(parse_agent(contributor_etree))
        for creator_etree in metadata_etree.iter(untl_ns + 'creator'):
            agents.extend(parse_agent(creator_etree))
        if len(agents) > 0:
            object_builder.set_agents(AgentSet.Builder().set_agents(tuple(agents)).build())

        for date_etree in metadata_etree.iter(untl_ns + 'date'):
            if len(date_etree.text) == 0:
                continue
            try:
                qualifier = date_etree.attrib['qualifier']
            except KeyError:
                object_builder.set_date_text(date_etree.text)
                break
            if qualifier == 'creation':
                object_builder.set_date_text(date_etree.text)
                break
            else:
                print >>sys.stderr, 'unknown date qualifier', qualifier

        for description_etree in metadata_etree.iter(untl_ns + 'description'):
            if len(description_etree.text) == 0:
                continue
            try:
                qualifier = description_etree.attrib['qualifier']
            except KeyError:
                object_builder.set_description(description_etree.text)
                continue
            if qualifier == 'content':
                object_builder.set_description(description_etree.text)
            elif qualifier == 'physical':
                object_builder.set_physical_description(description_etree.text)

        object_builder.institution_id = self._institution_id
        object_builder.model_metadata = self._new_model_metadata()

        subjects = []
        for subject_etree in metadata_etree.iter(untl_ns + 'subject'):
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
                print >>sys.stderr, 'unknown vocabulary', qualifier
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
            object_builder.set_subjects(SubjectSet.Builder().set_subjects(tuple(subjects)).build())

        for title_etree in metadata_etree.iter(untl_ns + 'title'):
            if len(title_etree.text) == 0:
                continue
            try:
                qualifier = title_etree.attrib['qualifier']
            except KeyError:
                object_builder.title = title_etree.text
                continue
            if qualifier == 'officialtitle':
                object_builder.title = title_etree.text

        for identifier_etree in metadata_etree.iter(untl_ns + 'identifier'):
            if len(identifier_etree.text) == 0:
                continue
            qualifier = identifier_etree.attrib['qualifier']
            if qualifier == 'itemURL':
                object_builder.url = identifier_etree.text
            elif qualifier == 'thumbnailURL':
                # http://digital.library.unt.edu/ark:/67531/metadc114750/m1/1/square/
                # object_builder.thumbnail = Image.Builder().set_url(identifier_etree.text).build()
                # info:ark/67531/metadc114731
                # Use uniformly-size square images rather than the variable-sized thumbnails in the OAI record
                object_builder.thumbnail = \
                    Image.Builder()\
                        .set_height_px(75)\
                        .set_width_px(75)\
                        .set_url("http://digital.library.unt.edu/ark:" + record_identifier[len('info:ark'):] + '/m1/1/square/')\
                        .build()

        return object_id, object_builder.build()
