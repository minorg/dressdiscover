import Backbone = require("backbone");
import { WorksheetEnumFeatureValueDefinition } from "dressdiscover/api/models/worksheet/worksheet_enum_feature_value_definition";

export class WorksheetEnumFeatureValueModel extends Backbone.Model {
    constructor(definition: WorksheetEnumFeatureValueDefinition, selected: boolean) {
        super({ id: definition.id });
        this._definition = definition;
        this.set("selected", selected);
    }

    get definition(): WorksheetEnumFeatureValueDefinition {
        return this._definition;
    }

    get selected(): boolean {
        return this.get("selected");
    }

    set selected(value: boolean) {
        this.set("selected", value);
    }

    private _definition: WorksheetEnumFeatureValueDefinition;
}
