import json
from typing import Dict

from rdflib import Graph, Namespace, RDF
from rdflib.resource import Resource

from dressdiscover.cms.etl.lib.model.collection import Collection
from dressdiscover.cms.etl.lib.namespace import CMS
from dressdiscover.cms.etl.lib.pipeline._transformer import _Transformer

# Omeka namespace
O = Namespace("http://omeka.org/s/vocabs/o#")


class OmekaSTransformer(_Transformer):
    def __init__(self, *, institution_kwds: Dict[str, str], square_thumbnail_height_px: int,
                 square_thumbnail_width_px: int):
        self.__institution_kwds = institution_kwds
        self.__square_thumbnail_height_px = square_thumbnail_height_px
        self.__square_thumbnail_width_px = square_thumbnail_width_px

    def transform(self, *, items, item_sets, media):
        target_graph = Graph()

        items_graph = Graph().parse(data=json.dumps(items), format="json-ld")
        item_sets_graph = Graph().parse(data=json.dumps(item_sets), format="json-ld")
        media_graph = Graph().parse(data=json.dumps(media), format="json-ld")

        institution = self._transform_institution_from_arguments(graph=target_graph, **self.__institution_kwds)

        collections_by_id = {}
        for item_set_uri in item_sets_graph.subjects(RDF.type, O.ItemSet):
            item_set_resource = item_sets_graph.resource(item_set_uri)
            item_set_id = item_set_resource.value(O["id"]).toPython()
            assert isinstance(item_set_id, int)
            collection = self.__transform_item_set(item_set=item_set_resource, target_graph=target_graph)
            collections_by_id[item_set_id] = collection
            institution.resource.add(CMS.collection, collection.uri)
        #
        # files_by_item_id = {}
        # for file_ in files:
        #     files_by_item_id.setdefault(file_["item"]["id"], []).append(file_)
        #
        # for item in items:
        #     if not item["public"]:
        #         continue
        #     transformed_item = self.__transform_item(files_by_item_id=files_by_item_id, graph=graph, item=item)
        #     transformed_collections_by_id[item["collection"]["id"]].resource.add(CMS.object,
        #                                                                          transformed_item.uri)

        return target_graph

    def __transform_item_set(self, *, item_set: Resource, target_graph: Graph) -> Collection:
        collection = Collection(
            graph=target_graph,
            uri=item_set.identifier
        )
        for p, o in item_set.predicate_objects():
            collection.resource.add(p.identifier, o)
        return collection

    # def __transform_file(self, *, file_, graph: Graph) -> Tuple[Image, ...]:
    #     if not file_["mime_type"].startswith("image/"):
    #         return None, None
    #
    #     original = thumbnail = None
    #     for key, url in file_["file_urls"].items():
    #         if url is None:
    #             continue
    #         if key not in ("original", "square_thumbnail"):
    #             continue
    #         image = Image(graph=graph, uri=URIRef(url))
    #         if key == "original":
    #             image.height = file_["metadata"]["video"]["resolution_y"]
    #             image.width = file_["metadata"]["video"]["resolution_x"]
    #         elif key == "square_thumbnail":
    #             image.height = self.__square_thumbnail_height_px
    #             image.width = self.__square_thumbnail_width_px
    #             original_uri = URIRef(file_["file_urls"]["original"])
    #             image.resource.add(PROV.wasDerivedFrom, original_uri)
    #             graph.add((original_uri, FOAF.thumbnail, image.uri))
    #         else:
    #             raise NotImplementedError
    #         image.created = dateparser.parse(file_["added"], settings={"STRICT_PARSING": True})
    #         image.format = file_["mime_type"]
    #         image.modified = dateparser.parse(file_["modified"], settings={"STRICT_PARSING": True})
    #         if key == "original":
    #             original = image
    #         elif key == "square_thumbnail":
    #             thumbnail = image
    #         else:
    #             raise NotImplementedError
    #
    #     return original, thumbnail
    #
    # def __transform_item(self, *, files_by_item_id, graph: Graph, item) -> Object:
    #     object_ = Object(
    #         graph=graph,
    #         uri=URIRef(item["url"])
    #     )
    #     item_element_text_tree = self.__get_element_texts_as_tree(item)
    #     self.__transform_dublin_core_elements(element_text_tree=item_element_text_tree, model=object_)
    #     for file_ in files_by_item_id.get(item["id"], []):
    #         original_image, thumbnail_image = self.__transform_file(file_=file_, graph=graph)
    #         if not original_image:
    #             continue
    #         original_image.resource.add(FOAF.depicts, object_.uri)
    #         object_.resource.add(FOAF.depiction, original_image.uri)
    #     return object_
