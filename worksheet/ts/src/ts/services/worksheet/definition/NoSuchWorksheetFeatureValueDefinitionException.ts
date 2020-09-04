import {WorksheetFeatureValueId} from "~/models/worksheet/WorksheetFeatureValueId";
import {Exception} from "~/Exception";

export class NoSuchWorksheetFeatureValueDefinitionException extends Exception {
  constructor(readonly id: WorksheetFeatureValueId) {
    super();
  }
}
