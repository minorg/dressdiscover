import {WorksheetFeatureId} from "~/models/worksheet/WorksheetFeatureId";

export class NoSuchWorksheetFeatureDefinitionException {
  constructor(readonly id: WorksheetFeatureId) {}
}
