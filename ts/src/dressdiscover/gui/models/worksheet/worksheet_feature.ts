import Backbone = require("backbone");
import { WorksheetFeatureDefinition } from "dressdiscover/api/models/worksheet/worksheet_feature_definition";
import { WorksheetFeatureSet } from "dressdiscover/gui/models/worksheet/worksheet_feature_set";
import { WorksheetFeatureState } from "dressdiscover/api/models/worksheet/worksheet_feature_state";
 
export abstract class WorksheetFeature extends Backbone.Model {
    constructor(kwds: {
        definition: WorksheetFeatureDefinition,
        parentFeatureSet: WorksheetFeatureSet,
        parentsChildNumber: number
        state: WorksheetFeatureState | undefined
    }) {
        super({ id: kwds.definition.id });
        this._definition = kwds.definition;
        this.selected = false;
        this._parentFeatureSet = kwds.parentFeatureSet;
        this._parentsChildNumber = kwds.parentsChildNumber;
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
        if (this._parentsChildNumber + 1 < this.parentFeatureSet.features.length) {
            return this.parentFeatureSet.features.at(this._parentsChildNumber + 1);
        }
        let nextFeatureSet = this.parentFeatureSet.nextFeatureSet;
        while (nextFeatureSet) {
            if (nextFeatureSet.features.length > 0) {
                return nextFeatureSet.features.at(0);
            }
            nextFeatureSet = nextFeatureSet.nextFeatureSet;
        }
        return undefined;
    }

    get previousFeature(): WorksheetFeature | undefined {
        if (this._parentsChildNumber > 0) {
            return this.parentFeatureSet.features.at(this._parentsChildNumber - 1);
        }
        let previousFeatureSet = this.parentFeatureSet.previousFeatureSet;
        while (previousFeatureSet) {
            if (previousFeatureSet.features.length > 0) {
                return previousFeatureSet.features.at(previousFeatureSet.features.length - 1);
            }
            previousFeatureSet = previousFeatureSet.previousFeatureSet;
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

    private _definition: WorksheetFeatureDefinition;
    private _parentFeatureSet: WorksheetFeatureSet;
    private _parentsChildNumber: number;
}
