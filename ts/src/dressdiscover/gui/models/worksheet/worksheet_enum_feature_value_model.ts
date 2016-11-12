import Backbone = require("backbone");
import { WorksheetEnumFeatureValueDefinition } from "../../../api/models/worksheet/worksheet_enum_feature_value_definition";

class WorksheetEnumFeatureValueModel extends Backbone.Model {
    constructor(definition: WorksheetEnumFeatureValueDefinition, selected: boolean) {
        super({ id: definition.id });
        this._definition = definition;
        this.set("selected", true);
    }

    get definition(): WorksheetEnumFeatureValueDefinition {
        return this._definition;
    }

    private _definition: WorksheetEnumFeatureValueDefinition;
}

export = WorksheetEnumFeatureValueModel;
