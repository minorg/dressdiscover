import * as Backbone from "backbone";
import { WorksheetFeatureDefinition } from "./worksheet_feature_definition";

export class WorksheetFeatureSetDefinition extends Backbone.Model {
    constructor(attributes?: {id: string, childFeatureSets?: Backbone.Collection<WorksheetFeatureSetDefinition>, displayName?: string, features?: Backbone.Collection<WorksheetFeatureDefinition>}) {
        let attributes_: any = {};
        if (attributes) {
            attributes_["id"] = attributes["id"];
            attributes_["childFeatureSets"] = attributes["childFeatureSets"];
            attributes_["displayName"] = attributes["displayName"];
            attributes_["features"] = attributes["features"];
        }
        attributes_["validation"] = {
            id: {
                "fn": function(value: any, attr: any, computedState: any) {
                    console.debug("validating id");
                    if (typeof value !== "string") {
                        return "expected WorksheetFeatureSetDefinition.id to be a string";
                    }
                    return undefined;
                },
                "required": true
            },

            childFeatureSets: {
                "fn": function(value: any, attr: any, computedState: any) {
                    console.debug("validating childFeatureSets");
                    if (typeof attr !== "undefined" && attr !== "null") {
                        if (!(value instanceof Backbone.Collection)) {
                            return "expected WorksheetFeatureSetDefinition.child_feature_sets to be a Backbone.Collection";
                        }
                        if (value.model !== WorksheetFeatureSetDefinition) {
                            return "expected WorksheetFeatureSetDefinition.child_feature_sets to be a Backbone.Collection with model=WorksheetFeatureSetDefinition";
                        }
                        for (let __model0 of value.models) {
                            if (!__model0.isValid(true)) {
                                return __model0.validationError;
                            }
                        }
                    }
                    return undefined;
                },
                "minLength": 1, "required": false
            },

            displayName: {
                "fn": function(value: any, attr: any, computedState: any) {
                    console.debug("validating displayName");
                    if (typeof attr !== "undefined" && attr !== "null") {
                        if (typeof value !== "string") {
                            return "expected WorksheetFeatureSetDefinition.display_name to be a string";
                        }
                    }
                    return undefined;
                },
                "minLength": 1, "required": false
            },

            features: {
                "fn": function(value: any, attr: any, computedState: any) {
                    console.debug("validating features");
                    if (typeof attr !== "undefined" && attr !== "null") {
                        if (!(value instanceof Backbone.Collection)) {
                            return "expected WorksheetFeatureSetDefinition.features to be a Backbone.Collection";
                        }
                        if (value.model !== WorksheetFeatureDefinition) {
                            return "expected WorksheetFeatureSetDefinition.features to be a Backbone.Collection with model=WorksheetFeatureDefinition";
                        }
                        for (let __model0 of value.models) {
                            if (!__model0.isValid(true)) {
                                return __model0.validationError;
                            }
                        }
                    }
                    return undefined;
                },
                "minLength": 1, "required": false
            }
        }
        super(attributes_);
    }

    get id(): string {
        return this.get('id');
    }

    set id(value: string) {
        this.set('id', value, { validate: true });
    }

    get childFeatureSets(): Backbone.Collection<WorksheetFeatureSetDefinition> {
        return this.get('childFeatureSets');
    }

    set childFeatureSets(value: Backbone.Collection<WorksheetFeatureSetDefinition>) {
        this.set('childFeatureSets', value, { validate: true });
    }

    get displayName(): string {
        return this.get('displayName');
    }

    set displayName(value: string) {
        this.set('displayName', value, { validate: true });
    }

    get features(): Backbone.Collection<WorksheetFeatureDefinition> {
        return this.get('features');
    }

    set features(value: Backbone.Collection<WorksheetFeatureDefinition>) {
        this.set('features', value, { validate: true });
    }

    static fromThryftJSON(json: any): WorksheetFeatureSetDefinition {
        var out: WorksheetFeatureSetDefinition = new WorksheetFeatureSetDefinition;
        for (var fieldName in json) {
            if (fieldName == "id") {
                out.attributes.id = json[fieldName];
            } else if (fieldName == "child_feature_sets") {
                out.attributes.childFeatureSets = function(json: any[]): Backbone.Collection<WorksheetFeatureSetDefinition> { var sequence: WorksheetFeatureSetDefinition[] = []; for (var i = 0; i < json.length; i++) { sequence.push(WorksheetFeatureSetDefinition.fromThryftJSON(json[i])); } return new Backbone.Collection<WorksheetFeatureSetDefinition>(sequence); }(json[fieldName]);
            } else if (fieldName == "display_name") {
                out.attributes.displayName = json[fieldName];
            } else if (fieldName == "features") {
                out.attributes.features = function(json: any[]): Backbone.Collection<WorksheetFeatureDefinition> { var sequence: WorksheetFeatureDefinition[] = []; for (var i = 0; i < json.length; i++) { sequence.push(WorksheetFeatureDefinition.fromThryftJSON(json[i])); } return new Backbone.Collection<WorksheetFeatureDefinition>(sequence); }(json[fieldName]);
            }
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id;
        if (this.has("childFeatureSets")) {
            json["child_feature_sets"] = function (__inArray: WorksheetFeatureSetDefinition[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJSON()); } return __outArray; }(this.childFeatureSets.models);
        }
        if (this.has("displayName")) {
            json["display_name"] = this.displayName;
        }
        if (this.has("features")) {
            json["features"] = function (__inArray: WorksheetFeatureDefinition[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJSON()); } return __outArray; }(this.features.models);
        }
        return json;
    }
}
