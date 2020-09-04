import {
    BundledWorksheetDefinitionConfiguration,
} from 'dressdiscover/gui/models/worksheet/configuration/bundled_worksheet_definition_configuration';
import {
    LocalStorageWorksheetStateConfiguration,
} from 'dressdiscover/gui/models/worksheet/configuration/local_storage_worksheet_state_configuration';
import { WorksheetConfiguration } from 'dressdiscover/gui/models/worksheet/configuration/worksheet_configuration';
import {
    WorksheetDefinitionConfiguration,
} from 'dressdiscover/gui/models/worksheet/configuration/worksheet_definition_configuration';
import { WorksheetStateConfiguration } from 'dressdiscover/gui/models/worksheet/configuration/worksheet_state_configuration';

export class DefaultWorksheetConfiguration {
    static readonly instance = new WorksheetConfiguration({
        definition: new WorksheetDefinitionConfiguration({ bundled: new BundledWorksheetDefinitionConfiguration }),
        state: new WorksheetStateConfiguration({ localStorage: new LocalStorageWorksheetStateConfiguration })
    });
}
