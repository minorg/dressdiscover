import { WorksheetFeatureId } from "../worksheet_feature_id";
import { WorksheetFeatureValueId } from "../worksheet_feature_value_id";

export class WorksheetFeatureState {
    constructor(kwds: {id: WorksheetFeatureId, selectedValueIds?: WorksheetFeatureValueId[], text?: string}) {
        this.idPrivate = WorksheetFeatureState.validateId(kwds.id);
        if (kwds.selectedValueIds != null) {
            this.selectedValueIdsPrivate = WorksheetFeatureState.validateSelectedValueIds(kwds.selectedValueIds);
        } else {
            this.selectedValueIdsPrivate = undefined;
        }
        if (kwds.text != null) {
            this.textPrivate = WorksheetFeatureState.validateText(kwds.text);
        } else {
            this.textPrivate = undefined;
        }
    }

    get id(): WorksheetFeatureId {
        return this.idPrivate;
    }

    set id(id: WorksheetFeatureId) {
        this.idPrivate = WorksheetFeatureState.validateId(id);
    }

    get selectedValueIds(): WorksheetFeatureValueId[] | undefined {
        return this.selectedValueIdsPrivate;
    }

    set selectedValueIds(selectedValueIds: WorksheetFeatureValueId[] | undefined) {
        this.selectedValueIdsPrivate = WorksheetFeatureState.validateSelectedValueIds(selectedValueIds);
    }

    get text(): string | undefined {
        return this.textPrivate;
    }

    set text(text: string | undefined) {
        this.textPrivate = WorksheetFeatureState.validateText(text);
    }

    public deepCopy(): WorksheetFeatureState {
        return new WorksheetFeatureState({ id: this.id, selectedValueIds: (this.selectedValueIds ? ((this.selectedValueIds).map((value0) => value0)) : undefined), text: this.text });
    }

    public equals(other: WorksheetFeatureState): boolean {
        if (!(this.id.equals(other.id))) {
            return false;
        }

        if (!((!((typeof (this.selectedValueIds)) === "undefined") && !((typeof (other.selectedValueIds)) === "undefined")) ? (((left: WorksheetFeatureValueId[], right: WorksheetFeatureValueId[]): boolean => { if (left.length !== right.length) { return false; } for (let elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI].equals(right[elementI]))) { return false; } } return true; })((this.selectedValueIds as WorksheetFeatureValueId[]), (other.selectedValueIds as WorksheetFeatureValueId[]))) : (((typeof (this.selectedValueIds)) === "undefined") && ((typeof (other.selectedValueIds)) === "undefined")))) {
            return false;
        }

        if (!((!((typeof (this.text)) === "undefined") && !((typeof (other.text)) === "undefined")) ? ((this.text as string) === (other.text as string)) : (((typeof (this.text)) === "undefined") && ((typeof (other.text)) === "undefined")))) {
            return false;
        }

        return true;
    }

    public static fromThryftJsonObject(json: any): WorksheetFeatureState {
        let id: WorksheetFeatureId | undefined;
        let selectedValueIds: WorksheetFeatureValueId[] | undefined;
        let text: string | undefined;
        for (const fieldName in json) {
            if (fieldName === "id") {
                id = WorksheetFeatureId.parse(json[fieldName]);
            } else if (fieldName === "selected_value_ids") {
                selectedValueIds = (json[fieldName]).map((element: any) => WorksheetFeatureValueId.parse(element));
            } else if (fieldName === "text") {
                text = json[fieldName];
            }
        }
        if (id == null) {
            throw new TypeError("id is required");
        }
        return new WorksheetFeatureState({id, selectedValueIds, text});
    }

    public toJsonObject(): {id: string, selected_value_ids: string[] | undefined, text: string | undefined} {
        return {
            id: this.id.toString(),
            selected_value_ids: this.selectedValueIds != null ? (this.selectedValueIds).map((inElement) => inElement.toString()) : undefined,
            text: this.text != null ? this.text : undefined
        };
    }

    public toString(): string {
        return "WorksheetFeatureState(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): {id: string, selected_value_ids: string[] | undefined, text: string | undefined} {
        return {
            id: this.id.toString(),
            selected_value_ids: this.selectedValueIds != null ? (this.selectedValueIds).map((inElement) => inElement.toString()) : undefined,
            text: this.text != null ? this.text : undefined
        };
    }

    private static validateId(id: WorksheetFeatureId): WorksheetFeatureId {
        if (id == null) {
            throw new RangeError("id is null or undefined");
        }
        return id;
    }

    private static validateSelectedValueIds(selectedValueIds: WorksheetFeatureValueId[] | undefined): WorksheetFeatureValueId[] | undefined {
        if (selectedValueIds != null) {
            if (selectedValueIds.length < 1) {
                throw new RangeError("expected len(selectedValueIds) to be >= 1, was " + selectedValueIds.length);
            }
        }
        return selectedValueIds;
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

    private idPrivate: WorksheetFeatureId;

    private selectedValueIdsPrivate?: WorksheetFeatureValueId[];

    private textPrivate?: string;
}
