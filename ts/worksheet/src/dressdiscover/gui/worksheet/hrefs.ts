export class Hrefs {
    get contact() {
        return "mailto:info@dressdiscover.org";
    }

    get credits() {
        return "/#/credits";
    }

    featureState(kwds: { featureId: string, stateId: string }) {
        return "/#/state/" + encodeURIComponent(kwds.stateId) + "/" + encodeURIComponent(kwds.featureId);
    }

    get privacy() {
        return "/#/privacy";
    }

    get root() {
        return '/';
    }

    state(kwds: { stateId: string }) {
        return "/#/state/" + encodeURIComponent(kwds.stateId) + "/";
    }
}