from typing import NamedTuple


class BoundingBox(NamedTuple):
    llx: float  # Lower-left x
    lly: float  # Lower-left y
    urx: float  # Upper-right x
    ury: float  # Upper-right y

    def intersection_over_union(self, other_bounding_box) -> float:
        # https://gist.github.com/meyerjo/dd3533edc97c81258898f60d8978eddc
        x_a = max(self.llx, other_bounding_box.llx)
        y_a = max(self.lly, other_bounding_box.lly)
        x_b = min(self.urx, other_bounding_box.urx)
        y_b = min(self.ury, other_bounding_box.ury)
        intersection_area = max(0, x_b - x_a + 1) * max(0, y_b - y_a + 1)

        def bounding_box_area(bounding_box: BoundingBox):
            return (bounding_box.urx - bounding_box.llx + 1) * (
                bounding_box.ury - bounding_box.lly + 1
            )

        self_area = bounding_box_area(self)
        other_bounding_box_area = bounding_box_area(other_bounding_box)

        iou = intersection_area / (
            self_area + other_bounding_box_area - intersection_area
        )
        assert iou >= 0 and iou <= 1
        return iou
