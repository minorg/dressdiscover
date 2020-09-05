import {WorksheetDefinition} from "~/models/worksheet/definition/WorksheetDefinition";
import {WorksheetState} from "~/models/worksheet/state/WorksheetState";
import {JsonWorksheetStateExporter} from "~/components/worksheet/state/exporters/JsonWorksheetStateExporter";
import {StringWorksheetStateExporter} from "~/components/worksheet/state/exporters/string/StringWorksheetStateExporter";

export class JsonStringWorksheetStateExporter
  implements StringWorksheetStateExporter {
  export(
    worksheetDefinition: WorksheetDefinition,
    worksheetStates: WorksheetState[]
  ): string {
    return JSON.stringify(
      this.delegate.export(worksheetDefinition, worksheetStates),
      null,
      4
    );
  }

  get displayName() {
    return "JSON";
  }

  get fileExtension() {
    return "json";
  }

  get mimeType() {
    return "application/json";
  }

  private readonly delegate = new JsonWorksheetStateExporter();
}
