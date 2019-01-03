import { WorksheetFeatureId } from "./worksheet_feature_id";
import { WorksheetFeatureSetId } from "./worksheet_feature_set_id";
import { WorksheetStateId } from "./worksheet_state_id";

export class WorksheetStateMark {
    constructor(kwds: {worksheetStateId: WorksheetStateId, featureId?: WorksheetFeatureId, featureSetId?: WorksheetFeatureSetId, review?: boolean}) {
        this._worksheetStateId = WorksheetStateMark._validateWorksheetStateId(kwds.worksheetStateId);
        if (kwds.featureId != null) {
            this._featureId = WorksheetStateMark._validateFeatureId(kwds.featureId);
        } else {
            this._featureId = undefined;
        }
        if (kwds.featureSetId != null) {
            this._featureSetId = WorksheetStateMark._validateFeatureSetId(kwds.featureSetId);
        } else {
            this._featureSetId = undefined;
        }
        if (kwds.review != null) {
            this._review = WorksheetStateMark._validateReview(kwds.review);
        } else {
            this._review = undefined;
        }
    }

    get worksheetStateId(): WorksheetStateId {
        return this._worksheetStateId;
    }

    set worksheetStateId(worksheetStateId: WorksheetStateId) {
        this._worksheetStateId = WorksheetStateMark._validateWorksheetStateId(worksheetStateId);
    }

    get featureId(): WorksheetFeatureId | undefined {
        return this._featureId;
    }

    set featureId(featureId: WorksheetFeatureId | undefined) {
        this._featureId = WorksheetStateMark._validateFeatureId(featureId);
    }

    get featureSetId(): WorksheetFeatureSetId | undefined {
        return this._featureSetId;
    }

    set featureSetId(featureSetId: WorksheetFeatureSetId | undefined) {
        this._featureSetId = WorksheetStateMark._validateFeatureSetId(featureSetId);
    }

    get review(): boolean | undefined {
        return this._review;
    }

    set review(review: boolean | undefined) {
        this._review = WorksheetStateMark._validateReview(review);
    }

    private static _validateFeatureId(featureId: WorksheetFeatureId | undefined): WorksheetFeatureId | undefined {
        if (featureId != null) {

        }
        return featureId;
    }

    private static _validateFeatureSetId(featureSetId: WorksheetFeatureSetId | undefined): WorksheetFeatureSetId | undefined {
        if (featureSetId != null) {

        }
        return featureSetId;
    }

    private static _validateReview(review: boolean | undefined): boolean | undefined {
        if (review != null) {
            if (!review) {
                throw new RangeError('review is false');
            }
        }
        return review;
    }

    private static _validateWorksheetStateId(worksheetStateId: WorksheetStateId): WorksheetStateId {
        if (worksheetStateId == null) {
            throw new RangeError('worksheetStateId is null or undefined');
        }
        return worksheetStateId;
    }

    deepCopy(): WorksheetStateMark {
        return new WorksheetStateMark({ worksheetStateId: this.worksheetStateId, featureId: this.featureId, featureSetId: this.featureSetId, review: this.review });
    }

    equals(other: WorksheetStateMark): boolean {
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

    static fromThryftJsonObject(json: any): WorksheetStateMark {
        let worksheetStateId: WorksheetStateId | undefined;
        let featureId: WorksheetFeatureId | undefined;
        let featureSetId: WorksheetFeatureSetId | undefined;
        let review: boolean | undefined;
        for (let fieldName in json) {
            if (fieldName == "worksheet_state_id") {
                worksheetStateId = WorksheetStateId.parse(json[fieldName]);
            } else if (fieldName == "feature_id") {
                featureId = WorksheetFeatureId.parse(json[fieldName]);
            } else if (fieldName == "feature_set_id") {
                featureSetId = WorksheetFeatureSetId.parse(json[fieldName]);
            } else if (fieldName == "review") {
                review = json[fieldName];
            }
        }
        if (worksheetStateId == null) {
            throw new TypeError('worksheetStateId is required');
        }
        return new WorksheetStateMark({worksheetStateId: worksheetStateId, featureId: featureId, featureSetId: featureSetId, review: review});
    }

    toJsonObject(): any {
        const json: {[index: string]: any} = {};
        json["worksheet_state_id"] = this.worksheetStateId.toString();
        if (this.featureId != null) {
            json["feature_id"] = this.featureId.toString();
        }
        if (this.featureSetId != null) {
            json["feature_set_id"] = this.featureSetId.toString();
        }
        if (this.review != null) {
            json["review"] = this.review;
        }
        return json;
    }

    toString(): string {
        return "WorksheetStateMark(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    toThryftJsonObject(): any {
        const json: {[index: string]: any} = {};
        json["worksheet_state_id"] = this.worksheetStateId.toString();
        if (this.featureId != null) {
            json["feature_id"] = this.featureId.toString();
        }
        if (this.featureSetId != null) {
            json["feature_set_id"] = this.featureSetId.toString();
        }
        if (this.review != null) {
            json["review"] = this.review;
        }
        return json;
    }

    private _featureId?: WorksheetFeatureId;

    private _featureSetId?: WorksheetFeatureSetId;

    private _review?: boolean;

    private _worksheetStateId: WorksheetStateId;
}
