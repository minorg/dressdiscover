import { WorksheetFeatureDefinition } from "../../../api/models/worksheet/worksheet_feature_definition";
import { WorksheetEnumFeatureState } from "../../../api/models/worksheet/worksheet_enum_feature_state";
import WorksheetEnumFeatureValueCollection = require("./worksheet_enum_feature_value_collection");
import WorksheetFeatureModel = require("./worksheet_feature_model");

class WorksheetEnumFeatureModel extends WorksheetFeatureModel {
    constructor(definition: WorksheetFeatureDefinition, state: WorksheetFeatureState | undefined) {
        super(definition, state);
    }

    private _featureValues: WorksheetEnumFeatureValueCollection;
}

export = WorksheetEnumFeatureModel;
