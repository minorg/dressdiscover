import { WorksheetFeatureSetState } from "./worksheet_feature_set_state";

export class WorksheetState {
    private _accessionNumber: string;

    private _rootFeatureSet?: WorksheetFeatureSetState;

    constructor(kwds: {accessionNumber: string, rootFeatureSet?: WorksheetFeatureSetState}) {
        this.accessionNumber = kwds.accessionNumber;
        this.rootFeatureSet = kwds.rootFeatureSet;
    }

    get accessionNumber(): string {
        return this._accessionNumber;
    }

    set accessionNumber(accessionNumber: string) {
        if (accessionNumber.trim().length == 0) {
            throw new RangeError('accessionNumber is blank');
        }
        if (accessionNumber.length < 1) {
            throw new RangeError("expected len(accessionNumber) to be >= 1, was " + accessionNumber.length);
        }
        this._accessionNumber = accessionNumber;
    }

    get rootFeatureSet(): WorksheetFeatureSetState | undefined {
        return this._rootFeatureSet;
    }

    set rootFeatureSet(rootFeatureSet: WorksheetFeatureSetState | undefined) {
        if (rootFeatureSet != null) {

        }
        this._rootFeatureSet = rootFeatureSet;
    }

    deepCopy(): WorksheetState {
        return new WorksheetState({ accessionNumber: this.accessionNumber, rootFeatureSet: (this.rootFeatureSet ? (this.rootFeatureSet.deepCopy()) : undefined) });
    }

    equals(other: WorksheetState): boolean {
        if (!(this.accessionNumber === other.accessionNumber)) {
            return false;
        }

        if (!((!((typeof (this.rootFeatureSet)) === "undefined") && !((typeof (other.rootFeatureSet)) === "undefined")) ? ((this.rootFeatureSet as WorksheetFeatureSetState).equals((other.rootFeatureSet as WorksheetFeatureSetState))) : (((typeof (this.rootFeatureSet)) === "undefined") && ((typeof (other.rootFeatureSet)) === "undefined")))) {
            return false;
        }

        return true;
    }

    static fromThryftJsonObject(json: any): WorksheetState {
        var accessionNumber: string | undefined;
        var rootFeatureSet: WorksheetFeatureSetState | undefined;
        for (var fieldName in json) {
            if (fieldName == "accession_number") {
                accessionNumber = json[fieldName];
            } else if (fieldName == "root_feature_set") {
                rootFeatureSet = WorksheetFeatureSetState.fromThryftJsonObject(json[fieldName]);
            }
        }
        if (accessionNumber == null) {
            throw new TypeError('accessionNumber is required');
        }
        return new WorksheetState({accessionNumber: accessionNumber, rootFeatureSet: rootFeatureSet});
    }

    toJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["accession_number"] = this.accessionNumber;
        if (this.rootFeatureSet != null) {
            json["root_feature_set"] = this.rootFeatureSet.toJsonObject();
        }
        return json;
    }

    toString(): string {
        return "WorksheetState(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    toThryftJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["accession_number"] = this.accessionNumber;
        if (this.rootFeatureSet != null) {
            json["root_feature_set"] = this.rootFeatureSet.toThryftJsonObject();
        }
        return json;
    }
}
