import {WorksheetFeatureValueId} from "~/models/worksheet/WorksheetFeatureValueId";

export class NoSuchWorksheetFeatureValueDefinitionException {
  constructor(readonly id: WorksheetFeatureValueId) {}
}
