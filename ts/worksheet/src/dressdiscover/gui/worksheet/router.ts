import * as Sammy from 'sammy';

export class Router {
    constructor() {
        const self = this;
        this._sammy.get('^/$', (context: any) => {
            self._onGetRoot();
        });
    }

    private _onGetRoot() {
        console.info("Getting root");
    }

    run() {
        this._sammy.run();
    }

    setLocationQuietly(location: string) {
        this._sammy.trigger('redirect', { to: location });
        this._sammy.last_location = ['get', location];
        this._sammy.setLocation(location);
    }

    // private _hrefs = new Hrefs();
    private _sammy: Sammy.Application = Sammy();
}