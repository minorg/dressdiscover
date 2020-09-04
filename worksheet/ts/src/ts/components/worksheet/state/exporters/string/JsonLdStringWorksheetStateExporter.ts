import { WorksheetDefinition } from '~/models/worksheet/definition/worksheet_definition';
import { WorksheetState } from '~/models/worksheet/state/worksheet_state';
import {
    JsonLdWorksheetStateExporter,
} from '~/components/worksheet/state/exporters/JsonLdWorksheetStateExporter';
import {
    StringWorksheetStateExporter,
} from '~/components/worksheet/state/exporters/string/StringWorksheetStateExporter';

export class JsonLdStringWorksheetStateExporter implements StringWorksheetStateExporter {
    export(worksheetDefinition: WorksheetDefinition, worksheetStates: WorksheetState[]): string {
        return JSON.stringify(this.delegate.export(worksheetDefinition, worksheetStates), null, 4);
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
