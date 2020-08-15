from pathlib import Path
from typing import Tuple

from paradicms_etl._loader import _Loader
from paradicms_etl.loaders.rdf_file_loader import RdfFileLoader

from dressdiscover_etl.models.costume_core_predicate import CostumeCorePredicate
from dressdiscover_etl.models.costume_core_term import CostumeCoreTerm
from dressdiscover_etl.path import DATA_DIR_PATH


class CostumeCoreLoader(_Loader):
    def __init__(self, **kwds):
        from .costume_core_pipeline import CostumeCorePipeline
        _Loader.__init__(self, data_dir_path=DATA_DIR_PATH, pipeline_id=CostumeCorePipeline.ID, **kwds)
        self.__ttl_file_loader = RdfFileLoader(pipeline_id=CostumeCorePipeline.ID, format="ttl", **kwds)
        self.__xml_file_loader = RdfFileLoader(pipeline_id=CostumeCorePipeline.ID, format="xml", **kwds)

    def load(self, *, force: bool, predicates: Tuple[CostumeCorePredicate, ...], terms: Tuple[CostumeCoreTerm, ...]):
        self.__ttl_file_loader.load(force=force)
        self.__xml_file_loader.load(force=force)

        models_dir_path = Path(__file__).parent.parent.parent / "models"
        with open(models_dir_path / "costume_core_predicates.py", "w+") as predicates_py_file:
            print('from .costume_core_predicate import CostumeCorePredicate', file=predicates_py_file)
            print(file=predicates_py_file)
            for predicate in predicates:
                print(f"{predicate.id} = {predicate.replace(terms=None)}", file=predicates_py_file)
            print(f"COSTUME_CORE_PREDICATES = ({', '.join(predicate.id for predicate in predicates)})",
                  file=predicates_py_file)

        with open(models_dir_path / "costume_core_terms.py", "w+") as terms_py_file:
            print('from .costume_core_description import CostumeCoreDescription', file=terms_py_file)
            print('from .costume_core_rights import CostumeCoreRights', file=terms_py_file)
            print('from .costume_core_term import CostumeCoreTerm', file=terms_py_file)
            print(file=terms_py_file)
            for term in terms:
                print(f"{term.id} = {term}", file=terms_py_file)
            print(f"COSTUME_CORE_TERMS = ({', '.join(term.id for term in terms)})", file=terms_py_file)
