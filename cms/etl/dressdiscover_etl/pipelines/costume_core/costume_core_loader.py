from pathlib import Path
from typing import Tuple

from paradicms_etl.pipelines._loader import _Loader
from paradicms_etl.pipelines.file_loader import FileLoader
from paradicms_etl.pipelines.pipeline_storage import PipelineStorage
from rdflib import Graph

from dressdiscover_etl.models.costume_core_predicate import CostumeCorePredicate
from dressdiscover_etl.models.costume_core_term import CostumeCoreTerm


class CostumeCoreLoader(_Loader):
    def __init__(self, **kwds):
        from .costume_core_pipeline import CostumeCorePipeline
        _Loader.__init__(self, pipeline_id=CostumeCorePipeline.ID, **kwds)
        self.__ttl_file_loader = FileLoader(pipeline_id=CostumeCorePipeline.ID, format="ttl", **kwds)
        self.__xml_file_loader = FileLoader(pipeline_id=CostumeCorePipeline.ID, format="xml", **kwds)

    def load(self, *, force: bool, graph: Graph, predicates: Tuple[CostumeCorePredicate, ...], storage: PipelineStorage,
             terms: Tuple[CostumeCoreTerm, ...]):
        self.__ttl_file_loader.load(force=force, graph=graph, storage=storage)
        self.__xml_file_loader.load(force=force, graph=graph, storage=storage)

        model_dir_path = Path(__file__).parent.parent.parent / "model"
        with open(model_dir_path / "costume_core_predicates.py", "w+") as predicates_py_file:
            print('from .costume_core_predicate import CostumeCorePredicate', file=predicates_py_file)
            print(file=predicates_py_file)
            for predicate in predicates:
                print(f"{predicate.id} = {predicate}", file=predicates_py_file)
            print(f"COSTUME_CORE_PREDICATES = ({', '.join(predicate.id for predicate in predicates)})",
                  file=predicates_py_file)

        with open(model_dir_path / "costume_core_terms.py", "w+") as terms_py_file:
            print('from .costume_core_description import CostumeCoreDescription', file=terms_py_file)
            print('from .costume_core_rights import CostumeCoreRights', file=terms_py_file)
            print('from .costume_core_term import CostumeCoreTerm', file=terms_py_file)
            print(file=terms_py_file)
            for term in terms:
                print(f"{term.id} = {term}", file=terms_py_file)
            print(f"COSTUME_CORE_TERMS = ({', '.join(term.id for term in terms)})", file=terms_py_file)
