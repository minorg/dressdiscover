export class CurrentUser {
    constructor(kwds: { email: string, name?: string }) {
        this.email = kwds.email;
        this._name = kwds.name;
    }

    get name() {
        return this._name ? this._name : this.email;
    }

    readonly email: string;
    private readonly _name?: string;
}
