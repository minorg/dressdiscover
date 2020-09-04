import {WorksheetConfiguration} from '~/models/worksheet/configuration/worksheet_configuration';

export class DefaultWorksheetConfiguration {
    static readonly instance: WorksheetConfiguration = {
        definition: {bundled: {}},
        state: { localStorage: {}},
    };
}
