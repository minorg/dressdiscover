from typing import Collection, Optional

from rdflib import Graph

from dressdiscover.cms.etl.lib.pipeline.vccc.costume_core_omeka_classic_transformer import \
    CostumeCoreOmekaClassicTransformer


class VccTransformer(CostumeCoreOmekaClassicTransformer):
    def __init__(self):
        CostumeCoreOmekaClassicTransformer.__init__(
            self,
            institution_kwds={
                "institution_name": "Vassar College Costume Collection",
                "institution_rights": "Copyright Vassar College. All rights reserved.",
                "institution_uri": "https://vcomeka.com/vccc/",
            },
            fullsize_max_height_px=600,
            fullsize_max_width_px=600,
            square_thumbnail_height_px=75,
            square_thumbnail_width_px=75,
            thumbnail_max_height_px=200,
            thumbnail_max_width_px=200
        )

    def _transform_collection(self, *, graph: Graph, omeka_collection) -> Optional[Collection]:
        if omeka_collection["url"] != "https://vcomeka.com/vccc/api/collections/1":
            return None  # Ignore all but  the "Costumes and Textiles" collection
        return CostumeCoreOmekaClassicTransformer._transform_collection(self, graph=graph,
                                                                        omeka_collection=omeka_collection)
