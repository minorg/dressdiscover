import csv
import json
from pathlib import Path
from typing import Generator

from style_synonyms.models.classification import Classification


class ClassificationsCsvParser:
    def parse_classifications_csv(
        self, classifications_csv_file_path: Path
    ) -> Generator[Classification, None, None]:
        with open(classifications_csv_file_path) as csv_file:
            for row in csv.DictReader(csv_file):
                yield Classification(
                    annotations=json.loads(row["annotations"]),
                    created_at=row["created_at"],
                    expert=row.get("expert"),
                    gold_standard=row.get("gold_standard") == "true",
                    id=int(row["classification_id"]),
                    metadata=json.loads(row["metadata"]),
                    subject_data=json.loads(row["subject_data"]),
                    subject_ids=row["subject_ids"],
                    user_id=int(row["user_id"]),
                    user_ip=row["user_ip"],
                    user_name=row["user_name"],
                    workflow_id=int(row["workflow_id"]),
                    workflow_name=row["workflow_name"],
                    workflow_version=row["workflow_version"],
                )
