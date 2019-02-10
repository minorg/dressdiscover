export class Environment {
    static get isHosted(): boolean {
        return window.location.protocol.startsWith("http");
    }

    static get supportsLogin(): boolean {
        return window.location.hostname.endsWith("dressdiscover.org") || window.location.host === "localhost:9000";
    }
}
