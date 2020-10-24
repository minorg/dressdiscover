import {WorksheetConfiguration} from "~/models/worksheet/configuration/WorksheetConfiguration";

export class DefaultWorksheetConfiguration {
  static readonly instance: WorksheetConfiguration = {
    definition: {bundled: {}},
    state: {localStorage: {}},
  };
}
