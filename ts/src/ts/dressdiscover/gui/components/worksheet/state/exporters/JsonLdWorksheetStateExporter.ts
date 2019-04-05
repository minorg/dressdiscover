import { WorksheetDefinition } from 'dressdiscover/api/models/worksheet/definition/worksheet_definition';
import { WorksheetState } from 'dressdiscover/api/models/worksheet/state/worksheet_state';
import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/state/worksheet_state_mark';
import { WorksheetStateExporter } from 'dressdiscover/gui/components/worksheet/state/exporters/WorksheetStateExporter';
import { Hrefs } from 'dressdiscover/gui/Hrefs';

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
        json["@context"] = "https://dressdiscover.org/contexts/worksheet";
        json["@id"] = "https://dressdiscover.org" + Hrefs.worksheetState(new WorksheetStateMark({ worksheetStateId: worksheetState.id }));
        for (const featureSetState of worksheetState.featureSets) {
            for (const featureState of featureSetState.features) {
                if (!featureState.selectedValueIds || featureState.selectedValueIds.length === 0) {
                    continue;
                }
                let selectedValueDisplayNames: string[] = [];
                for (const selectedValueId of featureState.selectedValueIds) {
                    const selectedValueDefinition = worksheetDefinition.featureValues.find((value) => value.id.equals(selectedValueId));
                    if (!selectedValueDefinition) {
                        continue;
                    }
                    selectedValueDisplayNames.push(selectedValueDefinition.displayNameEn);
                }
                if (selectedValueDisplayNames.length > 0) {
                    json[featureState.id.toString().replace(" ", "")] = selectedValueDisplayNames;
                }
            }
        }
        return json;
    }
}
