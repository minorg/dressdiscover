import { WorksheetFeatureDefinition } from "../../../api/models/worksheet/worksheet_feature_definition";
import { WorksheetFeatureState } from "../../../api/models/worksheet/worksheet_feature_state";
import WorksheetEnumFeatureValueCollection = require("./worksheet_enum_feature_value_collection");
import WorksheetEnumFeatureValueModel = require("./worksheet_enum_feature_value_model");
import WorksheetFeatureModel = require("./worksheet_feature_model");

class WorksheetEnumFeatureModel extends WorksheetFeatureModel {
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

export = WorksheetEnumFeatureModel;
