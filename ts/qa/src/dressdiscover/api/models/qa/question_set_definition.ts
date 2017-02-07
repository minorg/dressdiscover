import { QuestionDefinition } from "./question_definition";

export class QuestionSetDefinition {
    constructor(private features: QuestionDefinition[]) {
    }

    static fromThryftJSON(json: any): QuestionSetDefinition {
        features: QuestionDefinition[];
        for (var fieldName in json) {
            if (fieldName == "features") {
                features = function(json: any[]): QuestionDefinition[] { var sequence: QuestionDefinition[] = []; for (var i = 0; i < json.length; i++) { sequence.push(QuestionDefinition.fromThryftJSON(json[i])); } return sequence; }(json[fieldName]);
            }
        }
        return new QuestionSetDefinition(features);
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["features"] = function (__inArray: QuestionDefinition[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJSON()); } return __outArray; }(this.features.models);
        return json;
    }
}
