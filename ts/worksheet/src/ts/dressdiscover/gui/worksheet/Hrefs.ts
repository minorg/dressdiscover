import { WorksheetStateId } from 'dressdiscover/api/models/worksheet/worksheet_state_id';
import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/worksheet_state_mark';
import * as queryString from 'query-string';

export class Hrefs {
  static get home() {
    return '/';
  }

  static get contact() {
    return "mailto:info@dressdiscover.org";
  }

  static get credits() {
    return "/#/credits";
  }

  static get gitHub() {
    return "https://github.com/minorg/dressdiscover";
  }

  static get login() {
    return '/api/v1/oauth/google';
  }

  static get loginFailure() {
    return '/loginFailure';
  }

  static get loginSuccess() {
    return '/loginSuccess';
  }

  static get logoutSuccess() {
    return "/logoutSuccess"
  }

  static get privacy() {
    return "/#/privacy";
  }

  static get root() {
    return '/';
  }

  static state(mark: WorksheetStateMark) {
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

  static worksheetState(worksheetStateId: WorksheetStateId) {
    return Hrefs.state(new WorksheetStateMark({ worksheetStateId: worksheetStateId }));
  }
}
