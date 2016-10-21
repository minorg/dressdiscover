from os.path import os
import urllib
from xml.etree import ElementTree

from com.google.common.base import Optional
from com.google.common.collect import ImmutableList
from com.google.common.primitives import UnsignedInteger
from org.dressdiscover.api.models import VocabRef, Vocab
from org.dressdiscover.api.models.agent import AgentSet, Agent, AgentRole, \
    AgentNameType, AgentName
from org.dressdiscover.api.models.date import DateType, DateSet, DateBound, \
    Date
from org.dressdiscover.api.models.description import DescriptionSet, \
    DescriptionType, Description
from org.dressdiscover.api.models.image import Image, ImageVersion
from org.dressdiscover.api.models.location import LocationSet, Location, \
    LocationName, LocationNameType, LocationType
from org.dressdiscover.api.models.object import ObjectId, ObjectEntry
from org.dressdiscover.api.models.rights import RightsSet, Rights, RightsType
from org.dressdiscover.api.models.subject import SubjectSet, SubjectTerm, \
    SubjectTermType, Subject
from org.dressdiscover.api.models.textref import TextrefSet, Textref, \
    TextrefName, TextrefNameType, TextrefRefid, TextrefRefidType
from org.dressdiscover.api.models.title import TitleSet, TitleType, Title
from org.dressdiscover.api.models.work_type import WorkTypeSet, WorkType
from org.thryft.native_ import Uri, Url

from dressdiscover.etl.date_parser import DateParser
from dressdiscover.etl.oai_pmh._oai_pmh_record_mapper import _OaiPmhRecordMapper
from dressdiscover.lib.stores.object.omeka.dcmi_types import DCMI_TYPES_BASE_URL


