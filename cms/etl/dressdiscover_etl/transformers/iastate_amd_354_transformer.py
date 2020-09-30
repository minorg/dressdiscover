import csv
from pathlib import Path
from typing import Dict, Optional

from paradicms_etl._transformer import _Transformer
from paradicms_etl.models.collection import Collection
from paradicms_etl.models.image import Image
from paradicms_etl.models.institution import Institution
from paradicms_etl.models.object import Object
from paradicms_etl.models.property import Property
from paradicms_etl.models.property_definitions import PropertyDefinitions
from paradicms_etl.models.rights import Rights
from paradicms_etl.models.rights_value import RightsValue
from paradicms_etl.utils import strip_csv_row
from rdflib import URIRef

from dressdiscover_etl.models import costume_core_predicates, costume_core_terms
from dressdiscover_etl.transformers.costume_core_property_definitions import (
    COSTUME_CORE_PROPERTY_DEFINITIONS,
)


class IastateAmd354Transformer(_Transformer):
    __URN_BASE = "urn:iastate_amd_354:"

    __INSTITUTION = Institution(
        name="Iowa State University", uri=URIRef("http://iastate.edu")
    )

    __COLLECTION = Collection(
        institution_uri=__INSTITUTION.uri,
        title="AMD 354 Images",
        uri=URIRef(__URN_BASE + "collection"),
    )

    __GENDERS = {
        "Men": costume_core_terms.CC00365,
        "Women": costume_core_terms.CC00364,
    }

    __LICENSES = {
        "CC BY-NC-SA 4.0": RightsValue(
            text="CC BY-NC-SA 4.0",
            uri="https://creativecommons.org/licenses/by-nc-sa/4.0/",
        ),
        "Creative Commons (CC0 1.0)": RightsValue(
            text="CC0 1.0", uri="https://creativecommons.org/publicdomain/zero/1.0/"
        ),
        "Digital image courtesy of the Getty's Open Content Program": RightsValue(
            text="Any use permitted",
            uri="https://www.getty.edu/about/whatwedo/opencontent.html",
        ),
        "Open Access": RightsValue(
            text="Any use permitted",
            uri="https://images.nga.gov/en/page/openaccess.html",
        ),
        "Public Domain": RightsValue(
            text="Public Domain",
            uri="https://creativecommons.org/publicdomain/mark/1.0/",
        ),
    }

    __RIGHTS_STATEMENTS = {
        "CC BY-NC-SA 4.0": RightsValue(
            text="In Copyright", uri="http://rightsstatements.org/vocab/InC/1.0/"
        ),
        "Creative Commons (CC0 1.0)": None,
        "Digital image courtesy of the Getty's Open Content Program": RightsValue(
            text="Digital image courtesy of the Getty's Open Content Program",
            uri="https://www.getty.edu/about/whatwedo/opencontent.html",
        ),
        "Open Access": RightsValue(
            text="National Gallery Open Access",
            uri="https://images.nga.gov/en/page/openaccess.html",
        ),
        "Public Domain": None,
    }

    def transform(self, *, file_path: Path):
        yield PropertyDefinitions.as_tuple()
        yield COSTUME_CORE_PROPERTY_DEFINITIONS
        yield self.__INSTITUTION
        yield self.__COLLECTION

        images_dir_path = file_path.parent / "AMD 354 Images"

        with open(file_path, encoding="utf-8") as csv_file:
            for csv_row_i, csv_row in enumerate(csv.DictReader(csv_file)):
                if csv_row_i == 0:
                    continue  # Instructions row
                yield from self.__transform_csv_row(
                    csv_row=csv_row, images_dir_path=images_dir_path
                )

    def __transform_csv_row(self, *, csv_row: Dict[str, str], images_dir_path: Path):
        csv_row = strip_csv_row(csv_row)

        image_number = int(csv_row.pop("Image Number"))
        self._logger.info("processing image number %d", image_number)

        try:
            image_file_name = csv_row.pop("File Name")
        except KeyError:
            self._logger.warning("image number %d has no file name", image_number)
            return
        image_file_path = images_dir_path / image_file_name
        if not image_file_path.is_file():
            raise ValueError(f"{image_file_path} does not exist")

        image_description = csv_row.pop("Image Description")
        image_license = csv_row.pop("Image License")
        image_source = csv_row.pop("Image Source")
        image_url = csv_row.pop("Image URL")
        object_source = csv_row.pop("Object Source")
        if object_source == "Same":
            object_source = image_source

        object_properties = []
        for key, property_uri in (
            ("Country of Origin", PropertyDefinitions.SPATIAL.uri),
        ):
            try:
                value = csv_row.pop(key)
            except KeyError:
                continue
            object_properties.append(Property(property_uri, value))

        gender = csv_row.pop("Men/Women/Children/Undetermined")
        if gender != "Undetermined":
            object_properties.append(
                Property(
                    URIRef(costume_core_predicates.gender.uri),
                    self.__GENDERS[gender].display_name_en,
                )
            )

        object_ = Object(
            abstract=image_description,
            collection_uris=(self.__COLLECTION.uri,),
            institution_uri=self.__INSTITUTION.uri,
            rights=Rights(
                holder=object_source,
                license=self.__LICENSES[image_license],
                statement=self.__RIGHTS_STATEMENTS[image_license],
            ),
            title=f"Image {image_number}",
            uri=URIRef(image_url),
        )
        yield object_

        image = Image(
            depicts_uri=object_.uri,
            institution_uri=self.__INSTITUTION.uri,
            rights=Rights(
                holder=image_source,
                license=self.__LICENSES[image_license],
                statement=self.__RIGHTS_STATEMENTS[image_license],
            ),
            uri=URIRef(image_url),
        )
        yield image

        for key, value in csv_row.items():
            self._logger.warning("unaccounted: %s = %s", key, value)

        return ()
