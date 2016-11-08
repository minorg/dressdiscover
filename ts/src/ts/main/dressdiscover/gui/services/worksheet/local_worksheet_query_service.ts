/// <reference path="../../../../../gen/index.ts" />

class LocalWorksheetQueryService extends dressdiscover.api.services.worksheet.AsyncToSyncWorksheetQueryService {
    getWorksheetFeatureSetDefinitionsSync(): { [index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition } {
        return {};
    }

    getWorksheetFeatureSetStatesSync(): { [index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetState } {
        return {};
    }
}

export = LocalWorksheetQueryService;