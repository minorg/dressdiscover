from dressdiscover.cms.etl.lib.model._model import _Model
from dressdiscover.cms.etl.lib.model.collection import Collection
from dressdiscover.cms.etl.lib.pipeline._transformer import _Transformer


class OmekaClassicTransformer(_Transformer):
    def transform(self, collections, files, items):
        for omeka_collection in collections:
            collection = Collection(
                uri=omeka_collection["url"]
            )
            self.__transform_dublin_core(collection, omeka_collection)
            yield collection

    def __transform_dublin_core(self, model: _Model, omeka_resource) -> _Model:
        for element_text in omeka_resource["element_texts"]:
            element_set_name = element_text["element_set"]["name"]
            if element_set_name != "Dublin Core":
                continue
            element_name = element_text["element"]["name"]
            text = element_text["text"].strip()
            if not text:
                continue

            if element_name == "Description":
                model.description = text
            elif element_name == "Title":
                model.title = text

        return model
