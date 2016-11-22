import { WorksheetEnumFeatureState } from "dressdiscover/api/models/worksheet/worksheet_enum_feature_state";
import { WorksheetFeatureDefinition } from "dressdiscover/api/models/worksheet/worksheet_feature_definition";
import { WorksheetFeature } from "dressdiscover/gui/models/worksheet/worksheet_feature";
import { WorksheetFeatureState } from "dressdiscover/api/models/worksheet/worksheet_feature_state";
import { WorksheetEnumFeatureValueCollection } from "dressdiscover/gui/models/worksheet/worksheet_enum_feature_value_collection";
import { WorksheetEnumFeatureValue } from "dressdiscover/gui/models/worksheet/worksheet_enum_feature_value";

export class WorksheetEnumFeature extends WorksheetFeature {
    constructor(definition: WorksheetFeatureDefinition, state: WorksheetFeatureState | undefined) {
        super(definition, state);
        let values: WorksheetEnumFeatureValue[] = [];
        for (let valueDefinition of definition.enum_.values_.models) {
            let value = new WorksheetEnumFeatureValue(valueDefinition, this, state && state.enum_ ? state.enum_.selectedValues.indexOf(valueDefinition.id) != -1 : false);
            values.push(value);
        }
        this._values = new WorksheetEnumFeatureValueCollection(values);
    }

    get currentState(): WorksheetFeatureState | undefined {
        let selectedValues: string[] = [];
        for (let value of this.values_.models) {
            if (value.selected) {
                selectedValues.push(value.id);
            }
        }
        if (selectedValues.length > 0) {
            return new WorksheetFeatureState({
                enum_: new WorksheetEnumFeatureState({ selectedValues: selectedValues })
            });
        } else {
            return undefined;
        }
    }

    get outputValues(): string[] {
        let selectedValues: string[] = [];
        for (let value of this._values.models) {
            if (value.selected) {
                if (value.definition.displayName) {
                    selectedValues.push(value.definition.displayName);
                } else {
                    selectedValues.push(value.definition.id);
                }
            }
        }
        return selectedValues;
    }

    get values_(): WorksheetEnumFeatureValueCollection {
        return this._values;
    }

    private _values: WorksheetEnumFeatureValueCollection;
}
