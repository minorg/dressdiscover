from typing import Dict

from dressdiscover.cms.etl.lib.model._model import _Model
from dressdiscover.cms.etl.lib.model.collection import Collection
from dressdiscover.cms.etl.lib.pipeline._transformer import _Transformer

ElementTextTree = Dict[str, Dict[str, str]]


class OmekaClassicTransformer(_Transformer):
    def transform(self, collections, files, items):
        for omeka_collection in collections:
            collection = Collection(
                uri=omeka_collection["url"]
            )
            element_text_tree = self.__get_element_texts_as_tree(omeka_collection)
            self.__transform_dublin_core(element_text_tree, collection)
            self.__log_unknown_element_texts(element_text_tree)
            yield collection

    def __get_element_texts_as_tree(self, omeka_resource) -> ElementTextTree:
        result = {}
        for element_text in omeka_resource["element_texts"]:
            text = element_text["text"].strip()
            if not text:
                continue
            element_set_name = element_text["element_set"]["name"]
            element_name = element_text["element"]["name"]
            element_set_dict = result.setdefault(element_set_name, {})
            assert not element_name in element_set_dict
            element_set_dict[element_name] = text
        return result

    def __log_unknown_element_texts(self, element_text_tree: ElementTextTree) -> None:
        for element_set_name in element_text_tree.keys():
            if element_text_tree[element_set_name]:
                self._logger.warn("unknown %s element names: %s", element_set_name,
                                  tuple(element_text_tree[element_set_name]))

    def __transform_dublin_core(self, element_text_tree: ElementTextTree, model: _Model) -> _Model:
        dc_element_text_tree = element_text_tree.pop("Dublin Core", None)
        model.description = dc_element_text_tree.pop("Description", None)
        model.title = dc_element_text_tree.pop("Title")
        if dc_element_text_tree:
            self._logger.warn("unknown Dublin Core element names: %s", tuple(dc_element_text_tree.keys()))
        return model
