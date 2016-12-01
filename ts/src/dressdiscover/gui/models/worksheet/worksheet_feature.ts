import Backbone = require("backbone");
import { WorksheetFeatureDefinition } from "dressdiscover/api/models/worksheet/worksheet_feature_definition";
import { WorksheetFeatureSet } from "dressdiscover/gui/models/worksheet/worksheet_feature_set";
import { WorksheetFeatureState } from "dressdiscover/api/models/worksheet/worksheet_feature_state";
 
export abstract class WorksheetFeature extends Backbone.Model {
    constructor(kwds: {
        allFeatures: WorksheetFeature[],
        allFeaturesIndex: number,
        definition: WorksheetFeatureDefinition,
        parentFeatureSet: WorksheetFeatureSet,
        state: WorksheetFeatureState | undefined
    }) {
        super({ id: kwds.definition.id });
        this._allFeatures = kwds.allFeatures;
        this._allFeaturesIndex = kwds.allFeaturesIndex;
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

    get parentFeatureSet(): WorksheetFeatureSet {
        return this._parentFeatureSet;
    }

    get nextFeature(): WorksheetFeature | undefined {
        if (this._allFeaturesIndex + 1 < this._allFeatures.length) {
            return this._allFeatures[this._allFeaturesIndex + 1];
        }
        return undefined;
    }

    get previousFeature(): WorksheetFeature | undefined {
        if (this._allFeaturesIndex > 0) {
            return this._allFeatures[this._allFeaturesIndex - 1];
        }
        return undefined;
    }

    get selected(): boolean {
        return this.get("selected");
    }

    set selected(value: boolean) {
        this.set("selected", value);
    }

    abstract get outputValues(): string[];

    private _allFeatures: WorksheetFeature[];
    private _allFeaturesIndex: number;
    private _definition: WorksheetFeatureDefinition;
    private _parentFeatureSet: WorksheetFeatureSet;
}
