import csv
from typing import Generator, Optional

from paradicms_etl._loader import _Loader
from paradicms_etl._model import _Model
from paradicms_etl.models.object import Object
from paradicms_etl.models.property_definitions import PropertyDefinitions

from dressdiscover_etl.costume_core import CostumeCore
from dressdiscover_etl.namespace import CC
from dressdiscover_etl.transformers.costume_core_property_extractor import (
    CostumeCorePropertyExtractor,
)


class CostumeCorePropertyExtractorCsvFileLoader(_Loader):
    def __init__(self, costume_core: Optional[CostumeCore] = None, **kwds):
        _Loader.__init__(self, **kwds)
        self.__extractor = CostumeCorePropertyExtractor(costume_core=costume_core)

    def load(self, *, models: Generator[_Model, None, None]):
        with open(
            self._loaded_data_dir_path
            / (self._pipeline_id + "-extracted-costume-core-properties.csv"),
            "w+",
            newline="\n",
        ) as csv_file:
            csv_writer = csv.DictWriter(
                csv_file,
                fieldnames=(
                    "object_uri",
                    "object_description",
                    "extracted_candidate",
                    "predicate",
                    "value",
                ),
            )
            csv_writer.writeheader()

            for model in models:
                if not isinstance(model, Object):
                    continue

                object_ = model
                description_properties = tuple(
                    property_
                    for property_ in object_.properties
                    if property_.property_definition_uri
                    == PropertyDefinitions.DESCRIPTION.uri
                )
                if not description_properties:
                    self._logger.info(
                        "object %s has no description, skipping", object_.uri
                    )
                    continue
                if len(description_properties) > 1:
                    self._logger.info(
                        "object %s has more than one description, skipping", object_.uri
                    )
                    continue

                description = description_properties[0].value.strip()
                if not description:
                    self._logger.info(
                        "object %s description is empty, skipping", object_.uri
                    )
                    continue

                for candidate in self.__extractor.extract_candidates_from_text(
                    description
                ):
                    extracted_properties = (
                        self.__extractor.extract_properties_from_candidate(candidate)
                    )
                    if not extracted_properties:
                        csv_writer.writerow(
                            {
                                "object_description": description,
                                "object_uri": str(object_.uri),
                                "extracted_candidate": candidate,
                            }
                        )
                        continue
                    for extracted_property in extracted_properties:
                        csv_writer.writerow(
                            {
                                "object_description": description,
                                "object_uri": str(object_.uri),
                                "extracted_candidate": candidate,
                                "predicate": str(
                                    extracted_property.property_definition_uri
                                ),
                                "value": extracted_property.value,
                            }
                        )
                for assigned_property in object_.properties:
                    if not str(assigned_property.property_definition_uri).startswith(
                        str(CC)
                    ):
                        continue
                    csv_writer.writerow(
                        {
                            "object_description": description.encode(
                                "ascii", "replace"
                            ).decode("ascii"),
                            "object_uri": str(object_.uri),
                            "predicate": str(assigned_property.property_definition_uri),
                            "value": assigned_property.value.encode(
                                "ascii", "replace"
                            ).decode("ascii"),
                        }
                    )
