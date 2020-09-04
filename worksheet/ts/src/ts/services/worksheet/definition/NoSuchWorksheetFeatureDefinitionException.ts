import {WorksheetFeatureId} from "~/models/worksheet/WorksheetFeatureId";
import {Exception} from "~/Exception";

export class NoSuchWorksheetFeatureDefinitionException extends Exception {
  constructor(readonly id: WorksheetFeatureId) {
    super();
  }
}
