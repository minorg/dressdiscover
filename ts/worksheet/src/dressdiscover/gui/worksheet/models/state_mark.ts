import { WorksheetFeatureId } from 'dressdiscover/api/models/worksheet/worksheet_feature_id';
import { WorksheetFeatureSetId } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_id';
import { WorksheetStateId } from 'dressdiscover/api/models/worksheet/worksheet_state_id';

export class StateMark {
    constructor(kwds: {
        featureId?: WorksheetFeatureId,
        featureSetId?: WorksheetFeatureSetId,
        review?: boolean,
        worksheetStateId: WorksheetStateId
    }) {
        this.featureId = kwds.featureId;
        this.featureSetId = kwds.featureSetId;
        this.review = kwds.review;
        this.worksheetStateId = kwds.worksheetStateId;
    }

    readonly featureId?: WorksheetFeatureId;
    readonly featureSetId?: WorksheetFeatureSetId;
    readonly review: boolean | undefined;
    readonly worksheetStateId: WorksheetStateId;
}