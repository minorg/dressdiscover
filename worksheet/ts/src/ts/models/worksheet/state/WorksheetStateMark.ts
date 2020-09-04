import {WorksheetFeatureId} from "../WorksheetFeatureId";
import {WorksheetFeatureSetId} from "../WorksheetFeatureSetId";
import {WorksheetStateId} from "./WorksheetStateId";

export class WorksheetStateMark {
  constructor(kwds: {
    worksheetStateId: WorksheetStateId;
    featureId?: WorksheetFeatureId;
    featureSetId?: WorksheetFeatureSetId;
    review?: boolean;
  }) {
    this.worksheetStateId = WorksheetStateMark.validateWorksheetStateId(
      kwds.worksheetStateId
    );
    this.featureId = kwds.featureId != null ? kwds.featureId : undefined;
    this.featureSetId =
      kwds.featureSetId != null ? kwds.featureSetId : undefined;
    this.review = WorksheetStateMark.validateReview(kwds.review);
  }

  public deepCopy(): WorksheetStateMark {
    return new WorksheetStateMark({
      worksheetStateId: this.worksheetStateId,
      featureId: this.featureId,
      featureSetId: this.featureSetId,
      review: this.review,
    });
  }

  public equals(other: WorksheetStateMark): boolean {
    if (!this.worksheetStateId.equals(other.worksheetStateId)) {
      return false;
    }

    if (
      !(!(typeof this.featureId === "undefined") &&
      !(typeof other.featureId === "undefined")
        ? (this.featureId as WorksheetFeatureId).equals(
            other.featureId as WorksheetFeatureId
          )
        : typeof this.featureId === "undefined" &&
          typeof other.featureId === "undefined")
    ) {
      return false;
    }

    if (
      !(!(typeof this.featureSetId === "undefined") &&
      !(typeof other.featureSetId === "undefined")
        ? (this.featureSetId as WorksheetFeatureSetId).equals(
            other.featureSetId as WorksheetFeatureSetId
          )
        : typeof this.featureSetId === "undefined" &&
          typeof other.featureSetId === "undefined")
    ) {
      return false;
    }

    if (this.review !== other.review) {
      return false;
    }

    return true;
  }

  public static fromThryftJsonObject(json: any): WorksheetStateMark {
    let worksheetStateId: WorksheetStateId | undefined;
    let featureId: WorksheetFeatureId | undefined;
    let featureSetId: WorksheetFeatureSetId | undefined;
    let review: boolean | undefined;
    for (const fieldName in json) {
      if (fieldName === "worksheet_state_id") {
        worksheetStateId = WorksheetStateId.parse(json[fieldName]);
      } else if (fieldName === "feature_id") {
        featureId = WorksheetFeatureId.parse(json[fieldName]);
      } else if (fieldName === "feature_set_id") {
        featureSetId = WorksheetFeatureSetId.parse(json[fieldName]);
      } else if (fieldName === "review") {
        review = json[fieldName];
      }
    }
    if (worksheetStateId == null) {
      throw new TypeError("worksheetStateId is required");
    }
    return new WorksheetStateMark({
      worksheetStateId,
      featureId,
      featureSetId,
      review,
    });
  }

  public toJsonObject(): {
    feature_id: string | undefined;
    feature_set_id: string | undefined;
    review: boolean | undefined;
    worksheet_state_id: string;
  } {
    return {
      feature_id:
        this.featureId != null ? this.featureId.toString() : undefined,
      feature_set_id:
        this.featureSetId != null ? this.featureSetId.toString() : undefined,
      review: this.review != null ? this.review : undefined,
      worksheet_state_id: this.worksheetStateId.toString(),
    };
  }

  public toString(): string {
    return (
      "WorksheetStateMark(" + JSON.stringify(this.toThryftJsonObject()) + ")"
    );
  }

  public toThryftJsonObject(): {
    feature_id: string | undefined;
    feature_set_id: string | undefined;
    review: boolean | undefined;
    worksheet_state_id: string;
  } {
    return {
      feature_id:
        this.featureId != null ? this.featureId.toString() : undefined,
      feature_set_id:
        this.featureSetId != null ? this.featureSetId.toString() : undefined,
      review: this.review != null ? this.review : undefined,
      worksheet_state_id: this.worksheetStateId.toString(),
    };
  }

  private static validateReview(
    review: boolean | undefined
  ): boolean | undefined {
    if (review != null) {
      if (!review) {
        throw new RangeError("review is false");
      }
    }
    return review;
  }

  private static validateWorksheetStateId(
    worksheetStateId: WorksheetStateId
  ): WorksheetStateId {
    if (worksheetStateId == null) {
      throw new RangeError("worksheetStateId is null or undefined");
    }
    return worksheetStateId;
  }

  public readonly featureId?: WorksheetFeatureId;
  public readonly featureSetId?: WorksheetFeatureSetId;
  public readonly review?: boolean;
  public readonly worksheetStateId: WorksheetStateId;
}
