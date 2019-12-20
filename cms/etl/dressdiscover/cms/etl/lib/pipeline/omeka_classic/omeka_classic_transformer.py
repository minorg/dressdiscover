from typing import Dict

from rdflib import Literal, URIRef
from rdflib.namespace import DCTERMS, FOAF

from dressdiscover.cms.etl.lib.model._model import _Model
from dressdiscover.cms.etl.lib.model.collection import Collection
from dressdiscover.cms.etl.lib.model.institution import Institution
from dressdiscover.cms.etl.lib.model.object import Object
from dressdiscover.cms.etl.lib.namespace import CMS
from dressdiscover.cms.etl.lib.pipeline._transformer import _Transformer

ElementTextTree = Dict[str, Dict[str, str]]


class OmekaClassicTransformer(_Transformer):
    def __init__(self, *, institution_name: str, institution_uri: str):
        self.__institution_name = institution_name
        self.__institution_uri = institution_uri

    def transform(self, collections, files, items):
        files_by_item_id = {}
        for file_ in files:
            files_by_item_id.setdefault(file_["item"]["id"], []).append(file_)

        transformed_item_uris_by_collection_id = {}
        for item in items:
            if not item["public"]:
                continue
            transformed_item = self.__transform_item(files_by_item_id, item)
            transformed_item_uris_by_collection_id.setdefault(item["collection"]["id"], []).append(transformed_item.uri)
            yield transformed_item

        transformed_collection_uris = []
        for collection in collections:
            transformed_collection = self.__transform_collection(collection)
            for transformed_item_uri in transformed_item_uris_by_collection_id.get(collection["id"], []):
                transformed_collection.resource.add(CMS.object, URIRef(transformed_item_uri))
            transformed_collection_uris.append(transformed_collection.uri)
            yield transformed_collection

        institution = Institution(uri=URIRef(self.__institution_uri))
        institution.resource.add(FOAF.name, Literal(self.__institution_name))
        for transformed_collection_uri in transformed_collection_uris:
            institution.resource.add(CMS.collection, URIRef(transformed_collection_uri))
        yield institution

    def __get_element_texts_as_tree(self, omeka_resource) -> ElementTextTree:
        result = {}
        for element_text in omeka_resource["element_texts"]:
            text = element_text["text"].strip()
            if not text:
                continue
            element_set_name = element_text["element_set"]["name"]
            element_name = element_text["element"]["name"]
            element_set_dict = result.setdefault(element_set_name, {})
            element_set_dict.setdefault(element_name, []).append(text)
        return result

    def __log_unknown_element_texts(self, element_text_tree: ElementTextTree) -> None:
        for element_set_name in element_text_tree.keys():
            if element_text_tree[element_set_name]:
                self._logger.warn("unknown %s element names: %s", element_set_name,
                                  tuple(element_text_tree[element_set_name]))

    def __transform_collection(self, omeka_collection) -> Collection:
        collection = Collection(
            uri=omeka_collection["url"]
        )
        element_text_tree = self.__get_element_texts_as_tree(omeka_collection)
        self.__transform_dublin_core_elements(element_text_tree, collection)
        self.__log_unknown_element_texts(element_text_tree)
        return collection

    def __transform_dublin_core_elements(self, element_text_tree: ElementTextTree, model: _Model) -> None:
        dc_element_text_tree = element_text_tree.pop("Dublin Core", None)
        if not dc_element_text_tree:
            return

        for creator in dc_element_text_tree.pop("Creator", []):
            model.resource.add(DCTERMS.creator, Literal(creator))

        for date in dc_element_text_tree.pop("Date", []):
            model.resource.add(DCTERMS.date, Literal(date))

        for description in dc_element_text_tree.pop("Description", []):
            model.resource.add(DCTERMS.description, Literal(description))

        for extent in dc_element_text_tree.pop("Extent", []):
            model.resource.add(DCTERMS.extent, Literal(extent))

        for identifier in dc_element_text_tree.pop("Identifier", []):
            model.resource.add(DCTERMS.identifier, Literal(identifier))

        for is_referenced_by in dc_element_text_tree.pop("Is Referenced By", []):
            model.resource.add(DCTERMS.isReferencedBy, Literal(is_referenced_by))

        for language in dc_element_text_tree.pop("Language", []):
            model.resource.add(DCTERMS.language, Literal(language))

        for medium in dc_element_text_tree.pop("Medium", []):
            model.resource.add(DCTERMS.medium, Literal(medium))

        for provenance in dc_element_text_tree.pop("Provenance", []):
            model.resource.add(DCTERMS.provenance, Literal(provenance))

        for publisher in dc_element_text_tree.pop("Publisher", []):
            model.resource.add(DCTERMS.publisher, Literal(publisher))

        for relation in dc_element_text_tree.pop("Relation", []):
            model.resource.add(DCTERMS.relation, Literal(relation))

        for rights in dc_element_text_tree.pop("Rights", []):
            model.resource.add(DCTERMS.rights, Literal(rights))

        for rights_holder in dc_element_text_tree.pop("Rights Holder", []):
            model.resource.add(DCTERMS.rightsHolder, Literal(rights_holder))

        for source in dc_element_text_tree.pop("Source", []):
            model.resource.add(DCTERMS.source, Literal(source))

        for spatial in dc_element_text_tree.pop("Spatial Coverage", []):
            model.resource.add(DCTERMS.spatial, Literal(spatial))

        for subject in dc_element_text_tree.pop("Subject", []):
            model.resource.add(DCTERMS.subject, Literal(subject))

        for title in dc_element_text_tree.pop("Title", []):
            model.resource.add(DCTERMS.title, Literal(title))

        for type_ in dc_element_text_tree.pop("Type", []):
            model.resource.add(DCTERMS.type, Literal(type_))

        if dc_element_text_tree:
            self._logger.warn("unknown Dublin Core element names: %s", tuple(dc_element_text_tree.keys()))

    def __transform_item(self, files_by_item_id, item) -> Object:
        object_ = Object(
            uri=item["url"]
        )
        element_text_tree = self.__get_element_texts_as_tree(item)
        self.__transform_dublin_core_elements(element_text_tree, object_)
        return object_
