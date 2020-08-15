from typing import Dict, Optional

from paradicms_etl.pipelines._extractor import _Extractor
from paradicms_etl.pipelines.pipeline_storage import PipelineStorage


class CostumeCoreExtractor(_Extractor):
    def extract(self, *, force: bool, storage: PipelineStorage) -> Optional[Dict[str, object]]:
        return {
            "cc_predicates_csv_file_path": self._download(
                from_url="https://docs.google.com/spreadsheets/d/13DwSzUZ5ZlQUKdG4fO_movGZp-BM4EHkWxKBz9Hi2YU/export?format=csv",
                force=force, storage=storage),
            "cc_terms_csv_file_path": self._download(
                from_url="https://docs.google.com/spreadsheets/d/1Rw-HiGN7Syr9MSTM3Hso8DqqMc3qZ3nyqypaiwfQbAw/export?format=csv",
                force=force, storage=storage),
        }
