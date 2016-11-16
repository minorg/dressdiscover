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

    get values_(): WorksheetEnumFeatureValueCollection {
        return this._values;
    }

    private _values: WorksheetEnumFeatureValueCollection = new WorksheetEnumFeatureValueCollection([]);
}
