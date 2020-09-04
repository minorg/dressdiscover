import {WorksheetFeatureSetId} from "~/models/worksheet/WorksheetFeatureSetId";
import {Exception} from "~/Exception";

export class NoSuchWorksheetFeatureSetDefinitionException extends Exception {
  constructor(readonly id: WorksheetFeatureSetId) {
    super();
  }
}
