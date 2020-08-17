import dataclasses
from pathlib import Path
from typing import Generator, Tuple

from paradicms_etl._loader import _Loader
from paradicms_etl._model import _Model
from paradicms_etl.loaders.rdf_file_loader import RdfFileLoader

from dressdiscover_etl.models.costume_core_predicate import CostumeCorePredicate
from dressdiscover_etl.models.costume_core_term import CostumeCoreTerm


class CostumeCoreLoader(_Loader):
    def __init__(self, **kwds):
        _Loader.__init__(self, **kwds)
        self.__ttl_file_loader = RdfFileLoader(format="ttl", **kwds)
        self.__xml_file_loader = RdfFileLoader(format="xml", **kwds)

    def load(self, *, force: bool, models: Generator[_Model, None, None]):
        models_tuple = tuple(models)
        self.__ttl_file_loader.load(force=force, models=models_tuple)
        self.__xml_file_loader.load(force=force, models=models_tuple)

        models_dir_path = Path(__file__).parent.parent.parent / "models"
        with open(
            models_dir_path / "costume_core_predicates.py", "w+", encoding="ascii"
        ) as predicates_py_file:
            print(
                "from .costume_core_predicate import CostumeCorePredicate",
                file=predicates_py_file,
            )
            print(file=predicates_py_file)
            predicates = tuple(
                filter(
                    lambda model: isinstance(model, CostumeCorePredicate), models_tuple
                )
            )
            for predicate in predicates:
                print(
                    f"{predicate.id} = {dataclasses.replace(predicate, terms=None)}",
                    file=predicates_py_file,
                )
            print(
                f"COSTUME_CORE_PREDICATES = ({', '.join(predicate.id for predicate in predicates)})",
                file=predicates_py_file,
            )

        with open(
            models_dir_path / "costume_core_terms.py", "w+", encoding="ascii"
        ) as terms_py_file:
            print(
                "from .costume_core_description import CostumeCoreDescription",
                file=terms_py_file,
            )
            print(
                "from .costume_core_rights import CostumeCoreRights", file=terms_py_file
            )
            print("from .costume_core_term import CostumeCoreTerm", file=terms_py_file)
            print(file=terms_py_file)
            terms = tuple(
                filter(lambda model: isinstance(model, CostumeCoreTerm), models_tuple)
            )
            for term in terms:
                print(f"{term.id} = {term}", file=terms_py_file)
            print(
                f"COSTUME_CORE_TERMS = ({', '.join(term.id for term in terms)})",
                file=terms_py_file,
            )
