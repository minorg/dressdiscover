from typing import Optional

from paradicms_etl._pipeline import _Pipeline
from paradicms_etl.extractors.airtable_extractor import AirtableExtractor

from dressdiscover_etl.transformers.costume_core_airtable_transformer import (
    CostumeCoreAirtableTransformer,
)


class CostumeCoreAirtablePipeline(_Pipeline):
    def __init__(
        self, *, api_key: str, base_id: str, pipeline_id: Optional[str], **kwds
    ):
        if pipeline_id is None:
            pipeline_id = "costume-core-airtable-" + base_id
        _Pipeline.__init__(
            self,
            extractor=AirtableExtractor(
                api_key=api_key,
                base_id=base_id,
                pipeline_id=pipeline_id,
                tables=("Objects",),
                **kwds
            ),
            id=pipeline_id,
            transformer=CostumeCoreAirtableTransformer(pipeline_id=pipeline_id, **kwds),
        )

    @classmethod
    def add_arguments(cls, arg_parser):
        _Pipeline.add_arguments(arg_parser)
        arg_parser.add_argument("--api-key", required=True)
        arg_parser.add_argument("--base-id", required=True)
        arg_parser.add_argument("--pipeline-id")


if __name__ == "__main__":
    CostumeCoreAirtablePipeline.main()
