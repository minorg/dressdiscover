import Backbone = require("backbone");
import { WorksheetFeatureDefinition } from "dressdiscover/api/models/worksheet/worksheet_feature_definition";
import { WorksheetFeatureSet } from "dressdiscover/gui/models/worksheet/worksheet_feature_set";
import { WorksheetFeatureState } from "dressdiscover/api/models/worksheet/worksheet_feature_state";
 
export abstract class WorksheetFeature extends Backbone.Model {
    constructor(kwds: { definition: WorksheetFeatureDefinition, parentFeatureSet: WorksheetFeatureSet, state: WorksheetFeatureState | undefined }) {
        super({ id: kwds.definition.id });
        this._definition = kwds.definition;
        this.selected = false;
        this._parentFeatureSet = kwds.parentFeatureSet;
    }

    abstract get currentState(): WorksheetFeatureState | undefined;

    get definition(): WorksheetFeatureDefinition {
        return this._definition;
    }

    get displayName(): string {
        return this._definition.displayName ? this._definition.displayName : this._definition.id;
    }

    get parentFeatureset(): WorksheetFeatureSet {
        return this._parentFeatureSet;
    }

    get selected(): boolean {
        return this.get("selected");
    }

    set selected(value: boolean) {
        this.set("selected", value);
    }

    abstract get outputValues(): string[];

    private _definition: WorksheetFeatureDefinition;
    private _parentFeatureSet: WorksheetFeatureSet;
}
