import { WorksheetFeatureDefinition } from "./worksheet_feature_definition";

export class WorksheetFeatureSetDefinition {
    private _childFeatureSets?: WorksheetFeatureSetDefinition[];

    private _displayName?: string;

    private _features?: WorksheetFeatureDefinition[];

    private _id: string;

    constructor(kwds: {id: string, childFeatureSets?: WorksheetFeatureSetDefinition[], displayName?: string, features?: WorksheetFeatureDefinition[]}) {
        this.id = kwds.id;
        this.childFeatureSets = kwds.childFeatureSets;
        this.displayName = kwds.displayName;
        this.features = kwds.features;
    }

    get id(): string {
        return this._id;
    }

    set id(id: string) {
        if (id.trim().length == 0) {
            throw new RangeError('id is blank');
        }
        if (id.length < 1) {
            throw new RangeError("expected len(id) to be >= 1, was " + id.length);
        }
        this._id = id;
    }

    get childFeatureSets(): WorksheetFeatureSetDefinition[] | undefined {
        return this._childFeatureSets;
    }

    set childFeatureSets(childFeatureSets: WorksheetFeatureSetDefinition[] | undefined) {
        if (childFeatureSets != null) {
            if (childFeatureSets.length < 1) {
                throw new RangeError("expected len(childFeatureSets) to be >= 1, was " + childFeatureSets.length);
            }
        }
        this._childFeatureSets = childFeatureSets;
    }

    get displayName(): string | undefined {
        return this._displayName;
    }

    set displayName(displayName: string | undefined) {
        if (displayName != null) {
            if (displayName.trim().length == 0) {
                throw new RangeError('displayName is blank');
            }
            if (displayName.length < 1) {
                throw new RangeError("expected len(displayName) to be >= 1, was " + displayName.length);
            }
        }
        this._displayName = displayName;
    }

    get features(): WorksheetFeatureDefinition[] | undefined {
        return this._features;
    }

    set features(features: WorksheetFeatureDefinition[] | undefined) {
        if (features != null) {
            if (features.length < 1) {
                throw new RangeError("expected len(features) to be >= 1, was " + features.length);
            }
        }
        this._features = features;
    }

    deepCopy(): WorksheetFeatureSetDefinition {
        return new WorksheetFeatureSetDefinition({ id: this.id, childFeatureSets: (this.childFeatureSets ? (function(__value0: WorksheetFeatureSetDefinition[]) { let __copy0: WorksheetFeatureSetDefinition[] = []; for (var __i0 = 0; __i0 < __value0.length; __i0++) { __copy0.push(__value0[__i0].deepCopy()); } return __copy0; }(this.childFeatureSets)) : undefined), displayName: this.displayName, features: (this.features ? (function(__value0: WorksheetFeatureDefinition[]) { let __copy0: WorksheetFeatureDefinition[] = []; for (var __i0 = 0; __i0 < __value0.length; __i0++) { __copy0.push(__value0[__i0].deepCopy()); } return __copy0; }(this.features)) : undefined) });
    }

    equals(other: WorksheetFeatureSetDefinition): boolean {
        if (!(this.id === other.id)) {
            return false;
        }

        if (!((!((typeof (this.childFeatureSets)) === "undefined") && !((typeof (other.childFeatureSets)) === "undefined")) ? (function(left: WorksheetFeatureSetDefinition[], right: WorksheetFeatureSetDefinition[]): boolean { if (left.length != right.length) { return false; } for (var elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI].equals(right[elementI]))) { return false; } } return true; }((this.childFeatureSets as WorksheetFeatureSetDefinition[]), (other.childFeatureSets as WorksheetFeatureSetDefinition[]))) : (((typeof (this.childFeatureSets)) === "undefined") && ((typeof (other.childFeatureSets)) === "undefined")))) {
            return false;
        }

        if (!((!((typeof (this.displayName)) === "undefined") && !((typeof (other.displayName)) === "undefined")) ? ((this.displayName as string) === (other.displayName as string)) : (((typeof (this.displayName)) === "undefined") && ((typeof (other.displayName)) === "undefined")))) {
            return false;
        }

        if (!((!((typeof (this.features)) === "undefined") && !((typeof (other.features)) === "undefined")) ? (function(left: WorksheetFeatureDefinition[], right: WorksheetFeatureDefinition[]): boolean { if (left.length != right.length) { return false; } for (var elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI].equals(right[elementI]))) { return false; } } return true; }((this.features as WorksheetFeatureDefinition[]), (other.features as WorksheetFeatureDefinition[]))) : (((typeof (this.features)) === "undefined") && ((typeof (other.features)) === "undefined")))) {
            return false;
        }

        return true;
    }

    static fromThryftJsonObject(json: any): WorksheetFeatureSetDefinition {
        var id: string | undefined;
        var childFeatureSets: WorksheetFeatureSetDefinition[] | undefined;
        var displayName: string | undefined;
        var features: WorksheetFeatureDefinition[] | undefined;
        for (var fieldName in json) {
            if (fieldName == "id") {
                id = json[fieldName];
            } else if (fieldName == "child_feature_sets") {
                childFeatureSets = function(json: any[]): WorksheetFeatureSetDefinition[] { var sequence: WorksheetFeatureSetDefinition[] = []; for (var i = 0; i < json.length; i++) { sequence.push(WorksheetFeatureSetDefinition.fromThryftJsonObject(json[i])); } return sequence; }(json[fieldName]);
            } else if (fieldName == "display_name") {
                displayName = json[fieldName];
            } else if (fieldName == "features") {
                features = function(json: any[]): WorksheetFeatureDefinition[] { var sequence: WorksheetFeatureDefinition[] = []; for (var i = 0; i < json.length; i++) { sequence.push(WorksheetFeatureDefinition.fromThryftJsonObject(json[i])); } return sequence; }(json[fieldName]);
            }
        }
        if (id == null) {
            throw new TypeError('id is required');
        }
        return new WorksheetFeatureSetDefinition({id: id, childFeatureSets: childFeatureSets, displayName: displayName, features: features});
    }

    toJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id;
        if (this.childFeatureSets != null) {
            json["child_feature_sets"] = function (__inArray: WorksheetFeatureSetDefinition[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toJsonObject()); } return __outArray; }(this.childFeatureSets);
        }
        if (this.displayName != null) {
            json["display_name"] = this.displayName;
        }
        if (this.features != null) {
            json["features"] = function (__inArray: WorksheetFeatureDefinition[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toJsonObject()); } return __outArray; }(this.features);
        }
        return json;
    }

    toString(): string {
        return "WorksheetFeatureSetDefinition(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    toThryftJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id;
        if (this.childFeatureSets != null) {
            json["child_feature_sets"] = function (__inArray: WorksheetFeatureSetDefinition[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJsonObject()); } return __outArray; }(this.childFeatureSets);
        }
        if (this.displayName != null) {
            json["display_name"] = this.displayName;
        }
        if (this.features != null) {
            json["features"] = function (__inArray: WorksheetFeatureDefinition[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJsonObject()); } return __outArray; }(this.features);
        }
        return json;
    }
}
