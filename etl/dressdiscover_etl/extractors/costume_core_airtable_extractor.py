from paradicms_etl.extractors.airtable_extractor import AirtableExtractor


class CostumeCoreAirtableExtractor(AirtableExtractor):
    def __init__(self, **kwds):
        AirtableExtractor.__init__(
            self,
            tables=(
                "Images",
                "Names",
                "Objects",
                "Terms",
            ),
            **kwds
        )
