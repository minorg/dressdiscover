import * as Backbone from "backbone";
import { WorksheetFeatureSetState } from "./worksheet_feature_set_state";

export class WorksheetState extends Backbone.Model {
    validation = {
        accessionNumber: {
            "fn": function(value: any, attr: any, computedState: any) {
                if (typeof value !== "string") {
                    return "expected WorksheetState.accession_number to be a string";
                }

                return undefined;
            },
            "required": true
        },

        rootFeatureSet: {
            "fn": function(value: any, attr: any, computedState: any) {
                if (typeof attr === "undefined" || attr === null) {
                    return undefined;
                }

                if (!(value instanceof WorksheetFeatureSetState)) {
                    return "expected WorksheetState.root_feature_set to be a WorksheetFeatureSetState";
                }
                if (!value.isValid(true)) {
                    return value.validationError;
                }

                return undefined;
            },
            "required": false
        }
    }

    validationError: any;

    constructor(attributes?: {accessionNumber: string, rootFeatureSet?: WorksheetFeatureSetState}, options?: any) {
        super(attributes, options);
    }

    get accessionNumber(): string {
        return this.get('accessionNumber');
    }

    set accessionNumber(value: string) {
        this.set('accessionNumber', value, { validate: true });
    }

    get rootFeatureSet(): WorksheetFeatureSetState {
        return this.get('rootFeatureSet');
    }

    set rootFeatureSet(value: WorksheetFeatureSetState) {
        this.set('rootFeatureSet', value, { validate: true });
    }

    static fromThryftJSON(json: any): WorksheetState {
        const attributes: any = {};
        for (var fieldName in json) {
            if (fieldName == "accession_number") {
                attributes["accessionNumber"] = json[fieldName];
            } else if (fieldName == "root_feature_set") {
                attributes["rootFeatureSet"] = WorksheetFeatureSetState.fromThryftJSON(json[fieldName]);
            }
        }
        const out = new WorksheetState(attributes);
        if (!out.isValid(true)) {
            throw new Error(out.validationError);
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["accession_number"] = this.accessionNumber;
        if (this.has("rootFeatureSet")) {
            json["root_feature_set"] = this.rootFeatureSet.toThryftJSON();
        }
        return json;
    }
}
