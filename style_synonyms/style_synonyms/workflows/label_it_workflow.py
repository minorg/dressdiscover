import csv
import itertools
import json
from typing import Dict, List, NamedTuple, Tuple

from style_synonyms._workflow import _Workflow
from style_synonyms.models.classification import Classification
from style_synonyms.models.label_it_annotation import LabelItAnnotation
from style_synonyms.models.label_it_annotation_value import LabelItAnnotationValue
from style_synonyms.models.label_it_subject import LabelItSubject


class LabelItWorkflow(_Workflow):
    __IOU_THRESHOLD = 0.1

    def analyze(self, classifications: Tuple[Classification, ...]):
        classifications = self.__parse_classifications(classifications)

        subjects_by_id = {}
        classifications_by_subject_id = {}
        for classification in classifications:
            assert len(classification.subject_data) == 1
            subject = classification.subject_data[0]
            classifications_by_subject_id.setdefault(subject.id, []).append(
                classification
            )
            subjects_by_id[subject.id] = subject

        with open("label-it-overlap.csv", "w+", newline="") as csv_file:
            csv_writer = csv.DictWriter(
                csv_file,
                fieldnames=(
                    "subject_id",
                    "subject_title",
                    "iou",
                    "left_classification_id",
                    "right_classification_id",
                    "left_annotation_value",
                    "right_annotation_value",
                ),
            )
            csv_writer.writeheader()

            for (
                subject_id,
                subject_classifications,
            ) in classifications_by_subject_id.items():
                if len(subject_classifications) == 1:
                    continue

                bounding_box_annotation_values = []
                for classification in subject_classifications:
                    for annotation in classification.annotations:
                        if isinstance(annotation.value, str):
                            continue
                        for annotation_value in annotation.value:
                            bounding_box_annotation_values.append(
                                (classification, annotation_value)
                            )

                for (left, right) in itertools.combinations(
                    bounding_box_annotation_values, 2
                ):
                    left_classification, left_bounding_box_annotation_value = left
                    right_classification, right_bounding_box_annotation_value = right

                    if left_classification.id == right_classification.id:
                        continue
                    if id(left_bounding_box_annotation_value) == id(
                        right_bounding_box_annotation_value
                    ):
                        continue

                    iou = left_bounding_box_annotation_value.bounding_box.intersection_over_union(
                        right_bounding_box_annotation_value.bounding_box
                    )
                    if iou < self.__IOU_THRESHOLD:
                        continue
                    csv_writer.writerow(
                        {
                            "subject_id": str(subject_id),
                            "subject_title": subjects_by_id[subject_id].title,
                            "iou": str(iou),
                            "left_classification_id": str(left_classification.id),
                            "right_classification_id": str(right_classification.id),
                            "left_annotation_value": json.dumps(
                                left_bounding_box_annotation_value._asdict()
                            ),
                            "right_annotation_value": json.dumps(
                                right_bounding_box_annotation_value._asdict()
                            ),
                        }
                    )

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

    def __parse_classifications(
        self, classifications: Tuple[Classification, ...]
    ) -> Tuple[Classification, ...]:
        return tuple(
            classification._replace(
                annotations=self.__parse_annotations(classification.annotations),
                subject_data=self.__parse_subjects(classification.subject_data),
            )
            for classification in classifications
        )

    def __parse_subject(self, id: int, subject: Dict) -> LabelItSubject:
        def get_optional_value(*keys: Tuple[str, ...]):
            for key in keys:
                value = subject.get(key)
                if value is not None:
                    return value
            return None

        def get_required_value(*keys: Tuple[str, ...]):
            value = get_optional_value(*keys)
            if value is not None:
                return value
            else:
                raise ValueError(
                    f"missing {keys[0]} from subject: {json.dumps(subject)}"
                )

        return LabelItSubject(
            description=get_optional_value("Dublin Core:Description"),
            file_name=get_required_value("file", "Filename"),
            id=id,
            title=get_required_value("Title", "Dublin Core:Title"),
        )

    def __parse_subjects(self, subject_data: Dict) -> Tuple[LabelItSubject, ...]:
        return tuple(
            self.__parse_subject(id=subject_id, subject=subject)
            for subject_id, subject in subject_data.items()
        )

    @property
    def id(self):
        return 14131
