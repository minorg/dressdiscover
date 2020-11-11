import dataclasses

from paradicms_etl.models.rights import Rights
from paradicms_etl.models.rights_value import RightsValue
from paradicms_etl.transformers.luna_transformer import LunaTransformer


class UcDaapVacTransformer(LunaTransformer):
    def _transform_institution(self, **kwds):
        institution = LunaTransformer._transform_institution(self, **kwds)
        assert institution.rights is None
        return dataclasses.replace(
            institution,
            rights=Rights(
                license=RightsValue(
                    text="Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License",
                    uri="http://creativecommons.org/licenses/by-nc-nd/4.0/",
                ),
                statement=RightsValue(
                    text="Copyright University of Cincinnati Libraries"
                ),
            ),
        )
