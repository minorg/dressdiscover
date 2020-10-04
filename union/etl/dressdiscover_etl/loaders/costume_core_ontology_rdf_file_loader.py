from paradicms_etl.loaders.rdf_file_loader import RdfFileLoader

from dressdiscover_etl.models.costume_core_predicate import CostumeCorePredicate
from dressdiscover_etl.models.costume_core_term import CostumeCoreTerm


class CostumeCoreOntologyRdfFileLoader(RdfFileLoader):
    def _flush(self, models):
        RdfFileLoader._flush(
            self,
            tuple(
                model
                for model in models
                if isinstance(model, (CostumeCorePredicate, CostumeCoreTerm))
            ),
        )
