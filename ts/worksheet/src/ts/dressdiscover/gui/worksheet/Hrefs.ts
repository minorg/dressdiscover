export class Hrefs {
  static get home() {
    return '/';
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
}
