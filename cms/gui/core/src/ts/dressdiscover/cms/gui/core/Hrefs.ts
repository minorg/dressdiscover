export class Hrefs {
  static collection(kwds: { collectionUri: string, institutionUri: string }) {
    return Hrefs.institution(kwds.institutionUri) + "/collection/" + encodeURIComponent(encodeURIComponent(kwds.collectionUri));
  }

  static get contact() {
    return "mailto:info@dressdiscover.org";
  }

  static get home() {
    return '/';
  }

  static institution(uri: string) {
    return "/institution/" + encodeURIComponent(encodeURIComponent(uri));
  }

  static get privacy() {
    return "/privacy";
  }
}
