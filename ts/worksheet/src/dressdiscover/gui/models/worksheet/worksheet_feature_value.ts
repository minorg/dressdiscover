import Backbone = require("backbone");
import { WorksheetFeature } from "dressdiscover/gui/models/worksheet/worksheet_feature";
import { WorksheetFeatureValueDefinition } from "dressdiscover/api/models/worksheet/worksheet_feature_value_definition";

export class WorksheetFeatureValue extends Backbone.Model {
    constructor(definition: WorksheetFeatureValueDefinition, parentFeature: WorksheetFeature, selected: boolean) {
        super({ id: definition.id });
        this._definition = definition;
        this._parentFeature = parentFeature;
        this.selected = selected;
    }

    get definition(): WorksheetFeatureValueDefinition {
        return this._definition;
    }

    get displayName(): string {
        return this._definition.displayName ? this._definition.displayName : this._definition.id;
    }

    get parentFeature(): WorksheetFeature {
        return this._parentFeature;
    }

    get selected(): boolean {
        return this.get("selected");
    }

    set selected(value: boolean) {
        this.set("selected", value);
    }

    private _definition: WorksheetFeatureValueDefinition;
    private _parentFeature: WorksheetFeature;
}
