from typing import NamedTuple

from style_synonyms.models.bounding_box import BoundingBox


class LabelItAnnotationValue(NamedTuple):
    details: str  # details: value
    height: float
    frame: int
    tool: int
    tool_label: str
    width: float
    x: float  # Top-left x
    y: float  # Top-left y

    @property
    def bounding_box(self) -> BoundingBox:
        return BoundingBox(
            llx=self.x, lly=self.y - self.height, urx=self.x + self.width, ury=self.y
        )
