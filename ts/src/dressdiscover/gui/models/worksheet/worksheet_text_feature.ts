import { WorksheetFeatureDefinition } from "dressdiscover/api/models/worksheet/worksheet_feature_definition";
import { WorksheetFeature } from "dressdiscover/gui/models/worksheet/worksheet_feature";
import { WorksheetFeatureSet } from "dressdiscover/gui/models/worksheet/worksheet_feature_set";
import { WorksheetFeatureState } from "dressdiscover/api/models/worksheet/worksheet_feature_state";
import { WorksheetTextFeatureState } from "dressdiscover/api/models/worksheet/worksheet_text_feature_state";

export class WorksheetTextFeature extends WorksheetFeature {
    constructor(kwds: {
        definition: WorksheetFeatureDefinition,
        parentFeatureSet: WorksheetFeatureSet,
        parentsChildNumber: number
        state: WorksheetFeatureState | undefined
    }) {
        super(kwds);
        if (kwds.state && kwds.state.text && kwds.state.text.text) {
            this.set("text", kwds.state.text.text);
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
