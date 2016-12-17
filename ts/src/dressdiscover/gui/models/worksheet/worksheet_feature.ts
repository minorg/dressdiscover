import * as _ from "underscore";
import * as Backbone from "backbone";
import { WorksheetFeatureDefinition } from "dressdiscover/api/models/worksheet/worksheet_feature_definition";
import { WorksheetFeatureSet } from "dressdiscover/gui/models/worksheet/worksheet_feature_set";
import { WorksheetFeatureState } from "dressdiscover/api/models/worksheet/worksheet_feature_state";
import { WorksheetFeatureValueCollection } from "dressdiscover/gui/models/worksheet/worksheet_feature_value_collection";
import { WorksheetFeatureValue } from "dressdiscover/gui/models/worksheet/worksheet_feature_value";

export class WorksheetFeature extends Backbone.Model {
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

        if (kwds.state && kwds.state.text) {
            this.set("text", kwds.state.text);
        }

        if (kwds.definition.values_) {
            let values: WorksheetFeatureValue[] = [];
            for (let valueDefinition of kwds.definition.values_.models) {
                values.push(new WorksheetFeatureValue(valueDefinition, this, kwds.state && kwds.state.selectedValues ? kwds.state.selectedValues.indexOf(valueDefinition.id) != -1 : false));
            }
            this._values = new WorksheetFeatureValueCollection(values);
        } else {
            this._values = undefined;
        }
    }

    get currentState(): WorksheetFeatureState | undefined {
        let stateAttributes: any = {};

        {
            let text = this.text;
            if (text) {
                stateAttributes["text"] = text;
            }
        }

        {
            if (this.values_) {
                let selectedValues: string[] = [];
                for (let value of this.values_.models) {
                    if (value.selected) {
                        selectedValues.push(value.id);
                    }
                }
                if (selectedValues.length > 0) {
                    stateAttributes["selectedValues"] = selectedValues;
                }
            }
        }

        if (!_.isEmpty(stateAttributes)) {
            return new WorksheetFeatureState(stateAttributes);
        } else {
            return undefined;
        }
    }

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

    get outputValues(): string[] {
        let outputValues: string[] = [];

        {
            let text = this.text;
            if (text) {
                outputValues.push(text);
            }
        }

        if (this._values) {
            for (let value of this._values.models) {
                if (value.selected) {
                    if (value.definition.displayName) {
                        outputValues.push(value.definition.displayName);
                    } else {
                        outputValues.push(value.definition.id);
                    }
                }
            }
        }

        return outputValues;
    }

    get text(): string | undefined {
        return this.get("text");
    }

    set text(value: string | undefined) {
        if (value) {
            this.set("text", value);
        } else {
            this.unset("text");
        }
    }

    get values_(): WorksheetFeatureValueCollection | undefined {
        return this._values;
    }

    private _allFeatures: WorksheetFeature[];
    private _allFeaturesIndex: number;
    private _definition: WorksheetFeatureDefinition;
    private _parentFeatureSet: WorksheetFeatureSet;
    private _values: WorksheetFeatureValueCollection | undefined;
}
