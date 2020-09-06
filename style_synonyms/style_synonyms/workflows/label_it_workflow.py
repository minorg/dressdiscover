from typing import Dict, List, NamedTuple, Tuple

from style_synonyms._workflow import _Workflow
from style_synonyms.models.classification import Classification
from style_synonyms.models.label_it_annotation import LabelItAnnotation
from style_synonyms.models.label_it_annotation_value import LabelItAnnotationValue


class LabelItWorkflow(_Workflow):
    def analyze(self, classifications: Tuple[Classification, ...]):
        for classification in classifications:
            print(classification.id)
            classification = classification._replace(
                annotations=self.__parse_annotations(classification.annotations)
            )
            print(classification.annotations)

    def __parse_annotation(self, annotation: Dict) -> LabelItAnnotation:
        if isinstance(annotation["value"], str):
            value = annotation["value"]
        else:
            values = []
            assert isinstance(annotation["value"], list)
            for value in annotation["value"]:
                # if isinstance(value, str):
                #     values.append(value)
                #     continue
                assert isinstance(value, dict), value
                details = value["details"]
                assert isinstance(details, list), details
                assert len(details) == 1, details
                details_0 = details[0]
                assert isinstance(details_0, dict), details
                assert len(details_0) == 1, details
                details_0_value = details_0["value"]
                values.append(
                    LabelItAnnotationValue(
                        details=details_0_value,
                        frame=int(value["frame"]),
                        height=value["height"],
                        tool=int(value["tool"]),
                        tool_label=value["tool_label"],
                        x=value["x"],
                        y=value["y"],
                        width=value["width"],
                    )
                )
            value = tuple(values)
        return LabelItAnnotation(
            task=annotation["task"], task_label=annotation["task_label"], value=value,
        )

    def __parse_annotations(
        self, annotations: List[Dict]
    ) -> Tuple[LabelItAnnotation, ...]:
        return tuple(self.__parse_annotation(annotation) for annotation in annotations)

    @property
    def id(self):
        return 14131