class TxfcOaiPmhRecordMapper(_OaiPmhRecordMapper):
    _RIGHTS_HOLDER = "University of North Texas"
    _UNTL_NS = '{http://digital2.library.unt.edu/untl/}'
    _SQUARE_THUMBNAIL_HEIGHT_PX = UnsignedInteger.valueOf(75)
    _SQUARE_THUMBNAIL_WIDTH_PX = UnsignedInteger.valueOf(75)

    class _ObjectBuilder(_OaiPmhRecordMapper._ObjectBuilder):
        def __init__(self, **kwds):
            _OaiPmhRecordMapper._ObjectBuilder.__init__(self, **kwds)
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
                    Date.builder()
                        .setEarliestDate(self.start_date_bound)
                        .setLatestDate(self.end_date_bound)
                        .setType(DateType.CREATION)
                        .build()
                )

            if len(self.agents) > 0:
                self._object_builder.setAgents(AgentSet.builder().setElements(ImmutableList.copyOf(self.agents)).build())
            if len(self.dates) > 0:
                self._object_builder.setDates(DateSet.builder().setElements(ImmutableList.copyOf(self.dates)).build())
            if len(self.descriptions) > 0:
                self._object_builder.setDescriptions(DescriptionSet.builder().setElements(ImmutableList.copyOf(self.descriptions)).build())
            if len(self.images) > 0:
                self._object_builder.setImages(ImmutableList.copyOf(self.images))
            if len(self.locations) > 0:
                self._object_builder.setLocations(LocationSet.builder().setElements(ImmutableList.copyOf(self.locations)).build())
            if len(self.rights) > 0:
                self._object_builder.setRights(RightsSet.builder().setElements(ImmutableList.copyOf(self.rights)).build())
            if len(self.subjects) > 0:
                self._object_builder.setSubjects(SubjectSet.builder().setElements(ImmutableList.copyOf(self.subjects)).build())
            if len(self.textrefs) > 0:
                self._object_builder.setTextrefs(TextrefSet.builder().setElements(ImmutableList.copyOf(self.textrefs)).build())
            if len(self.titles) > 0:
                self._object_builder.setTitles(TitleSet.builder().setElements(ImmutableList.copyOf(self.titles)).build())
            if len(self.work_types) > 0:
                self._object_builder.setWorkTypes(WorkTypeSet.builder().setElements(ImmutableList.copyOf(self.work_types)).build())
            return self._object_builder.build()

    def __init__(self, *args, **kwds):
        _OaiPmhRecordMapper.__init__(self, *args, **kwds)

        agent_qualifiers = {}
        agent_qualifiers_etree = ElementTree.parse(os.path.join(os.path.dirname(__file__), 'agent-qualifiers.xml'))
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

    def map_oai_pmh_record(self, collection_id, logger, log_marker, record_etree):
        record_identifier = record_etree.find('header').find('identifier').text
        object_id = ObjectId.parse(str(collection_id) + '/' + urllib.quote(record_identifier, ''))
        metadata_etree = record_etree.find('metadata')

        object_builder = \
            self._ObjectBuilder(
                collection_id=collection_id,
                institution_id=collection_id.getInstitutionId(),
                logger=logger,
                log_marker=log_marker,
                record_identifier=record_identifier
            )

        for etree in metadata_etree.find(self._UNTL_NS + 'metadata'):
            assert etree.tag.startswith(self._UNTL_NS)
            tag = etree.tag[len(self._UNTL_NS):]
            method_name = '_parse_record_metadata_' + tag + '_element'
            try:
                method = getattr(self, method_name)
            except AttributeError:
                object_builder.logger.warn(object_builder.log_marker, "no such method '{}' for record {} with text '{}'", (method_name, record_identifier, etree.text,))
                continue
            method(
                element=etree,
                object_builder=object_builder
            )

        return ObjectEntry(object_id, object_builder.build())

    def __parse_date(self, text, circa=None):
        date_bound_builder = DateBound.builder().setText(text)

        if text[-1] == 'u':
            date_bound_builder.setCirca(True)
            text = text[:-1] + '0'
        elif text[-1] == '~':
            date_bound_builder.setCirca(True)
            text = text[:-1]
        elif circa is not None:
            date_bound_builder.setCirca(circa)

        DateParser.parse_certain_date(
            date_bound_builder=date_bound_builder,
            text=text
        )

        return date_bound_builder.build()

    def __parse_date_range(self, object_builder, text):
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

        if date_range[0].getParsedDateTime() is None or date_range[1].getParsedDateTime() is None:
            object_builder.logger.warn(object_builder.log_marker, "unable to parse date range '{}'", original_text)
        else:
            object_builder.logger.debug(object_builder.log_marker, "parsed date range '{}' from '{}'", date_range, original_text)
        return date_range

    def __parse_record_metadata_agent_element(self, element, object_builder):
        agent_builder = Agent.builder()

        qualifier = element.attrib.get('qualifier', None)
        if qualifier is None:
            object_builder.logger.warn(object_builder.log_marker, "ignoring agent element without qualifier on record {}", object_builder.record_identifier)
            return

        role = AgentRole.builder().setText(self.__agent_qualifiers[qualifier]).build()
        agent_builder.setRole(role)

        info = element.find(self._UNTL_NS + 'info')
        if info is not None and len(info.text) > 0:
            agent_builder.setAttribution(info.text)

        name = element.find(self._UNTL_NS + 'name')
        if name is not None and len(name.text) > 0:
            name_text = name.text
        else:
            object_builder.logger.warn(object_builder.log_marker, "ignoring agent element with empty name text on record {}", object_builder.record_identifier)
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

        agent_builder.name = AgentName.builder().setText(name_text).setType(name_type).build()

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
            object_builder.logger.warn(object_builder.log_marker, "coverage element without qualifier on record {}", object_builder.record_identifier)
            return

        if qualifier == 'date':
            pass # Same as date element
        elif qualifier == 'eDate':
            if object_builder.end_date_bound is not None:
                object_builder.logger.warn(object_builder.log_marker, "record {} has multiple eDate's", object_builder.record_identifier)
            earliest_date, latest_date = self.__parse_date_range(object_builder=object_builder, text=text)
            if earliest_date != latest_date:
                object_builder.logger.warn(object_builder.log_marker, "record {} has a eDate range: {}", object_builder.record_identifier, text)
            object_builder.end_date_bound = latest_date
        elif qualifier == 'placeName':
            text_parts = [text_part.strip() for text_part in text.split(' - ')]
            object_builder.logger.debug(object_builder.log_marker, 'place name from record {}: {}', object_builder.record_identifier, text)

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
                Location.builder()
                    .setNames(ImmutableList.copyOf(
                        LocationName.builder()
                            .setExtent(extent)
                            .setText(text)
                            .setType(LocationNameType.GEOGRAPHIC)
                            .build()
                        for extent, text in location_names_by_extent.iteritems()
                    ))
                    .setType(LocationType.OTHER)
                    .build()
            )
        elif qualifier == 'sDate':
            if object_builder.start_date_bound is not None:
                object_builder.logger.warn(object_builder.log_marker, "record {} has multiple sDate's", object_builder.record_identifier)
            earliest_date, latest_date = self.__parse_date_range(object_builder=object_builder, text=text)
            if earliest_date != latest_date:
                object_builder.logger.warn(object_builder.log_marker, "record {} has a sDate range: {}", object_builder.record_identifier, text)
            object_builder.start_date_bound = earliest_date
        else:
            object_builder.logger.warn(object_builder.log_marker, "unknown coverage qualifier '{}' on record {}", qualifier, object_builder.record_identifier)

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
                object_builder.logger.warn(object_builder.log_marker, "unknown date qualifier '{}' on record {}", qualifier, object_builder.record_identifier)

        earliest_date, latest_date = self.__parse_date_range(object_builder=object_builder, text=text)
        object_builder.dates.append(
            Date.builder()
                .setEarliestDate(earliest_date)
                .setLatestDate(latest_date)
                .setType(date_type)
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
                object_builder.logger.warn(object_builder.log_marker, "unknown description qualifier '{}'", qualifier)

        object_builder.descriptions.append(
            Description.builder()
                .setText(text)
                .setType(Optional.fromNullable(description_type))
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
                Textref.builder()
                    .setName(
                        TextrefName.builder()
                            .setText("Item URL")
                            .setType(TextrefNameType.ELECTRONIC)
                            .build()
                    )
                    .setRefid(
                        TextrefRefid.builder()
                            .setHref(Url.parse(text))
                            .setText(text)
                            .setType(TextrefRefidType.URI)
                            .build()
                    )
                    .build()
            )
        elif qualifier == 'thumbnailURL':
            object_builder.images.append(
                Image.builder()
                    .setFullSize(
                        ImageVersion.builder()
                            .setUrl(Url.parse("http://digital.library.unt.edu/ark:" + object_builder.record_identifier[len('info:ark'):] + '/m1/1/med_res/'))
                            .build()
                    )
                    .setOriginal(
                        ImageVersion.builder()
                            .setUrl(Url.parse("http://digital.library.unt.edu/ark:" + object_builder.record_identifier[len('info:ark'):] + '/m1/1/high_res/'))
                            .build()
                    )
                    .setSquareThumbnail(
                        ImageVersion.builder()
                            .setHeightPx(self._SQUARE_THUMBNAIL_HEIGHT_PX)
                            .setUrl(Url.parse("http://digital.library.unt.edu/ark:" + object_builder.record_identifier[len('info:ark'):] + '/m1/1/square/'))
                            .setWidthPx(self._SQUARE_THUMBNAIL_WIDTH_PX)
                            .build()
                    )
                    .setThumbnail(
                        ImageVersion.builder()
                            .setUrl(Url.parse(text))
                            .build()
                    )
                    .build()
            )
        elif qualifier is not None:
            object_builder.logger.warn(object_builder.log_marker, "ignoring unknown identifier qualifier '{}' on record {}", qualifier, object_builder.record_identifier)

    def _parse_record_metadata_meta_element(self, element, object_builder):
        text = element.text.strip()
        if len(text) == 0:
            return

        qualifier = element.attrib.get('qualifier', None)
        if qualifier is None:
            object_builder.logger.warn(object_builder.log_marker, "meta element without qualifier on record {}", object_builder.record_identifier)
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
            object_builder.logger.warn(object_builder.log_marker, "ignoring unknown meta qualifier '{}' on record {}", qualifier, object_builder.record_identifier)

    def _parse_record_metadata_note_element(self, element, object_builder):
        text = element.text.strip()
        if len(text) == 0:
            return

        qualifier = element.attrib.get('qualifier', None)
        if qualifier == 'digitalPreservation':
            object_builder.descriptions.append(
                Description.builder()
                    .setText(text)
                    .setType(DescriptionType.HISTORY)
                    .build()
            )
        elif qualifier == 'display':
            object_builder.descriptions.append(
                Description.builder()
                    .setText(text)
                    .setType(DescriptionType.PUBLIC)
                    .build()
            )
        elif qualifier == 'nonDisplay':
            pass
        else:
            object_builder.descriptions.append(
                Description.builder()
                    .setText(text)
                    .setType(DescriptionType.HISTORY)
                    .build()
            )
#             object_builder.logger.warn(object_builder.log_marker, "ignoring unknown note qualifier '{}' on record {}", qualifier, object_builder.record_identifier)

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
            WorkType.builder()\
                .setText(text)\
                .setVocabRef(
                    VocabRef.builder()
                        .setRefid(text)\
                        .setVocab(Vocab.DCMI_TYPE)\
                        .setUri(Uri.parse(DCMI_TYPES_BASE_URL + text))\
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
            object_builder.logger.warn(object_builder.log_marker, "rights element without qualifier on record {}", object_builder.record_identifier)
            return

        if qualifier == 'access':
            assert text == 'public', text
        elif qualifier == 'license':
            if text == 'by-nc-nd':
                license_vocab_ref = \
                    VocabRef.builder()\
                        .setVocab(Vocab.CREATIVE_COMMONS)\
                        .setUri(Uri.parse('https://creativecommons.org/licenses/by-nc-nd/2.0/'))\
                        .build()
            else:
                license_vocab_ref = None
                object_builder.logger.warn(object_builder.log_marker, "ignoring unknown license text '{}' on record {}", text, object_builder.record_identifier)

            object_builder.rights.append(
                Rights.builder()
                    .setLicenseVocabRef(license_vocab_ref)
                    .setRightsHolder(self._RIGHTS_HOLDER)
                    .setText(text)
                    .setType(RightsType.LICENSED)
                    .build()
            )
        elif qualifier == 'statement':
            object_builder.rights.append(
                Rights.builder()
                    .setRightsHolder(self._RIGHTS_HOLDER)
                    .setText(text)
                    .setType(RightsType.COPYRIGHTED)
                    .build()
            )
        else:
            object_builder.logger.warn(object_builder.log_marker, "ignoring unknown rights qualifier '{}' on record {}", qualifier, object_builder.record_identifier)

    def _parse_record_metadata_subject_element(self, element, object_builder):
        text = element.text.strip()
        if len(text) == 0:
            return

        subject_term_builder = \
            SubjectTerm.builder()\
                .setText(text)\
                .setType(SubjectTermType.OTHER_TOPIC)\

        qualifier = element.get('qualifier', None)
        if qualifier is not None:
            try:
                vocab = getattr(Vocab, qualifier)
                subject_term_builder.setVocabRef(VocabRef.builder().setVocab(vocab).build())
            except AttributeError:
                if qualifier not in ('named_person', 'UNTL-BS',):
                    object_builder.logger.warn(object_builder.log_marker, "unknown subject vocabulary '{}'", qualifier)

        object_builder.subjects.append(
            Subject.builder()
                .setTerms(ImmutableList.of(subject_term_builder.build()))
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
                object_builder.logger.warn(object_builder.log_marker, "unknown title qualifier '{}' on record {}", qualifier, object_builder.record_identifier)

        object_builder.titles.append(
            Title.builder()
                .setText(element.text)
                .setType(title_type)
                .build()
        )

