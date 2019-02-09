import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/worksheet_state_mark';

export class Hrefs {
  static get home() {
    return '/';
  }

  static get contact() {
    return "mailto:info@dressdiscover.org";
  }

  static get credits() {
    return "/credits";
  }

  static get gitHub() {
    return "https://github.com/minorg/dressdiscover";
  }

  static get login() {
    return "/login";
  }

  static get loginCallback() {
    return '/loginCallback';
  }

  static get logout() {
    return "/logout";
  }

  static get privacy() {
    return "/privacy";
  }

  static get root() {
    return '/';
  }

  static get worksheetStart() {
    return "/worksheet/";
  }

  static worksheetState(mark: WorksheetStateMark) {
    let href = "/worksheet/state/" + encodeURIComponent(mark.worksheetStateId.toString()) + "/";
    if (mark.featureSetId) {
      href += "feature_set/" + encodeURIComponent(mark.featureSetId.toString()) + "/";
      if (mark.featureId) {
        href += "feature/" + encodeURIComponent(mark.featureId.toString()) + "/";
      }
    }
    href += mark.review ? "review" : "edit";
    return href;
  }
}
