import { WorksheetStateId } from 'dressdiscover/api/models/worksheet/worksheet_state_id';
import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/worksheet_state_mark';
import * as queryString from 'query-string';

export class Hrefs {
    get contact() {
        return "mailto:info@dressdiscover.org";
    }

    get credits() {
        return "/#/credits";
    }

    get gitHub() {
        return "https://github.com/minorg/dressdiscover";
    }

    get privacy() {
        return "/#/privacy";
    }

    get root() {
        return '/';
    }

    state(mark: WorksheetStateMark) {
        let href = "/#/state/" + encodeURIComponent(mark.worksheetStateId.toString()) + "/";
        if (mark.featureSetId) {
            href += encodeURIComponent(mark.featureSetId.toString()) + "/";
            if (mark.featureId) {
                href += encodeURIComponent(mark.featureId.toString());
            }
        }
        if (mark.review) {
            href += "?" + queryString.stringify({ "review": true });
        }
        return href;
    }

    worksheetState(worksheetStateId: WorksheetStateId) {
        return this.state(new WorksheetStateMark({ worksheetStateId: worksheetStateId }));
    }
}
