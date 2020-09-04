import {WorksheetFeatureSetId} from "~/models/worksheet/WorksheetFeatureSetId";

export class NoSuchWorksheetFeatureSetDefinitionException {
  constructor(readonly id: WorksheetFeatureSetId) {}
}
