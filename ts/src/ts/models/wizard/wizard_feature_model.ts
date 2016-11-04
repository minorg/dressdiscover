/// <reference path="../../../../typings/index.d.ts" />
/// <reference path="../../gen/index.ts" />

import Backbone = require("backbone");

export class WizardFeatureModel extends Backbone.Model {
    private _definition: dressdiscover.api.models.wizard.WizardFeatureDefinition;
    private _state: dressdiscover.api.models.wizard.WizardFeatureState;

    constructor(definition: dressdiscover.api.models.wizard.WizardFeatureDefinition, state: dressdiscover.api.models.wizard.WizardFeatureState) {
        super();
        this._definition = definition;
        this._state = state;
    }

    get definition(): dressdiscover.api.models.wizard.WizardFeatureDefinition {
        return this._definition;
    }

    get state(): dressdiscover.api.models.wizard.WizardFeatureState {
        return this._state;
    }
}
