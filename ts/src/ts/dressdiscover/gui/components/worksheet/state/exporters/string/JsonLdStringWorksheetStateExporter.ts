import { WorksheetDefinition } from 'dressdiscover/api/models/worksheet/definition/worksheet_definition';
import { WorksheetState } from 'dressdiscover/api/models/worksheet/state/worksheet_state';
import {
    JsonLdWorksheetStateExporter,
} from 'dressdiscover/gui/components/worksheet/state/exporters/JsonLdWorksheetStateExporter';
import {
    StringWorksheetStateExporter,
} from 'dressdiscover/gui/components/worksheet/state/exporters/string/StringWorksheetStateExporter';

export class JsonLdStringWorksheetStateExporter implements StringWorksheetStateExporter {
    export(worksheetDefinition: WorksheetDefinition, worksheetStates: WorksheetState[]): string {
        return JSON.stringify(this.delegate.export(worksheetDefinition, worksheetStates));
    }

    get displayName() {
        return "JSON-LD";
    }

    get fileExtension() {
        return "jsonld";
    }

    get mimeType() {
        return "application/ld+json";
    }

    private readonly delegate = new JsonLdWorksheetStateExporter();
}
