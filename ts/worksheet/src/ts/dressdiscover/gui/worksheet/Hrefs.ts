import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/worksheet_state_mark';

import { Secrets } from './Secrets';

export class Hrefs {
  private static readonly cognitoBaseUrl = "https://dressdiscover.auth.us-east-1.amazoncognito.com";

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
    return Hrefs.cognitoBaseUrl + "/login?response_type=code&client_id=" + Secrets.AWS_COGNITO_CLIENT_ID + "&redirect_uri=" + window.location.protocol + "//" + window.location.host + Hrefs.loginRedirect;
  }

  static get loginRedirect() {
    return '/loginRedirect';
  }

  static get logout() {
    return Hrefs.cognitoBaseUrl + "/logout";
  }

  static get logoutRedirect() {
    return "/logoutRedirect";
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
