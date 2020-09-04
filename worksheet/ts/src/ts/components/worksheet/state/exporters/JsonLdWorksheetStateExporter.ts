import { WorksheetDefinition } from '~/models/worksheet/definition/worksheet_definition';
import { WorksheetState } from '~/models/worksheet/state/worksheet_state';
import { WorksheetStateMark } from '~/models/worksheet/state/worksheet_state_mark';
import { WorksheetStateExporter } from '~/components/worksheet/state/exporters/WorksheetStateExporter';
import { Hrefs } from '~/Hrefs';

export class JsonLdWorksheetStateExporter implements WorksheetStateExporter<any> {
    export(worksheetDefinition: WorksheetDefinition, worksheetStates: WorksheetState[]): any {
        switch (worksheetStates.length) {
            case 0: return [];
            case 1: return this._export(worksheetDefinition, worksheetStates[0]);
            default: worksheetStates.map((worksheetState) => this._export(worksheetDefinition, worksheetState));
        }
    }

    private _export(worksheetDefinition: WorksheetDefinition, worksheetState: WorksheetState): any {
        const json: any = {};
        const context: any = {};
        context.cc = "https://w3id.org/costumeCore/ontology/";
        json["@context"] = context;
        let href = Hrefs.worksheetState(new WorksheetStateMark({ worksheetStateId: worksheetState.id }));
        if (href.endsWith("/edit")) {
            href = href.substring(0, href.length - 4);
        }
        json["@id"] = "https://dressdiscover.org" + href;
        for (const featureSetState of worksheetState.featureSets) {
            for (const featureState of featureSetState.features) {
                if (!featureState.selectedValueIds || featureState.selectedValueIds.length === 0) {
                    continue;
                }
                const featureStateKey = "cc:" + featureState.id.toString().replace(" ", "");
                context[featureStateKey] = { "@type": "@id" };
                json[featureStateKey] = featureState.selectedValueIds.map((selectedValueId) => "cc:" + selectedValueId.toString());
            }
        }
        return json;
    }
}
