import csv
from pathlib import Path
from typing import Dict

from paradicms.etl.lib.model.collection import Collection
from paradicms.etl.lib.model.institution import Institution
from paradicms.etl.lib.model.object import Object
from paradicms.etl.lib.namespace import CMS, DCMITYPE, VRA
from paradicms.etl.lib.pipeline.csv._csv_file_transformer import _CsvFileTransformer
from rdflib import Graph, Literal, URIRef
from rdflib.namespace import DCTERMS, XSD


class SchccTransformer(_CsvFileTransformer):
    class __SchccObject(Object):
        def __init__(self, *, csv_row: Dict[str, str], graph: Graph):
            int(csv_row["SSID"])
            Object.__init__(self, graph=graph, rdf_type=CMS.Object,
                            uri=URIRef("urn:sharedshelf:schcc:" + csv_row["SSID"]))
            self.__csv_row = csv_row.copy()
            self.owner = CMS.inherit

            self.__transform_single_value_literal_property(csv_column_key="Alternative Title",
                                                           property=DCTERMS.alternative)
            self.__csv_row.pop("Cataloguer With Date", None)  # Ignore
            self.__csv_row.pop("Classification")  # Same for all objects
            self.__transform_single_value_literal_property(csv_column_key="Creator", property=DCTERMS.creator)
            # self.__transform_multi_value_literal_property(csv_column_key="Culture", property=DCTERMS.coverage)
            self.__transform_single_value_literal_property(csv_column_key="Date", property=DCTERMS.date)
            for (date_csv_column_key, date_property) in (
                    ("Date Earliest", VRA.earliestDate),
                    ("Date Latest", VRA.latestDate),
            ):
                date_value = self.__csv_row.pop(date_csv_column_key, None)
                if not date_value:
                    continue
                date_value = int(date_value)
                self.resource.add(date_property, Literal(date_value, datatype=XSD.int))
            self.__transform_single_value_literal_property(csv_column_key="Description", property=DCTERMS.description)
            self.__csv_row.pop("Description Autofill", None)  # Created from other columns
            # Skip Donor
            # self.__transform_multi_value_literal_property(csv_column_key="Function",
            #                                               property=CMS.function)  # TODO: use Costume Core?
            self.__csv_row.pop("Gender", None)  # Only set to "womenswear"
            self.__csv_row.pop("Holding Institution", None)  # Handled in collection/institution transform
            self.__transform_single_value_literal_property(csv_column_key="Identifier", property=DCTERMS.identifier)
            # Skip Label
            # self.__transform_multi_value_literal_property(csv_column_key="Life Stages",
            #                                               property=DCTERMS.coverage)  # TODO: use Costume Core?
            # self.__transform_single_value_literal_property(csv_column_key="Measurements Display",
            #                                                property=DCTERMS["format"])  # TODO: use Costume Core?
            self.__csv_row.pop("Measurements Autofill", None)  # Created from other columns
            self.__transform_multi_value_literal_property(csv_column_key="Medium", property=DCTERMS.medium)
            # self.__transform_multi_value_literal_property(csv_column_key="Technique",
            #                                               property=CMS.technique)  # TODO: use Costume Core?
            # Skip Region
            self.__csv_row.pop("Rights", None)  # Handled in collection/institution transform
            self.__csv_row.pop("Rights Holder", None)  # Handled in collection/institution transform
            # Shared Shelf fields
            self.__csv_row.pop("SSID")
            self.__csv_row.pop("Source ID[66858]", None)
            self.__csv_row.pop("SC Accession[66859]", None)
            self.__csv_row.pop("SC Batch Number[66863]", None)
            self.__csv_row.pop("SC Order[66860]", None)
            self.__csv_row.pop("SC Work Number[66862]", None)
            # self.__transform_multi_value_literal_property(csv_column_key="Style Period", property=DCTERMS.coverage)
            self.__transform_single_value_literal_property(csv_column_key="Subject", property=DCTERMS.subject)
            self.__transform_single_value_literal_property(csv_column_key="Title", property=DCTERMS.title)
            type_ = self.__csv_row.pop("Type")
            assert type_ == "Physical object", type_
            self.resource.add(DCTERMS.type, DCMITYPE.PhysicalObject)
            self.__transform_single_value_literal_property(csv_column_key="Work Type", property=DCTERMS.type)

            for key, value in self.__csv_row.items():
                print(self.uri, ": unaccounted", key, "=", value)

        def __transform_multi_value_literal_property(self, *, csv_column_key: str, property: URIRef):
            value = self.__csv_row.pop(csv_column_key, None)
            if not value:
                return
            for value in value.split("|"):
                value = value.strip()
                if not value:
                    continue
                self.resource.add(property, Literal(value))

        def __transform_single_value_literal_property(self, *, csv_column_key: str, property: URIRef):
            value = self.__csv_row.pop(csv_column_key, None)
            if not value:
                return
            assert "|" not in value
            self.resource.add(property, Literal(value))

    def _transform_csv_file(self, *, csv_file_path: Path, graph: Graph) -> None:
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
                    collection.resource.add(DCTERMS.license, URIRef(csv_row["Rights"]))
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
