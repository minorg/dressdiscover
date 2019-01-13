import { WorksheetFeatureId } from 'dressdiscover/api/models/worksheet/worksheet_feature_id';
import { WorksheetFeatureSetId } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_id';
import { WorksheetStateId } from 'dressdiscover/api/models/worksheet/worksheet_state_id';
import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/worksheet_state_mark';
import * as queryString from 'query-string';
import { RouteComponentProps } from 'react-router';

export class WorksheetStateMarkParser {
    static parseRouteComponentProps(props: RouteComponentProps<WorksheetStateMarkRouteParams>): WorksheetStateMark {
        const locationParsed = queryString.parse(props.location);
        const review = locationParsed["review"] != null;
        return new WorksheetStateMark({
            featureId: props.match.params.featureId ? WorksheetFeatureId.parse(props.match.params.featureId) : undefined,
            featureSetId: props.match.params.featureSetId ? WorksheetFeatureSetId.parse(props.match.params.featureSetId) : undefined,
            review: review ? review : undefined,
            worksheetStateId: WorksheetStateId.parse(props.match.params.worksheetStateId)
        });
    }
}
