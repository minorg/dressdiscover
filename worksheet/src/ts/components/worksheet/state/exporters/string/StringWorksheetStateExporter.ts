import {WorksheetStateExporter} from "~/components/worksheet/state/exporters/WorksheetStateExporter";

export interface StringWorksheetStateExporter
  extends WorksheetStateExporter<string> {
  readonly displayName: string;
  readonly fileExtension: string;
  readonly mimeType: string;
}
