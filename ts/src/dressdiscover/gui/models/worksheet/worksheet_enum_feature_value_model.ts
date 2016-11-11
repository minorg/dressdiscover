import Backbone = require("backbone");
import { WorksheetEnumFeatureValueDefinition } from "../../../api/models/worksheet/worksheet_enum_feature_value_definition";
import { WorksheetEnumFeatureValueState } from "../../../api/models/worksheet/worksheet_enum_feature_value_state";

class WorksheetEnumFeatureValueModel extends Backbone.Model {
    constructor(definition: WorksheetEnumFeatureValueDefinition, state: WorksheetEnumFeatureValueState | undefined) {
        super({ id: definition.id });
        this._definition = definition;
    }

    get definition(): WorksheetEnumFeatureValueDefinition {
        return this._definition;
    }

    private _definition: WorksheetEnumFeatureValueDefinition;
}

export = WorksheetEnumFeatureValueModel;
