﻿import { WorksheetEnumFeatureState } from "dressdiscover/api/models/worksheet/worksheet_enum_feature_state";
import { WorksheetFeatureDefinition } from "dressdiscover/api/models/worksheet/worksheet_feature_definition";
import { WorksheetFeatureModel } from "dressdiscover/gui/models/worksheet/worksheet_feature_model";
import { WorksheetFeatureState } from "dressdiscover/api/models/worksheet/worksheet_feature_state";
import { WorksheetEnumFeatureValueCollection } from "dressdiscover/gui/models/worksheet/worksheet_enum_feature_value_collection";
import { WorksheetEnumFeatureValueModel } from "dressdiscover/gui/models/worksheet/worksheet_enum_feature_value_model";

export class WorksheetEnumFeatureModel extends WorksheetFeatureModel {
    constructor(definition: WorksheetFeatureDefinition, state: WorksheetFeatureState | undefined) {
        super(definition, state);
        for (let valueDefinition of definition.enum_.values_.models) {
            this._values.add(new WorksheetEnumFeatureValueModel(valueDefinition, state && state.enum_ ? state.enum_.selectedValues.indexOf(valueDefinition.id) != -1 : false));
        }
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

    private _values: WorksheetEnumFeatureValueCollection = new WorksheetEnumFeatureValueCollection([]);
}
