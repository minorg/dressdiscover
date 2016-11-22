import { WorksheetFeatureDefinition } from "dressdiscover/api/models/worksheet/worksheet_feature_definition";
import { WorksheetFeature } from "dressdiscover/gui/models/worksheet/worksheet_feature";
import { WorksheetFeatureState } from "dressdiscover/api/models/worksheet/worksheet_feature_state";
import { WorksheetTextFeatureState } from "dressdiscover/api/models/worksheet/worksheet_text_feature_state";

export class WorksheetTextFeature extends WorksheetFeature {
    constructor(definition: WorksheetFeatureDefinition, state: WorksheetFeatureState | undefined) {
        super(definition, state);
        if (state && state.text && state.text.text) {
            this.set("text", state.text.text);
        }
    }

    get currentState(): WorksheetFeatureState | undefined {
        let text = this.text;
        if (text) {
            return new WorksheetFeatureState({
                text: new WorksheetTextFeatureState({ text: text })
            })
        } else {
            return undefined;
        }
    }

    get outputValues(): string[] {
        let text = this.text;
        if (text) {
            return [text];
        } else {
            return [];
        }
    }

    get text(): string | undefined {
        return this.get("text");
    }
}
