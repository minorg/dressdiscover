import { WorksheetFeatureSetState } from "./worksheet_feature_set_state";
import { WorksheetStateId } from "./worksheet_state_id";

export class WorksheetState {
    constructor(kwds: {featureSets: WorksheetFeatureSetState[], id: WorksheetStateId, text?: string}) {
        this.featureSetsPrivate = WorksheetState.validateFeatureSets(kwds.featureSets);
        this.idPrivate = WorksheetState.validateId(kwds.id);
        if (kwds.text != null) {
            this.textPrivate = WorksheetState.validateText(kwds.text);
        } else {
            this.textPrivate = undefined;
        }
    }

    get featureSets(): WorksheetFeatureSetState[] {
        return this.featureSetsPrivate;
    }

    set featureSets(featureSets: WorksheetFeatureSetState[]) {
        this.featureSetsPrivate = WorksheetState.validateFeatureSets(featureSets);
    }

    get id(): WorksheetStateId {
        return this.idPrivate;
    }

    set id(id: WorksheetStateId) {
        this.idPrivate = WorksheetState.validateId(id);
    }

    get text(): string | undefined {
        return this.textPrivate;
    }

    set text(text: string | undefined) {
        this.textPrivate = WorksheetState.validateText(text);
    }

    public deepCopy(): WorksheetState {
        return new WorksheetState({ featureSets: (this.featureSets).map((value0) => value0.deepCopy()), id: this.id, text: this.text });
    }

    public equals(other: WorksheetState): boolean {
        if (!(((left: WorksheetFeatureSetState[], right: WorksheetFeatureSetState[]): boolean => { if (left.length !== right.length) { return false; } for (let elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI].equals(right[elementI]))) { return false; } } return true; })(this.featureSets, other.featureSets))) {
            return false;
        }

        if (!(this.id.equals(other.id))) {
            return false;
        }

        if (!((!((typeof (this.text)) === "undefined") && !((typeof (other.text)) === "undefined")) ? ((this.text as string) === (other.text as string)) : (((typeof (this.text)) === "undefined") && ((typeof (other.text)) === "undefined")))) {
            return false;
        }

        return true;
    }

    public static fromThryftJsonObject(json: any): WorksheetState {
        let featureSets: WorksheetFeatureSetState[] | undefined;
        let id: WorksheetStateId | undefined;
        let text: string | undefined;
        for (const fieldName in json) {
            if (fieldName === "feature_sets") {
                featureSets = (json[fieldName]).map((element: any) => WorksheetFeatureSetState.fromThryftJsonObject(element));
            } else if (fieldName === "id") {
                id = WorksheetStateId.parse(json[fieldName]);
            } else if (fieldName === "text") {
                text = json[fieldName];
            }
        }
        if (featureSets == null) {
            throw new TypeError("featureSets is required");
        }
        if (id == null) {
            throw new TypeError("id is required");
        }
        return new WorksheetState({featureSets, id, text});
    }

    public toJsonObject(): {feature_sets: {features: {id: string, selected_value_ids: string[] | undefined, text: string | undefined}[], id: string}[], id: string, text: string | undefined} {
        return {
            feature_sets: (this.featureSets).map((inElement) => inElement.toJsonObject()),
            id: this.id.toString(),
            text: this.text != null ? this.text : undefined
        };
    }

    public toString(): string {
        return "WorksheetState(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): {feature_sets: {features: {id: string, selected_value_ids: string[] | undefined, text: string | undefined}[], id: string}[], id: string, text: string | undefined} {
        return {
            feature_sets: (this.featureSets).map((inElement) => inElement.toThryftJsonObject()),
            id: this.id.toString(),
            text: this.text != null ? this.text : undefined
        };
    }

    private static validateFeatureSets(featureSets: WorksheetFeatureSetState[]): WorksheetFeatureSetState[] {
        if (featureSets == null) {
            throw new RangeError("featureSets is null or undefined");
        }
        return featureSets;
    }

    private static validateId(id: WorksheetStateId): WorksheetStateId {
        if (id == null) {
            throw new RangeError("id is null or undefined");
        }
        return id;
    }

    private static validateText(text: string | undefined): string | undefined {
        if (text != null) {
            if (text.trim().length === 0) {
                throw new RangeError("text is blank");
            }
            if (text.length < 1) {
                throw new RangeError("expected len(text) to be >= 1, was " + text.length);
            }
        }
        return text;
    }

    private featureSetsPrivate: WorksheetFeatureSetState[];

    private idPrivate: WorksheetStateId;

    private textPrivate?: string;
}
