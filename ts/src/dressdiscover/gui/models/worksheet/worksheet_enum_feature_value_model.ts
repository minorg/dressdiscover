﻿import Backbone = require("backbone");
import { WorksheetEnumFeatureModel } from "dressdiscover/gui/models/worksheet/worksheet_enum_feature_model";
import { WorksheetEnumFeatureValueDefinition } from "dressdiscover/api/models/worksheet/worksheet_enum_feature_value_definition";

export class WorksheetEnumFeatureValueModel extends Backbone.Model {
    constructor(definition: WorksheetEnumFeatureValueDefinition, parentFeature: WorksheetEnumFeatureModel, selected: boolean) {
        super({ id: definition.id });
        this._definition = definition;
        this._parentFeature = parentFeature;
        this.selected = selected;
    }

    get definition(): WorksheetEnumFeatureValueDefinition {
        return this._definition;
    }

    get displayName(): string {
        return this._definition.displayName ? this._definition.displayName : this._definition.id;
    }

    get parentFeature(): WorksheetEnumFeatureModel {
        return this._parentFeature;
    }

    get selected(): boolean {
        return this.get("selected");
    }

    set selected(value: boolean) {
        this.set("selected", value);
    }

    private _definition: WorksheetEnumFeatureValueDefinition;
    private _parentFeature: WorksheetEnumFeatureModel;
}
