export class Hrefs {
  static collection(uri: string) {
    return "/collection/" + encodeURIComponent(encodeURIComponent(uri));
  }

  static get contact() {
    return "mailto:info@dressdiscover.org";
  }

  static get home() {
    return '/';
  }

  static get privacy() {
    return "/privacy";
  }
}
