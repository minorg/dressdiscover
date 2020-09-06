from typing import Dict, NamedTuple, Optional


class Classification(NamedTuple):
    annotations: object
    created_at: str
    expert: Optional[str]
    gold_standard: bool
    id: int
    metadata: Dict
    subject_data: Dict
    subject_ids: str
    user_id: int
    user_ip: str
    user_name: str
    workflow_id: id
    workflow_name: str
    workflow_version: str
