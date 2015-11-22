import os.path
import urllib
from xml.etree import ElementTree

from argparse import ArgumentParser

from costume.api.models.agent.agent import Agent
from costume.api.models.agent.agent_name import AgentName
from costume.api.models.agent.agent_name_type import AgentNameType
from costume.api.models.agent.agent_role import AgentRole
from costume.api.models.agent.agent_set import AgentSet
from costume.api.models.collection.collection import Collection
from costume.api.models.institution.institution import Institution
from costume.api.models.object.object import Object
from costume.api.models.rights.rights import Rights
from costume.api.models.rights.rights_set import RightsSet
from costume.api.models.rights.rights_type import RightsType
from costume.api.models.subject.subject import Subject
from costume.api.models.subject.subject_term import SubjectTerm
from costume.api.models.subject.subject_term_type import SubjectTermType
from costume.api.models.vocab import Vocab
from costume.api.services.institution.no_such_institution_exception import NoSuchInstitutionException
from costume.lib.costume_properties import CostumeProperties
from model_utils import new_model_metadata
from services import Services
from costume.api.models.image.image import Image
from costume.api.models.subject.subject_set import SubjectSet
import sys


INSTITUTION_ID = 'untvca'
COLLECTION_ID = INSTITUTION_ID + '/txfc'
properties = CostumeProperties.load()
services = Services(properties=properties)


def parse_record(record_etree):
    object_id = COLLECTION_ID + '/' + urllib.quote(record_etree.find('header').find('identifier').text, '')

    untl_ns = '{http://digital2.library.unt.edu/untl/}'
    metadata_etree = record_etree.find('metadata').find(untl_ns + 'metadata')

    object_builder = Object.Builder()

    object_builder.collection_id = COLLECTION_ID

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

    object_builder.institution_id = INSTITUTION_ID
    object_builder.model_metadata = new_model_metadata()

    subjects = []
    for subject_etree in metadata_etree.iter(untl_ns + 'subject'):
        if len(subject_etree.text) == 0:
            continue
        try:
            qualifier = subject_etree.attrib['qualifier']
        except KeyError:
            continue
        if qualifier == 'AAT':
            subjects.append(
                Subject.Builder()
                    .set_terms((
                        SubjectTerm.Builder()
                            .set_text(subject_etree.text)
                            .set_type(SubjectTermType.OTHER_TOPIC)
                            .set_vocab(Vocab.AAT)
                            .build()
                    ,))
                    .build()
            )
        elif qualifier in ('UNTL-BS',):
            continue
        else:
            print >>sys.stderr, 'unknown vocabulary', qualifier
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
            object_builder.thumbnail = Image.Builder().set_url(identifier_etree.text).build()

    return object_id, object_builder.build()


argument_parser = ArgumentParser()
argument_parser.add_argument('--clean', action='store_true')
args = argument_parser.parse_args()


if args.clean:
    try:
        services.institution_command_service.delete_institution_by_id(INSTITUTION_ID)
    except NoSuchInstitutionException:
        pass


services.institution_command_service.put_institution(
    INSTITUTION_ID,
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
        .set_model_metadata(new_model_metadata())
        .set_title("University of North Texas")
        .set_url('http://digital.library.unt.edu/explore/collections/TXFC/')
        .build()
)


services.collection_command_service.put_collection(
    COLLECTION_ID,
    Collection.Builder()
        .set_institution_id(INSTITUTION_ID)
        .set_model_metadata(new_model_metadata())
        .set_title("Texas Fashion Collection")
        .build()
)


DATA_DIR_PATH = os.path.abspath(os.path.join(os.path.dirname(__file__), '..', '..', 'data'))
RECORDS_DIR_PATH = os.path.join(DATA_DIR_PATH, 'txfc', 'record')

object_count = 0
for root_dir_path, _, file_names in os.walk(RECORDS_DIR_PATH):
    for file_name in file_names:
        file_path = os.path.join(root_dir_path, file_name)
        if not file_path.endswith('.xml'):
            os.rename(file_path, file_path + '.xml')
            file_path = file_path + '.xml'
        record_etree = ElementTree.parse(file_path)
        object_id, object_ = parse_record(record_etree)
        services.object_command_service.put_object(object_id, object_)
        print 'put object', object_id, '(#', object_count, ')'
        object_count = object_count + 1
