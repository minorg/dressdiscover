import { StateMark } from 'dressdiscover/gui/worksheet/models/state_mark';
import * as queryString from 'query-string';

export class Hrefs {
    get contact() {
        return "mailto:info@dressdiscover.org";
    }

    get credits() {
        return "/#/credits";
    }

    get privacy() {
        return "/#/privacy";
    }

    get root() {
        return '/';
    }

    state(mark: StateMark) {
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
}
