from typing import NamedTuple


class LabelItAnnotationValue(NamedTuple):
    details: str  # details: value
    height: float
    frame: int
    tool: int
    tool_label: str
    width: float
    x: float
    y: float
