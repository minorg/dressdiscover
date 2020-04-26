from pprint import pprint

from paradicms.etl.lib.pipeline.omeka_classic.omeka_classic_transformer import OmekaClassicTransformer


class CostumeCoreOmekaClassicTransformer(OmekaClassicTransformer):
    def _transform_item_type_metadata(self, element_text_tree, model):
        # "Item Type Metadata" is a catch-all element set for all user-defined elements.
        itm_element_text_tree = element_text_tree.pop("Item Type Metadata", None)
        if not itm_element_text_tree:
            return
        pprint(itm_element_text_tree)
        raise NotImplementedError
