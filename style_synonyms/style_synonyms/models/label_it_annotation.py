from typing import NamedTuple, Tuple, Union

from style_synonyms.models.label_it_annotation_value import LabelItAnnotationValue


class LabelItAnnotation(NamedTuple):
    task: str
    task_label: str
    value: Union[str, Tuple[LabelItAnnotationValue, ...]]
