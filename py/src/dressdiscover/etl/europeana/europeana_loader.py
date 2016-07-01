from costume.api.models.institution.institution import Institution
from costume.etl.oai_pmh._oai_pmh_loader import _OaiPmhLoader


class EuropeanaLoader(_OaiPmhLoader):
    _NAMESPACES = {
        'dc': 'http://purl.org/dc/elements/1.1/',
        'edm': 'http://www.europeana.eu/schemas/edm/',
        'ore': 'http://www.openarchives.org/ore/terms/',
        'rdf': 'http://www.w3.org/1999/02/22-rdf-syntax-ns#',
        'skos': 'http://www.w3.org/2004/02/skos/core#',
    }

    class _ObjectBuilder(_OaiPmhLoader._ObjectBuilder):
        def __init__(self, **kwds):
            _OaiPmhLoader._ObjectBuilder.__init__(self, **kwds)

        def build(self):
            return self._object_builder.build()

    def __init__(self, **kwds):
        _OaiPmhLoader.__init__(
            self,
            collection_id='europeana/2048208_Ag_EU_EuropeanaFashion_1015',
            institution_id='europeana',
            **kwds
        )
        self.__unique_dc_types = {}
        self.__unique_edm_types = {}

    def _parse_record_metadata(self, object_id, record_identifier, record_metadata_etree):
        object_builder = \
            self._ObjectBuilder(
                collection_id=self._collection_id,
                institution_id=self._institution_id,
                model_metadata=self._new_model_metadata(),
                record_identifier=record_identifier
            )

        rdf_element_etree = record_metadata_etree.find("{%s}RDF" % self._NAMESPACES['rdf'])
        for etree in rdf_element_etree:
            tag = etree.tag
            assert tag.startswith('{'), tag
            namespace = None
            for test_namespace, uri in self._NAMESPACES.iteritems():
                tag_namespace_uri_prefix = "{%s}" % uri
                if tag.startswith(tag_namespace_uri_prefix):
                    namespace = test_namespace
                    unqualified_tag = tag[len(tag_namespace_uri_prefix):]
                    break
            assert namespace is not None, etree.tag
            method_name = '_parse_record_metadata_' + namespace + '_' + unqualified_tag
            try:
                method = getattr(self, method_name)
            except AttributeError:
                # self._logger.warn("no such method '%s' for record %s", method_name, record_identifier)
                continue
            method(
                element=etree,
                object_builder=object_builder
            )

        return None
        # return object_id, object_builder.build()

    def _parse_record_metadata_ore_Proxy(self, element, object_builder):
        for dc_type_etree in element.findall("{%s}type" % self._NAMESPACES['dc']):
            if dc_type_etree.text is None or len(dc_type_etree.text) == 0:
                continue
            try:
                xml_lang = dc_type_etree.attrib['{http://www.w3.org/XML/1998/namespace}lang']
                if xml_lang != 'en':
                    continue
            except KeyError:
                pass
            dc_type_text = dc_type_etree.text
            if not dc_type_text in self.__unique_dc_types:
                # print dc_type_text
                self.__unique_dc_types[dc_type_text] = None

        for edm_type_etree in element.findall("{%s}type" % self._NAMESPACES['edm']):
            if edm_type_etree.text is None or len(edm_type_etree.text) == 0:
                continue
            edm_type_text = edm_type_etree.text
            if not edm_type_text in self.__unique_edm_types:
                # print edm_type_text
                self.__unique_edm_types[edm_type_text] = None

    def _put_collection(self):
        _OaiPmhLoader._put_collection(
            self,
            collection_id=self._collection_id,
            title="Europeana Fashion"
        )

    def _put_institution(self):
        self._services.institution_command_service.put_institution(
            self._institution_id,
            Institution.Builder()
                .set_model_metadata(self._new_model_metadata())
                .set_title("Europeana Fashion")
                .set_url('http://www.europeanafashion.eu')
                .build()
        )
