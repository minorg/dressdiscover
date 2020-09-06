from typing import NamedTuple, Optional


class LabelItSubject(NamedTuple):
    description: Optional[str]
    file_name: str
    id: int
    title: str
