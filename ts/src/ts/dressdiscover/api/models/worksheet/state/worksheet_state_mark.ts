import { WorksheetFeatureId } from "../worksheet_feature_id";
import { WorksheetFeatureSetId } from "../worksheet_feature_set_id";
import { WorksheetStateId } from "./worksheet_state_id";

export class WorksheetStateMark {
    constructor(kwds: {worksheetStateId: WorksheetStateId, featureId?: WorksheetFeatureId, featureSetId?: WorksheetFeatureSetId, review?: boolean}) {
        this.worksheetStateIdPrivate = WorksheetStateMark.validateWorksheetStateId(kwds.worksheetStateId);
        if (kwds.featureId != null) {
            this.featureIdPrivate = WorksheetStateMark.validateFeatureId(kwds.featureId);
        } else {
            this.featureIdPrivate = undefined;
        }
        if (kwds.featureSetId != null) {
            this.featureSetIdPrivate = WorksheetStateMark.validateFeatureSetId(kwds.featureSetId);
        } else {
            this.featureSetIdPrivate = undefined;
        }
        if (kwds.review != null) {
            this.reviewPrivate = WorksheetStateMark.validateReview(kwds.review);
        } else {
            this.reviewPrivate = undefined;
        }
    }

    get worksheetStateId(): WorksheetStateId {
        return this.worksheetStateIdPrivate;
    }

    set worksheetStateId(worksheetStateId: WorksheetStateId) {
        this.worksheetStateIdPrivate = WorksheetStateMark.validateWorksheetStateId(worksheetStateId);
    }

    get featureId(): WorksheetFeatureId | undefined {
        return this.featureIdPrivate;
    }

    set featureId(featureId: WorksheetFeatureId | undefined) {
        this.featureIdPrivate = WorksheetStateMark.validateFeatureId(featureId);
    }

    get featureSetId(): WorksheetFeatureSetId | undefined {
        return this.featureSetIdPrivate;
    }

    set featureSetId(featureSetId: WorksheetFeatureSetId | undefined) {
        this.featureSetIdPrivate = WorksheetStateMark.validateFeatureSetId(featureSetId);
    }

    get review(): boolean | undefined {
        return this.reviewPrivate;
    }

    set review(review: boolean | undefined) {
        this.reviewPrivate = WorksheetStateMark.validateReview(review);
    }

    public deepCopy(): WorksheetStateMark {
        return new WorksheetStateMark({ worksheetStateId: this.worksheetStateId, featureId: this.featureId, featureSetId: this.featureSetId, review: this.review });
    }

    public equals(other: WorksheetStateMark): boolean {
        if (!(this.worksheetStateId.equals(other.worksheetStateId))) {
            return false;
        }

        if (!((!((typeof (this.featureId)) === "undefined") && !((typeof (other.featureId)) === "undefined")) ? ((this.featureId as WorksheetFeatureId).equals((other.featureId as WorksheetFeatureId))) : (((typeof (this.featureId)) === "undefined") && ((typeof (other.featureId)) === "undefined")))) {
            return false;
        }

        if (!((!((typeof (this.featureSetId)) === "undefined") && !((typeof (other.featureSetId)) === "undefined")) ? ((this.featureSetId as WorksheetFeatureSetId).equals((other.featureSetId as WorksheetFeatureSetId))) : (((typeof (this.featureSetId)) === "undefined") && ((typeof (other.featureSetId)) === "undefined")))) {
            return false;
        }

        if (!((!((typeof (this.review)) === "undefined") && !((typeof (other.review)) === "undefined")) ? ((this.review as boolean) === (other.review as boolean)) : (((typeof (this.review)) === "undefined") && ((typeof (other.review)) === "undefined")))) {
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
        return new WorksheetStateMark({worksheetStateId, featureId, featureSetId, review});
    }

    public toJsonObject(): any {
        const json: {[index: string]: any} = {};
        json.worksheet_state_id = this.worksheetStateId.toString();
        if (this.featureId != null) {
            json.feature_id = this.featureId.toString();
        }
        if (this.featureSetId != null) {
            json.feature_set_id = this.featureSetId.toString();
        }
        if (this.review != null) {
            json.review = this.review;
        }
        return json;
    }

    public toString(): string {
        return "WorksheetStateMark(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): any {
        const json: {[index: string]: any} = {};
        json.worksheet_state_id = this.worksheetStateId.toString();
        if (this.featureId != null) {
            json.feature_id = this.featureId.toString();
        }
        if (this.featureSetId != null) {
            json.feature_set_id = this.featureSetId.toString();
        }
        if (this.review != null) {
            json.review = this.review;
        }
        return json;
    }

    private static validateFeatureId(featureId: WorksheetFeatureId | undefined): WorksheetFeatureId | undefined {
        return featureId;
    }

    private static validateFeatureSetId(featureSetId: WorksheetFeatureSetId | undefined): WorksheetFeatureSetId | undefined {
        return featureSetId;
    }

    private static validateReview(review: boolean | undefined): boolean | undefined {
        if (review != null) {
            if (!review) {
                throw new RangeError("review is false");
            }
        }
        return review;
    }

    private static validateWorksheetStateId(worksheetStateId: WorksheetStateId): WorksheetStateId {
        if (worksheetStateId == null) {
            throw new RangeError("worksheetStateId is null or undefined");
        }
        return worksheetStateId;
    }

    private featureIdPrivate?: WorksheetFeatureId;

    private featureSetIdPrivate?: WorksheetFeatureSetId;

    private reviewPrivate?: boolean;

    private worksheetStateIdPrivate: WorksheetStateId;
}
