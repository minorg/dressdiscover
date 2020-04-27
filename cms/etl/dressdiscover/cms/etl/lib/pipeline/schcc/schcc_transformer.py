import csv
from pathlib import Path
from typing import Dict, List, Optional

from paradicms.etl.lib.model.collection import Collection
from paradicms.etl.lib.model.institution import Institution
from paradicms.etl.lib.model.object import Object
from paradicms.etl.lib.namespace import CMS, DCMITYPE, VRA
from paradicms.etl.lib.pipeline.csv._csv_file_transformer import _CsvFileTransformer
from rdflib import Graph, Literal, URIRef
from rdflib.namespace import DCTERMS, XSD

from dressdiscover.cms.etl.lib.model import costume_core_predicates
from dressdiscover.cms.etl.lib.model.costume_core_term import CostumeCoreTerm
from dressdiscover.cms.etl.lib.model.costume_core_terms_by_features import COSTUME_CORE_TERMS_BY_FEATURES
from dressdiscover.cms.etl.lib.namespace import bind_namespaces


class SchccTransformer(_CsvFileTransformer):
    class __SchccObject(Object):
        def __init__(self, *, csv_row: Dict[str, str],
                     graph: Graph):
            int(csv_row["SSID"])
            Object.__init__(self, graph=graph, rdf_type=CMS.Object,
                            uri=URIRef("urn:sharedshelf:schcc:" + csv_row["SSID"]))
            self.__csv_row = csv_row.copy()
            self.owner = CMS.inherit

            self.__transform(multi=False, csv_column_key="Alternative Title",
                             property=DCTERMS.alternative)
            self.__csv_row.pop("Cataloguer With Date", None)  # Ignore
            self.__transform(multi=False, csv_column_key="Classification",
                             property=URIRef(costume_core_predicates.classification.uri),
                             costume_core_terms=COSTUME_CORE_TERMS_BY_FEATURES["classification"])
            self.__transform(multi=False, csv_column_key="Collar", property=URIRef(costume_core_predicates.collar.uri),
                             costume_core_terms=COSTUME_CORE_TERMS_BY_FEATURES["collar"])
            self.__transform(multi=False, csv_column_key="Color Main",
                             property=URIRef(costume_core_predicates.color.uri),
                             costume_core_terms=COSTUME_CORE_TERMS_BY_FEATURES["color"])
            self.__transform(multi=False, csv_column_key="Color Secondary",
                             property=URIRef(costume_core_predicates.color.uri),
                             costume_core_terms=COSTUME_CORE_TERMS_BY_FEATURES["color"])
            self.__transform(multi=False, csv_column_key="Condition Term",
                             property=URIRef(costume_core_predicates.condition.uri),
                             costume_core_terms=COSTUME_CORE_TERMS_BY_FEATURES["condition"])
            self.__transform(multi=False, csv_column_key="Creator", property=DCTERMS.creator)
            self.__transform(multi=True, csv_column_key="Culture",
                             property=URIRef(costume_core_predicates.culture.uri))
            self.__transform(multi=False, csv_column_key="Date", property=DCTERMS.date)
            for (date_csv_column_key, date_property) in (
                    ("Date Earliest", VRA.earliestDate),
                    ("Date Latest", VRA.latestDate),
            ):
                date_value = self.__csv_row.pop(date_csv_column_key, None)
                if not date_value:
                    continue
                date_value = int(date_value)
                self.resource.add(date_property, Literal(date_value, datatype=XSD.int))
            self.__transform(multi=False, csv_column_key="Description", property=DCTERMS.description)
            self.__csv_row.pop("Description Autofill", None)  # Created from other columns
            self.__transform(multi=True, csv_column_key="Dress Type",
                             property=URIRef(costume_core_predicates.dressType.uri),
                             costume_core_terms=COSTUME_CORE_TERMS_BY_FEATURES["dressType"])
            # Skip Donor
            self.__transform(multi=True, csv_column_key="Function",
                             property=URIRef(costume_core_predicates.function.uri),
                             costume_core_terms=COSTUME_CORE_TERMS_BY_FEATURES["function"])
            self.__transform(multi=False, csv_column_key="Gender",
                             property=URIRef(costume_core_predicates.gender.uri),
                             costume_core_terms=COSTUME_CORE_TERMS_BY_FEATURES["gender"])
            self.__transform(multi=False, csv_column_key="Grain",
                             property=URIRef(costume_core_predicates.grain.uri))
            self.__csv_row.pop("Holding Institution", None)  # Handled in collection/institution transform
            self.__transform(multi=False, csv_column_key="Identifier", property=DCTERMS.identifier)
            # Skip Label
            self.__transform(multi=True, csv_column_key="Life Stages",
                             property=URIRef(costume_core_predicates.lifeStages.uri),
                             costume_core_terms=COSTUME_CORE_TERMS_BY_FEATURES["lifeStages"])
            self.__csv_row.pop("Measurements Display", None)  # Ignore for now, no predicates
            self.__csv_row.pop("Measurements Autofill", None)  # Created from other columns
            self.__transform(multi=True, csv_column_key="Medium", property=DCTERMS.medium)
            self.__transform(multi=False, csv_column_key="Neckline",
                             property=URIRef(costume_core_predicates.neckline.uri),
                             costume_core_terms=COSTUME_CORE_TERMS_BY_FEATURES["neckline"])
            self.__transform(multi=True, csv_column_key="Technique",
                             property=URIRef(costume_core_predicates.technique.uri),
                             costume_core_terms=COSTUME_CORE_TERMS_BY_FEATURES["technique"])
            self.__transform(multi=True, csv_column_key="Region",
                             property=URIRef(costume_core_predicates.region.uri))
            self.__csv_row.pop("Rights", None)  # Handled in collection/institution transform
            self.__csv_row.pop("Rights Holder", None)  # Handled in collection/institution transform
            # Shared Shelf fields
            self.__csv_row.pop("SSID")
            self.__csv_row.pop("Source ID[66858]", None)
            self.__csv_row.pop("SC Accession[66859]", None)
            self.__csv_row.pop("SC Batch Number[66863]", None)
            self.__csv_row.pop("SC Order[66860]", None)
            self.__csv_row.pop("SC Work Number[66862]", None)
            self.__transform(multi=False, csv_column_key="Skirt Type",
                             property=URIRef(costume_core_predicates.skirtType.uri),
                             costume_core_terms=COSTUME_CORE_TERMS_BY_FEATURES["skirtType"])
            self.__transform(multi=False, csv_column_key="Skirt Length",
                             property=URIRef(costume_core_predicates.skirtLength.uri),
                             costume_core_terms=COSTUME_CORE_TERMS_BY_FEATURES["skirtLength"])
            self.__transform(multi=False, csv_column_key="Sleeve Type",
                             property=URIRef(costume_core_predicates.sleeveType.uri),
                             costume_core_terms=COSTUME_CORE_TERMS_BY_FEATURES["sleeveType"])
            self.__transform(multi=False, csv_column_key="Sleeve Length",
                             property=URIRef(costume_core_predicates.sleeveLength.uri),
                             costume_core_terms=COSTUME_CORE_TERMS_BY_FEATURES["sleeveLength"])
            self.__transform(multi=True, csv_column_key="Style Period",
                             property=URIRef(costume_core_predicates.period.uri))
            self.__transform(multi=False, csv_column_key="Subject", property=DCTERMS.subject)
            self.__transform(multi=False, csv_column_key="Title", property=DCTERMS.title)
            type_ = self.__csv_row.pop("Type")
            assert type_ == "Physical object", type_
            self.resource.add(DCTERMS.type, DCMITYPE.PhysicalObject)
            self.__transform(multi=False, csv_column_key="Waistline",
                             property=URIRef(costume_core_predicates.waistline.uri),
                             costume_core_terms=COSTUME_CORE_TERMS_BY_FEATURES["waistline"])
            self.__transform(multi=False, csv_column_key="Work Type",
                             property=DCTERMS.type,
                             costume_core_terms=COSTUME_CORE_TERMS_BY_FEATURES["workType"])  # CC also has a workType

            for key, value in self.__csv_row.items():
                print(self.uri, ": unaccounted", key, "=", value)

        def __transform(self, *, csv_column_key: str, multi: bool, property: URIRef,
                        costume_core_terms: Optional[List[CostumeCoreTerm]] = None):
            value = self.__csv_row.pop(csv_column_key, None)
            if not value:
                return
            if multi:
                values = []
                for value in value.split("|"):
                    value = value.strip()
                    if not value:
                        continue
                    values.append(value)
            else:
                assert "|" not in value
                values = (value,)
            for value in values:
                self.resource.add(property, Literal(value))
                if costume_core_terms is not None:
                    for costume_core_term in costume_core_terms:
                        if costume_core_term.display_name_en == value:
                            self.resource.add(property, URIRef(costume_core_term.uri))
                            break

    def _transform_csv_file(self, *, csv_file_path: Path, graph: Graph) -> None:
        bind_namespaces(graph.namespace_manager)

        collection = None
        institution = None

        with open(csv_file_path, "r", encoding="utf-8") as csv_file:
            for csv_row in csv.DictReader(csv_file):
                csv_row = self._strip_csv_row(csv_row)
                if not csv_row:
                    continue

                if institution is None:
                    assert collection is None

                    institution = Institution(graph=graph, uri=URIRef("http://www.smith.edu/"))
                    institution.name = "Smith College"
                    institution.owner = CMS.public

                    collection = Collection(graph=graph, uri=URIRef("http://schistoricclothing.com/"))
                    collection.owner = CMS.inherit
                    collection.title = csv_row["Holding Institution"]
                    collection.resource.add(DCTERMS.rights, URIRef(csv_row["Rights"]))
                    collection.resource.add(DCTERMS.rights,
                                            Literal(
                                                csv_row["Rights Holder"]))
                    collection.resource.add(DCTERMS.rightsHolder, Literal(
                        "Costume Department, Theatre Department, Smith College, Northampton, Massachusetts USA"))
                else:
                    assert collection is not None

                object_ = self.__SchccObject(csv_row=csv_row, graph=graph)
                if object_.title is None:
                    continue
                collection.add_object(object_)

        institution.add_collection(collection)

        return graph
