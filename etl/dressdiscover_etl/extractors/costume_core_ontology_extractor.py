from paradicms_etl.extractors.airtable_extractor import AirtableExtractor


class CostumeCoreOntologyExtractor(AirtableExtractor):
    def __init__(self, **kwds):
        AirtableExtractor.__init__(
            self,
            base_id="appfEYYWWn3CqSAxW",
            tables=(
                "feature_values",
                "features",
                "feature_sets",
                "images",
                "rights_licenses",
            ),
            **kwds
        )
